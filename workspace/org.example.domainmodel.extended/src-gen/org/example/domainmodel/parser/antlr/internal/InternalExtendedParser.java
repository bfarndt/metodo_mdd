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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'project'", "'begin'", "'end'", "'package'", "'{'", "'}'", "'.'", "'import'", "'.*'", "'datatype'", "'entity'", "'extends'", "'many'", "':'", "'true'", "'false'", "'page'", "'title'", "'header'", "'footer'", "'form'", "'get'", "'post'", "'put'", "'delete'", "'formNewEntity'", "'formReport'", "'filter'", "'order'", "'pagination'"
    };
    public static final int RULE_ID=5;
    public static final int T__40=40;
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
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__11=11;
    public static final int T__39=39;
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

                if ( (LA1_0==14||LA1_0==18||(LA1_0>=20 && LA1_0<=21)||LA1_0==27||LA1_0==31) ) {
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

                if ( (LA2_0==14||LA2_0==18||(LA2_0>=20 && LA2_0<=21)||LA2_0==27||LA2_0==31) ) {
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
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:214:1: ruleAbstractElement returns [EObject current=null] : (this_PackageDeclaration_0= rulePackageDeclaration | this_Type_1= ruleType | this_Import_2= ruleImport | this_Page_3= rulePage | this_Form_4= ruleForm ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_PackageDeclaration_0 = null;

        EObject this_Type_1 = null;

        EObject this_Import_2 = null;

        EObject this_Page_3 = null;

        EObject this_Form_4 = null;


         enterRule(); 
            
        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:217:28: ( (this_PackageDeclaration_0= rulePackageDeclaration | this_Type_1= ruleType | this_Import_2= ruleImport | this_Page_3= rulePage | this_Form_4= ruleForm ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:218:1: (this_PackageDeclaration_0= rulePackageDeclaration | this_Type_1= ruleType | this_Import_2= ruleImport | this_Page_3= rulePage | this_Form_4= ruleForm )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:218:1: (this_PackageDeclaration_0= rulePackageDeclaration | this_Type_1= ruleType | this_Import_2= ruleImport | this_Page_3= rulePage | this_Form_4= ruleForm )
            int alt3=5;
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
            case 27:
                {
                alt3=4;
                }
                break;
            case 31:
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
                case 5 :
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:259:5: this_Form_4= ruleForm
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getFormParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleForm_in_ruleAbstractElement541);
                    this_Form_4=ruleForm();

                    state._fsp--;

                     
                            current = this_Form_4; 
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


    // $ANTLR start "entryRuleType"
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:397:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:398:2: (iv_ruleType= ruleType EOF )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:399:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType933);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType943); 

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
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:406:1: ruleType returns [EObject current=null] : (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_DataType_0 = null;

        EObject this_Entity_1 = null;


         enterRule(); 
            
        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:409:28: ( (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:410:1: (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:410:1: (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity )
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
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:411:5: this_DataType_0= ruleDataType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDataType_in_ruleType990);
                    this_DataType_0=ruleDataType();

                    state._fsp--;

                     
                            current = this_DataType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:421:5: this_Entity_1= ruleEntity
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEntity_in_ruleType1017);
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
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:446:1: ruleDataType returns [EObject current=null] : (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:449:28: ( (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:450:1: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:450:1: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:450:3: otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleDataType1099); 

                	newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getDatatypeKeyword_0());
                
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:454:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:455:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:455:1: (lv_name_1_0= RULE_ID )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:456:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataType1116); 

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
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:480:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:481:2: (iv_ruleEntity= ruleEntity EOF )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:482:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity1157);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity1167); 

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
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:489:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' ) ;
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
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:492:28: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:493:1: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:493:1: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:493:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleEntity1204); 

                	newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
                
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:497:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:498:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:498:1: (lv_name_1_0= RULE_ID )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:499:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity1221); 

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

            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:515:2: (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:515:4: otherlv_2= 'extends' ( ( ruleQualifiedName ) )
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleEntity1239); 

                        	newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getExtendsKeyword_2_0());
                        
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:519:1: ( ( ruleQualifiedName ) )
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:520:1: ( ruleQualifiedName )
                    {
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:520:1: ( ruleQualifiedName )
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:521:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleEntity1262);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleEntity1276); 

                	newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:538:1: ( (lv_features_5_0= ruleFeature ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:539:1: (lv_features_5_0= ruleFeature )
            	    {
            	    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:539:1: (lv_features_5_0= ruleFeature )
            	    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:540:3: lv_features_5_0= ruleFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFeature_in_ruleEntity1297);
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

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleEntity1310); 

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
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:568:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:569:2: (iv_ruleFeature= ruleFeature EOF )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:570:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature1346);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature1356); 

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
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:577:1: ruleFeature returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_many_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:580:28: ( ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:581:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:581:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:581:2: ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:581:2: ( (lv_many_0_0= 'many' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:582:1: (lv_many_0_0= 'many' )
                    {
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:582:1: (lv_many_0_0= 'many' )
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:583:3: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,23,FOLLOW_23_in_ruleFeature1399); 

                            newLeafNode(lv_many_0_0, grammarAccess.getFeatureAccess().getManyManyKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "many", true, "many");
                    	    

                    }


                    }
                    break;

            }

            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:596:3: ( (lv_name_1_0= RULE_ID ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:597:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:597:1: (lv_name_1_0= RULE_ID )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:598:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeature1430); 

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

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleFeature1447); 

                	newLeafNode(otherlv_2, grammarAccess.getFeatureAccess().getColonKeyword_2());
                
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:618:1: ( ( ruleQualifiedName ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:619:1: ( ruleQualifiedName )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:619:1: ( ruleQualifiedName )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:620:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFeatureRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getFeatureAccess().getTypeTypeCrossReference_3_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleFeature1470);
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


    // $ANTLR start "entryRuleBoolean"
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:641:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;


        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:642:2: (iv_ruleBoolean= ruleBoolean EOF )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:643:2: iv_ruleBoolean= ruleBoolean EOF
            {
             newCompositeNode(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_ruleBoolean_in_entryRuleBoolean1507);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;

             current =iv_ruleBoolean.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolean1518); 

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
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:650:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:653:28: ( (kw= 'true' | kw= 'false' ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:654:1: (kw= 'true' | kw= 'false' )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:654:1: (kw= 'true' | kw= 'false' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            else if ( (LA10_0==26) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:655:2: kw= 'true'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleBoolean1556); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBooleanAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:662:2: kw= 'false'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleBoolean1575); 

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
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:675:1: entryRulePage returns [EObject current=null] : iv_rulePage= rulePage EOF ;
    public final EObject entryRulePage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePage = null;


        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:676:2: (iv_rulePage= rulePage EOF )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:677:2: iv_rulePage= rulePage EOF
            {
             newCompositeNode(grammarAccess.getPageRule()); 
            pushFollow(FOLLOW_rulePage_in_entryRulePage1615);
            iv_rulePage=rulePage();

            state._fsp--;

             current =iv_rulePage; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePage1625); 

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
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:684:1: rulePage returns [EObject current=null] : (otherlv_0= 'page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'title' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) otherlv_6= 'header' otherlv_7= ':' ( (lv_header_8_0= ruleBoolean ) ) otherlv_9= 'footer' otherlv_10= ':' ( (lv_footer_11_0= ruleBoolean ) ) ( (otherlv_12= RULE_ID ) )* otherlv_13= '}' ) ;
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
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:687:28: ( (otherlv_0= 'page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'title' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) otherlv_6= 'header' otherlv_7= ':' ( (lv_header_8_0= ruleBoolean ) ) otherlv_9= 'footer' otherlv_10= ':' ( (lv_footer_11_0= ruleBoolean ) ) ( (otherlv_12= RULE_ID ) )* otherlv_13= '}' ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:688:1: (otherlv_0= 'page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'title' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) otherlv_6= 'header' otherlv_7= ':' ( (lv_header_8_0= ruleBoolean ) ) otherlv_9= 'footer' otherlv_10= ':' ( (lv_footer_11_0= ruleBoolean ) ) ( (otherlv_12= RULE_ID ) )* otherlv_13= '}' )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:688:1: (otherlv_0= 'page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'title' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) otherlv_6= 'header' otherlv_7= ':' ( (lv_header_8_0= ruleBoolean ) ) otherlv_9= 'footer' otherlv_10= ':' ( (lv_footer_11_0= ruleBoolean ) ) ( (otherlv_12= RULE_ID ) )* otherlv_13= '}' )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:688:3: otherlv_0= 'page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'title' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) otherlv_6= 'header' otherlv_7= ':' ( (lv_header_8_0= ruleBoolean ) ) otherlv_9= 'footer' otherlv_10= ':' ( (lv_footer_11_0= ruleBoolean ) ) ( (otherlv_12= RULE_ID ) )* otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_rulePage1662); 

                	newLeafNode(otherlv_0, grammarAccess.getPageAccess().getPageKeyword_0());
                
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:692:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:693:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:693:1: (lv_name_1_0= RULE_ID )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:694:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePage1679); 

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

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_rulePage1696); 

                	newLeafNode(otherlv_2, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,28,FOLLOW_28_in_rulePage1708); 

                	newLeafNode(otherlv_3, grammarAccess.getPageAccess().getTitleKeyword_3());
                
            otherlv_4=(Token)match(input,24,FOLLOW_24_in_rulePage1720); 

                	newLeafNode(otherlv_4, grammarAccess.getPageAccess().getColonKeyword_4());
                
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:722:1: ( (lv_title_5_0= RULE_STRING ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:723:1: (lv_title_5_0= RULE_STRING )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:723:1: (lv_title_5_0= RULE_STRING )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:724:3: lv_title_5_0= RULE_STRING
            {
            lv_title_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePage1737); 

            			newLeafNode(lv_title_5_0, grammarAccess.getPageAccess().getTitleSTRINGTerminalRuleCall_5_0()); 
            		

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

            otherlv_6=(Token)match(input,29,FOLLOW_29_in_rulePage1754); 

                	newLeafNode(otherlv_6, grammarAccess.getPageAccess().getHeaderKeyword_6());
                
            otherlv_7=(Token)match(input,24,FOLLOW_24_in_rulePage1766); 

                	newLeafNode(otherlv_7, grammarAccess.getPageAccess().getColonKeyword_7());
                
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:748:1: ( (lv_header_8_0= ruleBoolean ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:749:1: (lv_header_8_0= ruleBoolean )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:749:1: (lv_header_8_0= ruleBoolean )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:750:3: lv_header_8_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getPageAccess().getHeaderBooleanParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_rulePage1787);
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

            otherlv_9=(Token)match(input,30,FOLLOW_30_in_rulePage1799); 

                	newLeafNode(otherlv_9, grammarAccess.getPageAccess().getFooterKeyword_9());
                
            otherlv_10=(Token)match(input,24,FOLLOW_24_in_rulePage1811); 

                	newLeafNode(otherlv_10, grammarAccess.getPageAccess().getColonKeyword_10());
                
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:774:1: ( (lv_footer_11_0= ruleBoolean ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:775:1: (lv_footer_11_0= ruleBoolean )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:775:1: (lv_footer_11_0= ruleBoolean )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:776:3: lv_footer_11_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getPageAccess().getFooterBooleanParserRuleCall_11_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_rulePage1832);
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

            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:792:2: ( (otherlv_12= RULE_ID ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:793:1: (otherlv_12= RULE_ID )
            	    {
            	    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:793:1: (otherlv_12= RULE_ID )
            	    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:794:3: otherlv_12= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getPageRule());
            	    	        }
            	            
            	    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePage1852); 

            	    		newLeafNode(otherlv_12, grammarAccess.getPageAccess().getFormsFormTypesCrossReference_12_0()); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_13=(Token)match(input,16,FOLLOW_16_in_rulePage1865); 

                	newLeafNode(otherlv_13, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_13());
                

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
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:819:1: entryRuleForm returns [EObject current=null] : iv_ruleForm= ruleForm EOF ;
    public final EObject entryRuleForm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForm = null;


        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:820:2: (iv_ruleForm= ruleForm EOF )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:821:2: iv_ruleForm= ruleForm EOF
            {
             newCompositeNode(grammarAccess.getFormRule()); 
            pushFollow(FOLLOW_ruleForm_in_entryRuleForm1903);
            iv_ruleForm=ruleForm();

            state._fsp--;

             current =iv_ruleForm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForm1913); 

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
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:828:1: ruleForm returns [EObject current=null] : (otherlv_0= 'form' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'get' otherlv_4= ':' ( (lv_get_5_0= ruleBoolean ) ) otherlv_6= 'post' otherlv_7= ':' ( (lv_post_8_0= ruleBoolean ) ) otherlv_9= 'put' otherlv_10= ':' ( (lv_put_11_0= ruleBoolean ) ) otherlv_12= 'delete' otherlv_13= ':' ( (lv_delete_14_0= ruleBoolean ) ) ( (otherlv_15= RULE_ID ) ) otherlv_16= '}' ) ;
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
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:831:28: ( (otherlv_0= 'form' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'get' otherlv_4= ':' ( (lv_get_5_0= ruleBoolean ) ) otherlv_6= 'post' otherlv_7= ':' ( (lv_post_8_0= ruleBoolean ) ) otherlv_9= 'put' otherlv_10= ':' ( (lv_put_11_0= ruleBoolean ) ) otherlv_12= 'delete' otherlv_13= ':' ( (lv_delete_14_0= ruleBoolean ) ) ( (otherlv_15= RULE_ID ) ) otherlv_16= '}' ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:832:1: (otherlv_0= 'form' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'get' otherlv_4= ':' ( (lv_get_5_0= ruleBoolean ) ) otherlv_6= 'post' otherlv_7= ':' ( (lv_post_8_0= ruleBoolean ) ) otherlv_9= 'put' otherlv_10= ':' ( (lv_put_11_0= ruleBoolean ) ) otherlv_12= 'delete' otherlv_13= ':' ( (lv_delete_14_0= ruleBoolean ) ) ( (otherlv_15= RULE_ID ) ) otherlv_16= '}' )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:832:1: (otherlv_0= 'form' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'get' otherlv_4= ':' ( (lv_get_5_0= ruleBoolean ) ) otherlv_6= 'post' otherlv_7= ':' ( (lv_post_8_0= ruleBoolean ) ) otherlv_9= 'put' otherlv_10= ':' ( (lv_put_11_0= ruleBoolean ) ) otherlv_12= 'delete' otherlv_13= ':' ( (lv_delete_14_0= ruleBoolean ) ) ( (otherlv_15= RULE_ID ) ) otherlv_16= '}' )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:832:3: otherlv_0= 'form' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'get' otherlv_4= ':' ( (lv_get_5_0= ruleBoolean ) ) otherlv_6= 'post' otherlv_7= ':' ( (lv_post_8_0= ruleBoolean ) ) otherlv_9= 'put' otherlv_10= ':' ( (lv_put_11_0= ruleBoolean ) ) otherlv_12= 'delete' otherlv_13= ':' ( (lv_delete_14_0= ruleBoolean ) ) ( (otherlv_15= RULE_ID ) ) otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleForm1950); 

                	newLeafNode(otherlv_0, grammarAccess.getFormAccess().getFormKeyword_0());
                
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:836:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:837:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:837:1: (lv_name_1_0= RULE_ID )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:838:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleForm1967); 

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

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleForm1984); 

                	newLeafNode(otherlv_2, grammarAccess.getFormAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleForm1996); 

                	newLeafNode(otherlv_3, grammarAccess.getFormAccess().getGetKeyword_3());
                
            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleForm2008); 

                	newLeafNode(otherlv_4, grammarAccess.getFormAccess().getColonKeyword_4());
                
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:866:1: ( (lv_get_5_0= ruleBoolean ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:867:1: (lv_get_5_0= ruleBoolean )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:867:1: (lv_get_5_0= ruleBoolean )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:868:3: lv_get_5_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getFormAccess().getGetBooleanParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleForm2029);
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

            otherlv_6=(Token)match(input,33,FOLLOW_33_in_ruleForm2041); 

                	newLeafNode(otherlv_6, grammarAccess.getFormAccess().getPostKeyword_6());
                
            otherlv_7=(Token)match(input,24,FOLLOW_24_in_ruleForm2053); 

                	newLeafNode(otherlv_7, grammarAccess.getFormAccess().getColonKeyword_7());
                
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:892:1: ( (lv_post_8_0= ruleBoolean ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:893:1: (lv_post_8_0= ruleBoolean )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:893:1: (lv_post_8_0= ruleBoolean )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:894:3: lv_post_8_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getFormAccess().getPostBooleanParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleForm2074);
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

            otherlv_9=(Token)match(input,34,FOLLOW_34_in_ruleForm2086); 

                	newLeafNode(otherlv_9, grammarAccess.getFormAccess().getPutKeyword_9());
                
            otherlv_10=(Token)match(input,24,FOLLOW_24_in_ruleForm2098); 

                	newLeafNode(otherlv_10, grammarAccess.getFormAccess().getColonKeyword_10());
                
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:918:1: ( (lv_put_11_0= ruleBoolean ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:919:1: (lv_put_11_0= ruleBoolean )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:919:1: (lv_put_11_0= ruleBoolean )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:920:3: lv_put_11_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getFormAccess().getPutBooleanParserRuleCall_11_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleForm2119);
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

            otherlv_12=(Token)match(input,35,FOLLOW_35_in_ruleForm2131); 

                	newLeafNode(otherlv_12, grammarAccess.getFormAccess().getDeleteKeyword_12());
                
            otherlv_13=(Token)match(input,24,FOLLOW_24_in_ruleForm2143); 

                	newLeafNode(otherlv_13, grammarAccess.getFormAccess().getColonKeyword_13());
                
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:944:1: ( (lv_delete_14_0= ruleBoolean ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:945:1: (lv_delete_14_0= ruleBoolean )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:945:1: (lv_delete_14_0= ruleBoolean )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:946:3: lv_delete_14_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getFormAccess().getDeleteBooleanParserRuleCall_14_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleForm2164);
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

            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:962:2: ( (otherlv_15= RULE_ID ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:963:1: (otherlv_15= RULE_ID )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:963:1: (otherlv_15= RULE_ID )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:964:3: otherlv_15= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFormRule());
            	        }
                    
            otherlv_15=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleForm2184); 

            		newLeafNode(otherlv_15, grammarAccess.getFormAccess().getEntityEntityCrossReference_15_0()); 
            	

            }


            }

            otherlv_16=(Token)match(input,16,FOLLOW_16_in_ruleForm2196); 

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
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:987:1: entryRuleFormNewEntityOnly returns [EObject current=null] : iv_ruleFormNewEntityOnly= ruleFormNewEntityOnly EOF ;
    public final EObject entryRuleFormNewEntityOnly() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormNewEntityOnly = null;


        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:988:2: (iv_ruleFormNewEntityOnly= ruleFormNewEntityOnly EOF )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:989:2: iv_ruleFormNewEntityOnly= ruleFormNewEntityOnly EOF
            {
             newCompositeNode(grammarAccess.getFormNewEntityOnlyRule()); 
            pushFollow(FOLLOW_ruleFormNewEntityOnly_in_entryRuleFormNewEntityOnly2232);
            iv_ruleFormNewEntityOnly=ruleFormNewEntityOnly();

            state._fsp--;

             current =iv_ruleFormNewEntityOnly; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormNewEntityOnly2242); 

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
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:996:1: ruleFormNewEntityOnly returns [EObject current=null] : (otherlv_0= 'formNewEntity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' ) ;
    public final EObject ruleFormNewEntityOnly() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:999:28: ( (otherlv_0= 'formNewEntity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1000:1: (otherlv_0= 'formNewEntity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1000:1: (otherlv_0= 'formNewEntity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1000:3: otherlv_0= 'formNewEntity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleFormNewEntityOnly2279); 

                	newLeafNode(otherlv_0, grammarAccess.getFormNewEntityOnlyAccess().getFormNewEntityKeyword_0());
                
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1004:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1005:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1005:1: (lv_name_1_0= RULE_ID )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1006:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFormNewEntityOnly2296); 

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

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleFormNewEntityOnly2313); 

                	newLeafNode(otherlv_2, grammarAccess.getFormNewEntityOnlyAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1026:1: ( (otherlv_3= RULE_ID ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1027:1: (otherlv_3= RULE_ID )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1027:1: (otherlv_3= RULE_ID )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1028:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFormNewEntityOnlyRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFormNewEntityOnly2333); 

            		newLeafNode(otherlv_3, grammarAccess.getFormNewEntityOnlyAccess().getEntityEntityCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleFormNewEntityOnly2345); 

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
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1051:1: entryRuleFormReport returns [EObject current=null] : iv_ruleFormReport= ruleFormReport EOF ;
    public final EObject entryRuleFormReport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormReport = null;


        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1052:2: (iv_ruleFormReport= ruleFormReport EOF )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1053:2: iv_ruleFormReport= ruleFormReport EOF
            {
             newCompositeNode(grammarAccess.getFormReportRule()); 
            pushFollow(FOLLOW_ruleFormReport_in_entryRuleFormReport2381);
            iv_ruleFormReport=ruleFormReport();

            state._fsp--;

             current =iv_ruleFormReport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormReport2391); 

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
    // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1060:1: ruleFormReport returns [EObject current=null] : (otherlv_0= 'formReport' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'filter' otherlv_4= ':' ( (lv_filter_5_0= ruleBoolean ) ) otherlv_6= 'order' otherlv_7= ':' ( (lv_order_8_0= ruleBoolean ) ) otherlv_9= 'pagination' otherlv_10= ':' ( (lv_pagination_11_0= ruleBoolean ) ) otherlv_12= '}' ) ;
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
        AntlrDatatypeRuleToken lv_filter_5_0 = null;

        AntlrDatatypeRuleToken lv_order_8_0 = null;

        AntlrDatatypeRuleToken lv_pagination_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1063:28: ( (otherlv_0= 'formReport' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'filter' otherlv_4= ':' ( (lv_filter_5_0= ruleBoolean ) ) otherlv_6= 'order' otherlv_7= ':' ( (lv_order_8_0= ruleBoolean ) ) otherlv_9= 'pagination' otherlv_10= ':' ( (lv_pagination_11_0= ruleBoolean ) ) otherlv_12= '}' ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1064:1: (otherlv_0= 'formReport' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'filter' otherlv_4= ':' ( (lv_filter_5_0= ruleBoolean ) ) otherlv_6= 'order' otherlv_7= ':' ( (lv_order_8_0= ruleBoolean ) ) otherlv_9= 'pagination' otherlv_10= ':' ( (lv_pagination_11_0= ruleBoolean ) ) otherlv_12= '}' )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1064:1: (otherlv_0= 'formReport' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'filter' otherlv_4= ':' ( (lv_filter_5_0= ruleBoolean ) ) otherlv_6= 'order' otherlv_7= ':' ( (lv_order_8_0= ruleBoolean ) ) otherlv_9= 'pagination' otherlv_10= ':' ( (lv_pagination_11_0= ruleBoolean ) ) otherlv_12= '}' )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1064:3: otherlv_0= 'formReport' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'filter' otherlv_4= ':' ( (lv_filter_5_0= ruleBoolean ) ) otherlv_6= 'order' otherlv_7= ':' ( (lv_order_8_0= ruleBoolean ) ) otherlv_9= 'pagination' otherlv_10= ':' ( (lv_pagination_11_0= ruleBoolean ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleFormReport2428); 

                	newLeafNode(otherlv_0, grammarAccess.getFormReportAccess().getFormReportKeyword_0());
                
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1068:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1069:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1069:1: (lv_name_1_0= RULE_ID )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1070:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFormReport2445); 

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

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleFormReport2462); 

                	newLeafNode(otherlv_2, grammarAccess.getFormReportAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleFormReport2474); 

                	newLeafNode(otherlv_3, grammarAccess.getFormReportAccess().getFilterKeyword_3());
                
            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleFormReport2486); 

                	newLeafNode(otherlv_4, grammarAccess.getFormReportAccess().getColonKeyword_4());
                
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1098:1: ( (lv_filter_5_0= ruleBoolean ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1099:1: (lv_filter_5_0= ruleBoolean )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1099:1: (lv_filter_5_0= ruleBoolean )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1100:3: lv_filter_5_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getFormReportAccess().getFilterBooleanParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleFormReport2507);
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

            otherlv_6=(Token)match(input,39,FOLLOW_39_in_ruleFormReport2519); 

                	newLeafNode(otherlv_6, grammarAccess.getFormReportAccess().getOrderKeyword_6());
                
            otherlv_7=(Token)match(input,24,FOLLOW_24_in_ruleFormReport2531); 

                	newLeafNode(otherlv_7, grammarAccess.getFormReportAccess().getColonKeyword_7());
                
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1124:1: ( (lv_order_8_0= ruleBoolean ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1125:1: (lv_order_8_0= ruleBoolean )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1125:1: (lv_order_8_0= ruleBoolean )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1126:3: lv_order_8_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getFormReportAccess().getOrderBooleanParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleFormReport2552);
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

            otherlv_9=(Token)match(input,40,FOLLOW_40_in_ruleFormReport2564); 

                	newLeafNode(otherlv_9, grammarAccess.getFormReportAccess().getPaginationKeyword_9());
                
            otherlv_10=(Token)match(input,24,FOLLOW_24_in_ruleFormReport2576); 

                	newLeafNode(otherlv_10, grammarAccess.getFormReportAccess().getColonKeyword_10());
                
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1150:1: ( (lv_pagination_11_0= ruleBoolean ) )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1151:1: (lv_pagination_11_0= ruleBoolean )
            {
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1151:1: (lv_pagination_11_0= ruleBoolean )
            // ../org.example.domainmodel.extended/src-gen/org/example/domainmodel/parser/antlr/internal/InternalExtended.g:1152:3: lv_pagination_11_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getFormReportAccess().getPaginationBooleanParserRuleCall_11_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleFormReport2597);
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

            otherlv_12=(Token)match(input,16,FOLLOW_16_in_ruleFormReport2609); 

                	newLeafNode(otherlv_12, grammarAccess.getFormReportAccess().getRightCurlyBracketKeyword_12());
                

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
    public static final BitSet FOLLOW_12_in_ruleDomainmodel156 = new BitSet(new long[]{0x0000000088346000L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleDomainmodel177 = new BitSet(new long[]{0x0000000088346000L});
    public static final BitSet FOLLOW_13_in_ruleDomainmodel190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageDeclaration236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulePackageDeclaration273 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePackageDeclaration294 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePackageDeclaration306 = new BitSet(new long[]{0x0000000088354000L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rulePackageDeclaration327 = new BitSet(new long[]{0x0000000088354000L});
    public static final BitSet FOLLOW_16_in_rulePackageDeclaration340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement376 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_ruleAbstractElement433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleAbstractElement460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleAbstractElement487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePage_in_ruleAbstractElement514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForm_in_ruleAbstractElement541 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_ruleType_in_entryRuleType933 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleType990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleType1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType1052 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleDataType1099 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataType1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity1157 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleEntity1204 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity1221 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_22_in_ruleEntity1239 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEntity1262 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEntity1276 = new BitSet(new long[]{0x0000000000810020L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleEntity1297 = new BitSet(new long[]{0x0000000000810020L});
    public static final BitSet FOLLOW_16_in_ruleEntity1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature1346 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleFeature1399 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeature1430 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleFeature1447 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleFeature1470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_entryRuleBoolean1507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolean1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleBoolean1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleBoolean1575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePage_in_entryRulePage1615 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePage1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rulePage1662 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePage1679 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePage1696 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_rulePage1708 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulePage1720 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePage1737 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_rulePage1754 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulePage1766 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_rulePage1787 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_rulePage1799 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulePage1811 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_rulePage1832 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePage1852 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_16_in_rulePage1865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForm_in_entryRuleForm1903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForm1913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleForm1950 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleForm1967 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleForm1984 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleForm1996 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleForm2008 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleForm2029 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleForm2041 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleForm2053 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleForm2074 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleForm2086 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleForm2098 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleForm2119 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleForm2131 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleForm2143 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleForm2164 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleForm2184 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleForm2196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormNewEntityOnly_in_entryRuleFormNewEntityOnly2232 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormNewEntityOnly2242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleFormNewEntityOnly2279 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFormNewEntityOnly2296 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFormNewEntityOnly2313 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFormNewEntityOnly2333 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFormNewEntityOnly2345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormReport_in_entryRuleFormReport2381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormReport2391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleFormReport2428 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFormReport2445 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFormReport2462 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleFormReport2474 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleFormReport2486 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleFormReport2507 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleFormReport2519 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleFormReport2531 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleFormReport2552 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleFormReport2564 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleFormReport2576 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleFormReport2597 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFormReport2609 = new BitSet(new long[]{0x0000000000000002L});

}