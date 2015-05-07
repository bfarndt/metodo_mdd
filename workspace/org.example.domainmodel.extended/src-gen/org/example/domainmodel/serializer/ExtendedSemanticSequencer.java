package org.example.domainmodel.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.example.domainmodel.extended.DataType;
import org.example.domainmodel.extended.Domainmodel;
import org.example.domainmodel.extended.Entity;
import org.example.domainmodel.extended.ExtendedPackage;
import org.example.domainmodel.extended.Feature;
import org.example.domainmodel.extended.Form;
import org.example.domainmodel.extended.FormNewEntityOnly;
import org.example.domainmodel.extended.FormReport;
import org.example.domainmodel.extended.Import;
import org.example.domainmodel.extended.PackageDeclaration;
import org.example.domainmodel.extended.Page;
import org.example.domainmodel.services.ExtendedGrammarAccess;

@SuppressWarnings("all")
public class ExtendedSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ExtendedGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ExtendedPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ExtendedPackage.DATA_TYPE:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getDataTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_DataType(context, (DataType) semanticObject); 
					return; 
				}
				else break;
			case ExtendedPackage.DOMAINMODEL:
				if(context == grammarAccess.getDomainmodelRule()) {
					sequence_Domainmodel(context, (Domainmodel) semanticObject); 
					return; 
				}
				else break;
			case ExtendedPackage.ENTITY:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getEntityRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_Entity(context, (Entity) semanticObject); 
					return; 
				}
				else break;
			case ExtendedPackage.FEATURE:
				if(context == grammarAccess.getFeatureRule()) {
					sequence_Feature(context, (Feature) semanticObject); 
					return; 
				}
				else break;
			case ExtendedPackage.FORM:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getFormRule() ||
				   context == grammarAccess.getFormTypesRule()) {
					sequence_Form(context, (Form) semanticObject); 
					return; 
				}
				else break;
			case ExtendedPackage.FORM_NEW_ENTITY_ONLY:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getFormNewEntityOnlyRule() ||
				   context == grammarAccess.getFormTypesRule()) {
					sequence_FormNewEntityOnly(context, (FormNewEntityOnly) semanticObject); 
					return; 
				}
				else break;
			case ExtendedPackage.FORM_REPORT:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getFormReportRule() ||
				   context == grammarAccess.getFormTypesRule()) {
					sequence_FormReport(context, (FormReport) semanticObject); 
					return; 
				}
				else break;
			case ExtendedPackage.IMPORT:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getImportRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case ExtendedPackage.PACKAGE_DECLARATION:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getPackageDeclarationRule()) {
					sequence_PackageDeclaration(context, (PackageDeclaration) semanticObject); 
					return; 
				}
				else break;
			case ExtendedPackage.PAGE:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getPageRule()) {
					sequence_Page(context, (Page) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_DataType(EObject context, DataType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExtendedPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtendedPackage.Literals.TYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (nomeProj=STRING elements+=AbstractElement*)
	 */
	protected void sequence_Domainmodel(EObject context, Domainmodel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID superType=[Entity|QualifiedName]? features+=Feature*)
	 */
	protected void sequence_Entity(EObject context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (many?='many'? name=ID type=[Type|QualifiedName])
	 */
	protected void sequence_Feature(EObject context, Feature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID entity=[Entity|ID])
	 */
	protected void sequence_FormNewEntityOnly(EObject context, FormNewEntityOnly semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExtendedPackage.Literals.FORM_TYPES__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtendedPackage.Literals.FORM_TYPES__NAME));
			if(transientValues.isValueTransient(semanticObject, ExtendedPackage.Literals.FORM_NEW_ENTITY_ONLY__ENTITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtendedPackage.Literals.FORM_NEW_ENTITY_ONLY__ENTITY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFormNewEntityOnlyAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getFormNewEntityOnlyAccess().getEntityEntityIDTerminalRuleCall_3_0_1(), semanticObject.getEntity());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID filter=Boolean order=Boolean pagination=Boolean)
	 */
	protected void sequence_FormReport(EObject context, FormReport semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExtendedPackage.Literals.FORM_TYPES__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtendedPackage.Literals.FORM_TYPES__NAME));
			if(transientValues.isValueTransient(semanticObject, ExtendedPackage.Literals.FORM_REPORT__FILTER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtendedPackage.Literals.FORM_REPORT__FILTER));
			if(transientValues.isValueTransient(semanticObject, ExtendedPackage.Literals.FORM_REPORT__ORDER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtendedPackage.Literals.FORM_REPORT__ORDER));
			if(transientValues.isValueTransient(semanticObject, ExtendedPackage.Literals.FORM_REPORT__PAGINATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtendedPackage.Literals.FORM_REPORT__PAGINATION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFormReportAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getFormReportAccess().getFilterBooleanParserRuleCall_5_0(), semanticObject.getFilter());
		feeder.accept(grammarAccess.getFormReportAccess().getOrderBooleanParserRuleCall_8_0(), semanticObject.getOrder());
		feeder.accept(grammarAccess.getFormReportAccess().getPaginationBooleanParserRuleCall_11_0(), semanticObject.getPagination());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         get=Boolean 
	 *         post=Boolean 
	 *         put=Boolean 
	 *         delete=Boolean 
	 *         entity=[Entity|ID]
	 *     )
	 */
	protected void sequence_Form(EObject context, Form semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExtendedPackage.Literals.FORM_TYPES__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtendedPackage.Literals.FORM_TYPES__NAME));
			if(transientValues.isValueTransient(semanticObject, ExtendedPackage.Literals.FORM__GET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtendedPackage.Literals.FORM__GET));
			if(transientValues.isValueTransient(semanticObject, ExtendedPackage.Literals.FORM__POST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtendedPackage.Literals.FORM__POST));
			if(transientValues.isValueTransient(semanticObject, ExtendedPackage.Literals.FORM__PUT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtendedPackage.Literals.FORM__PUT));
			if(transientValues.isValueTransient(semanticObject, ExtendedPackage.Literals.FORM__DELETE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtendedPackage.Literals.FORM__DELETE));
			if(transientValues.isValueTransient(semanticObject, ExtendedPackage.Literals.FORM__ENTITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtendedPackage.Literals.FORM__ENTITY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFormAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getFormAccess().getGetBooleanParserRuleCall_5_0(), semanticObject.getGet());
		feeder.accept(grammarAccess.getFormAccess().getPostBooleanParserRuleCall_8_0(), semanticObject.getPost());
		feeder.accept(grammarAccess.getFormAccess().getPutBooleanParserRuleCall_11_0(), semanticObject.getPut());
		feeder.accept(grammarAccess.getFormAccess().getDeleteBooleanParserRuleCall_14_0(), semanticObject.getDelete());
		feeder.accept(grammarAccess.getFormAccess().getEntityEntityIDTerminalRuleCall_15_0_1(), semanticObject.getEntity());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     importedNamespace=QualifiedNameWithWildcard
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExtendedPackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtendedPackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=QualifiedName elements+=AbstractElement*)
	 */
	protected void sequence_PackageDeclaration(EObject context, PackageDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID title=STRING? header=Boolean footer=Boolean forms+=[FormTypes|ID]*)
	 */
	protected void sequence_Page(EObject context, Page semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
