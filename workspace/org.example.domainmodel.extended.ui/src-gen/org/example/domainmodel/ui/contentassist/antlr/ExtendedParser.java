/*
* generated by Xtext
*/
package org.example.domainmodel.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.example.domainmodel.services.ExtendedGrammarAccess;

public class ExtendedParser extends AbstractContentAssistParser {
	
	@Inject
	private ExtendedGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.example.domainmodel.ui.contentassist.antlr.internal.InternalExtendedParser createParser() {
		org.example.domainmodel.ui.contentassist.antlr.internal.InternalExtendedParser result = new org.example.domainmodel.ui.contentassist.antlr.internal.InternalExtendedParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getAbstractElementAccess().getAlternatives(), "rule__AbstractElement__Alternatives");
					put(grammarAccess.getAbstractTypeAccess().getAlternatives(), "rule__AbstractType__Alternatives");
					put(grammarAccess.getDataTypeAccess().getNameAlternatives_0(), "rule__DataType__NameAlternatives_0");
					put(grammarAccess.getBooleanAccess().getAlternatives(), "rule__Boolean__Alternatives");
					put(grammarAccess.getFormTypesAccess().getAlternatives(), "rule__FormTypes__Alternatives");
					put(grammarAccess.getDomainmodelAccess().getGroup(), "rule__Domainmodel__Group__0");
					put(grammarAccess.getPackageDeclarationAccess().getGroup(), "rule__PackageDeclaration__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
					put(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup(), "rule__QualifiedNameWithWildcard__Group__0");
					put(grammarAccess.getEntityAccess().getGroup(), "rule__Entity__Group__0");
					put(grammarAccess.getEntityAccess().getGroup_2(), "rule__Entity__Group_2__0");
					put(grammarAccess.getFeatureAccess().getGroup(), "rule__Feature__Group__0");
					put(grammarAccess.getFeatureAccess().getGroup_1(), "rule__Feature__Group_1__0");
					put(grammarAccess.getPageAccess().getGroup(), "rule__Page__Group__0");
					put(grammarAccess.getPageAccess().getGroup_3(), "rule__Page__Group_3__0");
					put(grammarAccess.getFormAccess().getGroup(), "rule__Form__Group__0");
					put(grammarAccess.getFormNewEntityOnlyAccess().getGroup(), "rule__FormNewEntityOnly__Group__0");
					put(grammarAccess.getFormReportAccess().getGroup(), "rule__FormReport__Group__0");
					put(grammarAccess.getDomainmodelAccess().getNomeProjAssignment_1(), "rule__Domainmodel__NomeProjAssignment_1");
					put(grammarAccess.getDomainmodelAccess().getElementsAssignment_3(), "rule__Domainmodel__ElementsAssignment_3");
					put(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1(), "rule__PackageDeclaration__NameAssignment_1");
					put(grammarAccess.getPackageDeclarationAccess().getElementsAssignment_3(), "rule__PackageDeclaration__ElementsAssignment_3");
					put(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1(), "rule__Import__ImportedNamespaceAssignment_1");
					put(grammarAccess.getDataTypeAccess().getNameAssignment(), "rule__DataType__NameAssignment");
					put(grammarAccess.getEntityTypeAccess().getEntityAssignment(), "rule__EntityType__EntityAssignment");
					put(grammarAccess.getEntityAccess().getNameAssignment_1(), "rule__Entity__NameAssignment_1");
					put(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_1(), "rule__Entity__SuperTypeAssignment_2_1");
					put(grammarAccess.getEntityAccess().getFeaturesAssignment_4(), "rule__Entity__FeaturesAssignment_4");
					put(grammarAccess.getFeatureAccess().getRequiredAssignment_0(), "rule__Feature__RequiredAssignment_0");
					put(grammarAccess.getFeatureAccess().getMinAssignment_1_0(), "rule__Feature__MinAssignment_1_0");
					put(grammarAccess.getFeatureAccess().getMaxAssignment_1_2(), "rule__Feature__MaxAssignment_1_2");
					put(grammarAccess.getFeatureAccess().getNameAssignment_2(), "rule__Feature__NameAssignment_2");
					put(grammarAccess.getFeatureAccess().getTypeAssignment_4(), "rule__Feature__TypeAssignment_4");
					put(grammarAccess.getPageAccess().getNameAssignment_1(), "rule__Page__NameAssignment_1");
					put(grammarAccess.getPageAccess().getTitleAssignment_3_2(), "rule__Page__TitleAssignment_3_2");
					put(grammarAccess.getPageAccess().getHeaderAssignment_6(), "rule__Page__HeaderAssignment_6");
					put(grammarAccess.getPageAccess().getFooterAssignment_9(), "rule__Page__FooterAssignment_9");
					put(grammarAccess.getPageAccess().getFormsAssignment_10(), "rule__Page__FormsAssignment_10");
					put(grammarAccess.getFormAccess().getNameAssignment_1(), "rule__Form__NameAssignment_1");
					put(grammarAccess.getFormAccess().getGetAssignment_5(), "rule__Form__GetAssignment_5");
					put(grammarAccess.getFormAccess().getPostAssignment_8(), "rule__Form__PostAssignment_8");
					put(grammarAccess.getFormAccess().getPutAssignment_11(), "rule__Form__PutAssignment_11");
					put(grammarAccess.getFormAccess().getDeleteAssignment_14(), "rule__Form__DeleteAssignment_14");
					put(grammarAccess.getFormAccess().getEntityAssignment_15(), "rule__Form__EntityAssignment_15");
					put(grammarAccess.getFormNewEntityOnlyAccess().getNameAssignment_1(), "rule__FormNewEntityOnly__NameAssignment_1");
					put(grammarAccess.getFormNewEntityOnlyAccess().getEntityAssignment_3(), "rule__FormNewEntityOnly__EntityAssignment_3");
					put(grammarAccess.getFormReportAccess().getNameAssignment_1(), "rule__FormReport__NameAssignment_1");
					put(grammarAccess.getFormReportAccess().getFilterAssignment_5(), "rule__FormReport__FilterAssignment_5");
					put(grammarAccess.getFormReportAccess().getOrderAssignment_8(), "rule__FormReport__OrderAssignment_8");
					put(grammarAccess.getFormReportAccess().getPaginationAssignment_11(), "rule__FormReport__PaginationAssignment_11");
					put(grammarAccess.getFormReportAccess().getEntityAssignment_12(), "rule__FormReport__EntityAssignment_12");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.example.domainmodel.ui.contentassist.antlr.internal.InternalExtendedParser typedParser = (org.example.domainmodel.ui.contentassist.antlr.internal.InternalExtendedParser) parser;
			typedParser.entryRuleDomainmodel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public ExtendedGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ExtendedGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
