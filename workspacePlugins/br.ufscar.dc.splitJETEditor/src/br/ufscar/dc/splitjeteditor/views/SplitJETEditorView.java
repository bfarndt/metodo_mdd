package br.ufscar.dc.splitjeteditor.views;

import java.io.File;
import java.io.PrintWriter;
import java.util.Timer;
import java.util.TimerTask;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.FontDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.ISaveablePart2;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartConstants;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.preferences.ScopedPreferenceStore;
import org.eclipse.ui.texteditor.ITextEditor;

import br.ufscar.dc.splitjeteditor.Activator;
import br.ufscar.jetmapping.GeneratedCodeMap;
import br.ufscar.jetmapping.MapEntry;

/**
 * This sample class demonstrates how to plug-in a new workbench view. The view
 * shows data obtained from the model. The sample creates a dummy model on the
 * fly, but a real implementation would connect to the model available either in
 * this or another plug-in (e.g. the workspace). The view is connected to the
 * model using a content provider.
 * <p>
 * The view uses a label provider to define how model objects should be
 * presented in the view. Each view can present the same model objects using
 * different labels and icons, if needed. Alternatively, a single label provider
 * can be shared between views in order to ensure that objects of the same type
 * are presented in the same way everywhere.
 * <p>
 */

public class SplitJETEditorView extends ViewPart implements ISaveablePart2 {

	// constants used to store user preferences
	public final static String REFERENCE_IMPLEMENTATION_PROJECT_NAME_KEY = "referenceImplementationProjectName";
	public final static String TEMPLATES_PROJECT_NAME_KEY = "templatesProjectName";
	public final static String MAPPING_FILE_KEY = "mappingFile";
	public final static String IS_SPLIT_EDITING_KEY = "isSplitEditing";

	public final static String BUTTON_TEXT_SELECTED = "Split editing is enabled. Click here to disable.";
	public final static String BUTTON_TEXT_NOT_SELECTED = "Split editing is disabled. Click here to enable.";

	// Parent composite
	Composite viewParent;

	// Split editing on/off button
	Composite compositeButtonTurnOnSplitEditing;
	Label labelButtonTurnOnSplitEditing;

	// Composite for configuring split editing
	Composite compositeConfig;
	Combo comboReferenceImplementation;
	Combo comboTemplatesProject;
	Label labelMappingFilePrefix;
	Composite compositeMappingFile;
	Text textMappingFile;
	Label labelMappingFileLoadStatus;
	TimerTask timerTaskMappingFile;

	Composite compositeActiveEditor;
	Label labelActiveEditor;
	Label labelAssociatedEditor;

	// List of open editors for template files
	Label labelListAssociatedFiles;
	List listAssociatedFiles;

	// Generated code map
	GeneratedCodeMap generatedCodeMap;

	boolean splitEditingEnabled;
	boolean isEditingTemplate;

	IPartListener openEditorsListener;
	int cont = 0;
	SplitJETEditorListener splitJETEditorListener;

	public SplitJETEditorView() {
		splitJETEditorListener = new SplitJETEditorListener(this);
	}

	public GeneratedCodeMap getMap() {
		return generatedCodeMap;
	}

	public String getReferenceImplementation() {
		return comboReferenceImplementation.getText();
	}

	public String getTemplatesProject() {
		return comboTemplatesProject.getText();
	}

