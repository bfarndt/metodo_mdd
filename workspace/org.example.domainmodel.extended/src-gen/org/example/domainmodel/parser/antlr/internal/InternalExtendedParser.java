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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'project'", "'begin'", "'end'", "'package'", "'{'", "'}'", "'.'", "'import'", "'.*'", "'datatype'", "'entity'", "'extends'", "'many'", "':'", "'page'", "'header'", "'footer'", "'form'", "'isShow'", "'isEdit'"
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
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
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

                if ( (LA1_0==14||LA1_0==18||(LA1_0>=20 && LA1_0<=21)||LA1_0==25) ) {
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

                if ( (LA2_0==14||LA2_0==18||(LA2_0>=20 && LA2_0<=21)||LA2_0==25) ) {
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
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:214:1: ruleAbstractElement returns [EObject current=null] : (this_PackageDeclaration_0= rulePackageDeclaration | this_Type_1= ruleType | this_Import_2= ruleImport | this_Page_3= rulePage ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_PackageDeclaration_0 = null;

        EObject this_Type_1 = null;

        EObject this_Import_2 = null;

        EObject this_Page_3 = null;


         enterRule(); 
            
        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:217:28: ( (this_PackageDeclaration_0= rulePackageDeclaration | this_Type_1= ruleType | this_Import_2= ruleImport | this_Page_3= rulePage ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:218:1: (this_PackageDeclaration_0= rulePackageDeclaration | this_Type_1= ruleType | this_Import_2= ruleImport | this_Page_3= rulePage )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:218:1: (this_PackageDeclaration_0= rulePackageDeclaration | this_Type_1= ruleType | this_Import_2= ruleImport | this_Page_3= rulePage )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 20:
            case 21:
                {
                alt3=2;
                }
                break;
            case 18:
                {
                alt3=3;
                }
                break;
            case 25:
                {
                alt3=4;
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
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:229:5: this_Type_1= ruleType
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleType_in_ruleAbstractElement460);
                    this_Type_1=ruleType();

                    state._fsp--;

                     
                            current = this_Type_1; 
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
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:265:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:266:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:267:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName550);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName561); 

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
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:274:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:277:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:278:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:278:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:278:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName601); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:285:1: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:286:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,17,FOLLOW_17_in_ruleQualifiedName620); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName635); 

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
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:306:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:307:2: (iv_ruleImport= ruleImport EOF )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:308:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport682);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport692); 

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
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:315:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:318:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:319:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:319:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:319:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleImport729); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:323:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:324:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:324:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:325:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
             
            	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport750);
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
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:349:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:350:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:351:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard787);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard798); 

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
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:358:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:361:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:362:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:362:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:363:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard845);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:373:1: (kw= '.*' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:374:2: kw= '.*'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleQualifiedNameWithWildcard864); 

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


    // $ANTLR start "entryRuleType"
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:387:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:388:2: (iv_ruleType= ruleType EOF )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:389:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType906);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType916); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:396:1: ruleType returns [EObject current=null] : (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_DataType_0 = null;

        EObject this_Entity_1 = null;


         enterRule(); 
            
        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:399:28: ( (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:400:1: (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:400:1: (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            else if ( (LA6_0==21) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:401:5: this_DataType_0= ruleDataType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDataType_in_ruleType963);
                    this_DataType_0=ruleDataType();

                    state._fsp--;

                     
                            current = this_DataType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:411:5: this_Entity_1= ruleEntity
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEntity_in_ruleType990);
                    this_Entity_1=ruleEntity();

                    state._fsp--;

                     
                            current = this_Entity_1; 
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleDataType"
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:427:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:428:2: (iv_ruleDataType= ruleDataType EOF )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:429:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType1025);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType1035); 

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
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:436:1: ruleDataType returns [EObject current=null] : (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:439:28: ( (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:440:1: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:440:1: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:440:3: otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleDataType1072); 

                	newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getDatatypeKeyword_0());
                
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:444:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:445:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:445:1: (lv_name_1_0= RULE_ID )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:446:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataType1089); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDataTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

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


    // $ANTLR start "entryRuleEntity"
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:470:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:471:2: (iv_ruleEntity= ruleEntity EOF )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:472:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity1130);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity1140); 

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
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:479:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' ) ;
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
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:482:28: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:483:1: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:483:1: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:483:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleEntity1177); 

                	newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
                
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:487:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:488:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:488:1: (lv_name_1_0= RULE_ID )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:489:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity1194); 

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

            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:505:2: (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:505:4: otherlv_2= 'extends' ( ( ruleQualifiedName ) )
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleEntity1212); 

                        	newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getExtendsKeyword_2_0());
                        
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:509:1: ( ( ruleQualifiedName ) )
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:510:1: ( ruleQualifiedName )
                    {
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:510:1: ( ruleQualifiedName )
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:511:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleEntity1235);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleEntity1249); 

                	newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:528:1: ( (lv_features_5_0= ruleFeature ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:529:1: (lv_features_5_0= ruleFeature )
            	    {
            	    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:529:1: (lv_features_5_0= ruleFeature )
            	    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:530:3: lv_features_5_0= ruleFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFeature_in_ruleEntity1270);
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
            	    break loop8;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleEntity1283); 

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
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:558:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:559:2: (iv_ruleFeature= ruleFeature EOF )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:560:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature1319);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature1329); 

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
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:567:1: ruleFeature returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_many_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:570:28: ( ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:571:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:571:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:571:2: ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:571:2: ( (lv_many_0_0= 'many' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:572:1: (lv_many_0_0= 'many' )
                    {
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:572:1: (lv_many_0_0= 'many' )
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:573:3: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,23,FOLLOW_23_in_ruleFeature1372); 

                            newLeafNode(lv_many_0_0, grammarAccess.getFeatureAccess().getManyManyKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "many", true, "many");
                    	    

                    }


                    }
                    break;

            }

            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:586:3: ( (lv_name_1_0= RULE_ID ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:587:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:587:1: (lv_name_1_0= RULE_ID )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:588:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeature1403); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFeatureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleFeature1420); 

                	newLeafNode(otherlv_2, grammarAccess.getFeatureAccess().getColonKeyword_2());
                
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:608:1: ( ( ruleQualifiedName ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:609:1: ( ruleQualifiedName )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:609:1: ( ruleQualifiedName )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:610:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFeatureRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getFeatureAccess().getTypeTypeCrossReference_3_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleFeature1443);
            ruleQualifiedName();

            state._fsp--;

             
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


    // $ANTLR start "entryRulePage"
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:631:1: entryRulePage returns [EObject current=null] : iv_rulePage= rulePage EOF ;
    public final EObject entryRulePage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePage = null;


        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:632:2: (iv_rulePage= rulePage EOF )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:633:2: iv_rulePage= rulePage EOF
            {
             newCompositeNode(grammarAccess.getPageRule()); 
            pushFollow(FOLLOW_rulePage_in_entryRulePage1479);
            iv_rulePage=rulePage();

            state._fsp--;

             current =iv_rulePage; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePage1489); 

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
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:640:1: rulePage returns [EObject current=null] : (otherlv_0= 'page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'header' otherlv_4= ':' this_STRING_5= RULE_STRING otherlv_6= 'footer' otherlv_7= ':' this_STRING_8= RULE_STRING ( (lv_forms_9_0= ruleForm ) )* otherlv_10= '}' ) ;
    public final EObject rulePage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token this_STRING_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token this_STRING_8=null;
        Token otherlv_10=null;
        EObject lv_forms_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:643:28: ( (otherlv_0= 'page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'header' otherlv_4= ':' this_STRING_5= RULE_STRING otherlv_6= 'footer' otherlv_7= ':' this_STRING_8= RULE_STRING ( (lv_forms_9_0= ruleForm ) )* otherlv_10= '}' ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:644:1: (otherlv_0= 'page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'header' otherlv_4= ':' this_STRING_5= RULE_STRING otherlv_6= 'footer' otherlv_7= ':' this_STRING_8= RULE_STRING ( (lv_forms_9_0= ruleForm ) )* otherlv_10= '}' )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:644:1: (otherlv_0= 'page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'header' otherlv_4= ':' this_STRING_5= RULE_STRING otherlv_6= 'footer' otherlv_7= ':' this_STRING_8= RULE_STRING ( (lv_forms_9_0= ruleForm ) )* otherlv_10= '}' )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:644:3: otherlv_0= 'page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'header' otherlv_4= ':' this_STRING_5= RULE_STRING otherlv_6= 'footer' otherlv_7= ':' this_STRING_8= RULE_STRING ( (lv_forms_9_0= ruleForm ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_rulePage1526); 

                	newLeafNode(otherlv_0, grammarAccess.getPageAccess().getPageKeyword_0());
                
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:648:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:649:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:649:1: (lv_name_1_0= RULE_ID )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:650:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePage1543); 

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

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_rulePage1560); 

                	newLeafNode(otherlv_2, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,26,FOLLOW_26_in_rulePage1572); 

                	newLeafNode(otherlv_3, grammarAccess.getPageAccess().getHeaderKeyword_3());
                
            otherlv_4=(Token)match(input,24,FOLLOW_24_in_rulePage1584); 

                	newLeafNode(otherlv_4, grammarAccess.getPageAccess().getColonKeyword_4());
                
            this_STRING_5=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePage1595); 
             
                newLeafNode(this_STRING_5, grammarAccess.getPageAccess().getSTRINGTerminalRuleCall_5()); 
                
            otherlv_6=(Token)match(input,27,FOLLOW_27_in_rulePage1606); 

                	newLeafNode(otherlv_6, grammarAccess.getPageAccess().getFooterKeyword_6());
                
            otherlv_7=(Token)match(input,24,FOLLOW_24_in_rulePage1618); 

                	newLeafNode(otherlv_7, grammarAccess.getPageAccess().getColonKeyword_7());
                
            this_STRING_8=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePage1629); 
             
                newLeafNode(this_STRING_8, grammarAccess.getPageAccess().getSTRINGTerminalRuleCall_8()); 
                
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:694:1: ( (lv_forms_9_0= ruleForm ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==28) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:695:1: (lv_forms_9_0= ruleForm )
            	    {
            	    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:695:1: (lv_forms_9_0= ruleForm )
            	    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:696:3: lv_forms_9_0= ruleForm
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPageAccess().getFormsFormParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleForm_in_rulePage1649);
            	    lv_forms_9_0=ruleForm();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPageRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"forms",
            	            		lv_forms_9_0, 
            	            		"Form");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_10=(Token)match(input,16,FOLLOW_16_in_rulePage1662); 

                	newLeafNode(otherlv_10, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_10());
                

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


    // $ANTLR start "entryRuleForm"
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:724:1: entryRuleForm returns [EObject current=null] : iv_ruleForm= ruleForm EOF ;
    public final EObject entryRuleForm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForm = null;


        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:725:2: (iv_ruleForm= ruleForm EOF )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:726:2: iv_ruleForm= ruleForm EOF
            {
             newCompositeNode(grammarAccess.getFormRule()); 
            pushFollow(FOLLOW_ruleForm_in_entryRuleForm1698);
            iv_ruleForm=ruleForm();

            state._fsp--;

             current =iv_ruleForm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForm1708); 

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
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:733:1: ruleForm returns [EObject current=null] : (otherlv_0= 'form' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'isShow' otherlv_4= ':' this_STRING_5= RULE_STRING otherlv_6= 'isEdit' otherlv_7= ':' this_STRING_8= RULE_STRING ( (lv_entitys_9_0= ruleEntity ) )* otherlv_10= '}' ) ;
    public final EObject ruleForm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token this_STRING_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token this_STRING_8=null;
        Token otherlv_10=null;
        EObject lv_entitys_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:736:28: ( (otherlv_0= 'form' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'isShow' otherlv_4= ':' this_STRING_5= RULE_STRING otherlv_6= 'isEdit' otherlv_7= ':' this_STRING_8= RULE_STRING ( (lv_entitys_9_0= ruleEntity ) )* otherlv_10= '}' ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:737:1: (otherlv_0= 'form' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'isShow' otherlv_4= ':' this_STRING_5= RULE_STRING otherlv_6= 'isEdit' otherlv_7= ':' this_STRING_8= RULE_STRING ( (lv_entitys_9_0= ruleEntity ) )* otherlv_10= '}' )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:737:1: (otherlv_0= 'form' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'isShow' otherlv_4= ':' this_STRING_5= RULE_STRING otherlv_6= 'isEdit' otherlv_7= ':' this_STRING_8= RULE_STRING ( (lv_entitys_9_0= ruleEntity ) )* otherlv_10= '}' )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:737:3: otherlv_0= 'form' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'isShow' otherlv_4= ':' this_STRING_5= RULE_STRING otherlv_6= 'isEdit' otherlv_7= ':' this_STRING_8= RULE_STRING ( (lv_entitys_9_0= ruleEntity ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleForm1745); 

                	newLeafNode(otherlv_0, grammarAccess.getFormAccess().getFormKeyword_0());
                
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:741:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:742:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:742:1: (lv_name_1_0= RULE_ID )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:743:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleForm1762); 

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

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleForm1779); 

                	newLeafNode(otherlv_2, grammarAccess.getFormAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleForm1791); 

                	newLeafNode(otherlv_3, grammarAccess.getFormAccess().getIsShowKeyword_3());
                
            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleForm1803); 

                	newLeafNode(otherlv_4, grammarAccess.getFormAccess().getColonKeyword_4());
                
            this_STRING_5=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleForm1814); 
             
                newLeafNode(this_STRING_5, grammarAccess.getFormAccess().getSTRINGTerminalRuleCall_5()); 
                
            otherlv_6=(Token)match(input,30,FOLLOW_30_in_ruleForm1825); 

                	newLeafNode(otherlv_6, grammarAccess.getFormAccess().getIsEditKeyword_6());
                
            otherlv_7=(Token)match(input,24,FOLLOW_24_in_ruleForm1837); 

                	newLeafNode(otherlv_7, grammarAccess.getFormAccess().getColonKeyword_7());
                
            this_STRING_8=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleForm1848); 
             
                newLeafNode(this_STRING_8, grammarAccess.getFormAccess().getSTRINGTerminalRuleCall_8()); 
                
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:787:1: ( (lv_entitys_9_0= ruleEntity ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==21) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:788:1: (lv_entitys_9_0= ruleEntity )
            	    {
            	    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:788:1: (lv_entitys_9_0= ruleEntity )
            	    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:789:3: lv_entitys_9_0= ruleEntity
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFormAccess().getEntitysEntityParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEntity_in_ruleForm1868);
            	    lv_entitys_9_0=ruleEntity();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFormRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"entitys",
            	            		lv_entitys_9_0, 
            	            		"Entity");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleForm1881); 

                	newLeafNode(otherlv_10, grammarAccess.getFormAccess().getRightCurlyBracketKeyword_10());
                

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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDomainmodel_in_entryRuleDomainmodel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainmodel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleDomainmodel122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDomainmodel139 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDomainmodel156 = new BitSet(new long[]{0x0000000002346000L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleDomainmodel177 = new BitSet(new long[]{0x0000000002346000L});
    public static final BitSet FOLLOW_13_in_ruleDomainmodel190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageDeclaration236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulePackageDeclaration273 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePackageDeclaration294 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePackageDeclaration306 = new BitSet(new long[]{0x0000000002354000L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rulePackageDeclaration327 = new BitSet(new long[]{0x0000000002354000L});
    public static final BitSet FOLLOW_16_in_rulePackageDeclaration340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement376 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_ruleAbstractElement433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleAbstractElement460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleAbstractElement487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePage_in_ruleAbstractElement514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName550 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName601 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleQualifiedName620 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName635 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleImport729 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard845 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleQualifiedNameWithWildcard864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType906 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleType963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleType990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType1025 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleDataType1072 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataType1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity1130 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleEntity1177 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity1194 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_22_in_ruleEntity1212 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEntity1235 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEntity1249 = new BitSet(new long[]{0x0000000000810020L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleEntity1270 = new BitSet(new long[]{0x0000000000810020L});
    public static final BitSet FOLLOW_16_in_ruleEntity1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature1319 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleFeature1372 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeature1403 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleFeature1420 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleFeature1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePage_in_entryRulePage1479 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePage1489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rulePage1526 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePage1543 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePage1560 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_rulePage1572 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulePage1584 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePage1595 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_rulePage1606 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulePage1618 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePage1629 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_ruleForm_in_rulePage1649 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_16_in_rulePage1662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForm_in_entryRuleForm1698 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForm1708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleForm1745 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleForm1762 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleForm1779 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleForm1791 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleForm1803 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleForm1814 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleForm1825 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleForm1837 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleForm1848 = new BitSet(new long[]{0x0000000000310000L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleForm1868 = new BitSet(new long[]{0x0000000000310000L});
    public static final BitSet FOLLOW_16_in_ruleForm1881 = new BitSet(new long[]{0x0000000000000002L});

}