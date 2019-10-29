package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.SeleniumGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSeleniumParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'returns'", "'true'", "'false'", "'{'", "'open;'", "'}'", "';'", "'goto:'", "'verify:'", "'page'", "'contains'", "'['", "']'", "'fill:'", "'in'", "'var'", "'='", "'text'", "'property'", "'of'", "'click:'", "'check:'", "'all'", "'on'", "'off'", "'select-combo:'", "'n\\u00B0'", "'where'", "'text='", "'image'", "'link'", "'button'", "'anything'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalSeleniumParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSeleniumParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSeleniumParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSelenium.g"; }



     	private SeleniumGrammarAccess grammarAccess;

        public InternalSeleniumParser(TokenStream input, SeleniumGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Global";
       	}

       	@Override
       	protected SeleniumGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGlobal"
    // InternalSelenium.g:64:1: entryRuleGlobal returns [EObject current=null] : iv_ruleGlobal= ruleGlobal EOF ;
    public final EObject entryRuleGlobal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobal = null;


        try {
            // InternalSelenium.g:64:47: (iv_ruleGlobal= ruleGlobal EOF )
            // InternalSelenium.g:65:2: iv_ruleGlobal= ruleGlobal EOF
            {
             newCompositeNode(grammarAccess.getGlobalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGlobal=ruleGlobal();

            state._fsp--;

             current =iv_ruleGlobal; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGlobal"


    // $ANTLR start "ruleGlobal"
    // InternalSelenium.g:71:1: ruleGlobal returns [EObject current=null] : ( (lv_programs_0_0= ruleProgram ) )* ;
    public final EObject ruleGlobal() throws RecognitionException {
        EObject current = null;

        EObject lv_programs_0_0 = null;



        	enterRule();

        try {
            // InternalSelenium.g:77:2: ( ( (lv_programs_0_0= ruleProgram ) )* )
            // InternalSelenium.g:78:2: ( (lv_programs_0_0= ruleProgram ) )*
            {
            // InternalSelenium.g:78:2: ( (lv_programs_0_0= ruleProgram ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSelenium.g:79:3: (lv_programs_0_0= ruleProgram )
            	    {
            	    // InternalSelenium.g:79:3: (lv_programs_0_0= ruleProgram )
            	    // InternalSelenium.g:80:4: lv_programs_0_0= ruleProgram
            	    {

            	    				newCompositeNode(grammarAccess.getGlobalAccess().getProgramsProgramParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_programs_0_0=ruleProgram();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getGlobalRule());
            	    				}
            	    				add(
            	    					current,
            	    					"programs",
            	    					lv_programs_0_0,
            	    					"org.xtext.example.mydsl.Selenium.Program");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleGlobal"


    // $ANTLR start "entryRuleProgram"
    // InternalSelenium.g:100:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalSelenium.g:100:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalSelenium.g:101:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalSelenium.g:107:1: ruleProgram returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'returns' ( ( (lv_ret_2_1= 'true' | lv_ret_2_2= 'false' ) ) ) otherlv_3= '{' otherlv_4= 'open;' ( (lv_ins_5_0= ruleInstruction ) )* otherlv_6= '}' ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_ret_2_1=null;
        Token lv_ret_2_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_ins_5_0 = null;



        	enterRule();

        try {
            // InternalSelenium.g:113:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'returns' ( ( (lv_ret_2_1= 'true' | lv_ret_2_2= 'false' ) ) ) otherlv_3= '{' otherlv_4= 'open;' ( (lv_ins_5_0= ruleInstruction ) )* otherlv_6= '}' ) )
            // InternalSelenium.g:114:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'returns' ( ( (lv_ret_2_1= 'true' | lv_ret_2_2= 'false' ) ) ) otherlv_3= '{' otherlv_4= 'open;' ( (lv_ins_5_0= ruleInstruction ) )* otherlv_6= '}' )
            {
            // InternalSelenium.g:114:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'returns' ( ( (lv_ret_2_1= 'true' | lv_ret_2_2= 'false' ) ) ) otherlv_3= '{' otherlv_4= 'open;' ( (lv_ins_5_0= ruleInstruction ) )* otherlv_6= '}' )
            // InternalSelenium.g:115:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'returns' ( ( (lv_ret_2_1= 'true' | lv_ret_2_2= 'false' ) ) ) otherlv_3= '{' otherlv_4= 'open;' ( (lv_ins_5_0= ruleInstruction ) )* otherlv_6= '}'
            {
            // InternalSelenium.g:115:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSelenium.g:116:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSelenium.g:116:4: (lv_name_0_0= RULE_ID )
            // InternalSelenium.g:117:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_0_0, grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProgramRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getProgramAccess().getReturnsKeyword_1());
            		
            // InternalSelenium.g:137:3: ( ( (lv_ret_2_1= 'true' | lv_ret_2_2= 'false' ) ) )
            // InternalSelenium.g:138:4: ( (lv_ret_2_1= 'true' | lv_ret_2_2= 'false' ) )
            {
            // InternalSelenium.g:138:4: ( (lv_ret_2_1= 'true' | lv_ret_2_2= 'false' ) )
            // InternalSelenium.g:139:5: (lv_ret_2_1= 'true' | lv_ret_2_2= 'false' )
            {
            // InternalSelenium.g:139:5: (lv_ret_2_1= 'true' | lv_ret_2_2= 'false' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( (LA2_0==13) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSelenium.g:140:6: lv_ret_2_1= 'true'
                    {
                    lv_ret_2_1=(Token)match(input,12,FOLLOW_6); 

                    						newLeafNode(lv_ret_2_1, grammarAccess.getProgramAccess().getRetTrueKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProgramRule());
                    						}
                    						setWithLastConsumed(current, "ret", lv_ret_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalSelenium.g:151:6: lv_ret_2_2= 'false'
                    {
                    lv_ret_2_2=(Token)match(input,13,FOLLOW_6); 

                    						newLeafNode(lv_ret_2_2, grammarAccess.getProgramAccess().getRetFalseKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProgramRule());
                    						}
                    						setWithLastConsumed(current, "ret", lv_ret_2_2, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getProgramAccess().getOpenKeyword_4());
            		
            // InternalSelenium.g:172:3: ( (lv_ins_5_0= ruleInstruction ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=18 && LA3_0<=19)||LA3_0==24||LA3_0==26||(LA3_0>=31 && LA3_0<=32)||LA3_0==36) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSelenium.g:173:4: (lv_ins_5_0= ruleInstruction )
            	    {
            	    // InternalSelenium.g:173:4: (lv_ins_5_0= ruleInstruction )
            	    // InternalSelenium.g:174:5: lv_ins_5_0= ruleInstruction
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getInsInstructionParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_ins_5_0=ruleInstruction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ins",
            	    						lv_ins_5_0,
            	    						"org.xtext.example.mydsl.Selenium.Instruction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleInstruction"
    // InternalSelenium.g:199:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // InternalSelenium.g:199:52: (iv_ruleInstruction= ruleInstruction EOF )
            // InternalSelenium.g:200:2: iv_ruleInstruction= ruleInstruction EOF
            {
             newCompositeNode(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;

             current =iv_ruleInstruction; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // InternalSelenium.g:206:1: ruleInstruction returns [EObject current=null] : ( (this_Go_0= ruleGo | this_Verify_1= ruleVerify | this_Click_2= ruleClick | this_FillText_3= ruleFillText | this_Check_4= ruleCheck | this_SelectCombo_5= ruleSelectCombo | this_Variable_6= ruleVariable ) otherlv_7= ';' ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        Token otherlv_7=null;
        EObject this_Go_0 = null;

        EObject this_Verify_1 = null;

        EObject this_Click_2 = null;

        EObject this_FillText_3 = null;

        EObject this_Check_4 = null;

        EObject this_SelectCombo_5 = null;

        EObject this_Variable_6 = null;



        	enterRule();

        try {
            // InternalSelenium.g:212:2: ( ( (this_Go_0= ruleGo | this_Verify_1= ruleVerify | this_Click_2= ruleClick | this_FillText_3= ruleFillText | this_Check_4= ruleCheck | this_SelectCombo_5= ruleSelectCombo | this_Variable_6= ruleVariable ) otherlv_7= ';' ) )
            // InternalSelenium.g:213:2: ( (this_Go_0= ruleGo | this_Verify_1= ruleVerify | this_Click_2= ruleClick | this_FillText_3= ruleFillText | this_Check_4= ruleCheck | this_SelectCombo_5= ruleSelectCombo | this_Variable_6= ruleVariable ) otherlv_7= ';' )
            {
            // InternalSelenium.g:213:2: ( (this_Go_0= ruleGo | this_Verify_1= ruleVerify | this_Click_2= ruleClick | this_FillText_3= ruleFillText | this_Check_4= ruleCheck | this_SelectCombo_5= ruleSelectCombo | this_Variable_6= ruleVariable ) otherlv_7= ';' )
            // InternalSelenium.g:214:3: (this_Go_0= ruleGo | this_Verify_1= ruleVerify | this_Click_2= ruleClick | this_FillText_3= ruleFillText | this_Check_4= ruleCheck | this_SelectCombo_5= ruleSelectCombo | this_Variable_6= ruleVariable ) otherlv_7= ';'
            {
            // InternalSelenium.g:214:3: (this_Go_0= ruleGo | this_Verify_1= ruleVerify | this_Click_2= ruleClick | this_FillText_3= ruleFillText | this_Check_4= ruleCheck | this_SelectCombo_5= ruleSelectCombo | this_Variable_6= ruleVariable )
            int alt4=7;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt4=1;
                }
                break;
            case 19:
                {
                alt4=2;
                }
                break;
            case 31:
                {
                alt4=3;
                }
                break;
            case 24:
                {
                alt4=4;
                }
                break;
            case 32:
                {
                alt4=5;
                }
                break;
            case 36:
                {
                alt4=6;
                }
                break;
            case 26:
                {
                alt4=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalSelenium.g:215:4: this_Go_0= ruleGo
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getGoParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_9);
                    this_Go_0=ruleGo();

                    state._fsp--;


                    				current = this_Go_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalSelenium.g:224:4: this_Verify_1= ruleVerify
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getVerifyParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_9);
                    this_Verify_1=ruleVerify();

                    state._fsp--;


                    				current = this_Verify_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalSelenium.g:233:4: this_Click_2= ruleClick
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getClickParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_9);
                    this_Click_2=ruleClick();

                    state._fsp--;


                    				current = this_Click_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 4 :
                    // InternalSelenium.g:242:4: this_FillText_3= ruleFillText
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getFillTextParserRuleCall_0_3());
                    			
                    pushFollow(FOLLOW_9);
                    this_FillText_3=ruleFillText();

                    state._fsp--;


                    				current = this_FillText_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 5 :
                    // InternalSelenium.g:251:4: this_Check_4= ruleCheck
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getCheckParserRuleCall_0_4());
                    			
                    pushFollow(FOLLOW_9);
                    this_Check_4=ruleCheck();

                    state._fsp--;


                    				current = this_Check_4;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 6 :
                    // InternalSelenium.g:260:4: this_SelectCombo_5= ruleSelectCombo
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getSelectComboParserRuleCall_0_5());
                    			
                    pushFollow(FOLLOW_9);
                    this_SelectCombo_5=ruleSelectCombo();

                    state._fsp--;


                    				current = this_SelectCombo_5;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 7 :
                    // InternalSelenium.g:269:4: this_Variable_6= ruleVariable
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getVariableParserRuleCall_0_6());
                    			
                    pushFollow(FOLLOW_9);
                    this_Variable_6=ruleVariable();

                    state._fsp--;


                    				current = this_Variable_6;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getInstructionAccess().getSemicolonKeyword_1());
            		

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
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleGo"
    // InternalSelenium.g:286:1: entryRuleGo returns [EObject current=null] : iv_ruleGo= ruleGo EOF ;
    public final EObject entryRuleGo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGo = null;


        try {
            // InternalSelenium.g:286:43: (iv_ruleGo= ruleGo EOF )
            // InternalSelenium.g:287:2: iv_ruleGo= ruleGo EOF
            {
             newCompositeNode(grammarAccess.getGoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGo=ruleGo();

            state._fsp--;

             current =iv_ruleGo; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGo"


    // $ANTLR start "ruleGo"
    // InternalSelenium.g:293:1: ruleGo returns [EObject current=null] : (otherlv_0= 'goto:' ( (lv_url_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleGo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_url_1_0=null;


        	enterRule();

        try {
            // InternalSelenium.g:299:2: ( (otherlv_0= 'goto:' ( (lv_url_1_0= RULE_STRING ) ) ) )
            // InternalSelenium.g:300:2: (otherlv_0= 'goto:' ( (lv_url_1_0= RULE_STRING ) ) )
            {
            // InternalSelenium.g:300:2: (otherlv_0= 'goto:' ( (lv_url_1_0= RULE_STRING ) ) )
            // InternalSelenium.g:301:3: otherlv_0= 'goto:' ( (lv_url_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getGoAccess().getGotoKeyword_0());
            		
            // InternalSelenium.g:305:3: ( (lv_url_1_0= RULE_STRING ) )
            // InternalSelenium.g:306:4: (lv_url_1_0= RULE_STRING )
            {
            // InternalSelenium.g:306:4: (lv_url_1_0= RULE_STRING )
            // InternalSelenium.g:307:5: lv_url_1_0= RULE_STRING
            {
            lv_url_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_url_1_0, grammarAccess.getGoAccess().getUrlSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"url",
            						lv_url_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleGo"


    // $ANTLR start "entryRuleVerify"
    // InternalSelenium.g:327:1: entryRuleVerify returns [EObject current=null] : iv_ruleVerify= ruleVerify EOF ;
    public final EObject entryRuleVerify() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerify = null;


        try {
            // InternalSelenium.g:327:47: (iv_ruleVerify= ruleVerify EOF )
            // InternalSelenium.g:328:2: iv_ruleVerify= ruleVerify EOF
            {
             newCompositeNode(grammarAccess.getVerifyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVerify=ruleVerify();

            state._fsp--;

             current =iv_ruleVerify; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVerify"


    // $ANTLR start "ruleVerify"
    // InternalSelenium.g:334:1: ruleVerify returns [EObject current=null] : (otherlv_0= 'verify:' (otherlv_1= 'page' | ( (lv_elem_2_0= ruleElement ) ) ) otherlv_3= 'contains' ( ( (lv_text_4_0= RULE_STRING ) ) | (otherlv_5= '[' ( (otherlv_6= RULE_ID ) ) otherlv_7= ']' ) | ( (lv_Element_8_0= ruleElement ) ) ) ) ;
    public final EObject ruleVerify() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_text_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_elem_2_0 = null;

        EObject lv_Element_8_0 = null;



        	enterRule();

        try {
            // InternalSelenium.g:340:2: ( (otherlv_0= 'verify:' (otherlv_1= 'page' | ( (lv_elem_2_0= ruleElement ) ) ) otherlv_3= 'contains' ( ( (lv_text_4_0= RULE_STRING ) ) | (otherlv_5= '[' ( (otherlv_6= RULE_ID ) ) otherlv_7= ']' ) | ( (lv_Element_8_0= ruleElement ) ) ) ) )
            // InternalSelenium.g:341:2: (otherlv_0= 'verify:' (otherlv_1= 'page' | ( (lv_elem_2_0= ruleElement ) ) ) otherlv_3= 'contains' ( ( (lv_text_4_0= RULE_STRING ) ) | (otherlv_5= '[' ( (otherlv_6= RULE_ID ) ) otherlv_7= ']' ) | ( (lv_Element_8_0= ruleElement ) ) ) )
            {
            // InternalSelenium.g:341:2: (otherlv_0= 'verify:' (otherlv_1= 'page' | ( (lv_elem_2_0= ruleElement ) ) ) otherlv_3= 'contains' ( ( (lv_text_4_0= RULE_STRING ) ) | (otherlv_5= '[' ( (otherlv_6= RULE_ID ) ) otherlv_7= ']' ) | ( (lv_Element_8_0= ruleElement ) ) ) )
            // InternalSelenium.g:342:3: otherlv_0= 'verify:' (otherlv_1= 'page' | ( (lv_elem_2_0= ruleElement ) ) ) otherlv_3= 'contains' ( ( (lv_text_4_0= RULE_STRING ) ) | (otherlv_5= '[' ( (otherlv_6= RULE_ID ) ) otherlv_7= ']' ) | ( (lv_Element_8_0= ruleElement ) ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getVerifyAccess().getVerifyKeyword_0());
            		
            // InternalSelenium.g:346:3: (otherlv_1= 'page' | ( (lv_elem_2_0= ruleElement ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=37 && LA5_0<=38)||(LA5_0>=40 && LA5_0<=43)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSelenium.g:347:4: otherlv_1= 'page'
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getVerifyAccess().getPageKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalSelenium.g:352:4: ( (lv_elem_2_0= ruleElement ) )
                    {
                    // InternalSelenium.g:352:4: ( (lv_elem_2_0= ruleElement ) )
                    // InternalSelenium.g:353:5: (lv_elem_2_0= ruleElement )
                    {
                    // InternalSelenium.g:353:5: (lv_elem_2_0= ruleElement )
                    // InternalSelenium.g:354:6: lv_elem_2_0= ruleElement
                    {

                    						newCompositeNode(grammarAccess.getVerifyAccess().getElemElementParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_elem_2_0=ruleElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVerifyRule());
                    						}
                    						set(
                    							current,
                    							"elem",
                    							lv_elem_2_0,
                    							"org.xtext.example.mydsl.Selenium.Element");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getVerifyAccess().getContainsKeyword_2());
            		
            // InternalSelenium.g:376:3: ( ( (lv_text_4_0= RULE_STRING ) ) | (otherlv_5= '[' ( (otherlv_6= RULE_ID ) ) otherlv_7= ']' ) | ( (lv_Element_8_0= ruleElement ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt6=1;
                }
                break;
            case 22:
                {
                alt6=2;
                }
                break;
            case 37:
            case 38:
            case 40:
            case 41:
            case 42:
            case 43:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalSelenium.g:377:4: ( (lv_text_4_0= RULE_STRING ) )
                    {
                    // InternalSelenium.g:377:4: ( (lv_text_4_0= RULE_STRING ) )
                    // InternalSelenium.g:378:5: (lv_text_4_0= RULE_STRING )
                    {
                    // InternalSelenium.g:378:5: (lv_text_4_0= RULE_STRING )
                    // InternalSelenium.g:379:6: lv_text_4_0= RULE_STRING
                    {
                    lv_text_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_text_4_0, grammarAccess.getVerifyAccess().getTextSTRINGTerminalRuleCall_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVerifyRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"text",
                    							lv_text_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSelenium.g:396:4: (otherlv_5= '[' ( (otherlv_6= RULE_ID ) ) otherlv_7= ']' )
                    {
                    // InternalSelenium.g:396:4: (otherlv_5= '[' ( (otherlv_6= RULE_ID ) ) otherlv_7= ']' )
                    // InternalSelenium.g:397:5: otherlv_5= '[' ( (otherlv_6= RULE_ID ) ) otherlv_7= ']'
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_14); 

                    					newLeafNode(otherlv_5, grammarAccess.getVerifyAccess().getLeftSquareBracketKeyword_3_1_0());
                    				
                    // InternalSelenium.g:401:5: ( (otherlv_6= RULE_ID ) )
                    // InternalSelenium.g:402:6: (otherlv_6= RULE_ID )
                    {
                    // InternalSelenium.g:402:6: (otherlv_6= RULE_ID )
                    // InternalSelenium.g:403:7: otherlv_6= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getVerifyRule());
                    							}
                    						
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_15); 

                    							newLeafNode(otherlv_6, grammarAccess.getVerifyAccess().getVarVariableCrossReference_3_1_1_0());
                    						

                    }


                    }

                    otherlv_7=(Token)match(input,23,FOLLOW_2); 

                    					newLeafNode(otherlv_7, grammarAccess.getVerifyAccess().getRightSquareBracketKeyword_3_1_2());
                    				

                    }


                    }
                    break;
                case 3 :
                    // InternalSelenium.g:420:4: ( (lv_Element_8_0= ruleElement ) )
                    {
                    // InternalSelenium.g:420:4: ( (lv_Element_8_0= ruleElement ) )
                    // InternalSelenium.g:421:5: (lv_Element_8_0= ruleElement )
                    {
                    // InternalSelenium.g:421:5: (lv_Element_8_0= ruleElement )
                    // InternalSelenium.g:422:6: lv_Element_8_0= ruleElement
                    {

                    						newCompositeNode(grammarAccess.getVerifyAccess().getElementElementParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_Element_8_0=ruleElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVerifyRule());
                    						}
                    						set(
                    							current,
                    							"Element",
                    							lv_Element_8_0,
                    							"org.xtext.example.mydsl.Selenium.Element");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleVerify"


    // $ANTLR start "entryRuleFillText"
    // InternalSelenium.g:444:1: entryRuleFillText returns [EObject current=null] : iv_ruleFillText= ruleFillText EOF ;
    public final EObject entryRuleFillText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFillText = null;


        try {
            // InternalSelenium.g:444:49: (iv_ruleFillText= ruleFillText EOF )
            // InternalSelenium.g:445:2: iv_ruleFillText= ruleFillText EOF
            {
             newCompositeNode(grammarAccess.getFillTextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFillText=ruleFillText();

            state._fsp--;

             current =iv_ruleFillText; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFillText"


    // $ANTLR start "ruleFillText"
    // InternalSelenium.g:451:1: ruleFillText returns [EObject current=null] : (otherlv_0= 'fill:' ( ( (lv_text_1_0= RULE_STRING ) ) | (otherlv_2= '[' ( (otherlv_3= RULE_ID ) ) otherlv_4= ']' ) ) otherlv_5= 'in' ( (lv_prop_6_0= ruleByProperty ) ) ( (lv_target_7_0= RULE_STRING ) ) ) ;
    public final EObject ruleFillText() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_text_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_target_7_0=null;
        EObject lv_prop_6_0 = null;



        	enterRule();

        try {
            // InternalSelenium.g:457:2: ( (otherlv_0= 'fill:' ( ( (lv_text_1_0= RULE_STRING ) ) | (otherlv_2= '[' ( (otherlv_3= RULE_ID ) ) otherlv_4= ']' ) ) otherlv_5= 'in' ( (lv_prop_6_0= ruleByProperty ) ) ( (lv_target_7_0= RULE_STRING ) ) ) )
            // InternalSelenium.g:458:2: (otherlv_0= 'fill:' ( ( (lv_text_1_0= RULE_STRING ) ) | (otherlv_2= '[' ( (otherlv_3= RULE_ID ) ) otherlv_4= ']' ) ) otherlv_5= 'in' ( (lv_prop_6_0= ruleByProperty ) ) ( (lv_target_7_0= RULE_STRING ) ) )
            {
            // InternalSelenium.g:458:2: (otherlv_0= 'fill:' ( ( (lv_text_1_0= RULE_STRING ) ) | (otherlv_2= '[' ( (otherlv_3= RULE_ID ) ) otherlv_4= ']' ) ) otherlv_5= 'in' ( (lv_prop_6_0= ruleByProperty ) ) ( (lv_target_7_0= RULE_STRING ) ) )
            // InternalSelenium.g:459:3: otherlv_0= 'fill:' ( ( (lv_text_1_0= RULE_STRING ) ) | (otherlv_2= '[' ( (otherlv_3= RULE_ID ) ) otherlv_4= ']' ) ) otherlv_5= 'in' ( (lv_prop_6_0= ruleByProperty ) ) ( (lv_target_7_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getFillTextAccess().getFillKeyword_0());
            		
            // InternalSelenium.g:463:3: ( ( (lv_text_1_0= RULE_STRING ) ) | (otherlv_2= '[' ( (otherlv_3= RULE_ID ) ) otherlv_4= ']' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==22) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalSelenium.g:464:4: ( (lv_text_1_0= RULE_STRING ) )
                    {
                    // InternalSelenium.g:464:4: ( (lv_text_1_0= RULE_STRING ) )
                    // InternalSelenium.g:465:5: (lv_text_1_0= RULE_STRING )
                    {
                    // InternalSelenium.g:465:5: (lv_text_1_0= RULE_STRING )
                    // InternalSelenium.g:466:6: lv_text_1_0= RULE_STRING
                    {
                    lv_text_1_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

                    						newLeafNode(lv_text_1_0, grammarAccess.getFillTextAccess().getTextSTRINGTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFillTextRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"text",
                    							lv_text_1_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSelenium.g:483:4: (otherlv_2= '[' ( (otherlv_3= RULE_ID ) ) otherlv_4= ']' )
                    {
                    // InternalSelenium.g:483:4: (otherlv_2= '[' ( (otherlv_3= RULE_ID ) ) otherlv_4= ']' )
                    // InternalSelenium.g:484:5: otherlv_2= '[' ( (otherlv_3= RULE_ID ) ) otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_14); 

                    					newLeafNode(otherlv_2, grammarAccess.getFillTextAccess().getLeftSquareBracketKeyword_1_1_0());
                    				
                    // InternalSelenium.g:488:5: ( (otherlv_3= RULE_ID ) )
                    // InternalSelenium.g:489:6: (otherlv_3= RULE_ID )
                    {
                    // InternalSelenium.g:489:6: (otherlv_3= RULE_ID )
                    // InternalSelenium.g:490:7: otherlv_3= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getFillTextRule());
                    							}
                    						
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_15); 

                    							newLeafNode(otherlv_3, grammarAccess.getFillTextAccess().getVarVariableCrossReference_1_1_1_0());
                    						

                    }


                    }

                    otherlv_4=(Token)match(input,23,FOLLOW_17); 

                    					newLeafNode(otherlv_4, grammarAccess.getFillTextAccess().getRightSquareBracketKeyword_1_1_2());
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,25,FOLLOW_18); 

            			newLeafNode(otherlv_5, grammarAccess.getFillTextAccess().getInKeyword_2());
            		
            // InternalSelenium.g:511:3: ( (lv_prop_6_0= ruleByProperty ) )
            // InternalSelenium.g:512:4: (lv_prop_6_0= ruleByProperty )
            {
            // InternalSelenium.g:512:4: (lv_prop_6_0= ruleByProperty )
            // InternalSelenium.g:513:5: lv_prop_6_0= ruleByProperty
            {

            					newCompositeNode(grammarAccess.getFillTextAccess().getPropByPropertyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_prop_6_0=ruleByProperty();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFillTextRule());
            					}
            					set(
            						current,
            						"prop",
            						lv_prop_6_0,
            						"org.xtext.example.mydsl.Selenium.ByProperty");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSelenium.g:530:3: ( (lv_target_7_0= RULE_STRING ) )
            // InternalSelenium.g:531:4: (lv_target_7_0= RULE_STRING )
            {
            // InternalSelenium.g:531:4: (lv_target_7_0= RULE_STRING )
            // InternalSelenium.g:532:5: lv_target_7_0= RULE_STRING
            {
            lv_target_7_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_target_7_0, grammarAccess.getFillTextAccess().getTargetSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFillTextRule());
            					}
            					setWithLastConsumed(
            						current,
            						"target",
            						lv_target_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleFillText"


    // $ANTLR start "entryRuleVariable"
    // InternalSelenium.g:552:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalSelenium.g:552:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalSelenium.g:553:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalSelenium.g:559:1: ruleVariable returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' (otherlv_3= 'text' | (otherlv_4= 'property' ( (lv_attr_5_0= RULE_STRING ) ) ) ) otherlv_6= 'of' ( (lv_elem_7_0= ruleElement ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_attr_5_0=null;
        Token otherlv_6=null;
        EObject lv_elem_7_0 = null;



        	enterRule();

        try {
            // InternalSelenium.g:565:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' (otherlv_3= 'text' | (otherlv_4= 'property' ( (lv_attr_5_0= RULE_STRING ) ) ) ) otherlv_6= 'of' ( (lv_elem_7_0= ruleElement ) ) ) )
            // InternalSelenium.g:566:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' (otherlv_3= 'text' | (otherlv_4= 'property' ( (lv_attr_5_0= RULE_STRING ) ) ) ) otherlv_6= 'of' ( (lv_elem_7_0= ruleElement ) ) )
            {
            // InternalSelenium.g:566:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' (otherlv_3= 'text' | (otherlv_4= 'property' ( (lv_attr_5_0= RULE_STRING ) ) ) ) otherlv_6= 'of' ( (lv_elem_7_0= ruleElement ) ) )
            // InternalSelenium.g:567:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' (otherlv_3= 'text' | (otherlv_4= 'property' ( (lv_attr_5_0= RULE_STRING ) ) ) ) otherlv_6= 'of' ( (lv_elem_7_0= ruleElement ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getVarKeyword_0());
            		
            // InternalSelenium.g:571:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSelenium.g:572:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSelenium.g:572:4: (lv_name_1_0= RULE_ID )
            // InternalSelenium.g:573:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getEqualsSignKeyword_2());
            		
            // InternalSelenium.g:593:3: (otherlv_3= 'text' | (otherlv_4= 'property' ( (lv_attr_5_0= RULE_STRING ) ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            else if ( (LA8_0==29) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalSelenium.g:594:4: otherlv_3= 'text'
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_21); 

                    				newLeafNode(otherlv_3, grammarAccess.getVariableAccess().getTextKeyword_3_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalSelenium.g:599:4: (otherlv_4= 'property' ( (lv_attr_5_0= RULE_STRING ) ) )
                    {
                    // InternalSelenium.g:599:4: (otherlv_4= 'property' ( (lv_attr_5_0= RULE_STRING ) ) )
                    // InternalSelenium.g:600:5: otherlv_4= 'property' ( (lv_attr_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_10); 

                    					newLeafNode(otherlv_4, grammarAccess.getVariableAccess().getPropertyKeyword_3_1_0());
                    				
                    // InternalSelenium.g:604:5: ( (lv_attr_5_0= RULE_STRING ) )
                    // InternalSelenium.g:605:6: (lv_attr_5_0= RULE_STRING )
                    {
                    // InternalSelenium.g:605:6: (lv_attr_5_0= RULE_STRING )
                    // InternalSelenium.g:606:7: lv_attr_5_0= RULE_STRING
                    {
                    lv_attr_5_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

                    							newLeafNode(lv_attr_5_0, grammarAccess.getVariableAccess().getAttrSTRINGTerminalRuleCall_3_1_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getVariableRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"attr",
                    								lv_attr_5_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,30,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getVariableAccess().getOfKeyword_4());
            		
            // InternalSelenium.g:628:3: ( (lv_elem_7_0= ruleElement ) )
            // InternalSelenium.g:629:4: (lv_elem_7_0= ruleElement )
            {
            // InternalSelenium.g:629:4: (lv_elem_7_0= ruleElement )
            // InternalSelenium.g:630:5: lv_elem_7_0= ruleElement
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getElemElementParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_elem_7_0=ruleElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableRule());
            					}
            					set(
            						current,
            						"elem",
            						lv_elem_7_0,
            						"org.xtext.example.mydsl.Selenium.Element");
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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleClick"
    // InternalSelenium.g:651:1: entryRuleClick returns [EObject current=null] : iv_ruleClick= ruleClick EOF ;
    public final EObject entryRuleClick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClick = null;


        try {
            // InternalSelenium.g:651:46: (iv_ruleClick= ruleClick EOF )
            // InternalSelenium.g:652:2: iv_ruleClick= ruleClick EOF
            {
             newCompositeNode(grammarAccess.getClickRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClick=ruleClick();

            state._fsp--;

             current =iv_ruleClick; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleClick"


    // $ANTLR start "ruleClick"
    // InternalSelenium.g:658:1: ruleClick returns [EObject current=null] : (otherlv_0= 'click:' this_Element_1= ruleElement ) ;
    public final EObject ruleClick() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Element_1 = null;



        	enterRule();

        try {
            // InternalSelenium.g:664:2: ( (otherlv_0= 'click:' this_Element_1= ruleElement ) )
            // InternalSelenium.g:665:2: (otherlv_0= 'click:' this_Element_1= ruleElement )
            {
            // InternalSelenium.g:665:2: (otherlv_0= 'click:' this_Element_1= ruleElement )
            // InternalSelenium.g:666:3: otherlv_0= 'click:' this_Element_1= ruleElement
            {
            otherlv_0=(Token)match(input,31,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getClickAccess().getClickKeyword_0());
            		

            			newCompositeNode(grammarAccess.getClickAccess().getElementParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_Element_1=ruleElement();

            state._fsp--;


            			current = this_Element_1;
            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleClick"


    // $ANTLR start "entryRuleCheck"
    // InternalSelenium.g:682:1: entryRuleCheck returns [EObject current=null] : iv_ruleCheck= ruleCheck EOF ;
    public final EObject entryRuleCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheck = null;


        try {
            // InternalSelenium.g:682:46: (iv_ruleCheck= ruleCheck EOF )
            // InternalSelenium.g:683:2: iv_ruleCheck= ruleCheck EOF
            {
             newCompositeNode(grammarAccess.getCheckRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCheck=ruleCheck();

            state._fsp--;

             current =iv_ruleCheck; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCheck"


    // $ANTLR start "ruleCheck"
    // InternalSelenium.g:689:1: ruleCheck returns [EObject current=null] : (otherlv_0= 'check:' (otherlv_1= 'all' | ( ( (lv_by_2_0= ruleBy ) ) ( (lv_target_3_0= RULE_STRING ) ) ) ) (otherlv_4= 'on' | otherlv_5= 'off' ) ) ;
    public final EObject ruleCheck() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_target_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_by_2_0 = null;



        	enterRule();

        try {
            // InternalSelenium.g:695:2: ( (otherlv_0= 'check:' (otherlv_1= 'all' | ( ( (lv_by_2_0= ruleBy ) ) ( (lv_target_3_0= RULE_STRING ) ) ) ) (otherlv_4= 'on' | otherlv_5= 'off' ) ) )
            // InternalSelenium.g:696:2: (otherlv_0= 'check:' (otherlv_1= 'all' | ( ( (lv_by_2_0= ruleBy ) ) ( (lv_target_3_0= RULE_STRING ) ) ) ) (otherlv_4= 'on' | otherlv_5= 'off' ) )
            {
            // InternalSelenium.g:696:2: (otherlv_0= 'check:' (otherlv_1= 'all' | ( ( (lv_by_2_0= ruleBy ) ) ( (lv_target_3_0= RULE_STRING ) ) ) ) (otherlv_4= 'on' | otherlv_5= 'off' ) )
            // InternalSelenium.g:697:3: otherlv_0= 'check:' (otherlv_1= 'all' | ( ( (lv_by_2_0= ruleBy ) ) ( (lv_target_3_0= RULE_STRING ) ) ) ) (otherlv_4= 'on' | otherlv_5= 'off' )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getCheckAccess().getCheckKeyword_0());
            		
            // InternalSelenium.g:701:3: (otherlv_1= 'all' | ( ( (lv_by_2_0= ruleBy ) ) ( (lv_target_3_0= RULE_STRING ) ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==33) ) {
                alt9=1;
            }
            else if ( (LA9_0==29||LA9_0==39) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalSelenium.g:702:4: otherlv_1= 'all'
                    {
                    otherlv_1=(Token)match(input,33,FOLLOW_23); 

                    				newLeafNode(otherlv_1, grammarAccess.getCheckAccess().getAllKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalSelenium.g:707:4: ( ( (lv_by_2_0= ruleBy ) ) ( (lv_target_3_0= RULE_STRING ) ) )
                    {
                    // InternalSelenium.g:707:4: ( ( (lv_by_2_0= ruleBy ) ) ( (lv_target_3_0= RULE_STRING ) ) )
                    // InternalSelenium.g:708:5: ( (lv_by_2_0= ruleBy ) ) ( (lv_target_3_0= RULE_STRING ) )
                    {
                    // InternalSelenium.g:708:5: ( (lv_by_2_0= ruleBy ) )
                    // InternalSelenium.g:709:6: (lv_by_2_0= ruleBy )
                    {
                    // InternalSelenium.g:709:6: (lv_by_2_0= ruleBy )
                    // InternalSelenium.g:710:7: lv_by_2_0= ruleBy
                    {

                    							newCompositeNode(grammarAccess.getCheckAccess().getByByParserRuleCall_1_1_0_0());
                    						
                    pushFollow(FOLLOW_10);
                    lv_by_2_0=ruleBy();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getCheckRule());
                    							}
                    							set(
                    								current,
                    								"by",
                    								lv_by_2_0,
                    								"org.xtext.example.mydsl.Selenium.By");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalSelenium.g:727:5: ( (lv_target_3_0= RULE_STRING ) )
                    // InternalSelenium.g:728:6: (lv_target_3_0= RULE_STRING )
                    {
                    // InternalSelenium.g:728:6: (lv_target_3_0= RULE_STRING )
                    // InternalSelenium.g:729:7: lv_target_3_0= RULE_STRING
                    {
                    lv_target_3_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

                    							newLeafNode(lv_target_3_0, grammarAccess.getCheckAccess().getTargetSTRINGTerminalRuleCall_1_1_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getCheckRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"target",
                    								lv_target_3_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalSelenium.g:747:3: (otherlv_4= 'on' | otherlv_5= 'off' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==34) ) {
                alt10=1;
            }
            else if ( (LA10_0==35) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSelenium.g:748:4: otherlv_4= 'on'
                    {
                    otherlv_4=(Token)match(input,34,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getCheckAccess().getOnKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalSelenium.g:753:4: otherlv_5= 'off'
                    {
                    otherlv_5=(Token)match(input,35,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getCheckAccess().getOffKeyword_2_1());
                    			

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
    // $ANTLR end "ruleCheck"


    // $ANTLR start "entryRuleSelectCombo"
    // InternalSelenium.g:762:1: entryRuleSelectCombo returns [EObject current=null] : iv_ruleSelectCombo= ruleSelectCombo EOF ;
    public final EObject entryRuleSelectCombo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectCombo = null;


        try {
            // InternalSelenium.g:762:52: (iv_ruleSelectCombo= ruleSelectCombo EOF )
            // InternalSelenium.g:763:2: iv_ruleSelectCombo= ruleSelectCombo EOF
            {
             newCompositeNode(grammarAccess.getSelectComboRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectCombo=ruleSelectCombo();

            state._fsp--;

             current =iv_ruleSelectCombo; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSelectCombo"


    // $ANTLR start "ruleSelectCombo"
    // InternalSelenium.g:769:1: ruleSelectCombo returns [EObject current=null] : (otherlv_0= 'select-combo:' ( (lv_by_1_0= ruleBy ) ) ( (lv_target_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleSelectCombo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_target_2_0=null;
        EObject lv_by_1_0 = null;



        	enterRule();

        try {
            // InternalSelenium.g:775:2: ( (otherlv_0= 'select-combo:' ( (lv_by_1_0= ruleBy ) ) ( (lv_target_2_0= RULE_STRING ) ) ) )
            // InternalSelenium.g:776:2: (otherlv_0= 'select-combo:' ( (lv_by_1_0= ruleBy ) ) ( (lv_target_2_0= RULE_STRING ) ) )
            {
            // InternalSelenium.g:776:2: (otherlv_0= 'select-combo:' ( (lv_by_1_0= ruleBy ) ) ( (lv_target_2_0= RULE_STRING ) ) )
            // InternalSelenium.g:777:3: otherlv_0= 'select-combo:' ( (lv_by_1_0= ruleBy ) ) ( (lv_target_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectComboAccess().getSelectComboKeyword_0());
            		
            // InternalSelenium.g:781:3: ( (lv_by_1_0= ruleBy ) )
            // InternalSelenium.g:782:4: (lv_by_1_0= ruleBy )
            {
            // InternalSelenium.g:782:4: (lv_by_1_0= ruleBy )
            // InternalSelenium.g:783:5: lv_by_1_0= ruleBy
            {

            					newCompositeNode(grammarAccess.getSelectComboAccess().getByByParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_by_1_0=ruleBy();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectComboRule());
            					}
            					set(
            						current,
            						"by",
            						lv_by_1_0,
            						"org.xtext.example.mydsl.Selenium.By");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSelenium.g:800:3: ( (lv_target_2_0= RULE_STRING ) )
            // InternalSelenium.g:801:4: (lv_target_2_0= RULE_STRING )
            {
            // InternalSelenium.g:801:4: (lv_target_2_0= RULE_STRING )
            // InternalSelenium.g:802:5: lv_target_2_0= RULE_STRING
            {
            lv_target_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_target_2_0, grammarAccess.getSelectComboAccess().getTargetSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSelectComboRule());
            					}
            					setWithLastConsumed(
            						current,
            						"target",
            						lv_target_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleSelectCombo"


    // $ANTLR start "entryRuleElement"
    // InternalSelenium.g:822:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalSelenium.g:822:48: (iv_ruleElement= ruleElement EOF )
            // InternalSelenium.g:823:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalSelenium.g:829:1: ruleElement returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) )? (otherlv_1= 'n\\u00B0' ( (lv_number_2_0= RULE_INT ) ) )? otherlv_3= 'where' ( (lv_selector_4_0= ruleBy ) ) ( ( (lv_target_5_0= RULE_STRING ) ) | (otherlv_6= '[' ( (otherlv_7= RULE_ID ) ) otherlv_8= ']' ) ) ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_number_2_0=null;
        Token otherlv_3=null;
        Token lv_target_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;

        EObject lv_selector_4_0 = null;



        	enterRule();

        try {
            // InternalSelenium.g:835:2: ( ( ( (lv_type_0_0= ruleType ) )? (otherlv_1= 'n\\u00B0' ( (lv_number_2_0= RULE_INT ) ) )? otherlv_3= 'where' ( (lv_selector_4_0= ruleBy ) ) ( ( (lv_target_5_0= RULE_STRING ) ) | (otherlv_6= '[' ( (otherlv_7= RULE_ID ) ) otherlv_8= ']' ) ) ) )
            // InternalSelenium.g:836:2: ( ( (lv_type_0_0= ruleType ) )? (otherlv_1= 'n\\u00B0' ( (lv_number_2_0= RULE_INT ) ) )? otherlv_3= 'where' ( (lv_selector_4_0= ruleBy ) ) ( ( (lv_target_5_0= RULE_STRING ) ) | (otherlv_6= '[' ( (otherlv_7= RULE_ID ) ) otherlv_8= ']' ) ) )
            {
            // InternalSelenium.g:836:2: ( ( (lv_type_0_0= ruleType ) )? (otherlv_1= 'n\\u00B0' ( (lv_number_2_0= RULE_INT ) ) )? otherlv_3= 'where' ( (lv_selector_4_0= ruleBy ) ) ( ( (lv_target_5_0= RULE_STRING ) ) | (otherlv_6= '[' ( (otherlv_7= RULE_ID ) ) otherlv_8= ']' ) ) )
            // InternalSelenium.g:837:3: ( (lv_type_0_0= ruleType ) )? (otherlv_1= 'n\\u00B0' ( (lv_number_2_0= RULE_INT ) ) )? otherlv_3= 'where' ( (lv_selector_4_0= ruleBy ) ) ( ( (lv_target_5_0= RULE_STRING ) ) | (otherlv_6= '[' ( (otherlv_7= RULE_ID ) ) otherlv_8= ']' ) )
            {
            // InternalSelenium.g:837:3: ( (lv_type_0_0= ruleType ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=40 && LA11_0<=43)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSelenium.g:838:4: (lv_type_0_0= ruleType )
                    {
                    // InternalSelenium.g:838:4: (lv_type_0_0= ruleType )
                    // InternalSelenium.g:839:5: lv_type_0_0= ruleType
                    {

                    					newCompositeNode(grammarAccess.getElementAccess().getTypeTypeParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_24);
                    lv_type_0_0=ruleType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getElementRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_0_0,
                    						"org.xtext.example.mydsl.Selenium.Type");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSelenium.g:856:3: (otherlv_1= 'n\\u00B0' ( (lv_number_2_0= RULE_INT ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==37) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSelenium.g:857:4: otherlv_1= 'n\\u00B0' ( (lv_number_2_0= RULE_INT ) )
                    {
                    otherlv_1=(Token)match(input,37,FOLLOW_25); 

                    				newLeafNode(otherlv_1, grammarAccess.getElementAccess().getNKeyword_1_0());
                    			
                    // InternalSelenium.g:861:4: ( (lv_number_2_0= RULE_INT ) )
                    // InternalSelenium.g:862:5: (lv_number_2_0= RULE_INT )
                    {
                    // InternalSelenium.g:862:5: (lv_number_2_0= RULE_INT )
                    // InternalSelenium.g:863:6: lv_number_2_0= RULE_INT
                    {
                    lv_number_2_0=(Token)match(input,RULE_INT,FOLLOW_26); 

                    						newLeafNode(lv_number_2_0, grammarAccess.getElementAccess().getNumberINTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getElementRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"number",
                    							lv_number_2_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,38,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getElementAccess().getWhereKeyword_2());
            		
            // InternalSelenium.g:884:3: ( (lv_selector_4_0= ruleBy ) )
            // InternalSelenium.g:885:4: (lv_selector_4_0= ruleBy )
            {
            // InternalSelenium.g:885:4: (lv_selector_4_0= ruleBy )
            // InternalSelenium.g:886:5: lv_selector_4_0= ruleBy
            {

            					newCompositeNode(grammarAccess.getElementAccess().getSelectorByParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
            lv_selector_4_0=ruleBy();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getElementRule());
            					}
            					set(
            						current,
            						"selector",
            						lv_selector_4_0,
            						"org.xtext.example.mydsl.Selenium.By");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSelenium.g:903:3: ( ( (lv_target_5_0= RULE_STRING ) ) | (otherlv_6= '[' ( (otherlv_7= RULE_ID ) ) otherlv_8= ']' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            else if ( (LA13_0==22) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalSelenium.g:904:4: ( (lv_target_5_0= RULE_STRING ) )
                    {
                    // InternalSelenium.g:904:4: ( (lv_target_5_0= RULE_STRING ) )
                    // InternalSelenium.g:905:5: (lv_target_5_0= RULE_STRING )
                    {
                    // InternalSelenium.g:905:5: (lv_target_5_0= RULE_STRING )
                    // InternalSelenium.g:906:6: lv_target_5_0= RULE_STRING
                    {
                    lv_target_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_target_5_0, grammarAccess.getElementAccess().getTargetSTRINGTerminalRuleCall_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getElementRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"target",
                    							lv_target_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSelenium.g:923:4: (otherlv_6= '[' ( (otherlv_7= RULE_ID ) ) otherlv_8= ']' )
                    {
                    // InternalSelenium.g:923:4: (otherlv_6= '[' ( (otherlv_7= RULE_ID ) ) otherlv_8= ']' )
                    // InternalSelenium.g:924:5: otherlv_6= '[' ( (otherlv_7= RULE_ID ) ) otherlv_8= ']'
                    {
                    otherlv_6=(Token)match(input,22,FOLLOW_14); 

                    					newLeafNode(otherlv_6, grammarAccess.getElementAccess().getLeftSquareBracketKeyword_4_1_0());
                    				
                    // InternalSelenium.g:928:5: ( (otherlv_7= RULE_ID ) )
                    // InternalSelenium.g:929:6: (otherlv_7= RULE_ID )
                    {
                    // InternalSelenium.g:929:6: (otherlv_7= RULE_ID )
                    // InternalSelenium.g:930:7: otherlv_7= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getElementRule());
                    							}
                    						
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_15); 

                    							newLeafNode(otherlv_7, grammarAccess.getElementAccess().getVarVariableCrossReference_4_1_1_0());
                    						

                    }


                    }

                    otherlv_8=(Token)match(input,23,FOLLOW_2); 

                    					newLeafNode(otherlv_8, grammarAccess.getElementAccess().getRightSquareBracketKeyword_4_1_2());
                    				

                    }


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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleBy"
    // InternalSelenium.g:951:1: entryRuleBy returns [EObject current=null] : iv_ruleBy= ruleBy EOF ;
    public final EObject entryRuleBy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBy = null;


        try {
            // InternalSelenium.g:951:43: (iv_ruleBy= ruleBy EOF )
            // InternalSelenium.g:952:2: iv_ruleBy= ruleBy EOF
            {
             newCompositeNode(grammarAccess.getByRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBy=ruleBy();

            state._fsp--;

             current =iv_ruleBy; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBy"


    // $ANTLR start "ruleBy"
    // InternalSelenium.g:958:1: ruleBy returns [EObject current=null] : (otherlv_0= 'text=' | this_ByProperty_1= ruleByProperty ) ;
    public final EObject ruleBy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_ByProperty_1 = null;



        	enterRule();

        try {
            // InternalSelenium.g:964:2: ( (otherlv_0= 'text=' | this_ByProperty_1= ruleByProperty ) )
            // InternalSelenium.g:965:2: (otherlv_0= 'text=' | this_ByProperty_1= ruleByProperty )
            {
            // InternalSelenium.g:965:2: (otherlv_0= 'text=' | this_ByProperty_1= ruleByProperty )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==39) ) {
                alt14=1;
            }
            else if ( (LA14_0==29) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalSelenium.g:966:3: otherlv_0= 'text='
                    {
                    otherlv_0=(Token)match(input,39,FOLLOW_2); 

                    			newLeafNode(otherlv_0, grammarAccess.getByAccess().getTextKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSelenium.g:971:3: this_ByProperty_1= ruleByProperty
                    {

                    			newCompositeNode(grammarAccess.getByAccess().getByPropertyParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ByProperty_1=ruleByProperty();

                    state._fsp--;


                    			current = this_ByProperty_1;
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
    // $ANTLR end "ruleBy"


    // $ANTLR start "entryRuleByProperty"
    // InternalSelenium.g:983:1: entryRuleByProperty returns [EObject current=null] : iv_ruleByProperty= ruleByProperty EOF ;
    public final EObject entryRuleByProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleByProperty = null;


        try {
            // InternalSelenium.g:983:51: (iv_ruleByProperty= ruleByProperty EOF )
            // InternalSelenium.g:984:2: iv_ruleByProperty= ruleByProperty EOF
            {
             newCompositeNode(grammarAccess.getByPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleByProperty=ruleByProperty();

            state._fsp--;

             current =iv_ruleByProperty; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleByProperty"


    // $ANTLR start "ruleByProperty"
    // InternalSelenium.g:990:1: ruleByProperty returns [EObject current=null] : (otherlv_0= 'property' ( (lv_property_1_0= RULE_STRING ) ) otherlv_2= '=' ) ;
    public final EObject ruleByProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_property_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSelenium.g:996:2: ( (otherlv_0= 'property' ( (lv_property_1_0= RULE_STRING ) ) otherlv_2= '=' ) )
            // InternalSelenium.g:997:2: (otherlv_0= 'property' ( (lv_property_1_0= RULE_STRING ) ) otherlv_2= '=' )
            {
            // InternalSelenium.g:997:2: (otherlv_0= 'property' ( (lv_property_1_0= RULE_STRING ) ) otherlv_2= '=' )
            // InternalSelenium.g:998:3: otherlv_0= 'property' ( (lv_property_1_0= RULE_STRING ) ) otherlv_2= '='
            {
            otherlv_0=(Token)match(input,29,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getByPropertyAccess().getPropertyKeyword_0());
            		
            // InternalSelenium.g:1002:3: ( (lv_property_1_0= RULE_STRING ) )
            // InternalSelenium.g:1003:4: (lv_property_1_0= RULE_STRING )
            {
            // InternalSelenium.g:1003:4: (lv_property_1_0= RULE_STRING )
            // InternalSelenium.g:1004:5: lv_property_1_0= RULE_STRING
            {
            lv_property_1_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_property_1_0, grammarAccess.getByPropertyAccess().getPropertySTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getByPropertyRule());
            					}
            					addWithLastConsumed(
            						current,
            						"property",
            						lv_property_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getByPropertyAccess().getEqualsSignKeyword_2());
            		

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
    // $ANTLR end "ruleByProperty"


    // $ANTLR start "entryRuleType"
    // InternalSelenium.g:1028:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalSelenium.g:1028:44: (iv_ruleType= ruleType EOF )
            // InternalSelenium.g:1029:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalSelenium.g:1035:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'image' | kw= 'link' | kw= 'button' | kw= 'anything' ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSelenium.g:1041:2: ( (kw= 'image' | kw= 'link' | kw= 'button' | kw= 'anything' ) )
            // InternalSelenium.g:1042:2: (kw= 'image' | kw= 'link' | kw= 'button' | kw= 'anything' )
            {
            // InternalSelenium.g:1042:2: (kw= 'image' | kw= 'link' | kw= 'button' | kw= 'anything' )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt15=1;
                }
                break;
            case 41:
                {
                alt15=2;
                }
                break;
            case 42:
                {
                alt15=3;
                }
                break;
            case 43:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalSelenium.g:1043:3: kw= 'image'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getImageKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSelenium.g:1049:3: kw= 'link'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getLinkKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSelenium.g:1055:3: kw= 'button'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getButtonKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalSelenium.g:1061:3: kw= 'anything'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getAnythingKeyword_3());
                    		

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000011850D0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000F6000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000F6000500020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000008220000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004000000000L});

}