	/**
	 * Creates Split JET Editor View
	 */
	public void createPartControl(Composite parent) {

		viewParent = parent;

		GridLayout layoutParent = new GridLayout(2, false);
		layoutParent.horizontalSpacing = 0;
		layoutParent.verticalSpacing = 0;
		parent.setLayout(layoutParent);

		// Composite Active Editor
		compositeActiveEditor = new Composite(parent, SWT.NULL);
		GridData gridDataCompositeActiveEditor = new GridData(SWT.LEFT,
				SWT.TOP, true, true);
		gridDataCompositeActiveEditor.verticalSpan = 2;
		compositeActiveEditor.setLayoutData(gridDataCompositeActiveEditor);

		GridLayout layoutCompositeActiveEditor = new GridLayout(2, false);
		layoutCompositeActiveEditor.horizontalSpacing = 0;
		layoutCompositeActiveEditor.verticalSpacing = 0;
		compositeActiveEditor.setLayout(layoutCompositeActiveEditor);

		Label labelActiveEditorTitle = new Label(compositeActiveEditor,
				SWT.NULL);
		labelActiveEditorTitle.setText("Now editing: ");
		labelActiveEditor = new Label(compositeActiveEditor, SWT.NULL);
		FontDescriptor boldDescriptor = FontDescriptor.createFrom(
				labelActiveEditorTitle.getFont()).setStyle(SWT.BOLD);
		Font boldFont = boldDescriptor.createFont(labelActiveEditorTitle
				.getDisplay());
		labelActiveEditor.setFont(boldFont);

		Label labelAssociatedEditorTitle = new Label(compositeActiveEditor,
				SWT.NULL);
		labelAssociatedEditorTitle.setText("Migrating to: ");
		labelAssociatedEditor = new Label(compositeActiveEditor, SWT.NULL);
		labelAssociatedEditor.setFont(boldFont);

		labelListAssociatedFiles = new Label(compositeActiveEditor, SWT.CENTER);
		GridData gridDataLabelListOpenEditors = new GridData();
		gridDataLabelListOpenEditors.horizontalSpan = 2;
		labelListAssociatedFiles.setLayoutData(gridDataLabelListOpenEditors);

		listAssociatedFiles = new List(compositeActiveEditor, SWT.BORDER
				| SWT.V_SCROLL | SWT.H_SCROLL);
		GridData gridDataListAssociatedTemplateEditors = new GridData();
		gridDataListAssociatedTemplateEditors.widthHint = 350;
		gridDataListAssociatedTemplateEditors.heightHint = 80;
		gridDataListAssociatedTemplateEditors.horizontalSpan = 2;
		listAssociatedFiles
				.setLayoutData(gridDataListAssociatedTemplateEditors);

		// Composite on/off button
		compositeButtonTurnOnSplitEditing = new Composite(parent, SWT.NULL);
		GridData gridDataButton = new GridData(SWT.RIGHT, SWT.CENTER, true,
				true);
		gridDataButton.widthHint = 250;
		gridDataButton.heightHint = 60;
		gridDataButton.minimumHeight = 60;
		compositeButtonTurnOnSplitEditing.setLayoutData(gridDataButton);
		compositeButtonTurnOnSplitEditing.setLayout(new GridLayout(1, false));
		labelButtonTurnOnSplitEditing = new Label(
				compositeButtonTurnOnSplitEditing, SWT.WRAP | SWT.CENTER);
		labelButtonTurnOnSplitEditing.setLayoutData(new GridData(SWT.CENTER,
				SWT.CENTER, true, true));

		// Composite Config
		compositeConfig = new Composite(parent, SWT.NULL);
		GridData gridDataCompositeConfig = new GridData(SWT.RIGHT, SWT.CENTER,
				true, true);
		gridDataCompositeConfig.widthHint = 250;
		compositeConfig.setLayoutData(gridDataCompositeConfig);
		GridLayout layoutCompositeConfig = new GridLayout(1, false);
		layoutCompositeConfig.horizontalSpacing = 0;
		layoutCompositeConfig.verticalSpacing = 0;
		compositeConfig.setLayout(layoutCompositeConfig);
		Label labelChooseReferenceImplementation = new Label(compositeConfig,
				SWT.NULL);
		labelChooseReferenceImplementation.setText("Reference implementation:");
		comboReferenceImplementation = new Combo(compositeConfig, SWT.DROP_DOWN
				| SWT.READ_ONLY);
		GridData gridDataComboReferenceImplementation = new GridData();
		gridDataComboReferenceImplementation.widthHint = 230;
		comboReferenceImplementation
				.setLayoutData(gridDataComboReferenceImplementation);

		Label labelChooseTemplatesProject = new Label(compositeConfig, SWT.NULL);
		labelChooseTemplatesProject.setText("Templates:");
		comboTemplatesProject = new Combo(compositeConfig, SWT.DROP_DOWN
				| SWT.READ_ONLY);
		GridData gridDataComboTemplatesProject = new GridData();
		gridDataComboTemplatesProject.widthHint = 230;
		comboTemplatesProject.setLayoutData(gridDataComboTemplatesProject);

		Label labelChooseMappingFile = new Label(compositeConfig, SWT.NULL);
		labelChooseMappingFile.setText("Mapping file:");

		compositeMappingFile = new Composite(compositeConfig, SWT.NULL);
		GridData gridDataCompositeMappingFile = new GridData();
		compositeMappingFile.setLayoutData(gridDataCompositeMappingFile);

		GridLayout layoutCompositeMappingFile = new GridLayout(1, false);
		layoutCompositeMappingFile.horizontalSpacing = 0;
		layoutCompositeMappingFile.verticalSpacing = 0;
		compositeMappingFile.setLayout(layoutCompositeMappingFile);

		labelMappingFilePrefix = new Label(compositeMappingFile, SWT.NULL);
		labelMappingFilePrefix.setText("in: /");

		textMappingFile = new Text(compositeMappingFile, SWT.SINGLE | SWT.LEFT
				| SWT.BORDER);
		textMappingFile.setEnabled(false);
		GridData gridDataMappingFileText = new GridData();
		gridDataMappingFileText.widthHint = 230;
		textMappingFile.setLayoutData(gridDataMappingFileText);

		labelMappingFileLoadStatus = new Label(compositeMappingFile, SWT.NULL);
		labelMappingFileLoadStatus.setText("");
		GridData gridDataMappingFileLoadStatus = new GridData();
		gridDataMappingFileLoadStatus.horizontalSpan = 1;
		labelMappingFileLoadStatus.setLayoutData(gridDataMappingFileLoadStatus);

		init();

	}

