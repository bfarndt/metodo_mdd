/*
* generated by Xtext
*/
package org.example.domainmodel.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.example.domainmodel.services.ExtendedGrammarAccess;

public class ExtendedParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private ExtendedGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.example.domainmodel.parser.antlr.internal.InternalExtendedParser createParser(XtextTokenStream stream) {
		return new org.example.domainmodel.parser.antlr.internal.InternalExtendedParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Domainmodel";
	}
	
	public ExtendedGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ExtendedGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
