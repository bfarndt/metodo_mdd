package br.ufscar.dc.splitjeteditor.views;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentListener;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CaretEvent;
import org.eclipse.swt.custom.CaretListener;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.custom.VerifyKeyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.events.VerifyListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.text.undo.DocumentUndoEvent;
import org.eclipse.text.undo.DocumentUndoManagerRegistry;
import org.eclipse.text.undo.IDocumentUndoListener;
import org.eclipse.text.undo.IDocumentUndoManager;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.texteditor.IDocumentProvider;
import org.eclipse.ui.texteditor.ITextEditor;

import br.ufscar.jetmapping.GeneratedCodeMap;
import br.ufscar.jetmapping.MapEntry;
import br.ufscar.jetmapping.RetrievalPolicy;

public class SplitJETEditorListener implements IDocumentListener,
		CaretListener, IDocumentUndoListener, VerifyKeyListener,
		VerifyListener, SelectionListener {

	SplitJETEditorView splitJETEditorView;
	ITextEditor editor;
	IDocument document;
	IDocumentUndoManager undoManager;
	StyledText st;
	HighlightMode hm;
	boolean aboutToUndo = false;
	boolean cancelBackspace = false;
	boolean cancelDel = false;
	boolean cancelEdit = false;
	boolean cancelCut = false;

	public SplitJETEditorListener(SplitJETEditorView splitJETEditorView) {
		this.splitJETEditorView = splitJETEditorView;
	}

	public void addToEditor(ITextEditor e) {
		removeFromCurrentEditor();
		this.editor = e;

		document = getDocument(editor);
		if (document == null) {
//			System.out.println("Error: could not get document for editor:"
//					+ editor.getTitle());
			return;
		} else {
			document.addDocumentListener(this);
		}

		st = (StyledText) editor.getAdapter(Control.class);
		if (st == null) {
//			System.out.println("Error: could not get StyledText for editor:"
//					+ editor.getTitle());
			return;
		} else {
			st.addCaretListener(this);
			st.addVerifyKeyListener(this);
			st.addVerifyListener(this);
			st.addSelectionListener(this);
		}

		undoManager = DocumentUndoManagerRegistry
				.getDocumentUndoManager(document);
		if (undoManager == null) {
//			System.out.println("Error: could not get UndoManager for editor:"
//					+ editor.getTitle());
			return;
		} else {
			undoManager.addDocumentUndoListener(this);
		}

	}

	public void removeFromCurrentEditor() {
		if (document != null) {
			document.removeDocumentListener(this);
			document = null;
		}
		if (undoManager != null) {
			undoManager.removeDocumentUndoListener(this);
			undoManager = null;
		}
		if (st != null && !st.isDisposed()) {
			st.removeCaretListener(this);
			st.removeVerifyKeyListener(this);
			st.removeVerifyListener(this);
			st.removeSelectionListener(this);
			st.setStyleRange(null);
			st = null;
		}
		if (editor != null) {
			editor = null;
		}
		aboutToUndo = false;

	}

	@Override
	public void verifyText(VerifyEvent e) {
		if (cancelEdit) {
			e.doit = false;
		} else if (cancelCut) {
			if (e.text.length() == 0)
				e.doit = false;
		}
	}

	@Override
	public void verifyKey(VerifyEvent event) {

		if (event.keyCode == SWT.BS && cancelBackspace) {
			event.doit = false;
		} else if (event.keyCode == SWT.DEL && cancelDel) {
			event.doit = false;
		}
	}

	@Override
	public void documentUndoNotification(DocumentUndoEvent event) {
		if (event.getEventType() == DocumentUndoEvent.ABOUT_TO_UNDO) {
			aboutToUndo = true;

		} else if (event.getEventType() == DocumentUndoEvent.UNDONE) {
			aboutToUndo = false;
		}
	}

	@Override
	public void documentAboutToBeChanged(DocumentEvent event) {
	}

	@Override
	public void documentChanged(DocumentEvent event) {

		// System.out.println("Changed:" + event.toString());

		int actualLength = event.getText().length() - event.getLength();

		// event.getLength() is > 0 when text is deleted

		int offset = event.getOffset();

		GeneratedCodeMap map = splitJETEditorView.getMap();
		RetrievalPolicy policy = RetrievalPolicy.LeftInclusiveRightExclusive;
		MapEntry mapEntry = paintThisAndAssociatedEditors(offset, policy);

		switch (hm) {
		case DelimiterRegion:
		case ScriptletRegion:
		case ModelRegion:
			// System.out.println("1:" + lastKnownOffset);
			mapEntry = getMapEntryForGeneratedFile(offset, policy);
			mapEntry.getGeneratedFileSection().increaseRange(actualLength);
			String filePath = getCurrentFile();
			if (filePath != null) {
				map.insertedText(filePath, offset, filePath, offset,
						event.getText(), actualLength, policy);
			}
			break;
		case NotAMappedRegion:
			// Never enters here, because editing is cancelled
			// when modifying an unmapped region
			System.out
					.println("Warning: should not have entered here (NotAMappedRegion)! Perhaps Ctrl-Z?");
			break;
		case EditingTemplateFile:
			// Never enters here, because editing is cancelled
			// when modifying a template file
			System.out
					.println("Warning: should not have entered here (EditingTemplateFile)! Perhaps Ctrl-Z?");
			if (aboutToUndo) {
				MessageDialog
						.openWarning(
								Display.getCurrent().getActiveShell(),
								"Warning!",
								"Warning! You modified a template file. Please disable split editing and run transformation again to rebuild mapping!");
			}
			break;
		case MappedFileClosed:
			// Never enters here, because editing is cancelled
			// when modifying a closed mapped file
			System.out
					.println("Warning: should not have entered here (MappedFileClosed)!");
			// mapEntry = getMapEntryForGeneratedFile(offset, policy);
			// if (mapEntry != null) {
			// map.splitInGeneratedFile(mapEntry, offset, event.getLength(),
			// policy);
			// map.insertedText(mapEntry.getGeneratedFile(), offset - 1, null,
			// 0, event.getText(), event.getLength(), policy);
			// }
			break;
		case OutOfSync:
		case Ok:
			mapEntry = getMapEntryForGeneratedFile(offset, policy);
			int templateOffset = 0;
			String templateFile = null;
			templateFile = mapEntry.getTemplateFile();
			ITextEditor mappedEditor = getEditor(templateFile);
			StyledText mappedSt = (StyledText) mappedEditor
					.getAdapter(Control.class);
			templateOffset = mapEntry.translateGeneratedFileToTemplate(offset);

			int oldFrom = mapEntry.getTemplateFileSection().getFrom();
			int oldTo = mapEntry.getTemplateFileSection().getTo();

			mapEntry.getGeneratedFileSection().increaseRange(actualLength);
			mapEntry.getTemplateFileSection().increaseRange(actualLength);

			map.insertedText(mapEntry.getGeneratedFile(), offset, templateFile,
					templateOffset, event.getText(), actualLength, policy);

			java.util.List<MapEntry> allSimilarEntries = map
					.getAllSimilarEntriesInTemplateFile(templateFile, oldFrom,
							oldTo);

			for (MapEntry similarMe : allSimilarEntries) {
				similarMe.getTemplateFileSection().increaseRange(actualLength);
			}

			if (aboutToUndo) {
				IDocument mappedDocument = getDocument(mappedEditor);
				if (mappedDocument != null) {
					try {
						DocumentUndoManagerRegistry.getDocumentUndoManager(
								mappedDocument).undo();
					} catch (ExecutionException ee) {
						ee.printStackTrace();
					}
				}
			} else {
				mappedSt.setSelection(templateOffset,
						templateOffset + event.getLength());
				mappedSt.insert(event.getText());
			}

			break;

		}
		paintThisAndAssociatedEditors(offset, policy);
	}

	@Override
	public void widgetSelected(SelectionEvent e) {
		paintThisAndAssociatedEditors(st.getCaretOffset(),
				RetrievalPolicy.LeftInclusiveRightExclusive);
	}

	@Override
	public void widgetDefaultSelected(SelectionEvent e) {
	}

	@Override
	public void caretMoved(CaretEvent event) {
		paintThisAndAssociatedEditors(event.caretOffset,
				RetrievalPolicy.LeftInclusiveRightExclusive);
	}

	public MapEntry paintThisAndAssociatedEditors(int offset,
			RetrievalPolicy policy) {
		cancelBackspace = false;
		cancelDel = false;
		cancelEdit = false;
		cancelCut = false;

		ITextEditor thisEditor = editor;

		Color highlightColor = ColorConstants.red; // red means migration will
													// not occur
		StyledText thisSt = (StyledText) thisEditor.getAdapter(Control.class);
		thisSt.setStyleRange(null);

		MapEntry mapEntry = getMapEntryForGeneratedFile(offset, policy);
		if (mapEntry == null) {
			mapEntry = getMapEntryForTemplateFile(offset, policy);
			if (mapEntry == null) {
				hm = HighlightMode.NotAMappedRegion;
				cancelEdit = true;
			} else {
				hm = HighlightMode.EditingTemplateFile;
				cancelEdit = true;
				// try to implement template editing
				// for now, migration will not occur from template to ref.
				// implementation
			}
		} else {
			// Ok, this is a valid map entry, for a generated file.
			// Let's check if there is an open editor for it
			ITextEditor mappedEditor = getEditor(mapEntry.getTemplateFile());
			if (mappedEditor == null) {
				hm = HighlightMode.MappedFileClosed;
				cancelEdit = true;
			} else {
				StyledText mappedSt = (StyledText) mappedEditor
						.getAdapter(Control.class);

				if (mapEntry.getType().equals("delimiter")) {
					// can't migrate changes in delimiter region
					hm = HighlightMode.DelimiterRegion;
					cancelEdit = true;
				} else if (mapEntry.getType().equals("get")) {
					// can't migrate changes in get region, because this is
					// probably data from the model
					hm = HighlightMode.ModelRegion;
					cancelEdit = true;
				} else if (mapEntry.getType().equals("scriptlet")) {
					// can't migrate changes in a scriptlet region
					hm = HighlightMode.ScriptletRegion;
					cancelEdit = true;
				} else {
					// ok to migrate changes
					// let's check if resources are out of sync
					String leftResource = thisSt.getText(mapEntry
							.getGeneratedFileSection().getFrom(), mapEntry
							.getGeneratedFileSection().getTo() - 1);
					String rightResource = mappedSt.getText(mapEntry
							.getTemplateFileSection().getFrom(), mapEntry
							.getTemplateFileSection().getTo() - 1);

					if (!leftResource.equals(rightResource)) {
						highlightColor = ColorConstants.yellow;
						hm = HighlightMode.OutOfSync;

					} else {
						highlightColor = ColorConstants.green;
						hm = HighlightMode.Ok;
					}
				}
				mappedSt.setStyleRange(null);

				StyleRange styleMappedHighlight = new StyleRange();
				styleMappedHighlight.background = highlightColor;
				styleMappedHighlight.start = mapEntry.getTemplateFileSection()
						.getFrom();
				styleMappedHighlight.length = mapEntry.getTemplateFileSection()
						.getTo() - styleMappedHighlight.start;
				mappedSt.setStyleRange(styleMappedHighlight);

				if (hm == HighlightMode.Ok || hm == HighlightMode.OutOfSync) {
					int translatedOffset = mapEntry
							.translateGeneratedFileToTemplate(offset);
					mappedSt.setCaretOffset(translatedOffset);
					mappedSt.setSelection(translatedOffset,
							translatedOffset + 1);
					mappedSt.showSelection();
				}
			}
			StyleRange styleThisHighlight = new StyleRange();
			styleThisHighlight.background = highlightColor;
			styleThisHighlight.start = mapEntry.getGeneratedFileSection()
					.getFrom();
			styleThisHighlight.length = mapEntry.getGeneratedFileSection()
					.getTo() - styleThisHighlight.start;
			thisSt.setStyleRange(styleThisHighlight);
		}

		int selectionStart = thisSt.getSelection().x;
		int selectionEnd = thisSt.getSelection().y;

		if (selectionStart != selectionEnd) {
			MapEntry meSelectionStart = getMapEntryForGeneratedFile(
					selectionStart, RetrievalPolicy.LeftInclusiveRightExclusive);
			MapEntry meSelectionEnd = getMapEntryForGeneratedFile(selectionEnd,
					RetrievalPolicy.LeftExclusiveRightInclusive);
			if (meSelectionStart != null && meSelectionEnd != null
					&& !meSelectionStart.equals(meSelectionEnd)) {
				cancelEdit = true;
			} else if (meSelectionStart != null && meSelectionEnd != null
					&& meSelectionStart.equals(meSelectionEnd)) {
				int translatedSelectionEnd = meSelectionEnd
						.translateGeneratedFileToTemplate(selectionEnd);
				if (selectionEnd == meSelectionEnd.getGeneratedFileSection()
						.getTo()) {
					cancelDel = true;
					cancelBackspace = true;
					cancelCut = true;
				}
				if (translatedSelectionEnd == meSelectionEnd
						.getTemplateFileSection().getTo()) {
					cancelDel = true;
					cancelBackspace = true;
					cancelCut = true;
				}
			}
		}

		if (!cancelEdit) {
			if (mapEntry != null) {
				if (mapEntry.getGeneratedFileSection() != null) {
					if (mapEntry.getGeneratedFileSection().size() == 1) {
						cancelBackspace = true;
						cancelDel = true;
					}
					if (mapEntry.getGeneratedFileSection().getFrom() == offset) {
						cancelBackspace = true;
					}
					if (mapEntry.getGeneratedFileSection().getTo() - 1 == offset) {
						cancelDel = true;
					}
					int translatedOffset = mapEntry
							.translateGeneratedFileToTemplate(offset);
					if (mapEntry.getTemplateFileSection().getTo() == translatedOffset) {
						cancelDel = true;
						cancelBackspace = true;
					}
				}
			}
		}

		splitJETEditorView.highlightMappedFile(mapEntry, hm);
		return mapEntry;
	}

	private String getCurrentFile() {
		IEditorInput ei = editor.getEditorInput();
		if (ei instanceof FileEditorInput) {
			FileEditorInput fei = (FileEditorInput) ei;
			String filePath = fei.getFile().getProjectRelativePath().toString();
			return filePath;
		}
		return null;
	}

	private MapEntry getMapEntryForGeneratedFile(int offset,
			RetrievalPolicy policy) {
		String filePath = getCurrentFile();
		if (filePath != null) {
			GeneratedCodeMap map = splitJETEditorView.getMap();
			if (map != null) {
				if (map.isGeneratedFile(filePath)) {
					return map.getAssociatedTemplate(filePath, offset, policy);
				}
			}
		}
		return null;
	}

	private MapEntry getMapEntryForTemplateFile(int offset,
			RetrievalPolicy policy) {
		IEditorInput ei = editor.getEditorInput();
		if (ei instanceof FileEditorInput) {
			FileEditorInput fei = (FileEditorInput) ei;
			String filePath = fei.getFile().getProjectRelativePath().toString();
			GeneratedCodeMap map = splitJETEditorView.getMap();
			if (map != null) {
				if (map.isTemplateFile(filePath)) {
					return map.getAssociatedGeneratedFile(filePath, offset,
							policy);
				}
			}
		}
		return null;
	}

	private ITextEditor getEditor(String fileToOpen) {
		String projectName = splitJETEditorView.getTemplatesProject();

		IProject project = ResourcesPlugin.getWorkspace().getRoot()
				.getProject(projectName);
		IFile f = project.getFile(fileToOpen);

		ITextEditor mappedEditor = splitJETEditorView.getEditor(f);

		return mappedEditor;
	}

	private IDocument getDocument(ITextEditor ite) {
		IDocumentProvider docProvider = ite.getDocumentProvider();
		if (docProvider == null)
			return null;

		return docProvider.getDocument(ite.getEditorInput());
	}
}