	/**
	 * Inits variables and register events
	 */
	private void init() {
		splitEditingEnabled = false;

		registerCompositeConfigEvents();

		registerButtonTurnOnSplitEditingEvents();

		registerEditorsListsEvents();

		updateButtonLookAndFeel();
	}

	private void buttonTurnOnSplitEditingSelected() {
		splitEditingEnabled = !splitEditingEnabled;
		updateButtonLookAndFeel();
		if (splitEditingEnabled) {
			enableSplitEditing();
		} else {
			disableSplitEditing();
		}
		updateConfigComposite();
		updateActiveEditorsAndTemplates();

		firePropertyChange(IWorkbenchPartConstants.PROP_DIRTY);
	}

	private void updateButtonLookAndFeel() {

		if (splitEditingEnabled) {
			labelButtonTurnOnSplitEditing.setText(BUTTON_TEXT_SELECTED);
			compositeButtonTurnOnSplitEditing
					.setBackground(ColorConstants.green);
		} else {
			labelButtonTurnOnSplitEditing.setText(BUTTON_TEXT_NOT_SELECTED);
			compositeButtonTurnOnSplitEditing.setBackground(ColorConstants.red);
		}
		updateView();
	}

	public void highlightMappedFile(MapEntry mapEntry,
			HighlightMode highlightMode) {
		String[] items = listAssociatedFiles.getItems();

		int itemToSelect = 0;

		switch (highlightMode) {
		case Ok:
			labelAssociatedEditor.setForeground(ColorConstants.darkGreen);
			labelAssociatedEditor.setText(mapEntry.getTemplateFile());
			break;
		case OutOfSync:
			labelAssociatedEditor.setForeground(ColorConstants.orange);
			labelAssociatedEditor
					.setText("Warning! Resources are out of sync! Run transformation again!)");
			break;
		case DelimiterRegion:
			labelAssociatedEditor.setForeground(ColorConstants.darkRed);
			labelAssociatedEditor
					.setText("Nowhere! You are modifying a delimiter region inside "
							+ mapEntry.getTemplateFile());
			break;
		case ModelRegion:
			labelAssociatedEditor.setForeground(ColorConstants.darkRed);
			labelAssociatedEditor
					.setText("Nowhere! You are modifying a model region inside "
							+ mapEntry.getTemplateFile());
			break;
		case ScriptletRegion:
			labelAssociatedEditor.setForeground(ColorConstants.darkRed);
			labelAssociatedEditor
					.setText("Nowhere! You are modifying a scriptlet region inside "
							+ mapEntry.getTemplateFile());
			break;
		case MappedFileClosed:
			labelAssociatedEditor.setForeground(ColorConstants.darkRed);
			labelAssociatedEditor
					.setText("Nowhere! Mapped file is closed! Open it (highlighted below) to migrate changes!");
			break;
		case EditingTemplateFile:
			labelAssociatedEditor.setForeground(ColorConstants.darkRed);
			labelAssociatedEditor
					.setText("Nowhere! You are modifying a template!");
			break;
		case NotAMappedRegion:
			labelAssociatedEditor.setForeground(ColorConstants.darkRed);
			labelAssociatedEditor
					.setText("Nowhere! This is not a mapped file or region!");
			break;
		}

		if (mapEntry != null) {
			String mappedFile = mapEntry.getTemplateFile();
			if (mappedFile != null) {
				for (int i = 0; i < items.length; i++) {
					if (items[i].equals(mappedFile)) {
						itemToSelect = i;
					}
				}
			}
		}

		listAssociatedFiles.setSelection(itemToSelect);

		updateView();
	}

