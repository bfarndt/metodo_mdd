package org.example.domainmodel.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.example.domainmodel.services.ExtendedGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExtendedParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'project'", "'begin'", "'end'", "'package'", "'{'", "'}'", "'.'", "'import'", "'.*'", "'string'", "'int'", "'float'", "'currency'", "'date'", "'time'", "'boolean'", "'entity'", "'extends'", "'required'", "'..'", "':'", "'true'", "'false'", "'page'", "'title'", "'header'", "'footer'", "'form'", "'get'", "'post'", "'put'", "'delete'", "'formNewEntity'", "'formReport'", "'filter'", "'order'", "'pagination'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=4;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalExtendedParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalExtendedParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalExtendedParser.tokenNames; }
    public String getGrammarFileName() { return "../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g"; }



     	private ExtendedGrammarAccess grammarAccess;
     	
        public InternalExtendedParser(TokenStream input, ExtendedGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Domainmodel";	
       	}
       	
       	@Override
       	protected ExtendedGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDomainmodel"
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:67:1: entryRuleDomainmodel returns [EObject current=null] : iv_ruleDomainmodel= ruleDomainmodel EOF ;
    public final EObject entryRuleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainmodel = null;


        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:68:2: (iv_ruleDomainmodel= ruleDomainmodel EOF )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:69:2: iv_ruleDomainmodel= ruleDomainmodel EOF
            {
             newCompositeNode(grammarAccess.getDomainmodelRule()); 
            pushFollow(FOLLOW_ruleDomainmodel_in_entryRuleDomainmodel75);
            iv_ruleDomainmodel=ruleDomainmodel();

            state._fsp--;

             current =iv_ruleDomainmodel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainmodel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDomainmodel"


    // $ANTLR start "ruleDomainmodel"
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:76:1: ruleDomainmodel returns [EObject current=null] : (otherlv_0= 'project' ( (lv_nomeProj_1_0= RULE_STRING ) ) otherlv_2= 'begin' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= 'end' ) ;
    public final EObject ruleDomainmodel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nomeProj_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:79:28: ( (otherlv_0= 'project' ( (lv_nomeProj_1_0= RULE_STRING ) ) otherlv_2= 'begin' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= 'end' ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:80:1: (otherlv_0= 'project' ( (lv_nomeProj_1_0= RULE_STRING ) ) otherlv_2= 'begin' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= 'end' )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:80:1: (otherlv_0= 'project' ( (lv_nomeProj_1_0= RULE_STRING ) ) otherlv_2= 'begin' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= 'end' )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:80:3: otherlv_0= 'project' ( (lv_nomeProj_1_0= RULE_STRING ) ) otherlv_2= 'begin' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= 'end'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleDomainmodel122); 

                	newLeafNode(otherlv_0, grammarAccess.getDomainmodelAccess().getProjectKeyword_0());
                
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:84:1: ( (lv_nomeProj_1_0= RULE_STRING ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:85:1: (lv_nomeProj_1_0= RULE_STRING )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:85:1: (lv_nomeProj_1_0= RULE_STRING )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:86:3: lv_nomeProj_1_0= RULE_STRING
            {
            lv_nomeProj_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDomainmodel139); 

            			newLeafNode(lv_nomeProj_1_0, grammarAccess.getDomainmodelAccess().getNomeProjSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDomainmodelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"nomeProj",
                    		lv_nomeProj_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleDomainmodel156); 

                	newLeafNode(otherlv_2, grammarAccess.getDomainmodelAccess().getBeginKeyword_2());
                
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:106:1: ( (lv_elements_3_0= ruleAbstractElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14||LA1_0==18||LA1_0==27||LA1_0==34||LA1_0==38||(LA1_0>=43 && LA1_0<=44)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:107:1: (lv_elements_3_0= ruleAbstractElement )
            	    {
            	    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:107:1: (lv_elements_3_0= ruleAbstractElement )
            	    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:108:3: lv_elements_3_0= ruleAbstractElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDomainmodelAccess().getElementsAbstractElementParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractElement_in_ruleDomainmodel177);
            	    lv_elements_3_0=ruleAbstractElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDomainmodelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_3_0, 
            	            		"AbstractElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleDomainmodel190); 

                	newLeafNode(otherlv_4, grammarAccess.getDomainmodelAccess().getEndKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDomainmodel"


    // $ANTLR start "entryRulePackageDeclaration"
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:136:1: entryRulePackageDeclaration returns [EObject current=null] : iv_rulePackageDeclaration= rulePackageDeclaration EOF ;
    public final EObject entryRulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDeclaration = null;


        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:137:2: (iv_rulePackageDeclaration= rulePackageDeclaration EOF )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:138:2: iv_rulePackageDeclaration= rulePackageDeclaration EOF
            {
             newCompositeNode(grammarAccess.getPackageDeclarationRule()); 
            pushFollow(FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration226);
            iv_rulePackageDeclaration=rulePackageDeclaration();

            state._fsp--;

             current =iv_rulePackageDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageDeclaration236); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackageDeclaration"


    // $ANTLR start "rulePackageDeclaration"
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:145:1: rulePackageDeclaration returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' ) ;
    public final EObject rulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:148:28: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:149:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:149:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:149:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_rulePackageDeclaration273); 

                	newLeafNode(otherlv_0, grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0());
                
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:153:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:154:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:154:1: (lv_name_1_0= ruleQualifiedName )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:155:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePackageDeclaration294);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_rulePackageDeclaration306); 

                	newLeafNode(otherlv_2, grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:175:1: ( (lv_elements_3_0= ruleAbstractElement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14||LA2_0==18||LA2_0==27||LA2_0==34||LA2_0==38||(LA2_0>=43 && LA2_0<=44)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:176:1: (lv_elements_3_0= ruleAbstractElement )
            	    {
            	    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:176:1: (lv_elements_3_0= ruleAbstractElement )
            	    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:177:3: lv_elements_3_0= ruleAbstractElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageDeclarationAccess().getElementsAbstractElementParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractElement_in_rulePackageDeclaration327);
            	    lv_elements_3_0=ruleAbstractElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_3_0, 
            	            		"AbstractElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_rulePackageDeclaration340); 

                	newLeafNode(otherlv_4, grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackageDeclaration"


    // $ANTLR start "entryRuleAbstractElement"
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:205:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:206:2: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:207:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement376);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;

             current =iv_ruleAbstractElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElement386); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:214:1: ruleAbstractElement returns [EObject current=null] : (this_PackageDeclaration_0= rulePackageDeclaration | this_Entity_1= ruleEntity | this_Import_2= ruleImport | this_Page_3= rulePage | this_FormTypes_4= ruleFormTypes ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_PackageDeclaration_0 = null;

        EObject this_Entity_1 = null;

        EObject this_Import_2 = null;

        EObject this_Page_3 = null;

        EObject this_FormTypes_4 = null;


         enterRule(); 
            
        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:217:28: ( (this_PackageDeclaration_0= rulePackageDeclaration | this_Entity_1= ruleEntity | this_Import_2= ruleImport | this_Page_3= rulePage | this_FormTypes_4= ruleFormTypes ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:218:1: (this_PackageDeclaration_0= rulePackageDeclaration | this_Entity_1= ruleEntity | this_Import_2= ruleImport | this_Page_3= rulePage | this_FormTypes_4= ruleFormTypes )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:218:1: (this_PackageDeclaration_0= rulePackageDeclaration | this_Entity_1= ruleEntity | this_Import_2= ruleImport | this_Page_3= rulePage | this_FormTypes_4= ruleFormTypes )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 27:
                {
                alt3=2;
                }
                break;
            case 18:
                {
                alt3=3;
                }
                break;
            case 34:
                {
                alt3=4;
                }
                break;
            case 38:
            case 43:
            case 44:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:219:5: this_PackageDeclaration_0= rulePackageDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getPackageDeclarationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePackageDeclaration_in_ruleAbstractElement433);
                    this_PackageDeclaration_0=rulePackageDeclaration();

                    state._fsp--;

                     
                            current = this_PackageDeclaration_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:229:5: this_Entity_1= ruleEntity
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getEntityParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEntity_in_ruleAbstractElement460);
                    this_Entity_1=ruleEntity();

                    state._fsp--;

                     
                            current = this_Entity_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:239:5: this_Import_2= ruleImport
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getImportParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleImport_in_ruleAbstractElement487);
                    this_Import_2=ruleImport();

                    state._fsp--;

                     
                            current = this_Import_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:249:5: this_Page_3= rulePage
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getPageParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_rulePage_in_ruleAbstractElement514);
                    this_Page_3=rulePage();

                    state._fsp--;

                     
                            current = this_Page_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:259:5: this_FormTypes_4= ruleFormTypes
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getFormTypesParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleFormTypes_in_ruleAbstractElement541);
                    this_FormTypes_4=ruleFormTypes();

                    state._fsp--;

                     
                            current = this_FormTypes_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:275:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:276:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:277:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName577);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName588); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:284:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:287:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:288:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:288:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:288:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName628); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:295:1: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:296:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,17,FOLLOW_17_in_ruleQualifiedName647); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName662); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleImport"
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:316:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:317:2: (iv_ruleImport= ruleImport EOF )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:318:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport709);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport719); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:325:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:328:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:329:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:329:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:329:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleImport756); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:333:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:334:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:334:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:335:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
             
            	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport777);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImportRule());
            	        }
                   		set(
                   			current, 
                   			"importedNamespace",
                    		lv_importedNamespace_1_0, 
                    		"QualifiedNameWithWildcard");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:359:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:360:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:361:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard814);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard825); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:368:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:371:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:372:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:372:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:373:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard872);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:383:1: (kw= '.*' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:384:2: kw= '.*'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleQualifiedNameWithWildcard891); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleAbstractType"
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:397:1: entryRuleAbstractType returns [EObject current=null] : iv_ruleAbstractType= ruleAbstractType EOF ;
    public final EObject entryRuleAbstractType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractType = null;


        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:398:2: (iv_ruleAbstractType= ruleAbstractType EOF )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:399:2: iv_ruleAbstractType= ruleAbstractType EOF
            {
             newCompositeNode(grammarAccess.getAbstractTypeRule()); 
            pushFollow(FOLLOW_ruleAbstractType_in_entryRuleAbstractType933);
            iv_ruleAbstractType=ruleAbstractType();

            state._fsp--;

             current =iv_ruleAbstractType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractType943); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractType"


    // $ANTLR start "ruleAbstractType"
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:406:1: ruleAbstractType returns [EObject current=null] : (this_DataType_0= ruleDataType | this_EntityType_1= ruleEntityType ) ;
    public final EObject ruleAbstractType() throws RecognitionException {
        EObject current = null;

        EObject this_DataType_0 = null;

        EObject this_EntityType_1 = null;


         enterRule(); 
            
        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:409:28: ( (this_DataType_0= ruleDataType | this_EntityType_1= ruleEntityType ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:410:1: (this_DataType_0= ruleDataType | this_EntityType_1= ruleEntityType )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:410:1: (this_DataType_0= ruleDataType | this_EntityType_1= ruleEntityType )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=20 && LA6_0<=26)) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:411:5: this_DataType_0= ruleDataType
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractTypeAccess().getDataTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDataType_in_ruleAbstractType990);
                    this_DataType_0=ruleDataType();

                    state._fsp--;

                     
                            current = this_DataType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:421:5: this_EntityType_1= ruleEntityType
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractTypeAccess().getEntityTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEntityType_in_ruleAbstractType1017);
                    this_EntityType_1=ruleEntityType();

                    state._fsp--;

                     
                            current = this_EntityType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractType"


    // $ANTLR start "entryRuleDataType"
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:437:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:438:2: (iv_ruleDataType= ruleDataType EOF )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:439:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType1052);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType1062); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:446:1: ruleDataType returns [EObject current=null] : ( ( (lv_name_0_1= 'string' | lv_name_0_2= 'int' | lv_name_0_3= 'float' | lv_name_0_4= 'currency' | lv_name_0_5= 'date' | lv_name_0_6= 'time' | lv_name_0_7= 'boolean' ) ) ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;
        Token lv_name_0_4=null;
        Token lv_name_0_5=null;
        Token lv_name_0_6=null;
        Token lv_name_0_7=null;

         enterRule(); 
            
        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:449:28: ( ( ( (lv_name_0_1= 'string' | lv_name_0_2= 'int' | lv_name_0_3= 'float' | lv_name_0_4= 'currency' | lv_name_0_5= 'date' | lv_name_0_6= 'time' | lv_name_0_7= 'boolean' ) ) ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:450:1: ( ( (lv_name_0_1= 'string' | lv_name_0_2= 'int' | lv_name_0_3= 'float' | lv_name_0_4= 'currency' | lv_name_0_5= 'date' | lv_name_0_6= 'time' | lv_name_0_7= 'boolean' ) ) )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:450:1: ( ( (lv_name_0_1= 'string' | lv_name_0_2= 'int' | lv_name_0_3= 'float' | lv_name_0_4= 'currency' | lv_name_0_5= 'date' | lv_name_0_6= 'time' | lv_name_0_7= 'boolean' ) ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:451:1: ( (lv_name_0_1= 'string' | lv_name_0_2= 'int' | lv_name_0_3= 'float' | lv_name_0_4= 'currency' | lv_name_0_5= 'date' | lv_name_0_6= 'time' | lv_name_0_7= 'boolean' ) )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:451:1: ( (lv_name_0_1= 'string' | lv_name_0_2= 'int' | lv_name_0_3= 'float' | lv_name_0_4= 'currency' | lv_name_0_5= 'date' | lv_name_0_6= 'time' | lv_name_0_7= 'boolean' ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:452:1: (lv_name_0_1= 'string' | lv_name_0_2= 'int' | lv_name_0_3= 'float' | lv_name_0_4= 'currency' | lv_name_0_5= 'date' | lv_name_0_6= 'time' | lv_name_0_7= 'boolean' )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:452:1: (lv_name_0_1= 'string' | lv_name_0_2= 'int' | lv_name_0_3= 'float' | lv_name_0_4= 'currency' | lv_name_0_5= 'date' | lv_name_0_6= 'time' | lv_name_0_7= 'boolean' )
            int alt7=7;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt7=1;
                }
                break;
            case 21:
                {
                alt7=2;
                }
                break;
            case 22:
                {
                alt7=3;
                }
                break;
            case 23:
                {
                alt7=4;
                }
                break;
            case 24:
                {
                alt7=5;
                }
                break;
            case 25:
                {
                alt7=6;
                }
                break;
            case 26:
                {
                alt7=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:453:3: lv_name_0_1= 'string'
                    {
                    lv_name_0_1=(Token)match(input,20,FOLLOW_20_in_ruleDataType1106); 

                            newLeafNode(lv_name_0_1, grammarAccess.getDataTypeAccess().getNameStringKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataTypeRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:465:8: lv_name_0_2= 'int'
                    {
                    lv_name_0_2=(Token)match(input,21,FOLLOW_21_in_ruleDataType1135); 

                            newLeafNode(lv_name_0_2, grammarAccess.getDataTypeAccess().getNameIntKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataTypeRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:477:8: lv_name_0_3= 'float'
                    {
                    lv_name_0_3=(Token)match(input,22,FOLLOW_22_in_ruleDataType1164); 

                            newLeafNode(lv_name_0_3, grammarAccess.getDataTypeAccess().getNameFloatKeyword_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataTypeRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:489:8: lv_name_0_4= 'currency'
                    {
                    lv_name_0_4=(Token)match(input,23,FOLLOW_23_in_ruleDataType1193); 

                            newLeafNode(lv_name_0_4, grammarAccess.getDataTypeAccess().getNameCurrencyKeyword_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataTypeRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:501:8: lv_name_0_5= 'date'
                    {
                    lv_name_0_5=(Token)match(input,24,FOLLOW_24_in_ruleDataType1222); 

                            newLeafNode(lv_name_0_5, grammarAccess.getDataTypeAccess().getNameDateKeyword_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataTypeRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:513:8: lv_name_0_6= 'time'
                    {
                    lv_name_0_6=(Token)match(input,25,FOLLOW_25_in_ruleDataType1251); 

                            newLeafNode(lv_name_0_6, grammarAccess.getDataTypeAccess().getNameTimeKeyword_0_5());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataTypeRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_6, null);
                    	    

                    }
                    break;
                case 7 :
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:525:8: lv_name_0_7= 'boolean'
                    {
                    lv_name_0_7=(Token)match(input,26,FOLLOW_26_in_ruleDataType1280); 

                            newLeafNode(lv_name_0_7, grammarAccess.getDataTypeAccess().getNameBooleanKeyword_0_6());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataTypeRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_7, null);
                    	    

                    }
                    break;

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleEntityType"
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:548:1: entryRuleEntityType returns [EObject current=null] : iv_ruleEntityType= ruleEntityType EOF ;
    public final EObject entryRuleEntityType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityType = null;


        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:549:2: (iv_ruleEntityType= ruleEntityType EOF )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:550:2: iv_ruleEntityType= ruleEntityType EOF
            {
             newCompositeNode(grammarAccess.getEntityTypeRule()); 
            pushFollow(FOLLOW_ruleEntityType_in_entryRuleEntityType1331);
            iv_ruleEntityType=ruleEntityType();

            state._fsp--;

             current =iv_ruleEntityType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityType1341); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityType"


    // $ANTLR start "ruleEntityType"
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:557:1: ruleEntityType returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleEntityType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:560:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:561:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:561:1: ( (otherlv_0= RULE_ID ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:562:1: (otherlv_0= RULE_ID )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:562:1: (otherlv_0= RULE_ID )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:563:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityTypeRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntityType1385); 

            		newLeafNode(otherlv_0, grammarAccess.getEntityTypeAccess().getEntityEntityCrossReference_0()); 
            	

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityType"


    // $ANTLR start "entryRuleEntity"
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:582:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:583:2: (iv_ruleEntity= ruleEntity EOF )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:584:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity1420);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity1430); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:591:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_features_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:594:28: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:595:1: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:595:1: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:595:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleEntity1467); 

                	newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
                
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:599:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:600:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:600:1: (lv_name_1_0= RULE_ID )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:601:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity1484); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:617:2: (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:617:4: otherlv_2= 'extends' ( ( ruleQualifiedName ) )
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleEntity1502); 

                        	newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getExtendsKeyword_2_0());
                        
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:621:1: ( ( ruleQualifiedName ) )
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:622:1: ( ruleQualifiedName )
                    {
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:622:1: ( ruleQualifiedName )
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:623:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleEntity1525);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleEntity1539); 

                	newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:640:1: ( (lv_features_5_0= ruleFeature ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_INT)||LA9_0==29) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:641:1: (lv_features_5_0= ruleFeature )
            	    {
            	    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:641:1: (lv_features_5_0= ruleFeature )
            	    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:642:3: lv_features_5_0= ruleFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFeature_in_ruleEntity1560);
            	    lv_features_5_0=ruleFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_5_0, 
            	            		"Feature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleEntity1573); 

                	newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleFeature"
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:670:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:671:2: (iv_ruleFeature= ruleFeature EOF )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:672:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature1609);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature1619); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:679:1: ruleFeature returns [EObject current=null] : ( ( (lv_required_0_0= 'required' ) )? ( ( (lv_min_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_INT ) ) )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' ( (lv_type_6_0= ruleAbstractType ) ) ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_required_0_0=null;
        Token lv_min_1_0=null;
        Token otherlv_2=null;
        Token lv_max_3_0=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        EObject lv_type_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:682:28: ( ( ( (lv_required_0_0= 'required' ) )? ( ( (lv_min_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_INT ) ) )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' ( (lv_type_6_0= ruleAbstractType ) ) ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:683:1: ( ( (lv_required_0_0= 'required' ) )? ( ( (lv_min_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_INT ) ) )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' ( (lv_type_6_0= ruleAbstractType ) ) )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:683:1: ( ( (lv_required_0_0= 'required' ) )? ( ( (lv_min_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_INT ) ) )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' ( (lv_type_6_0= ruleAbstractType ) ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:683:2: ( (lv_required_0_0= 'required' ) )? ( ( (lv_min_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_INT ) ) )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' ( (lv_type_6_0= ruleAbstractType ) )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:683:2: ( (lv_required_0_0= 'required' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:684:1: (lv_required_0_0= 'required' )
                    {
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:684:1: (lv_required_0_0= 'required' )
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:685:3: lv_required_0_0= 'required'
                    {
                    lv_required_0_0=(Token)match(input,29,FOLLOW_29_in_ruleFeature1662); 

                            newLeafNode(lv_required_0_0, grammarAccess.getFeatureAccess().getRequiredRequiredKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "required", lv_required_0_0, "required");
                    	    

                    }


                    }
                    break;

            }

            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:698:3: ( ( (lv_min_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_INT ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:698:4: ( (lv_min_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_INT ) )
                    {
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:698:4: ( (lv_min_1_0= RULE_INT ) )
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:699:1: (lv_min_1_0= RULE_INT )
                    {
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:699:1: (lv_min_1_0= RULE_INT )
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:700:3: lv_min_1_0= RULE_INT
                    {
                    lv_min_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFeature1694); 

                    			newLeafNode(lv_min_1_0, grammarAccess.getFeatureAccess().getMinINTTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeatureRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"min",
                            		lv_min_1_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleFeature1711); 

                        	newLeafNode(otherlv_2, grammarAccess.getFeatureAccess().getFullStopFullStopKeyword_1_1());
                        
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:720:1: ( (lv_max_3_0= RULE_INT ) )
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:721:1: (lv_max_3_0= RULE_INT )
                    {
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:721:1: (lv_max_3_0= RULE_INT )
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:722:3: lv_max_3_0= RULE_INT
                    {
                    lv_max_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFeature1728); 

                    			newLeafNode(lv_max_3_0, grammarAccess.getFeatureAccess().getMaxINTTerminalRuleCall_1_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeatureRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"max",
                            		lv_max_3_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:738:4: ( (lv_name_4_0= RULE_ID ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:739:1: (lv_name_4_0= RULE_ID )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:739:1: (lv_name_4_0= RULE_ID )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:740:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeature1752); 

            			newLeafNode(lv_name_4_0, grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFeatureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"ID");
            	    

            }


            }

            otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleFeature1769); 

                	newLeafNode(otherlv_5, grammarAccess.getFeatureAccess().getColonKeyword_3());
                
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:760:1: ( (lv_type_6_0= ruleAbstractType ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:761:1: (lv_type_6_0= ruleAbstractType )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:761:1: (lv_type_6_0= ruleAbstractType )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:762:3: lv_type_6_0= ruleAbstractType
            {
             
            	        newCompositeNode(grammarAccess.getFeatureAccess().getTypeAbstractTypeParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleAbstractType_in_ruleFeature1790);
            lv_type_6_0=ruleAbstractType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFeatureRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_6_0, 
                    		"AbstractType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleBoolean"
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:786:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;


        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:787:2: (iv_ruleBoolean= ruleBoolean EOF )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:788:2: iv_ruleBoolean= ruleBoolean EOF
            {
             newCompositeNode(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_ruleBoolean_in_entryRuleBoolean1827);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;

             current =iv_ruleBoolean.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolean1838); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:795:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:798:28: ( (kw= 'true' | kw= 'false' ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:799:1: (kw= 'true' | kw= 'false' )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:799:1: (kw= 'true' | kw= 'false' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==32) ) {
                alt12=1;
            }
            else if ( (LA12_0==33) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:800:2: kw= 'true'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleBoolean1876); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBooleanAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:807:2: kw= 'false'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleBoolean1895); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBooleanAccess().getFalseKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRulePage"
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:820:1: entryRulePage returns [EObject current=null] : iv_rulePage= rulePage EOF ;
    public final EObject entryRulePage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePage = null;


        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:821:2: (iv_rulePage= rulePage EOF )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:822:2: iv_rulePage= rulePage EOF
            {
             newCompositeNode(grammarAccess.getPageRule()); 
            pushFollow(FOLLOW_rulePage_in_entryRulePage1935);
            iv_rulePage=rulePage();

            state._fsp--;

             current =iv_rulePage; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePage1945); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePage"


    // $ANTLR start "rulePage"
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:829:1: rulePage returns [EObject current=null] : (otherlv_0= 'page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'title' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) )? otherlv_6= 'header' otherlv_7= ':' ( (lv_header_8_0= ruleBoolean ) ) otherlv_9= 'footer' otherlv_10= ':' ( (lv_footer_11_0= ruleBoolean ) ) ( (otherlv_12= RULE_ID ) )* otherlv_13= '}' ) ;
    public final EObject rulePage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_title_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_header_8_0 = null;

        AntlrDatatypeRuleToken lv_footer_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:832:28: ( (otherlv_0= 'page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'title' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) )? otherlv_6= 'header' otherlv_7= ':' ( (lv_header_8_0= ruleBoolean ) ) otherlv_9= 'footer' otherlv_10= ':' ( (lv_footer_11_0= ruleBoolean ) ) ( (otherlv_12= RULE_ID ) )* otherlv_13= '}' ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:833:1: (otherlv_0= 'page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'title' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) )? otherlv_6= 'header' otherlv_7= ':' ( (lv_header_8_0= ruleBoolean ) ) otherlv_9= 'footer' otherlv_10= ':' ( (lv_footer_11_0= ruleBoolean ) ) ( (otherlv_12= RULE_ID ) )* otherlv_13= '}' )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:833:1: (otherlv_0= 'page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'title' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) )? otherlv_6= 'header' otherlv_7= ':' ( (lv_header_8_0= ruleBoolean ) ) otherlv_9= 'footer' otherlv_10= ':' ( (lv_footer_11_0= ruleBoolean ) ) ( (otherlv_12= RULE_ID ) )* otherlv_13= '}' )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:833:3: otherlv_0= 'page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'title' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) )? otherlv_6= 'header' otherlv_7= ':' ( (lv_header_8_0= ruleBoolean ) ) otherlv_9= 'footer' otherlv_10= ':' ( (lv_footer_11_0= ruleBoolean ) ) ( (otherlv_12= RULE_ID ) )* otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_rulePage1982); 

                	newLeafNode(otherlv_0, grammarAccess.getPageAccess().getPageKeyword_0());
                
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:837:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:838:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:838:1: (lv_name_1_0= RULE_ID )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:839:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePage1999); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPageAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPageRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_rulePage2016); 

                	newLeafNode(otherlv_2, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:859:1: (otherlv_3= 'title' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==35) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:859:3: otherlv_3= 'title' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_35_in_rulePage2029); 

                        	newLeafNode(otherlv_3, grammarAccess.getPageAccess().getTitleKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,31,FOLLOW_31_in_rulePage2041); 

                        	newLeafNode(otherlv_4, grammarAccess.getPageAccess().getColonKeyword_3_1());
                        
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:867:1: ( (lv_title_5_0= RULE_STRING ) )
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:868:1: (lv_title_5_0= RULE_STRING )
                    {
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:868:1: (lv_title_5_0= RULE_STRING )
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:869:3: lv_title_5_0= RULE_STRING
                    {
                    lv_title_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePage2058); 

                    			newLeafNode(lv_title_5_0, grammarAccess.getPageAccess().getTitleSTRINGTerminalRuleCall_3_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPageRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"title",
                            		lv_title_5_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,36,FOLLOW_36_in_rulePage2077); 

                	newLeafNode(otherlv_6, grammarAccess.getPageAccess().getHeaderKeyword_4());
                
            otherlv_7=(Token)match(input,31,FOLLOW_31_in_rulePage2089); 

                	newLeafNode(otherlv_7, grammarAccess.getPageAccess().getColonKeyword_5());
                
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:893:1: ( (lv_header_8_0= ruleBoolean ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:894:1: (lv_header_8_0= ruleBoolean )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:894:1: (lv_header_8_0= ruleBoolean )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:895:3: lv_header_8_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getPageAccess().getHeaderBooleanParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_rulePage2110);
            lv_header_8_0=ruleBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPageRule());
            	        }
                   		set(
                   			current, 
                   			"header",
                    		lv_header_8_0, 
                    		"Boolean");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_9=(Token)match(input,37,FOLLOW_37_in_rulePage2122); 

                	newLeafNode(otherlv_9, grammarAccess.getPageAccess().getFooterKeyword_7());
                
            otherlv_10=(Token)match(input,31,FOLLOW_31_in_rulePage2134); 

                	newLeafNode(otherlv_10, grammarAccess.getPageAccess().getColonKeyword_8());
                
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:919:1: ( (lv_footer_11_0= ruleBoolean ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:920:1: (lv_footer_11_0= ruleBoolean )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:920:1: (lv_footer_11_0= ruleBoolean )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:921:3: lv_footer_11_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getPageAccess().getFooterBooleanParserRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_rulePage2155);
            lv_footer_11_0=ruleBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPageRule());
            	        }
                   		set(
                   			current, 
                   			"footer",
                    		lv_footer_11_0, 
                    		"Boolean");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:937:2: ( (otherlv_12= RULE_ID ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:938:1: (otherlv_12= RULE_ID )
            	    {
            	    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:938:1: (otherlv_12= RULE_ID )
            	    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:939:3: otherlv_12= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getPageRule());
            	    	        }
            	            
            	    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePage2175); 

            	    		newLeafNode(otherlv_12, grammarAccess.getPageAccess().getFormsFormTypesCrossReference_10_0()); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_13=(Token)match(input,16,FOLLOW_16_in_rulePage2188); 

                	newLeafNode(otherlv_13, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_11());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePage"


    // $ANTLR start "entryRuleFormTypes"
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:962:1: entryRuleFormTypes returns [EObject current=null] : iv_ruleFormTypes= ruleFormTypes EOF ;
    public final EObject entryRuleFormTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormTypes = null;


        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:963:2: (iv_ruleFormTypes= ruleFormTypes EOF )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:964:2: iv_ruleFormTypes= ruleFormTypes EOF
            {
             newCompositeNode(grammarAccess.getFormTypesRule()); 
            pushFollow(FOLLOW_ruleFormTypes_in_entryRuleFormTypes2224);
            iv_ruleFormTypes=ruleFormTypes();

            state._fsp--;

             current =iv_ruleFormTypes; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormTypes2234); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFormTypes"


    // $ANTLR start "ruleFormTypes"
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:971:1: ruleFormTypes returns [EObject current=null] : (this_Form_0= ruleForm | this_FormNewEntityOnly_1= ruleFormNewEntityOnly | this_FormReport_2= ruleFormReport ) ;
    public final EObject ruleFormTypes() throws RecognitionException {
        EObject current = null;

        EObject this_Form_0 = null;

        EObject this_FormNewEntityOnly_1 = null;

        EObject this_FormReport_2 = null;


         enterRule(); 
            
        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:974:28: ( (this_Form_0= ruleForm | this_FormNewEntityOnly_1= ruleFormNewEntityOnly | this_FormReport_2= ruleFormReport ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:975:1: (this_Form_0= ruleForm | this_FormNewEntityOnly_1= ruleFormNewEntityOnly | this_FormReport_2= ruleFormReport )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:975:1: (this_Form_0= ruleForm | this_FormNewEntityOnly_1= ruleFormNewEntityOnly | this_FormReport_2= ruleFormReport )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt15=1;
                }
                break;
            case 43:
                {
                alt15=2;
                }
                break;
            case 44:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:976:5: this_Form_0= ruleForm
                    {
                     
                            newCompositeNode(grammarAccess.getFormTypesAccess().getFormParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleForm_in_ruleFormTypes2281);
                    this_Form_0=ruleForm();

                    state._fsp--;

                     
                            current = this_Form_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:986:5: this_FormNewEntityOnly_1= ruleFormNewEntityOnly
                    {
                     
                            newCompositeNode(grammarAccess.getFormTypesAccess().getFormNewEntityOnlyParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleFormNewEntityOnly_in_ruleFormTypes2308);
                    this_FormNewEntityOnly_1=ruleFormNewEntityOnly();

                    state._fsp--;

                     
                            current = this_FormNewEntityOnly_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:996:5: this_FormReport_2= ruleFormReport
                    {
                     
                            newCompositeNode(grammarAccess.getFormTypesAccess().getFormReportParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleFormReport_in_ruleFormTypes2335);
                    this_FormReport_2=ruleFormReport();

                    state._fsp--;

                     
                            current = this_FormReport_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFormTypes"


    // $ANTLR start "entryRuleForm"
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1012:1: entryRuleForm returns [EObject current=null] : iv_ruleForm= ruleForm EOF ;
    public final EObject entryRuleForm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForm = null;


        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1013:2: (iv_ruleForm= ruleForm EOF )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1014:2: iv_ruleForm= ruleForm EOF
            {
             newCompositeNode(grammarAccess.getFormRule()); 
            pushFollow(FOLLOW_ruleForm_in_entryRuleForm2370);
            iv_ruleForm=ruleForm();

            state._fsp--;

             current =iv_ruleForm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForm2380); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForm"


    // $ANTLR start "ruleForm"
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1021:1: ruleForm returns [EObject current=null] : (otherlv_0= 'form' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'get' otherlv_4= ':' ( (lv_get_5_0= ruleBoolean ) ) otherlv_6= 'post' otherlv_7= ':' ( (lv_post_8_0= ruleBoolean ) ) otherlv_9= 'put' otherlv_10= ':' ( (lv_put_11_0= ruleBoolean ) ) otherlv_12= 'delete' otherlv_13= ':' ( (lv_delete_14_0= ruleBoolean ) ) ( (otherlv_15= RULE_ID ) ) otherlv_16= '}' ) ;
    public final EObject ruleForm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_get_5_0 = null;

        AntlrDatatypeRuleToken lv_post_8_0 = null;

        AntlrDatatypeRuleToken lv_put_11_0 = null;

        AntlrDatatypeRuleToken lv_delete_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1024:28: ( (otherlv_0= 'form' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'get' otherlv_4= ':' ( (lv_get_5_0= ruleBoolean ) ) otherlv_6= 'post' otherlv_7= ':' ( (lv_post_8_0= ruleBoolean ) ) otherlv_9= 'put' otherlv_10= ':' ( (lv_put_11_0= ruleBoolean ) ) otherlv_12= 'delete' otherlv_13= ':' ( (lv_delete_14_0= ruleBoolean ) ) ( (otherlv_15= RULE_ID ) ) otherlv_16= '}' ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1025:1: (otherlv_0= 'form' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'get' otherlv_4= ':' ( (lv_get_5_0= ruleBoolean ) ) otherlv_6= 'post' otherlv_7= ':' ( (lv_post_8_0= ruleBoolean ) ) otherlv_9= 'put' otherlv_10= ':' ( (lv_put_11_0= ruleBoolean ) ) otherlv_12= 'delete' otherlv_13= ':' ( (lv_delete_14_0= ruleBoolean ) ) ( (otherlv_15= RULE_ID ) ) otherlv_16= '}' )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1025:1: (otherlv_0= 'form' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'get' otherlv_4= ':' ( (lv_get_5_0= ruleBoolean ) ) otherlv_6= 'post' otherlv_7= ':' ( (lv_post_8_0= ruleBoolean ) ) otherlv_9= 'put' otherlv_10= ':' ( (lv_put_11_0= ruleBoolean ) ) otherlv_12= 'delete' otherlv_13= ':' ( (lv_delete_14_0= ruleBoolean ) ) ( (otherlv_15= RULE_ID ) ) otherlv_16= '}' )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1025:3: otherlv_0= 'form' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'get' otherlv_4= ':' ( (lv_get_5_0= ruleBoolean ) ) otherlv_6= 'post' otherlv_7= ':' ( (lv_post_8_0= ruleBoolean ) ) otherlv_9= 'put' otherlv_10= ':' ( (lv_put_11_0= ruleBoolean ) ) otherlv_12= 'delete' otherlv_13= ':' ( (lv_delete_14_0= ruleBoolean ) ) ( (otherlv_15= RULE_ID ) ) otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleForm2417); 

                	newLeafNode(otherlv_0, grammarAccess.getFormAccess().getFormKeyword_0());
                
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1029:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1030:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1030:1: (lv_name_1_0= RULE_ID )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1031:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleForm2434); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFormAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFormRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleForm2451); 

                	newLeafNode(otherlv_2, grammarAccess.getFormAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleForm2463); 

                	newLeafNode(otherlv_3, grammarAccess.getFormAccess().getGetKeyword_3());
                
            otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleForm2475); 

                	newLeafNode(otherlv_4, grammarAccess.getFormAccess().getColonKeyword_4());
                
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1059:1: ( (lv_get_5_0= ruleBoolean ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1060:1: (lv_get_5_0= ruleBoolean )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1060:1: (lv_get_5_0= ruleBoolean )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1061:3: lv_get_5_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getFormAccess().getGetBooleanParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleForm2496);
            lv_get_5_0=ruleBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFormRule());
            	        }
                   		set(
                   			current, 
                   			"get",
                    		lv_get_5_0, 
                    		"Boolean");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,40,FOLLOW_40_in_ruleForm2508); 

                	newLeafNode(otherlv_6, grammarAccess.getFormAccess().getPostKeyword_6());
                
            otherlv_7=(Token)match(input,31,FOLLOW_31_in_ruleForm2520); 

                	newLeafNode(otherlv_7, grammarAccess.getFormAccess().getColonKeyword_7());
                
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1085:1: ( (lv_post_8_0= ruleBoolean ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1086:1: (lv_post_8_0= ruleBoolean )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1086:1: (lv_post_8_0= ruleBoolean )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1087:3: lv_post_8_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getFormAccess().getPostBooleanParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleForm2541);
            lv_post_8_0=ruleBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFormRule());
            	        }
                   		set(
                   			current, 
                   			"post",
                    		lv_post_8_0, 
                    		"Boolean");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_9=(Token)match(input,41,FOLLOW_41_in_ruleForm2553); 

                	newLeafNode(otherlv_9, grammarAccess.getFormAccess().getPutKeyword_9());
                
            otherlv_10=(Token)match(input,31,FOLLOW_31_in_ruleForm2565); 

                	newLeafNode(otherlv_10, grammarAccess.getFormAccess().getColonKeyword_10());
                
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1111:1: ( (lv_put_11_0= ruleBoolean ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1112:1: (lv_put_11_0= ruleBoolean )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1112:1: (lv_put_11_0= ruleBoolean )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1113:3: lv_put_11_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getFormAccess().getPutBooleanParserRuleCall_11_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleForm2586);
            lv_put_11_0=ruleBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFormRule());
            	        }
                   		set(
                   			current, 
                   			"put",
                    		lv_put_11_0, 
                    		"Boolean");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_12=(Token)match(input,42,FOLLOW_42_in_ruleForm2598); 

                	newLeafNode(otherlv_12, grammarAccess.getFormAccess().getDeleteKeyword_12());
                
            otherlv_13=(Token)match(input,31,FOLLOW_31_in_ruleForm2610); 

                	newLeafNode(otherlv_13, grammarAccess.getFormAccess().getColonKeyword_13());
                
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1137:1: ( (lv_delete_14_0= ruleBoolean ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1138:1: (lv_delete_14_0= ruleBoolean )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1138:1: (lv_delete_14_0= ruleBoolean )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1139:3: lv_delete_14_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getFormAccess().getDeleteBooleanParserRuleCall_14_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleForm2631);
            lv_delete_14_0=ruleBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFormRule());
            	        }
                   		set(
                   			current, 
                   			"delete",
                    		lv_delete_14_0, 
                    		"Boolean");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1155:2: ( (otherlv_15= RULE_ID ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1156:1: (otherlv_15= RULE_ID )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1156:1: (otherlv_15= RULE_ID )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1157:3: otherlv_15= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFormRule());
            	        }
                    
            otherlv_15=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleForm2651); 

            		newLeafNode(otherlv_15, grammarAccess.getFormAccess().getEntityEntityCrossReference_15_0()); 
            	

            }


            }

            otherlv_16=(Token)match(input,16,FOLLOW_16_in_ruleForm2663); 

                	newLeafNode(otherlv_16, grammarAccess.getFormAccess().getRightCurlyBracketKeyword_16());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForm"


    // $ANTLR start "entryRuleFormNewEntityOnly"
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1180:1: entryRuleFormNewEntityOnly returns [EObject current=null] : iv_ruleFormNewEntityOnly= ruleFormNewEntityOnly EOF ;
    public final EObject entryRuleFormNewEntityOnly() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormNewEntityOnly = null;


        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1181:2: (iv_ruleFormNewEntityOnly= ruleFormNewEntityOnly EOF )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1182:2: iv_ruleFormNewEntityOnly= ruleFormNewEntityOnly EOF
            {
             newCompositeNode(grammarAccess.getFormNewEntityOnlyRule()); 
            pushFollow(FOLLOW_ruleFormNewEntityOnly_in_entryRuleFormNewEntityOnly2699);
            iv_ruleFormNewEntityOnly=ruleFormNewEntityOnly();

            state._fsp--;

             current =iv_ruleFormNewEntityOnly; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormNewEntityOnly2709); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFormNewEntityOnly"


    // $ANTLR start "ruleFormNewEntityOnly"
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1189:1: ruleFormNewEntityOnly returns [EObject current=null] : (otherlv_0= 'formNewEntity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' ) ;
    public final EObject ruleFormNewEntityOnly() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1192:28: ( (otherlv_0= 'formNewEntity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1193:1: (otherlv_0= 'formNewEntity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1193:1: (otherlv_0= 'formNewEntity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1193:3: otherlv_0= 'formNewEntity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleFormNewEntityOnly2746); 

                	newLeafNode(otherlv_0, grammarAccess.getFormNewEntityOnlyAccess().getFormNewEntityKeyword_0());
                
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1197:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1198:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1198:1: (lv_name_1_0= RULE_ID )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1199:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFormNewEntityOnly2763); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFormNewEntityOnlyAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFormNewEntityOnlyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleFormNewEntityOnly2780); 

                	newLeafNode(otherlv_2, grammarAccess.getFormNewEntityOnlyAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1219:1: ( (otherlv_3= RULE_ID ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1220:1: (otherlv_3= RULE_ID )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1220:1: (otherlv_3= RULE_ID )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1221:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFormNewEntityOnlyRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFormNewEntityOnly2800); 

            		newLeafNode(otherlv_3, grammarAccess.getFormNewEntityOnlyAccess().getEntityEntityCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleFormNewEntityOnly2812); 

                	newLeafNode(otherlv_4, grammarAccess.getFormNewEntityOnlyAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFormNewEntityOnly"


    // $ANTLR start "entryRuleFormReport"
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1244:1: entryRuleFormReport returns [EObject current=null] : iv_ruleFormReport= ruleFormReport EOF ;
    public final EObject entryRuleFormReport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormReport = null;


        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1245:2: (iv_ruleFormReport= ruleFormReport EOF )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1246:2: iv_ruleFormReport= ruleFormReport EOF
            {
             newCompositeNode(grammarAccess.getFormReportRule()); 
            pushFollow(FOLLOW_ruleFormReport_in_entryRuleFormReport2848);
            iv_ruleFormReport=ruleFormReport();

            state._fsp--;

             current =iv_ruleFormReport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormReport2858); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFormReport"


    // $ANTLR start "ruleFormReport"
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1253:1: ruleFormReport returns [EObject current=null] : (otherlv_0= 'formReport' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'filter' otherlv_4= ':' ( (lv_filter_5_0= ruleBoolean ) ) otherlv_6= 'order' otherlv_7= ':' ( (lv_order_8_0= ruleBoolean ) ) otherlv_9= 'pagination' otherlv_10= ':' ( (lv_pagination_11_0= ruleBoolean ) ) ( (otherlv_12= RULE_ID ) ) otherlv_13= '}' ) ;
    public final EObject ruleFormReport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_filter_5_0 = null;

        AntlrDatatypeRuleToken lv_order_8_0 = null;

        AntlrDatatypeRuleToken lv_pagination_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1256:28: ( (otherlv_0= 'formReport' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'filter' otherlv_4= ':' ( (lv_filter_5_0= ruleBoolean ) ) otherlv_6= 'order' otherlv_7= ':' ( (lv_order_8_0= ruleBoolean ) ) otherlv_9= 'pagination' otherlv_10= ':' ( (lv_pagination_11_0= ruleBoolean ) ) ( (otherlv_12= RULE_ID ) ) otherlv_13= '}' ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1257:1: (otherlv_0= 'formReport' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'filter' otherlv_4= ':' ( (lv_filter_5_0= ruleBoolean ) ) otherlv_6= 'order' otherlv_7= ':' ( (lv_order_8_0= ruleBoolean ) ) otherlv_9= 'pagination' otherlv_10= ':' ( (lv_pagination_11_0= ruleBoolean ) ) ( (otherlv_12= RULE_ID ) ) otherlv_13= '}' )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1257:1: (otherlv_0= 'formReport' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'filter' otherlv_4= ':' ( (lv_filter_5_0= ruleBoolean ) ) otherlv_6= 'order' otherlv_7= ':' ( (lv_order_8_0= ruleBoolean ) ) otherlv_9= 'pagination' otherlv_10= ':' ( (lv_pagination_11_0= ruleBoolean ) ) ( (otherlv_12= RULE_ID ) ) otherlv_13= '}' )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1257:3: otherlv_0= 'formReport' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'filter' otherlv_4= ':' ( (lv_filter_5_0= ruleBoolean ) ) otherlv_6= 'order' otherlv_7= ':' ( (lv_order_8_0= ruleBoolean ) ) otherlv_9= 'pagination' otherlv_10= ':' ( (lv_pagination_11_0= ruleBoolean ) ) ( (otherlv_12= RULE_ID ) ) otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleFormReport2895); 

                	newLeafNode(otherlv_0, grammarAccess.getFormReportAccess().getFormReportKeyword_0());
                
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1261:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1262:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1262:1: (lv_name_1_0= RULE_ID )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1263:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFormReport2912); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFormReportAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFormReportRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleFormReport2929); 

                	newLeafNode(otherlv_2, grammarAccess.getFormReportAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleFormReport2941); 

                	newLeafNode(otherlv_3, grammarAccess.getFormReportAccess().getFilterKeyword_3());
                
            otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleFormReport2953); 

                	newLeafNode(otherlv_4, grammarAccess.getFormReportAccess().getColonKeyword_4());
                
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1291:1: ( (lv_filter_5_0= ruleBoolean ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1292:1: (lv_filter_5_0= ruleBoolean )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1292:1: (lv_filter_5_0= ruleBoolean )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1293:3: lv_filter_5_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getFormReportAccess().getFilterBooleanParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleFormReport2974);
            lv_filter_5_0=ruleBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFormReportRule());
            	        }
                   		set(
                   			current, 
                   			"filter",
                    		lv_filter_5_0, 
                    		"Boolean");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,46,FOLLOW_46_in_ruleFormReport2986); 

                	newLeafNode(otherlv_6, grammarAccess.getFormReportAccess().getOrderKeyword_6());
                
            otherlv_7=(Token)match(input,31,FOLLOW_31_in_ruleFormReport2998); 

                	newLeafNode(otherlv_7, grammarAccess.getFormReportAccess().getColonKeyword_7());
                
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1317:1: ( (lv_order_8_0= ruleBoolean ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1318:1: (lv_order_8_0= ruleBoolean )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1318:1: (lv_order_8_0= ruleBoolean )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1319:3: lv_order_8_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getFormReportAccess().getOrderBooleanParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleFormReport3019);
            lv_order_8_0=ruleBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFormReportRule());
            	        }
                   		set(
                   			current, 
                   			"order",
                    		lv_order_8_0, 
                    		"Boolean");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_9=(Token)match(input,47,FOLLOW_47_in_ruleFormReport3031); 

                	newLeafNode(otherlv_9, grammarAccess.getFormReportAccess().getPaginationKeyword_9());
                
            otherlv_10=(Token)match(input,31,FOLLOW_31_in_ruleFormReport3043); 

                	newLeafNode(otherlv_10, grammarAccess.getFormReportAccess().getColonKeyword_10());
                
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1343:1: ( (lv_pagination_11_0= ruleBoolean ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1344:1: (lv_pagination_11_0= ruleBoolean )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1344:1: (lv_pagination_11_0= ruleBoolean )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1345:3: lv_pagination_11_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getFormReportAccess().getPaginationBooleanParserRuleCall_11_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleFormReport3064);
            lv_pagination_11_0=ruleBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFormReportRule());
            	        }
                   		set(
                   			current, 
                   			"pagination",
                    		lv_pagination_11_0, 
                    		"Boolean");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1361:2: ( (otherlv_12= RULE_ID ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1362:1: (otherlv_12= RULE_ID )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1362:1: (otherlv_12= RULE_ID )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1363:3: otherlv_12= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFormReportRule());
            	        }
                    
            otherlv_12=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFormReport3084); 

            		newLeafNode(otherlv_12, grammarAccess.getFormReportAccess().getEntityEntityCrossReference_12_0()); 
            	

            }


            }

            otherlv_13=(Token)match(input,16,FOLLOW_16_in_ruleFormReport3096); 

                	newLeafNode(otherlv_13, grammarAccess.getFormReportAccess().getRightCurlyBracketKeyword_13());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFormReport"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDomainmodel_in_entryRuleDomainmodel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainmodel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleDomainmodel122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDomainmodel139 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDomainmodel156 = new BitSet(new long[]{0x0000184408046000L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleDomainmodel177 = new BitSet(new long[]{0x0000184408046000L});
    public static final BitSet FOLLOW_13_in_ruleDomainmodel190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageDeclaration236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulePackageDeclaration273 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePackageDeclaration294 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePackageDeclaration306 = new BitSet(new long[]{0x0000184408054000L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rulePackageDeclaration327 = new BitSet(new long[]{0x0000184408054000L});
    public static final BitSet FOLLOW_16_in_rulePackageDeclaration340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement376 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_ruleAbstractElement433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleAbstractElement460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleAbstractElement487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePage_in_ruleAbstractElement514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormTypes_in_ruleAbstractElement541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName577 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName628 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleQualifiedName647 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName662 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport709 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleImport756 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard814 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard872 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleQualifiedNameWithWildcard891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractType_in_entryRuleAbstractType933 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractType943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleAbstractType990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityType_in_ruleAbstractType1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType1052 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleDataType1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleDataType1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleDataType1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleDataType1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleDataType1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleDataType1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleDataType1280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityType_in_entryRuleEntityType1331 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityType1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntityType1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity1420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity1430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleEntity1467 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity1484 = new BitSet(new long[]{0x0000000010008000L});
    public static final BitSet FOLLOW_28_in_ruleEntity1502 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEntity1525 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEntity1539 = new BitSet(new long[]{0x0000000020010060L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleEntity1560 = new BitSet(new long[]{0x0000000020010060L});
    public static final BitSet FOLLOW_16_in_ruleEntity1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature1609 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature1619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleFeature1662 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFeature1694 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleFeature1711 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFeature1728 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeature1752 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleFeature1769 = new BitSet(new long[]{0x0000000007F00020L});
    public static final BitSet FOLLOW_ruleAbstractType_in_ruleFeature1790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_entryRuleBoolean1827 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolean1838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleBoolean1876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleBoolean1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePage_in_entryRulePage1935 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePage1945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rulePage1982 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePage1999 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePage2016 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_35_in_rulePage2029 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_rulePage2041 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePage2058 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_rulePage2077 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_rulePage2089 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_rulePage2110 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_rulePage2122 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_rulePage2134 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_rulePage2155 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePage2175 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_16_in_rulePage2188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormTypes_in_entryRuleFormTypes2224 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormTypes2234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForm_in_ruleFormTypes2281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormNewEntityOnly_in_ruleFormTypes2308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormReport_in_ruleFormTypes2335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForm_in_entryRuleForm2370 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForm2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleForm2417 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleForm2434 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleForm2451 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleForm2463 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleForm2475 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleForm2496 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleForm2508 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleForm2520 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleForm2541 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleForm2553 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleForm2565 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleForm2586 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleForm2598 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleForm2610 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleForm2631 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleForm2651 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleForm2663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormNewEntityOnly_in_entryRuleFormNewEntityOnly2699 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormNewEntityOnly2709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleFormNewEntityOnly2746 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFormNewEntityOnly2763 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFormNewEntityOnly2780 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFormNewEntityOnly2800 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFormNewEntityOnly2812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormReport_in_entryRuleFormReport2848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormReport2858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleFormReport2895 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFormReport2912 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFormReport2929 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleFormReport2941 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleFormReport2953 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleFormReport2974 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleFormReport2986 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleFormReport2998 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleFormReport3019 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleFormReport3031 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleFormReport3043 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleFormReport3064 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFormReport3084 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFormReport3096 = new BitSet(new long[]{0x0000000000000002L});

}