	private void updateActiveEditorsAndTemplates() {
		labelActiveEditor.setText("");
		labelAssociatedEditor.setText("");
		labelListAssociatedFiles.setText("");
		listAssociatedFiles.removeAll();
		listAssociatedFiles.setEnabled(false);
		if (splitEditingEnabled && generatedCodeMap != null) {
			IWorkbenchPage activePage = getActivePage();
			IEditorPart editorPart = activePage.getActiveEditor();
			if (editorPart != null && editorPart instanceof ITextEditor) {
				ITextEditor textEditor = (ITextEditor) editorPart;
				IEditorInput ei = textEditor.getEditorInput();
				if (ei instanceof FileEditorInput) {
					FileEditorInput fei = (FileEditorInput) ei;

					registerListenersToActiveEditor(textEditor);

					String projectName = fei.getFile().getProject().getName();
					String filePath = fei.getFile().getProjectRelativePath()
							.toString();
					labelActiveEditor.setText(projectName + "/" + filePath);

					if (generatedCodeMap.isGeneratedFile(filePath)) {
						listAssociatedFiles.setEnabled(true);
						isEditingTemplate = false;
						labelListAssociatedFiles
								.setText("This is a generated file. See associated templates below (double-click to open):");
						java.util.List<String> associatedTemplateFiles = generatedCodeMap
								.getAssociatedTemplates(filePath);
						for (String s : associatedTemplateFiles) {
							listAssociatedFiles.add(s);
						}
					} else if (generatedCodeMap.isTemplateFile(filePath)) {
						listAssociatedFiles.setEnabled(true);
						isEditingTemplate = true;
						labelListAssociatedFiles
								.setText("This is a template file. See generated files below (double-click to open):");
						java.util.List<String> associatedTemplateFiles = generatedCodeMap
								.getGeneratedFiles(filePath);
						for (String s : associatedTemplateFiles) {
							listAssociatedFiles.add(s);
						}

					} else {
						labelListAssociatedFiles
								.setText("This file is not mapped!");
					}
				}
			}
		}
		updateView();
	}

	private void updateConfigComposite() {
		comboReferenceImplementation.removeAll();
		comboTemplatesProject.removeAll();
		labelMappingFilePrefix.setText("in: ");
		textMappingFile.setEnabled(false);
		textMappingFile.setText("");
		labelMappingFileLoadStatus.setText("");

		if (splitEditingEnabled) {
			textMappingFile.setEnabled(true);

			IProject[] projects = ResourcesPlugin.getWorkspace().getRoot()
					.getProjects();
			String referenceImplementationProjectName = Activator.getDefault()
					.getPreferenceStore()
					.getString(REFERENCE_IMPLEMENTATION_PROJECT_NAME_KEY);
			String templatesProjectName = Activator.getDefault()
					.getPreferenceStore().getString(TEMPLATES_PROJECT_NAME_KEY);
			String mappingFile = Activator.getDefault().getPreferenceStore()
					.getString(MAPPING_FILE_KEY);

			int i = 0;
			int referenceImplementationProjectIndex = 0;
			int templatesProjectIndex = 0;

			for (IProject p : projects) {
				comboReferenceImplementation.add(p.getName());
				comboTemplatesProject.add(p.getName());
				if (p.getName().equals(referenceImplementationProjectName))
					referenceImplementationProjectIndex = i;
				if (p.getName().equals(templatesProjectName))
					templatesProjectIndex = i;
				i++;
			}

			comboReferenceImplementation
					.select(referenceImplementationProjectIndex);
			comboTemplatesProject.select(templatesProjectIndex);

			labelMappingFilePrefix.setText("in: "
					+ referenceImplementationProjectName + "/");

			textMappingFile.setText(mappingFile);

			loadMappingFile();
		}

		updateView();

	}

	private void saveConfig() {
		Activator
				.getDefault()
				.getPreferenceStore()
				.setValue(REFERENCE_IMPLEMENTATION_PROJECT_NAME_KEY,
						comboReferenceImplementation.getText());
		Activator
				.getDefault()
				.getPreferenceStore()
				.setValue(TEMPLATES_PROJECT_NAME_KEY,
						comboTemplatesProject.getText());
		Activator.getDefault().getPreferenceStore()
				.setValue(MAPPING_FILE_KEY, textMappingFile.getText());
	}

	private void textMappingFileKeyReleased() {
		textMappingFileStartedEditing();
		if (timerTaskMappingFile != null) {
			timerTaskMappingFile.cancel();
		}
		timerTaskMappingFile = new TimerTask() {
			@Override
			public void run() {
				Display.getDefault().syncExec(new Runnable() {
					@Override
					public void run() {
						timerTaskMappingFile = null;
						textMappingFileStoppedEditing();
					}
				});
			}
		};
		new Timer().schedule(timerTaskMappingFile, 2000);
	}

	private void textMappingFileStartedEditing() {
		labelMappingFileLoadStatus.setText("Wait...");
		labelMappingFileLoadStatus.setForeground(ColorConstants.darkGray);
		updateView();
	}

	private void textMappingFileStoppedEditing() {
		loadMappingFile();
	}

	private void saveMappingFile() {
		if (generatedCodeMap != null) {
			String mappingFileTxt = textMappingFile.getText();
			String projectName = comboReferenceImplementation.getText();
			IProject project = ResourcesPlugin.getWorkspace().getRoot()
					.getProject(projectName);
			IFile mappingFile = project.getFile(mappingFileTxt);
			File f = mappingFile.getRawLocation().makeAbsolute().toFile();
			PrintWriter out;
			try {
				out = new PrintWriter(f);
				generatedCodeMap.saveToWriter(out);
				out.flush();
				out.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private void loadMappingFile() {
		generatedCodeMap = null;
		String mappingFileTxt = textMappingFile.getText();
		String projectName = comboReferenceImplementation.getText();

		IProject project = ResourcesPlugin.getWorkspace().getRoot()
				.getProject(projectName);
		IFile mappingFile = project.getFile(mappingFileTxt);
		File f = mappingFile.getRawLocation().makeAbsolute().toFile();
		if (f.exists()) {
			try {
				generatedCodeMap = GeneratedCodeMap.createFromFile(f);
				labelMappingFileLoadStatus
						.setText("Mapping file loaded successfully!");
				labelMappingFileLoadStatus
						.setForeground(ColorConstants.darkGreen);
			} catch (Exception e) {
				labelMappingFileLoadStatus.setText("File could not be read!");
				labelMappingFileLoadStatus
						.setForeground(ColorConstants.darkRed);
			}
		} else {
			labelMappingFileLoadStatus.setText("File not found!");
			labelMappingFileLoadStatus.setForeground(ColorConstants.darkRed);
		}

		updateView();
	}

	private void openSelectedFile(String fileToOpen) {
		String projectName = comboTemplatesProject.getText();
		if (isEditingTemplate)
			projectName = comboReferenceImplementation.getText();
		IProject project = ResourcesPlugin.getWorkspace().getRoot()
				.getProject(projectName);
		IFile f = project.getFile(fileToOpen);
		if (f.exists()) {
			IEditorInput editorInput = new FileEditorInput(f);
			IWorkbenchWindow window = PlatformUI.getWorkbench()
					.getActiveWorkbenchWindow();
			IWorkbenchPage page = window.getActivePage();
			try {
				page.openEditor(editorInput,
						"org.eclipse.ui.DefaultTextEditor", true);

			} catch (PartInitException e) {
				e.printStackTrace();
			}
		}
	}

	private void registerCompositeConfigEvents() {
		SelectionListener listener = new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				labelMappingFilePrefix.setText("in: "
						+ comboReferenceImplementation.getText() + "/");
				loadMappingFile();
				// viewParent.layout();
				super.widgetSelected(e);
			}
		};
		comboReferenceImplementation.addSelectionListener(listener);

		textMappingFile.addKeyListener(new KeyAdapter() {

			@Override
			public void keyReleased(KeyEvent e) {
				textMappingFileKeyReleased();
			}
		});

	}

	private void registerEditorsListsEvents() {

		listAssociatedFiles.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseDoubleClick(MouseEvent e) {
				List list = (List) e.getSource();
				int selectedItem = list.getSelectionIndex();
				if (selectedItem != -1)
					openSelectedFile(list.getItem(selectedItem));
				super.mouseDoubleClick(e);
			}

		});
	}

	private void registerButtonTurnOnSplitEditingEvents() {
		MouseListener buttonEvents = new MouseAdapter() {

			@Override
			public void mouseDown(MouseEvent e) {
				compositeButtonTurnOnSplitEditing
						.setBackground(ColorConstants.gray);
				super.mouseDown(e);
			}

			@Override
			public void mouseUp(MouseEvent e) {
				buttonTurnOnSplitEditingSelected();
				super.mouseUp(e);
			}

		};

		compositeButtonTurnOnSplitEditing.addMouseListener(buttonEvents);
		labelButtonTurnOnSplitEditing.addMouseListener(buttonEvents);
	}

	private void registerTextEditorListeners() {
		IWorkbenchPage activePage = getActivePage();
		if (openEditorsListener == null) {
			openEditorsListener = new IPartListener() {
				private IWorkbenchPart activeEditor;

				public void partActivated(IWorkbenchPart part) {
					if (part instanceof ITextEditor) {
						activeEditor = part;
						// registerDocumentListener((ITextEditor) part);
					}
					updateActiveEditorsAndTemplates();
				}

				public void partClosed(IWorkbenchPart part) {
					if (part == activeEditor) {
						activeEditor = null;
						// Depois vejo o que fazer aqui
					}
					updateActiveEditorsAndTemplates();
				}

				@Override
				public void partBroughtToTop(IWorkbenchPart part) {
					updateActiveEditorsAndTemplates();
				}

				@Override
				public void partDeactivated(IWorkbenchPart part) {
					updateActiveEditorsAndTemplates();
				}

				@Override
				public void partOpened(IWorkbenchPart part) {
					updateActiveEditorsAndTemplates();
				}
			};
		}
		activePage.addPartListener(openEditorsListener);
	}

	private void unregisterTextEditorListeners() {
		IWorkbenchPage activePage = getActivePage();
		if (openEditorsListener != null)
			activePage.removePartListener(openEditorsListener);

	}

	private void registerListenersToActiveEditor(ITextEditor editor) {
		splitJETEditorListener.addToEditor(editor);
	}

	private void enableSplitEditing() {
		registerTextEditorListeners();
		IPreferenceStore ss = new ScopedPreferenceStore(InstanceScope.INSTANCE,
				"org.eclipse.ui");
		ss.setValue(IS_SPLIT_EDITING_KEY, true);

	}

	private void disableSplitEditing() {
		unregisterTextEditorListeners();
		splitJETEditorListener.removeFromCurrentEditor();
		saveConfig();
		saveMappingFile();

		IPreferenceStore ss = new ScopedPreferenceStore(InstanceScope.INSTANCE,
				"org.eclipse.ui");
		ss.setValue(IS_SPLIT_EDITING_KEY, false);
	}

	public void setFocus() {
		// set focus to my widget. For a label, this doesn't
		// make much sense, but for more complex sets of widgets
		// you would decide which one gets the focus.
	}

	private void updateView() {
		compositeActiveEditor.layout();
		compositeMappingFile.layout();
		compositeConfig.layout();
		viewParent.layout();
	}

	private IWorkbenchPage getActivePage() {
		return getSite().getWorkbenchWindow().getActivePage();
	}

	public ITextEditor getEditor(IFile f) {
		IEditorReference[] editorReferences = getActivePage()
				.getEditorReferences();
		for (IEditorReference ier : editorReferences) {
			try {
				IEditorInput iei = ier.getEditorInput();
				if (iei instanceof FileEditorInput) {
					FileEditorInput fei = (FileEditorInput) iei;
					if (fei.getFile().equals(f)) {
						IEditorPart editor = ier.getEditor(true);
						if (editor instanceof ITextEditor)
							return (ITextEditor) editor;
					}
				}
			} catch (PartInitException pie) {
				pie.printStackTrace();
			}
		}
		return null;
	}

	// Methods to avoid closing the view without disabling split editing
	// This is necessary because when split editing is enabled
	// there are many part listeners that trigger changes to this view's widgets
	// and if they are disposed, exceptions will be launched.
	@Override
	public void doSave(IProgressMonitor monitor) {
	}

	@Override
	public void doSaveAs() {
	}

	@Override
	public boolean isDirty() {
		return splitEditingEnabled;
	}

	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}

	@Override
	public boolean isSaveOnCloseNeeded() {
		return true;
	}

	@Override
	public int promptToSaveOnClose() {
		if (splitEditingEnabled) {
			MessageDialog
					.openInformation(Display.getCurrent().getActiveShell(),
							"Warning",
							"Split editing is enabled. Please disable it before closing the view");
			return CANCEL;
		}
		return NO;
	}
}