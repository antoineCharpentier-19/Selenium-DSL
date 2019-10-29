package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.SeleniumGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSeleniumParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'page'", "'text'", "'all'", "'on'", "'off'", "'text='", "'image'", "'link'", "'button'", "'anything'", "'returns'", "'{'", "'open;'", "'}'", "';'", "'goto:'", "'verify:'", "'contains'", "'['", "']'", "'fill:'", "'in'", "'var'", "'='", "'of'", "'property'", "'click:'", "'check:'", "'select-combo:'", "'where'", "'n\\u00B0'"
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

    	public void setGrammarAccess(SeleniumGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleGlobal"
    // InternalSelenium.g:53:1: entryRuleGlobal : ruleGlobal EOF ;
    public final void entryRuleGlobal() throws RecognitionException {
        try {
            // InternalSelenium.g:54:1: ( ruleGlobal EOF )
            // InternalSelenium.g:55:1: ruleGlobal EOF
            {
             before(grammarAccess.getGlobalRule()); 
            pushFollow(FOLLOW_1);
            ruleGlobal();

            state._fsp--;

             after(grammarAccess.getGlobalRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGlobal"


    // $ANTLR start "ruleGlobal"
    // InternalSelenium.g:62:1: ruleGlobal : ( ( rule__Global__ProgramsAssignment )* ) ;
    public final void ruleGlobal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:66:2: ( ( ( rule__Global__ProgramsAssignment )* ) )
            // InternalSelenium.g:67:2: ( ( rule__Global__ProgramsAssignment )* )
            {
            // InternalSelenium.g:67:2: ( ( rule__Global__ProgramsAssignment )* )
            // InternalSelenium.g:68:3: ( rule__Global__ProgramsAssignment )*
            {
             before(grammarAccess.getGlobalAccess().getProgramsAssignment()); 
            // InternalSelenium.g:69:3: ( rule__Global__ProgramsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSelenium.g:69:4: rule__Global__ProgramsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Global__ProgramsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getGlobalAccess().getProgramsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGlobal"


    // $ANTLR start "entryRuleProgram"
    // InternalSelenium.g:78:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalSelenium.g:79:1: ( ruleProgram EOF )
            // InternalSelenium.g:80:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalSelenium.g:87:1: ruleProgram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:91:2: ( ( ( rule__Program__Group__0 ) ) )
            // InternalSelenium.g:92:2: ( ( rule__Program__Group__0 ) )
            {
            // InternalSelenium.g:92:2: ( ( rule__Program__Group__0 ) )
            // InternalSelenium.g:93:3: ( rule__Program__Group__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup()); 
            // InternalSelenium.g:94:3: ( rule__Program__Group__0 )
            // InternalSelenium.g:94:4: rule__Program__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleInstruction"
    // InternalSelenium.g:103:1: entryRuleInstruction : ruleInstruction EOF ;
    public final void entryRuleInstruction() throws RecognitionException {
        try {
            // InternalSelenium.g:104:1: ( ruleInstruction EOF )
            // InternalSelenium.g:105:1: ruleInstruction EOF
            {
             before(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_1);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getInstructionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // InternalSelenium.g:112:1: ruleInstruction : ( ( rule__Instruction__Group__0 ) ) ;
    public final void ruleInstruction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:116:2: ( ( ( rule__Instruction__Group__0 ) ) )
            // InternalSelenium.g:117:2: ( ( rule__Instruction__Group__0 ) )
            {
            // InternalSelenium.g:117:2: ( ( rule__Instruction__Group__0 ) )
            // InternalSelenium.g:118:3: ( rule__Instruction__Group__0 )
            {
             before(grammarAccess.getInstructionAccess().getGroup()); 
            // InternalSelenium.g:119:3: ( rule__Instruction__Group__0 )
            // InternalSelenium.g:119:4: rule__Instruction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Instruction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInstructionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleGo"
    // InternalSelenium.g:128:1: entryRuleGo : ruleGo EOF ;
    public final void entryRuleGo() throws RecognitionException {
        try {
            // InternalSelenium.g:129:1: ( ruleGo EOF )
            // InternalSelenium.g:130:1: ruleGo EOF
            {
             before(grammarAccess.getGoRule()); 
            pushFollow(FOLLOW_1);
            ruleGo();

            state._fsp--;

             after(grammarAccess.getGoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGo"


    // $ANTLR start "ruleGo"
    // InternalSelenium.g:137:1: ruleGo : ( ( rule__Go__Group__0 ) ) ;
    public final void ruleGo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:141:2: ( ( ( rule__Go__Group__0 ) ) )
            // InternalSelenium.g:142:2: ( ( rule__Go__Group__0 ) )
            {
            // InternalSelenium.g:142:2: ( ( rule__Go__Group__0 ) )
            // InternalSelenium.g:143:3: ( rule__Go__Group__0 )
            {
             before(grammarAccess.getGoAccess().getGroup()); 
            // InternalSelenium.g:144:3: ( rule__Go__Group__0 )
            // InternalSelenium.g:144:4: rule__Go__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Go__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGo"


    // $ANTLR start "entryRuleVerify"
    // InternalSelenium.g:153:1: entryRuleVerify : ruleVerify EOF ;
    public final void entryRuleVerify() throws RecognitionException {
        try {
            // InternalSelenium.g:154:1: ( ruleVerify EOF )
            // InternalSelenium.g:155:1: ruleVerify EOF
            {
             before(grammarAccess.getVerifyRule()); 
            pushFollow(FOLLOW_1);
            ruleVerify();

            state._fsp--;

             after(grammarAccess.getVerifyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVerify"


    // $ANTLR start "ruleVerify"
    // InternalSelenium.g:162:1: ruleVerify : ( ( rule__Verify__Group__0 ) ) ;
    public final void ruleVerify() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:166:2: ( ( ( rule__Verify__Group__0 ) ) )
            // InternalSelenium.g:167:2: ( ( rule__Verify__Group__0 ) )
            {
            // InternalSelenium.g:167:2: ( ( rule__Verify__Group__0 ) )
            // InternalSelenium.g:168:3: ( rule__Verify__Group__0 )
            {
             before(grammarAccess.getVerifyAccess().getGroup()); 
            // InternalSelenium.g:169:3: ( rule__Verify__Group__0 )
            // InternalSelenium.g:169:4: rule__Verify__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Verify__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVerifyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVerify"


    // $ANTLR start "entryRuleFillText"
    // InternalSelenium.g:178:1: entryRuleFillText : ruleFillText EOF ;
    public final void entryRuleFillText() throws RecognitionException {
        try {
            // InternalSelenium.g:179:1: ( ruleFillText EOF )
            // InternalSelenium.g:180:1: ruleFillText EOF
            {
             before(grammarAccess.getFillTextRule()); 
            pushFollow(FOLLOW_1);
            ruleFillText();

            state._fsp--;

             after(grammarAccess.getFillTextRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFillText"


    // $ANTLR start "ruleFillText"
    // InternalSelenium.g:187:1: ruleFillText : ( ( rule__FillText__Group__0 ) ) ;
    public final void ruleFillText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:191:2: ( ( ( rule__FillText__Group__0 ) ) )
            // InternalSelenium.g:192:2: ( ( rule__FillText__Group__0 ) )
            {
            // InternalSelenium.g:192:2: ( ( rule__FillText__Group__0 ) )
            // InternalSelenium.g:193:3: ( rule__FillText__Group__0 )
            {
             before(grammarAccess.getFillTextAccess().getGroup()); 
            // InternalSelenium.g:194:3: ( rule__FillText__Group__0 )
            // InternalSelenium.g:194:4: rule__FillText__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FillText__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFillTextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFillText"


    // $ANTLR start "entryRuleVariable"
    // InternalSelenium.g:203:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalSelenium.g:204:1: ( ruleVariable EOF )
            // InternalSelenium.g:205:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalSelenium.g:212:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:216:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalSelenium.g:217:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalSelenium.g:217:2: ( ( rule__Variable__Group__0 ) )
            // InternalSelenium.g:218:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalSelenium.g:219:3: ( rule__Variable__Group__0 )
            // InternalSelenium.g:219:4: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleClick"
    // InternalSelenium.g:228:1: entryRuleClick : ruleClick EOF ;
    public final void entryRuleClick() throws RecognitionException {
        try {
            // InternalSelenium.g:229:1: ( ruleClick EOF )
            // InternalSelenium.g:230:1: ruleClick EOF
            {
             before(grammarAccess.getClickRule()); 
            pushFollow(FOLLOW_1);
            ruleClick();

            state._fsp--;

             after(grammarAccess.getClickRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClick"


    // $ANTLR start "ruleClick"
    // InternalSelenium.g:237:1: ruleClick : ( ( rule__Click__Group__0 ) ) ;
    public final void ruleClick() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:241:2: ( ( ( rule__Click__Group__0 ) ) )
            // InternalSelenium.g:242:2: ( ( rule__Click__Group__0 ) )
            {
            // InternalSelenium.g:242:2: ( ( rule__Click__Group__0 ) )
            // InternalSelenium.g:243:3: ( rule__Click__Group__0 )
            {
             before(grammarAccess.getClickAccess().getGroup()); 
            // InternalSelenium.g:244:3: ( rule__Click__Group__0 )
            // InternalSelenium.g:244:4: rule__Click__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Click__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClickAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClick"


    // $ANTLR start "entryRuleCheck"
    // InternalSelenium.g:253:1: entryRuleCheck : ruleCheck EOF ;
    public final void entryRuleCheck() throws RecognitionException {
        try {
            // InternalSelenium.g:254:1: ( ruleCheck EOF )
            // InternalSelenium.g:255:1: ruleCheck EOF
            {
             before(grammarAccess.getCheckRule()); 
            pushFollow(FOLLOW_1);
            ruleCheck();

            state._fsp--;

             after(grammarAccess.getCheckRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCheck"


    // $ANTLR start "ruleCheck"
    // InternalSelenium.g:262:1: ruleCheck : ( ( rule__Check__Group__0 ) ) ;
    public final void ruleCheck() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:266:2: ( ( ( rule__Check__Group__0 ) ) )
            // InternalSelenium.g:267:2: ( ( rule__Check__Group__0 ) )
            {
            // InternalSelenium.g:267:2: ( ( rule__Check__Group__0 ) )
            // InternalSelenium.g:268:3: ( rule__Check__Group__0 )
            {
             before(grammarAccess.getCheckAccess().getGroup()); 
            // InternalSelenium.g:269:3: ( rule__Check__Group__0 )
            // InternalSelenium.g:269:4: rule__Check__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Check__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCheckAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCheck"


    // $ANTLR start "entryRuleSelectCombo"
    // InternalSelenium.g:278:1: entryRuleSelectCombo : ruleSelectCombo EOF ;
    public final void entryRuleSelectCombo() throws RecognitionException {
        try {
            // InternalSelenium.g:279:1: ( ruleSelectCombo EOF )
            // InternalSelenium.g:280:1: ruleSelectCombo EOF
            {
             before(grammarAccess.getSelectComboRule()); 
            pushFollow(FOLLOW_1);
            ruleSelectCombo();

            state._fsp--;

             after(grammarAccess.getSelectComboRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelectCombo"


    // $ANTLR start "ruleSelectCombo"
    // InternalSelenium.g:287:1: ruleSelectCombo : ( ( rule__SelectCombo__Group__0 ) ) ;
    public final void ruleSelectCombo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:291:2: ( ( ( rule__SelectCombo__Group__0 ) ) )
            // InternalSelenium.g:292:2: ( ( rule__SelectCombo__Group__0 ) )
            {
            // InternalSelenium.g:292:2: ( ( rule__SelectCombo__Group__0 ) )
            // InternalSelenium.g:293:3: ( rule__SelectCombo__Group__0 )
            {
             before(grammarAccess.getSelectComboAccess().getGroup()); 
            // InternalSelenium.g:294:3: ( rule__SelectCombo__Group__0 )
            // InternalSelenium.g:294:4: rule__SelectCombo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SelectCombo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectComboAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelectCombo"


    // $ANTLR start "entryRuleElement"
    // InternalSelenium.g:303:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalSelenium.g:304:1: ( ruleElement EOF )
            // InternalSelenium.g:305:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalSelenium.g:312:1: ruleElement : ( ( rule__Element__Group__0 ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:316:2: ( ( ( rule__Element__Group__0 ) ) )
            // InternalSelenium.g:317:2: ( ( rule__Element__Group__0 ) )
            {
            // InternalSelenium.g:317:2: ( ( rule__Element__Group__0 ) )
            // InternalSelenium.g:318:3: ( rule__Element__Group__0 )
            {
             before(grammarAccess.getElementAccess().getGroup()); 
            // InternalSelenium.g:319:3: ( rule__Element__Group__0 )
            // InternalSelenium.g:319:4: rule__Element__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Element__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleBy"
    // InternalSelenium.g:328:1: entryRuleBy : ruleBy EOF ;
    public final void entryRuleBy() throws RecognitionException {
        try {
            // InternalSelenium.g:329:1: ( ruleBy EOF )
            // InternalSelenium.g:330:1: ruleBy EOF
            {
             before(grammarAccess.getByRule()); 
            pushFollow(FOLLOW_1);
            ruleBy();

            state._fsp--;

             after(grammarAccess.getByRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBy"


    // $ANTLR start "ruleBy"
    // InternalSelenium.g:337:1: ruleBy : ( ( rule__By__Alternatives ) ) ;
    public final void ruleBy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:341:2: ( ( ( rule__By__Alternatives ) ) )
            // InternalSelenium.g:342:2: ( ( rule__By__Alternatives ) )
            {
            // InternalSelenium.g:342:2: ( ( rule__By__Alternatives ) )
            // InternalSelenium.g:343:3: ( rule__By__Alternatives )
            {
             before(grammarAccess.getByAccess().getAlternatives()); 
            // InternalSelenium.g:344:3: ( rule__By__Alternatives )
            // InternalSelenium.g:344:4: rule__By__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__By__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getByAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBy"


    // $ANTLR start "entryRuleByProperty"
    // InternalSelenium.g:353:1: entryRuleByProperty : ruleByProperty EOF ;
    public final void entryRuleByProperty() throws RecognitionException {
        try {
            // InternalSelenium.g:354:1: ( ruleByProperty EOF )
            // InternalSelenium.g:355:1: ruleByProperty EOF
            {
             before(grammarAccess.getByPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleByProperty();

            state._fsp--;

             after(grammarAccess.getByPropertyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleByProperty"


    // $ANTLR start "ruleByProperty"
    // InternalSelenium.g:362:1: ruleByProperty : ( ( rule__ByProperty__Group__0 ) ) ;
    public final void ruleByProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:366:2: ( ( ( rule__ByProperty__Group__0 ) ) )
            // InternalSelenium.g:367:2: ( ( rule__ByProperty__Group__0 ) )
            {
            // InternalSelenium.g:367:2: ( ( rule__ByProperty__Group__0 ) )
            // InternalSelenium.g:368:3: ( rule__ByProperty__Group__0 )
            {
             before(grammarAccess.getByPropertyAccess().getGroup()); 
            // InternalSelenium.g:369:3: ( rule__ByProperty__Group__0 )
            // InternalSelenium.g:369:4: rule__ByProperty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ByProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getByPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleByProperty"


    // $ANTLR start "entryRuleType"
    // InternalSelenium.g:378:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalSelenium.g:379:1: ( ruleType EOF )
            // InternalSelenium.g:380:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalSelenium.g:387:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:391:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalSelenium.g:392:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalSelenium.g:392:2: ( ( rule__Type__Alternatives ) )
            // InternalSelenium.g:393:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalSelenium.g:394:3: ( rule__Type__Alternatives )
            // InternalSelenium.g:394:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "rule__Program__RetAlternatives_2_0"
    // InternalSelenium.g:402:1: rule__Program__RetAlternatives_2_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Program__RetAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:406:1: ( ( 'true' ) | ( 'false' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSelenium.g:407:2: ( 'true' )
                    {
                    // InternalSelenium.g:407:2: ( 'true' )
                    // InternalSelenium.g:408:3: 'true'
                    {
                     before(grammarAccess.getProgramAccess().getRetTrueKeyword_2_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getProgramAccess().getRetTrueKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSelenium.g:413:2: ( 'false' )
                    {
                    // InternalSelenium.g:413:2: ( 'false' )
                    // InternalSelenium.g:414:3: 'false'
                    {
                     before(grammarAccess.getProgramAccess().getRetFalseKeyword_2_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getProgramAccess().getRetFalseKeyword_2_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__RetAlternatives_2_0"


    // $ANTLR start "rule__Instruction__Alternatives_0"
    // InternalSelenium.g:423:1: rule__Instruction__Alternatives_0 : ( ( ruleGo ) | ( ruleVerify ) | ( ruleClick ) | ( ruleFillText ) | ( ruleCheck ) | ( ruleSelectCombo ) | ( ruleVariable ) );
    public final void rule__Instruction__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:427:1: ( ( ruleGo ) | ( ruleVerify ) | ( ruleClick ) | ( ruleFillText ) | ( ruleCheck ) | ( ruleSelectCombo ) | ( ruleVariable ) )
            int alt3=7;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt3=1;
                }
                break;
            case 29:
                {
                alt3=2;
                }
                break;
            case 39:
                {
                alt3=3;
                }
                break;
            case 33:
                {
                alt3=4;
                }
                break;
            case 40:
                {
                alt3=5;
                }
                break;
            case 41:
                {
                alt3=6;
                }
                break;
            case 35:
                {
                alt3=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSelenium.g:428:2: ( ruleGo )
                    {
                    // InternalSelenium.g:428:2: ( ruleGo )
                    // InternalSelenium.g:429:3: ruleGo
                    {
                     before(grammarAccess.getInstructionAccess().getGoParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleGo();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getGoParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSelenium.g:434:2: ( ruleVerify )
                    {
                    // InternalSelenium.g:434:2: ( ruleVerify )
                    // InternalSelenium.g:435:3: ruleVerify
                    {
                     before(grammarAccess.getInstructionAccess().getVerifyParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVerify();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getVerifyParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSelenium.g:440:2: ( ruleClick )
                    {
                    // InternalSelenium.g:440:2: ( ruleClick )
                    // InternalSelenium.g:441:3: ruleClick
                    {
                     before(grammarAccess.getInstructionAccess().getClickParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleClick();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getClickParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSelenium.g:446:2: ( ruleFillText )
                    {
                    // InternalSelenium.g:446:2: ( ruleFillText )
                    // InternalSelenium.g:447:3: ruleFillText
                    {
                     before(grammarAccess.getInstructionAccess().getFillTextParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleFillText();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getFillTextParserRuleCall_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSelenium.g:452:2: ( ruleCheck )
                    {
                    // InternalSelenium.g:452:2: ( ruleCheck )
                    // InternalSelenium.g:453:3: ruleCheck
                    {
                     before(grammarAccess.getInstructionAccess().getCheckParserRuleCall_0_4()); 
                    pushFollow(FOLLOW_2);
                    ruleCheck();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getCheckParserRuleCall_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSelenium.g:458:2: ( ruleSelectCombo )
                    {
                    // InternalSelenium.g:458:2: ( ruleSelectCombo )
                    // InternalSelenium.g:459:3: ruleSelectCombo
                    {
                     before(grammarAccess.getInstructionAccess().getSelectComboParserRuleCall_0_5()); 
                    pushFollow(FOLLOW_2);
                    ruleSelectCombo();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getSelectComboParserRuleCall_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSelenium.g:464:2: ( ruleVariable )
                    {
                    // InternalSelenium.g:464:2: ( ruleVariable )
                    // InternalSelenium.g:465:3: ruleVariable
                    {
                     before(grammarAccess.getInstructionAccess().getVariableParserRuleCall_0_6()); 
                    pushFollow(FOLLOW_2);
                    ruleVariable();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getVariableParserRuleCall_0_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Alternatives_0"


    // $ANTLR start "rule__Verify__Alternatives_1"
    // InternalSelenium.g:474:1: rule__Verify__Alternatives_1 : ( ( 'page' ) | ( ( rule__Verify__ElemAssignment_1_1 ) ) );
    public final void rule__Verify__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:478:1: ( ( 'page' ) | ( ( rule__Verify__ElemAssignment_1_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=19 && LA4_0<=22)||(LA4_0>=42 && LA4_0<=43)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSelenium.g:479:2: ( 'page' )
                    {
                    // InternalSelenium.g:479:2: ( 'page' )
                    // InternalSelenium.g:480:3: 'page'
                    {
                     before(grammarAccess.getVerifyAccess().getPageKeyword_1_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getVerifyAccess().getPageKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSelenium.g:485:2: ( ( rule__Verify__ElemAssignment_1_1 ) )
                    {
                    // InternalSelenium.g:485:2: ( ( rule__Verify__ElemAssignment_1_1 ) )
                    // InternalSelenium.g:486:3: ( rule__Verify__ElemAssignment_1_1 )
                    {
                     before(grammarAccess.getVerifyAccess().getElemAssignment_1_1()); 
                    // InternalSelenium.g:487:3: ( rule__Verify__ElemAssignment_1_1 )
                    // InternalSelenium.g:487:4: rule__Verify__ElemAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Verify__ElemAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getVerifyAccess().getElemAssignment_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Alternatives_1"


    // $ANTLR start "rule__Verify__Alternatives_3"
    // InternalSelenium.g:495:1: rule__Verify__Alternatives_3 : ( ( ( rule__Verify__TextAssignment_3_0 ) ) | ( ( rule__Verify__Group_3_1__0 ) ) | ( ( rule__Verify__ElementAssignment_3_2 ) ) );
    public final void rule__Verify__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:499:1: ( ( ( rule__Verify__TextAssignment_3_0 ) ) | ( ( rule__Verify__Group_3_1__0 ) ) | ( ( rule__Verify__ElementAssignment_3_2 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt5=1;
                }
                break;
            case 31:
                {
                alt5=2;
                }
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 42:
            case 43:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalSelenium.g:500:2: ( ( rule__Verify__TextAssignment_3_0 ) )
                    {
                    // InternalSelenium.g:500:2: ( ( rule__Verify__TextAssignment_3_0 ) )
                    // InternalSelenium.g:501:3: ( rule__Verify__TextAssignment_3_0 )
                    {
                     before(grammarAccess.getVerifyAccess().getTextAssignment_3_0()); 
                    // InternalSelenium.g:502:3: ( rule__Verify__TextAssignment_3_0 )
                    // InternalSelenium.g:502:4: rule__Verify__TextAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Verify__TextAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVerifyAccess().getTextAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSelenium.g:506:2: ( ( rule__Verify__Group_3_1__0 ) )
                    {
                    // InternalSelenium.g:506:2: ( ( rule__Verify__Group_3_1__0 ) )
                    // InternalSelenium.g:507:3: ( rule__Verify__Group_3_1__0 )
                    {
                     before(grammarAccess.getVerifyAccess().getGroup_3_1()); 
                    // InternalSelenium.g:508:3: ( rule__Verify__Group_3_1__0 )
                    // InternalSelenium.g:508:4: rule__Verify__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Verify__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVerifyAccess().getGroup_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSelenium.g:512:2: ( ( rule__Verify__ElementAssignment_3_2 ) )
                    {
                    // InternalSelenium.g:512:2: ( ( rule__Verify__ElementAssignment_3_2 ) )
                    // InternalSelenium.g:513:3: ( rule__Verify__ElementAssignment_3_2 )
                    {
                     before(grammarAccess.getVerifyAccess().getElementAssignment_3_2()); 
                    // InternalSelenium.g:514:3: ( rule__Verify__ElementAssignment_3_2 )
                    // InternalSelenium.g:514:4: rule__Verify__ElementAssignment_3_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Verify__ElementAssignment_3_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getVerifyAccess().getElementAssignment_3_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Alternatives_3"


    // $ANTLR start "rule__FillText__Alternatives_1"
    // InternalSelenium.g:522:1: rule__FillText__Alternatives_1 : ( ( ( rule__FillText__TextAssignment_1_0 ) ) | ( ( rule__FillText__Group_1_1__0 ) ) );
    public final void rule__FillText__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:526:1: ( ( ( rule__FillText__TextAssignment_1_0 ) ) | ( ( rule__FillText__Group_1_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==31) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSelenium.g:527:2: ( ( rule__FillText__TextAssignment_1_0 ) )
                    {
                    // InternalSelenium.g:527:2: ( ( rule__FillText__TextAssignment_1_0 ) )
                    // InternalSelenium.g:528:3: ( rule__FillText__TextAssignment_1_0 )
                    {
                     before(grammarAccess.getFillTextAccess().getTextAssignment_1_0()); 
                    // InternalSelenium.g:529:3: ( rule__FillText__TextAssignment_1_0 )
                    // InternalSelenium.g:529:4: rule__FillText__TextAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FillText__TextAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFillTextAccess().getTextAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSelenium.g:533:2: ( ( rule__FillText__Group_1_1__0 ) )
                    {
                    // InternalSelenium.g:533:2: ( ( rule__FillText__Group_1_1__0 ) )
                    // InternalSelenium.g:534:3: ( rule__FillText__Group_1_1__0 )
                    {
                     before(grammarAccess.getFillTextAccess().getGroup_1_1()); 
                    // InternalSelenium.g:535:3: ( rule__FillText__Group_1_1__0 )
                    // InternalSelenium.g:535:4: rule__FillText__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FillText__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFillTextAccess().getGroup_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillText__Alternatives_1"


    // $ANTLR start "rule__Variable__Alternatives_3"
    // InternalSelenium.g:543:1: rule__Variable__Alternatives_3 : ( ( 'text' ) | ( ( rule__Variable__Group_3_1__0 ) ) );
    public final void rule__Variable__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:547:1: ( ( 'text' ) | ( ( rule__Variable__Group_3_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            else if ( (LA7_0==38) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalSelenium.g:548:2: ( 'text' )
                    {
                    // InternalSelenium.g:548:2: ( 'text' )
                    // InternalSelenium.g:549:3: 'text'
                    {
                     before(grammarAccess.getVariableAccess().getTextKeyword_3_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getVariableAccess().getTextKeyword_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSelenium.g:554:2: ( ( rule__Variable__Group_3_1__0 ) )
                    {
                    // InternalSelenium.g:554:2: ( ( rule__Variable__Group_3_1__0 ) )
                    // InternalSelenium.g:555:3: ( rule__Variable__Group_3_1__0 )
                    {
                     before(grammarAccess.getVariableAccess().getGroup_3_1()); 
                    // InternalSelenium.g:556:3: ( rule__Variable__Group_3_1__0 )
                    // InternalSelenium.g:556:4: rule__Variable__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Variable__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVariableAccess().getGroup_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Alternatives_3"


    // $ANTLR start "rule__Check__Alternatives_1"
    // InternalSelenium.g:564:1: rule__Check__Alternatives_1 : ( ( 'all' ) | ( ( rule__Check__Group_1_1__0 ) ) );
    public final void rule__Check__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:568:1: ( ( 'all' ) | ( ( rule__Check__Group_1_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            else if ( (LA8_0==18||LA8_0==38) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalSelenium.g:569:2: ( 'all' )
                    {
                    // InternalSelenium.g:569:2: ( 'all' )
                    // InternalSelenium.g:570:3: 'all'
                    {
                     before(grammarAccess.getCheckAccess().getAllKeyword_1_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getCheckAccess().getAllKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSelenium.g:575:2: ( ( rule__Check__Group_1_1__0 ) )
                    {
                    // InternalSelenium.g:575:2: ( ( rule__Check__Group_1_1__0 ) )
                    // InternalSelenium.g:576:3: ( rule__Check__Group_1_1__0 )
                    {
                     before(grammarAccess.getCheckAccess().getGroup_1_1()); 
                    // InternalSelenium.g:577:3: ( rule__Check__Group_1_1__0 )
                    // InternalSelenium.g:577:4: rule__Check__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Check__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCheckAccess().getGroup_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__Alternatives_1"


    // $ANTLR start "rule__Check__Alternatives_2"
    // InternalSelenium.g:585:1: rule__Check__Alternatives_2 : ( ( 'on' ) | ( 'off' ) );
    public final void rule__Check__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:589:1: ( ( 'on' ) | ( 'off' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            else if ( (LA9_0==17) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalSelenium.g:590:2: ( 'on' )
                    {
                    // InternalSelenium.g:590:2: ( 'on' )
                    // InternalSelenium.g:591:3: 'on'
                    {
                     before(grammarAccess.getCheckAccess().getOnKeyword_2_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getCheckAccess().getOnKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSelenium.g:596:2: ( 'off' )
                    {
                    // InternalSelenium.g:596:2: ( 'off' )
                    // InternalSelenium.g:597:3: 'off'
                    {
                     before(grammarAccess.getCheckAccess().getOffKeyword_2_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getCheckAccess().getOffKeyword_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__Alternatives_2"


    // $ANTLR start "rule__Element__Alternatives_4"
    // InternalSelenium.g:606:1: rule__Element__Alternatives_4 : ( ( ( rule__Element__TargetAssignment_4_0 ) ) | ( ( rule__Element__Group_4_1__0 ) ) );
    public final void rule__Element__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:610:1: ( ( ( rule__Element__TargetAssignment_4_0 ) ) | ( ( rule__Element__Group_4_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            else if ( (LA10_0==31) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSelenium.g:611:2: ( ( rule__Element__TargetAssignment_4_0 ) )
                    {
                    // InternalSelenium.g:611:2: ( ( rule__Element__TargetAssignment_4_0 ) )
                    // InternalSelenium.g:612:3: ( rule__Element__TargetAssignment_4_0 )
                    {
                     before(grammarAccess.getElementAccess().getTargetAssignment_4_0()); 
                    // InternalSelenium.g:613:3: ( rule__Element__TargetAssignment_4_0 )
                    // InternalSelenium.g:613:4: rule__Element__TargetAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Element__TargetAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getElementAccess().getTargetAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSelenium.g:617:2: ( ( rule__Element__Group_4_1__0 ) )
                    {
                    // InternalSelenium.g:617:2: ( ( rule__Element__Group_4_1__0 ) )
                    // InternalSelenium.g:618:3: ( rule__Element__Group_4_1__0 )
                    {
                     before(grammarAccess.getElementAccess().getGroup_4_1()); 
                    // InternalSelenium.g:619:3: ( rule__Element__Group_4_1__0 )
                    // InternalSelenium.g:619:4: rule__Element__Group_4_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Element__Group_4_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getElementAccess().getGroup_4_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Alternatives_4"


    // $ANTLR start "rule__By__Alternatives"
    // InternalSelenium.g:627:1: rule__By__Alternatives : ( ( 'text=' ) | ( ruleByProperty ) );
    public final void rule__By__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:631:1: ( ( 'text=' ) | ( ruleByProperty ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            else if ( (LA11_0==38) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalSelenium.g:632:2: ( 'text=' )
                    {
                    // InternalSelenium.g:632:2: ( 'text=' )
                    // InternalSelenium.g:633:3: 'text='
                    {
                     before(grammarAccess.getByAccess().getTextKeyword_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getByAccess().getTextKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSelenium.g:638:2: ( ruleByProperty )
                    {
                    // InternalSelenium.g:638:2: ( ruleByProperty )
                    // InternalSelenium.g:639:3: ruleByProperty
                    {
                     before(grammarAccess.getByAccess().getByPropertyParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleByProperty();

                    state._fsp--;

                     after(grammarAccess.getByAccess().getByPropertyParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__By__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalSelenium.g:648:1: rule__Type__Alternatives : ( ( 'image' ) | ( 'link' ) | ( 'button' ) | ( 'anything' ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:652:1: ( ( 'image' ) | ( 'link' ) | ( 'button' ) | ( 'anything' ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt12=1;
                }
                break;
            case 20:
                {
                alt12=2;
                }
                break;
            case 21:
                {
                alt12=3;
                }
                break;
            case 22:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalSelenium.g:653:2: ( 'image' )
                    {
                    // InternalSelenium.g:653:2: ( 'image' )
                    // InternalSelenium.g:654:3: 'image'
                    {
                     before(grammarAccess.getTypeAccess().getImageKeyword_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getImageKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSelenium.g:659:2: ( 'link' )
                    {
                    // InternalSelenium.g:659:2: ( 'link' )
                    // InternalSelenium.g:660:3: 'link'
                    {
                     before(grammarAccess.getTypeAccess().getLinkKeyword_1()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getLinkKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSelenium.g:665:2: ( 'button' )
                    {
                    // InternalSelenium.g:665:2: ( 'button' )
                    // InternalSelenium.g:666:3: 'button'
                    {
                     before(grammarAccess.getTypeAccess().getButtonKeyword_2()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getButtonKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSelenium.g:671:2: ( 'anything' )
                    {
                    // InternalSelenium.g:671:2: ( 'anything' )
                    // InternalSelenium.g:672:3: 'anything'
                    {
                     before(grammarAccess.getTypeAccess().getAnythingKeyword_3()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getAnythingKeyword_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Program__Group__0"
    // InternalSelenium.g:681:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:685:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalSelenium.g:686:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Program__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0"


    // $ANTLR start "rule__Program__Group__0__Impl"
    // InternalSelenium.g:693:1: rule__Program__Group__0__Impl : ( ( rule__Program__NameAssignment_0 ) ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:697:1: ( ( ( rule__Program__NameAssignment_0 ) ) )
            // InternalSelenium.g:698:1: ( ( rule__Program__NameAssignment_0 ) )
            {
            // InternalSelenium.g:698:1: ( ( rule__Program__NameAssignment_0 ) )
            // InternalSelenium.g:699:2: ( rule__Program__NameAssignment_0 )
            {
             before(grammarAccess.getProgramAccess().getNameAssignment_0()); 
            // InternalSelenium.g:700:2: ( rule__Program__NameAssignment_0 )
            // InternalSelenium.g:700:3: rule__Program__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Program__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0__Impl"


    // $ANTLR start "rule__Program__Group__1"
    // InternalSelenium.g:708:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:712:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalSelenium.g:713:2: rule__Program__Group__1__Impl rule__Program__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Program__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1"


    // $ANTLR start "rule__Program__Group__1__Impl"
    // InternalSelenium.g:720:1: rule__Program__Group__1__Impl : ( 'returns' ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:724:1: ( ( 'returns' ) )
            // InternalSelenium.g:725:1: ( 'returns' )
            {
            // InternalSelenium.g:725:1: ( 'returns' )
            // InternalSelenium.g:726:2: 'returns'
            {
             before(grammarAccess.getProgramAccess().getReturnsKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getReturnsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1__Impl"


    // $ANTLR start "rule__Program__Group__2"
    // InternalSelenium.g:735:1: rule__Program__Group__2 : rule__Program__Group__2__Impl rule__Program__Group__3 ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:739:1: ( rule__Program__Group__2__Impl rule__Program__Group__3 )
            // InternalSelenium.g:740:2: rule__Program__Group__2__Impl rule__Program__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Program__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__2"


    // $ANTLR start "rule__Program__Group__2__Impl"
    // InternalSelenium.g:747:1: rule__Program__Group__2__Impl : ( ( rule__Program__RetAssignment_2 ) ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:751:1: ( ( ( rule__Program__RetAssignment_2 ) ) )
            // InternalSelenium.g:752:1: ( ( rule__Program__RetAssignment_2 ) )
            {
            // InternalSelenium.g:752:1: ( ( rule__Program__RetAssignment_2 ) )
            // InternalSelenium.g:753:2: ( rule__Program__RetAssignment_2 )
            {
             before(grammarAccess.getProgramAccess().getRetAssignment_2()); 
            // InternalSelenium.g:754:2: ( rule__Program__RetAssignment_2 )
            // InternalSelenium.g:754:3: rule__Program__RetAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Program__RetAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getRetAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__2__Impl"


    // $ANTLR start "rule__Program__Group__3"
    // InternalSelenium.g:762:1: rule__Program__Group__3 : rule__Program__Group__3__Impl rule__Program__Group__4 ;
    public final void rule__Program__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:766:1: ( rule__Program__Group__3__Impl rule__Program__Group__4 )
            // InternalSelenium.g:767:2: rule__Program__Group__3__Impl rule__Program__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Program__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__3"


    // $ANTLR start "rule__Program__Group__3__Impl"
    // InternalSelenium.g:774:1: rule__Program__Group__3__Impl : ( '{' ) ;
    public final void rule__Program__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:778:1: ( ( '{' ) )
            // InternalSelenium.g:779:1: ( '{' )
            {
            // InternalSelenium.g:779:1: ( '{' )
            // InternalSelenium.g:780:2: '{'
            {
             before(grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__3__Impl"


    // $ANTLR start "rule__Program__Group__4"
    // InternalSelenium.g:789:1: rule__Program__Group__4 : rule__Program__Group__4__Impl rule__Program__Group__5 ;
    public final void rule__Program__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:793:1: ( rule__Program__Group__4__Impl rule__Program__Group__5 )
            // InternalSelenium.g:794:2: rule__Program__Group__4__Impl rule__Program__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Program__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__4"


    // $ANTLR start "rule__Program__Group__4__Impl"
    // InternalSelenium.g:801:1: rule__Program__Group__4__Impl : ( 'open;' ) ;
    public final void rule__Program__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:805:1: ( ( 'open;' ) )
            // InternalSelenium.g:806:1: ( 'open;' )
            {
            // InternalSelenium.g:806:1: ( 'open;' )
            // InternalSelenium.g:807:2: 'open;'
            {
             before(grammarAccess.getProgramAccess().getOpenKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getOpenKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__4__Impl"


    // $ANTLR start "rule__Program__Group__5"
    // InternalSelenium.g:816:1: rule__Program__Group__5 : rule__Program__Group__5__Impl rule__Program__Group__6 ;
    public final void rule__Program__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:820:1: ( rule__Program__Group__5__Impl rule__Program__Group__6 )
            // InternalSelenium.g:821:2: rule__Program__Group__5__Impl rule__Program__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Program__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__5"


    // $ANTLR start "rule__Program__Group__5__Impl"
    // InternalSelenium.g:828:1: rule__Program__Group__5__Impl : ( ( rule__Program__InsAssignment_5 )* ) ;
    public final void rule__Program__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:832:1: ( ( ( rule__Program__InsAssignment_5 )* ) )
            // InternalSelenium.g:833:1: ( ( rule__Program__InsAssignment_5 )* )
            {
            // InternalSelenium.g:833:1: ( ( rule__Program__InsAssignment_5 )* )
            // InternalSelenium.g:834:2: ( rule__Program__InsAssignment_5 )*
            {
             before(grammarAccess.getProgramAccess().getInsAssignment_5()); 
            // InternalSelenium.g:835:2: ( rule__Program__InsAssignment_5 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=28 && LA13_0<=29)||LA13_0==33||LA13_0==35||(LA13_0>=39 && LA13_0<=41)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSelenium.g:835:3: rule__Program__InsAssignment_5
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Program__InsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getInsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__5__Impl"


    // $ANTLR start "rule__Program__Group__6"
    // InternalSelenium.g:843:1: rule__Program__Group__6 : rule__Program__Group__6__Impl ;
    public final void rule__Program__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:847:1: ( rule__Program__Group__6__Impl )
            // InternalSelenium.g:848:2: rule__Program__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__6"


    // $ANTLR start "rule__Program__Group__6__Impl"
    // InternalSelenium.g:854:1: rule__Program__Group__6__Impl : ( '}' ) ;
    public final void rule__Program__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:858:1: ( ( '}' ) )
            // InternalSelenium.g:859:1: ( '}' )
            {
            // InternalSelenium.g:859:1: ( '}' )
            // InternalSelenium.g:860:2: '}'
            {
             before(grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_6()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__6__Impl"


    // $ANTLR start "rule__Instruction__Group__0"
    // InternalSelenium.g:870:1: rule__Instruction__Group__0 : rule__Instruction__Group__0__Impl rule__Instruction__Group__1 ;
    public final void rule__Instruction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:874:1: ( rule__Instruction__Group__0__Impl rule__Instruction__Group__1 )
            // InternalSelenium.g:875:2: rule__Instruction__Group__0__Impl rule__Instruction__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Instruction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instruction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group__0"


    // $ANTLR start "rule__Instruction__Group__0__Impl"
    // InternalSelenium.g:882:1: rule__Instruction__Group__0__Impl : ( ( rule__Instruction__Alternatives_0 ) ) ;
    public final void rule__Instruction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:886:1: ( ( ( rule__Instruction__Alternatives_0 ) ) )
            // InternalSelenium.g:887:1: ( ( rule__Instruction__Alternatives_0 ) )
            {
            // InternalSelenium.g:887:1: ( ( rule__Instruction__Alternatives_0 ) )
            // InternalSelenium.g:888:2: ( rule__Instruction__Alternatives_0 )
            {
             before(grammarAccess.getInstructionAccess().getAlternatives_0()); 
            // InternalSelenium.g:889:2: ( rule__Instruction__Alternatives_0 )
            // InternalSelenium.g:889:3: rule__Instruction__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Instruction__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getInstructionAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group__0__Impl"


    // $ANTLR start "rule__Instruction__Group__1"
    // InternalSelenium.g:897:1: rule__Instruction__Group__1 : rule__Instruction__Group__1__Impl ;
    public final void rule__Instruction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:901:1: ( rule__Instruction__Group__1__Impl )
            // InternalSelenium.g:902:2: rule__Instruction__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Instruction__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group__1"


    // $ANTLR start "rule__Instruction__Group__1__Impl"
    // InternalSelenium.g:908:1: rule__Instruction__Group__1__Impl : ( ';' ) ;
    public final void rule__Instruction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:912:1: ( ( ';' ) )
            // InternalSelenium.g:913:1: ( ';' )
            {
            // InternalSelenium.g:913:1: ( ';' )
            // InternalSelenium.g:914:2: ';'
            {
             before(grammarAccess.getInstructionAccess().getSemicolonKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getInstructionAccess().getSemicolonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group__1__Impl"


    // $ANTLR start "rule__Go__Group__0"
    // InternalSelenium.g:924:1: rule__Go__Group__0 : rule__Go__Group__0__Impl rule__Go__Group__1 ;
    public final void rule__Go__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:928:1: ( rule__Go__Group__0__Impl rule__Go__Group__1 )
            // InternalSelenium.g:929:2: rule__Go__Group__0__Impl rule__Go__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Go__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Go__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Go__Group__0"


    // $ANTLR start "rule__Go__Group__0__Impl"
    // InternalSelenium.g:936:1: rule__Go__Group__0__Impl : ( 'goto:' ) ;
    public final void rule__Go__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:940:1: ( ( 'goto:' ) )
            // InternalSelenium.g:941:1: ( 'goto:' )
            {
            // InternalSelenium.g:941:1: ( 'goto:' )
            // InternalSelenium.g:942:2: 'goto:'
            {
             before(grammarAccess.getGoAccess().getGotoKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getGoAccess().getGotoKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Go__Group__0__Impl"


    // $ANTLR start "rule__Go__Group__1"
    // InternalSelenium.g:951:1: rule__Go__Group__1 : rule__Go__Group__1__Impl ;
    public final void rule__Go__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:955:1: ( rule__Go__Group__1__Impl )
            // InternalSelenium.g:956:2: rule__Go__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Go__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Go__Group__1"


    // $ANTLR start "rule__Go__Group__1__Impl"
    // InternalSelenium.g:962:1: rule__Go__Group__1__Impl : ( ( rule__Go__UrlAssignment_1 ) ) ;
    public final void rule__Go__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:966:1: ( ( ( rule__Go__UrlAssignment_1 ) ) )
            // InternalSelenium.g:967:1: ( ( rule__Go__UrlAssignment_1 ) )
            {
            // InternalSelenium.g:967:1: ( ( rule__Go__UrlAssignment_1 ) )
            // InternalSelenium.g:968:2: ( rule__Go__UrlAssignment_1 )
            {
             before(grammarAccess.getGoAccess().getUrlAssignment_1()); 
            // InternalSelenium.g:969:2: ( rule__Go__UrlAssignment_1 )
            // InternalSelenium.g:969:3: rule__Go__UrlAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Go__UrlAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGoAccess().getUrlAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Go__Group__1__Impl"


    // $ANTLR start "rule__Verify__Group__0"
    // InternalSelenium.g:978:1: rule__Verify__Group__0 : rule__Verify__Group__0__Impl rule__Verify__Group__1 ;
    public final void rule__Verify__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:982:1: ( rule__Verify__Group__0__Impl rule__Verify__Group__1 )
            // InternalSelenium.g:983:2: rule__Verify__Group__0__Impl rule__Verify__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Verify__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Verify__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group__0"


    // $ANTLR start "rule__Verify__Group__0__Impl"
    // InternalSelenium.g:990:1: rule__Verify__Group__0__Impl : ( 'verify:' ) ;
    public final void rule__Verify__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:994:1: ( ( 'verify:' ) )
            // InternalSelenium.g:995:1: ( 'verify:' )
            {
            // InternalSelenium.g:995:1: ( 'verify:' )
            // InternalSelenium.g:996:2: 'verify:'
            {
             before(grammarAccess.getVerifyAccess().getVerifyKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getVerifyAccess().getVerifyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group__0__Impl"


    // $ANTLR start "rule__Verify__Group__1"
    // InternalSelenium.g:1005:1: rule__Verify__Group__1 : rule__Verify__Group__1__Impl rule__Verify__Group__2 ;
    public final void rule__Verify__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1009:1: ( rule__Verify__Group__1__Impl rule__Verify__Group__2 )
            // InternalSelenium.g:1010:2: rule__Verify__Group__1__Impl rule__Verify__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Verify__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Verify__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group__1"


    // $ANTLR start "rule__Verify__Group__1__Impl"
    // InternalSelenium.g:1017:1: rule__Verify__Group__1__Impl : ( ( rule__Verify__Alternatives_1 ) ) ;
    public final void rule__Verify__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1021:1: ( ( ( rule__Verify__Alternatives_1 ) ) )
            // InternalSelenium.g:1022:1: ( ( rule__Verify__Alternatives_1 ) )
            {
            // InternalSelenium.g:1022:1: ( ( rule__Verify__Alternatives_1 ) )
            // InternalSelenium.g:1023:2: ( rule__Verify__Alternatives_1 )
            {
             before(grammarAccess.getVerifyAccess().getAlternatives_1()); 
            // InternalSelenium.g:1024:2: ( rule__Verify__Alternatives_1 )
            // InternalSelenium.g:1024:3: rule__Verify__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Verify__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getVerifyAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group__1__Impl"


    // $ANTLR start "rule__Verify__Group__2"
    // InternalSelenium.g:1032:1: rule__Verify__Group__2 : rule__Verify__Group__2__Impl rule__Verify__Group__3 ;
    public final void rule__Verify__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1036:1: ( rule__Verify__Group__2__Impl rule__Verify__Group__3 )
            // InternalSelenium.g:1037:2: rule__Verify__Group__2__Impl rule__Verify__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Verify__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Verify__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group__2"


    // $ANTLR start "rule__Verify__Group__2__Impl"
    // InternalSelenium.g:1044:1: rule__Verify__Group__2__Impl : ( 'contains' ) ;
    public final void rule__Verify__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1048:1: ( ( 'contains' ) )
            // InternalSelenium.g:1049:1: ( 'contains' )
            {
            // InternalSelenium.g:1049:1: ( 'contains' )
            // InternalSelenium.g:1050:2: 'contains'
            {
             before(grammarAccess.getVerifyAccess().getContainsKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getVerifyAccess().getContainsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group__2__Impl"


    // $ANTLR start "rule__Verify__Group__3"
    // InternalSelenium.g:1059:1: rule__Verify__Group__3 : rule__Verify__Group__3__Impl ;
    public final void rule__Verify__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1063:1: ( rule__Verify__Group__3__Impl )
            // InternalSelenium.g:1064:2: rule__Verify__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Verify__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group__3"


    // $ANTLR start "rule__Verify__Group__3__Impl"
    // InternalSelenium.g:1070:1: rule__Verify__Group__3__Impl : ( ( rule__Verify__Alternatives_3 ) ) ;
    public final void rule__Verify__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1074:1: ( ( ( rule__Verify__Alternatives_3 ) ) )
            // InternalSelenium.g:1075:1: ( ( rule__Verify__Alternatives_3 ) )
            {
            // InternalSelenium.g:1075:1: ( ( rule__Verify__Alternatives_3 ) )
            // InternalSelenium.g:1076:2: ( rule__Verify__Alternatives_3 )
            {
             before(grammarAccess.getVerifyAccess().getAlternatives_3()); 
            // InternalSelenium.g:1077:2: ( rule__Verify__Alternatives_3 )
            // InternalSelenium.g:1077:3: rule__Verify__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__Verify__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getVerifyAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group__3__Impl"


    // $ANTLR start "rule__Verify__Group_3_1__0"
    // InternalSelenium.g:1086:1: rule__Verify__Group_3_1__0 : rule__Verify__Group_3_1__0__Impl rule__Verify__Group_3_1__1 ;
    public final void rule__Verify__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1090:1: ( rule__Verify__Group_3_1__0__Impl rule__Verify__Group_3_1__1 )
            // InternalSelenium.g:1091:2: rule__Verify__Group_3_1__0__Impl rule__Verify__Group_3_1__1
            {
            pushFollow(FOLLOW_15);
            rule__Verify__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Verify__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group_3_1__0"


    // $ANTLR start "rule__Verify__Group_3_1__0__Impl"
    // InternalSelenium.g:1098:1: rule__Verify__Group_3_1__0__Impl : ( '[' ) ;
    public final void rule__Verify__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1102:1: ( ( '[' ) )
            // InternalSelenium.g:1103:1: ( '[' )
            {
            // InternalSelenium.g:1103:1: ( '[' )
            // InternalSelenium.g:1104:2: '['
            {
             before(grammarAccess.getVerifyAccess().getLeftSquareBracketKeyword_3_1_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getVerifyAccess().getLeftSquareBracketKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group_3_1__0__Impl"


    // $ANTLR start "rule__Verify__Group_3_1__1"
    // InternalSelenium.g:1113:1: rule__Verify__Group_3_1__1 : rule__Verify__Group_3_1__1__Impl rule__Verify__Group_3_1__2 ;
    public final void rule__Verify__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1117:1: ( rule__Verify__Group_3_1__1__Impl rule__Verify__Group_3_1__2 )
            // InternalSelenium.g:1118:2: rule__Verify__Group_3_1__1__Impl rule__Verify__Group_3_1__2
            {
            pushFollow(FOLLOW_16);
            rule__Verify__Group_3_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Verify__Group_3_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group_3_1__1"


    // $ANTLR start "rule__Verify__Group_3_1__1__Impl"
    // InternalSelenium.g:1125:1: rule__Verify__Group_3_1__1__Impl : ( ( rule__Verify__VarAssignment_3_1_1 ) ) ;
    public final void rule__Verify__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1129:1: ( ( ( rule__Verify__VarAssignment_3_1_1 ) ) )
            // InternalSelenium.g:1130:1: ( ( rule__Verify__VarAssignment_3_1_1 ) )
            {
            // InternalSelenium.g:1130:1: ( ( rule__Verify__VarAssignment_3_1_1 ) )
            // InternalSelenium.g:1131:2: ( rule__Verify__VarAssignment_3_1_1 )
            {
             before(grammarAccess.getVerifyAccess().getVarAssignment_3_1_1()); 
            // InternalSelenium.g:1132:2: ( rule__Verify__VarAssignment_3_1_1 )
            // InternalSelenium.g:1132:3: rule__Verify__VarAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Verify__VarAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getVerifyAccess().getVarAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group_3_1__1__Impl"


    // $ANTLR start "rule__Verify__Group_3_1__2"
    // InternalSelenium.g:1140:1: rule__Verify__Group_3_1__2 : rule__Verify__Group_3_1__2__Impl ;
    public final void rule__Verify__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1144:1: ( rule__Verify__Group_3_1__2__Impl )
            // InternalSelenium.g:1145:2: rule__Verify__Group_3_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Verify__Group_3_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group_3_1__2"


    // $ANTLR start "rule__Verify__Group_3_1__2__Impl"
    // InternalSelenium.g:1151:1: rule__Verify__Group_3_1__2__Impl : ( ']' ) ;
    public final void rule__Verify__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1155:1: ( ( ']' ) )
            // InternalSelenium.g:1156:1: ( ']' )
            {
            // InternalSelenium.g:1156:1: ( ']' )
            // InternalSelenium.g:1157:2: ']'
            {
             before(grammarAccess.getVerifyAccess().getRightSquareBracketKeyword_3_1_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getVerifyAccess().getRightSquareBracketKeyword_3_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group_3_1__2__Impl"


    // $ANTLR start "rule__FillText__Group__0"
    // InternalSelenium.g:1167:1: rule__FillText__Group__0 : rule__FillText__Group__0__Impl rule__FillText__Group__1 ;
    public final void rule__FillText__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1171:1: ( rule__FillText__Group__0__Impl rule__FillText__Group__1 )
            // InternalSelenium.g:1172:2: rule__FillText__Group__0__Impl rule__FillText__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__FillText__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FillText__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillText__Group__0"


    // $ANTLR start "rule__FillText__Group__0__Impl"
    // InternalSelenium.g:1179:1: rule__FillText__Group__0__Impl : ( 'fill:' ) ;
    public final void rule__FillText__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1183:1: ( ( 'fill:' ) )
            // InternalSelenium.g:1184:1: ( 'fill:' )
            {
            // InternalSelenium.g:1184:1: ( 'fill:' )
            // InternalSelenium.g:1185:2: 'fill:'
            {
             before(grammarAccess.getFillTextAccess().getFillKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getFillTextAccess().getFillKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillText__Group__0__Impl"


    // $ANTLR start "rule__FillText__Group__1"
    // InternalSelenium.g:1194:1: rule__FillText__Group__1 : rule__FillText__Group__1__Impl rule__FillText__Group__2 ;
    public final void rule__FillText__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1198:1: ( rule__FillText__Group__1__Impl rule__FillText__Group__2 )
            // InternalSelenium.g:1199:2: rule__FillText__Group__1__Impl rule__FillText__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__FillText__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FillText__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillText__Group__1"


    // $ANTLR start "rule__FillText__Group__1__Impl"
    // InternalSelenium.g:1206:1: rule__FillText__Group__1__Impl : ( ( rule__FillText__Alternatives_1 ) ) ;
    public final void rule__FillText__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1210:1: ( ( ( rule__FillText__Alternatives_1 ) ) )
            // InternalSelenium.g:1211:1: ( ( rule__FillText__Alternatives_1 ) )
            {
            // InternalSelenium.g:1211:1: ( ( rule__FillText__Alternatives_1 ) )
            // InternalSelenium.g:1212:2: ( rule__FillText__Alternatives_1 )
            {
             before(grammarAccess.getFillTextAccess().getAlternatives_1()); 
            // InternalSelenium.g:1213:2: ( rule__FillText__Alternatives_1 )
            // InternalSelenium.g:1213:3: rule__FillText__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__FillText__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getFillTextAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillText__Group__1__Impl"


    // $ANTLR start "rule__FillText__Group__2"
    // InternalSelenium.g:1221:1: rule__FillText__Group__2 : rule__FillText__Group__2__Impl rule__FillText__Group__3 ;
    public final void rule__FillText__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1225:1: ( rule__FillText__Group__2__Impl rule__FillText__Group__3 )
            // InternalSelenium.g:1226:2: rule__FillText__Group__2__Impl rule__FillText__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__FillText__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FillText__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillText__Group__2"


    // $ANTLR start "rule__FillText__Group__2__Impl"
    // InternalSelenium.g:1233:1: rule__FillText__Group__2__Impl : ( 'in' ) ;
    public final void rule__FillText__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1237:1: ( ( 'in' ) )
            // InternalSelenium.g:1238:1: ( 'in' )
            {
            // InternalSelenium.g:1238:1: ( 'in' )
            // InternalSelenium.g:1239:2: 'in'
            {
             before(grammarAccess.getFillTextAccess().getInKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getFillTextAccess().getInKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillText__Group__2__Impl"


    // $ANTLR start "rule__FillText__Group__3"
    // InternalSelenium.g:1248:1: rule__FillText__Group__3 : rule__FillText__Group__3__Impl rule__FillText__Group__4 ;
    public final void rule__FillText__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1252:1: ( rule__FillText__Group__3__Impl rule__FillText__Group__4 )
            // InternalSelenium.g:1253:2: rule__FillText__Group__3__Impl rule__FillText__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__FillText__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FillText__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillText__Group__3"


    // $ANTLR start "rule__FillText__Group__3__Impl"
    // InternalSelenium.g:1260:1: rule__FillText__Group__3__Impl : ( ( rule__FillText__PropAssignment_3 ) ) ;
    public final void rule__FillText__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1264:1: ( ( ( rule__FillText__PropAssignment_3 ) ) )
            // InternalSelenium.g:1265:1: ( ( rule__FillText__PropAssignment_3 ) )
            {
            // InternalSelenium.g:1265:1: ( ( rule__FillText__PropAssignment_3 ) )
            // InternalSelenium.g:1266:2: ( rule__FillText__PropAssignment_3 )
            {
             before(grammarAccess.getFillTextAccess().getPropAssignment_3()); 
            // InternalSelenium.g:1267:2: ( rule__FillText__PropAssignment_3 )
            // InternalSelenium.g:1267:3: rule__FillText__PropAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__FillText__PropAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFillTextAccess().getPropAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillText__Group__3__Impl"


    // $ANTLR start "rule__FillText__Group__4"
    // InternalSelenium.g:1275:1: rule__FillText__Group__4 : rule__FillText__Group__4__Impl ;
    public final void rule__FillText__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1279:1: ( rule__FillText__Group__4__Impl )
            // InternalSelenium.g:1280:2: rule__FillText__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FillText__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillText__Group__4"


    // $ANTLR start "rule__FillText__Group__4__Impl"
    // InternalSelenium.g:1286:1: rule__FillText__Group__4__Impl : ( ( rule__FillText__TargetAssignment_4 ) ) ;
    public final void rule__FillText__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1290:1: ( ( ( rule__FillText__TargetAssignment_4 ) ) )
            // InternalSelenium.g:1291:1: ( ( rule__FillText__TargetAssignment_4 ) )
            {
            // InternalSelenium.g:1291:1: ( ( rule__FillText__TargetAssignment_4 ) )
            // InternalSelenium.g:1292:2: ( rule__FillText__TargetAssignment_4 )
            {
             before(grammarAccess.getFillTextAccess().getTargetAssignment_4()); 
            // InternalSelenium.g:1293:2: ( rule__FillText__TargetAssignment_4 )
            // InternalSelenium.g:1293:3: rule__FillText__TargetAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__FillText__TargetAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFillTextAccess().getTargetAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillText__Group__4__Impl"


    // $ANTLR start "rule__FillText__Group_1_1__0"
    // InternalSelenium.g:1302:1: rule__FillText__Group_1_1__0 : rule__FillText__Group_1_1__0__Impl rule__FillText__Group_1_1__1 ;
    public final void rule__FillText__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1306:1: ( rule__FillText__Group_1_1__0__Impl rule__FillText__Group_1_1__1 )
            // InternalSelenium.g:1307:2: rule__FillText__Group_1_1__0__Impl rule__FillText__Group_1_1__1
            {
            pushFollow(FOLLOW_15);
            rule__FillText__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FillText__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillText__Group_1_1__0"


    // $ANTLR start "rule__FillText__Group_1_1__0__Impl"
    // InternalSelenium.g:1314:1: rule__FillText__Group_1_1__0__Impl : ( '[' ) ;
    public final void rule__FillText__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1318:1: ( ( '[' ) )
            // InternalSelenium.g:1319:1: ( '[' )
            {
            // InternalSelenium.g:1319:1: ( '[' )
            // InternalSelenium.g:1320:2: '['
            {
             before(grammarAccess.getFillTextAccess().getLeftSquareBracketKeyword_1_1_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getFillTextAccess().getLeftSquareBracketKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillText__Group_1_1__0__Impl"


    // $ANTLR start "rule__FillText__Group_1_1__1"
    // InternalSelenium.g:1329:1: rule__FillText__Group_1_1__1 : rule__FillText__Group_1_1__1__Impl rule__FillText__Group_1_1__2 ;
    public final void rule__FillText__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1333:1: ( rule__FillText__Group_1_1__1__Impl rule__FillText__Group_1_1__2 )
            // InternalSelenium.g:1334:2: rule__FillText__Group_1_1__1__Impl rule__FillText__Group_1_1__2
            {
            pushFollow(FOLLOW_16);
            rule__FillText__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FillText__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillText__Group_1_1__1"


    // $ANTLR start "rule__FillText__Group_1_1__1__Impl"
    // InternalSelenium.g:1341:1: rule__FillText__Group_1_1__1__Impl : ( ( rule__FillText__VarAssignment_1_1_1 ) ) ;
    public final void rule__FillText__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1345:1: ( ( ( rule__FillText__VarAssignment_1_1_1 ) ) )
            // InternalSelenium.g:1346:1: ( ( rule__FillText__VarAssignment_1_1_1 ) )
            {
            // InternalSelenium.g:1346:1: ( ( rule__FillText__VarAssignment_1_1_1 ) )
            // InternalSelenium.g:1347:2: ( rule__FillText__VarAssignment_1_1_1 )
            {
             before(grammarAccess.getFillTextAccess().getVarAssignment_1_1_1()); 
            // InternalSelenium.g:1348:2: ( rule__FillText__VarAssignment_1_1_1 )
            // InternalSelenium.g:1348:3: rule__FillText__VarAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__FillText__VarAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFillTextAccess().getVarAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillText__Group_1_1__1__Impl"


    // $ANTLR start "rule__FillText__Group_1_1__2"
    // InternalSelenium.g:1356:1: rule__FillText__Group_1_1__2 : rule__FillText__Group_1_1__2__Impl ;
    public final void rule__FillText__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1360:1: ( rule__FillText__Group_1_1__2__Impl )
            // InternalSelenium.g:1361:2: rule__FillText__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FillText__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillText__Group_1_1__2"


    // $ANTLR start "rule__FillText__Group_1_1__2__Impl"
    // InternalSelenium.g:1367:1: rule__FillText__Group_1_1__2__Impl : ( ']' ) ;
    public final void rule__FillText__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1371:1: ( ( ']' ) )
            // InternalSelenium.g:1372:1: ( ']' )
            {
            // InternalSelenium.g:1372:1: ( ']' )
            // InternalSelenium.g:1373:2: ']'
            {
             before(grammarAccess.getFillTextAccess().getRightSquareBracketKeyword_1_1_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getFillTextAccess().getRightSquareBracketKeyword_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillText__Group_1_1__2__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // InternalSelenium.g:1383:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1387:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalSelenium.g:1388:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // InternalSelenium.g:1395:1: rule__Variable__Group__0__Impl : ( 'var' ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1399:1: ( ( 'var' ) )
            // InternalSelenium.g:1400:1: ( 'var' )
            {
            // InternalSelenium.g:1400:1: ( 'var' )
            // InternalSelenium.g:1401:2: 'var'
            {
             before(grammarAccess.getVariableAccess().getVarKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getVarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // InternalSelenium.g:1410:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1414:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalSelenium.g:1415:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Variable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // InternalSelenium.g:1422:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__NameAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1426:1: ( ( ( rule__Variable__NameAssignment_1 ) ) )
            // InternalSelenium.g:1427:1: ( ( rule__Variable__NameAssignment_1 ) )
            {
            // InternalSelenium.g:1427:1: ( ( rule__Variable__NameAssignment_1 ) )
            // InternalSelenium.g:1428:2: ( rule__Variable__NameAssignment_1 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_1()); 
            // InternalSelenium.g:1429:2: ( rule__Variable__NameAssignment_1 )
            // InternalSelenium.g:1429:3: rule__Variable__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__Variable__Group__2"
    // InternalSelenium.g:1437:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl rule__Variable__Group__3 ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1441:1: ( rule__Variable__Group__2__Impl rule__Variable__Group__3 )
            // InternalSelenium.g:1442:2: rule__Variable__Group__2__Impl rule__Variable__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Variable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__2"


    // $ANTLR start "rule__Variable__Group__2__Impl"
    // InternalSelenium.g:1449:1: rule__Variable__Group__2__Impl : ( '=' ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1453:1: ( ( '=' ) )
            // InternalSelenium.g:1454:1: ( '=' )
            {
            // InternalSelenium.g:1454:1: ( '=' )
            // InternalSelenium.g:1455:2: '='
            {
             before(grammarAccess.getVariableAccess().getEqualsSignKeyword_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__2__Impl"


    // $ANTLR start "rule__Variable__Group__3"
    // InternalSelenium.g:1464:1: rule__Variable__Group__3 : rule__Variable__Group__3__Impl rule__Variable__Group__4 ;
    public final void rule__Variable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1468:1: ( rule__Variable__Group__3__Impl rule__Variable__Group__4 )
            // InternalSelenium.g:1469:2: rule__Variable__Group__3__Impl rule__Variable__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__Variable__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__3"


    // $ANTLR start "rule__Variable__Group__3__Impl"
    // InternalSelenium.g:1476:1: rule__Variable__Group__3__Impl : ( ( rule__Variable__Alternatives_3 ) ) ;
    public final void rule__Variable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1480:1: ( ( ( rule__Variable__Alternatives_3 ) ) )
            // InternalSelenium.g:1481:1: ( ( rule__Variable__Alternatives_3 ) )
            {
            // InternalSelenium.g:1481:1: ( ( rule__Variable__Alternatives_3 ) )
            // InternalSelenium.g:1482:2: ( rule__Variable__Alternatives_3 )
            {
             before(grammarAccess.getVariableAccess().getAlternatives_3()); 
            // InternalSelenium.g:1483:2: ( rule__Variable__Alternatives_3 )
            // InternalSelenium.g:1483:3: rule__Variable__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__3__Impl"


    // $ANTLR start "rule__Variable__Group__4"
    // InternalSelenium.g:1491:1: rule__Variable__Group__4 : rule__Variable__Group__4__Impl rule__Variable__Group__5 ;
    public final void rule__Variable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1495:1: ( rule__Variable__Group__4__Impl rule__Variable__Group__5 )
            // InternalSelenium.g:1496:2: rule__Variable__Group__4__Impl rule__Variable__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Variable__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__4"


    // $ANTLR start "rule__Variable__Group__4__Impl"
    // InternalSelenium.g:1503:1: rule__Variable__Group__4__Impl : ( 'of' ) ;
    public final void rule__Variable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1507:1: ( ( 'of' ) )
            // InternalSelenium.g:1508:1: ( 'of' )
            {
            // InternalSelenium.g:1508:1: ( 'of' )
            // InternalSelenium.g:1509:2: 'of'
            {
             before(grammarAccess.getVariableAccess().getOfKeyword_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getOfKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__4__Impl"


    // $ANTLR start "rule__Variable__Group__5"
    // InternalSelenium.g:1518:1: rule__Variable__Group__5 : rule__Variable__Group__5__Impl ;
    public final void rule__Variable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1522:1: ( rule__Variable__Group__5__Impl )
            // InternalSelenium.g:1523:2: rule__Variable__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__5"


    // $ANTLR start "rule__Variable__Group__5__Impl"
    // InternalSelenium.g:1529:1: rule__Variable__Group__5__Impl : ( ( rule__Variable__ElemAssignment_5 ) ) ;
    public final void rule__Variable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1533:1: ( ( ( rule__Variable__ElemAssignment_5 ) ) )
            // InternalSelenium.g:1534:1: ( ( rule__Variable__ElemAssignment_5 ) )
            {
            // InternalSelenium.g:1534:1: ( ( rule__Variable__ElemAssignment_5 ) )
            // InternalSelenium.g:1535:2: ( rule__Variable__ElemAssignment_5 )
            {
             before(grammarAccess.getVariableAccess().getElemAssignment_5()); 
            // InternalSelenium.g:1536:2: ( rule__Variable__ElemAssignment_5 )
            // InternalSelenium.g:1536:3: rule__Variable__ElemAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Variable__ElemAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getElemAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__5__Impl"


    // $ANTLR start "rule__Variable__Group_3_1__0"
    // InternalSelenium.g:1545:1: rule__Variable__Group_3_1__0 : rule__Variable__Group_3_1__0__Impl rule__Variable__Group_3_1__1 ;
    public final void rule__Variable__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1549:1: ( rule__Variable__Group_3_1__0__Impl rule__Variable__Group_3_1__1 )
            // InternalSelenium.g:1550:2: rule__Variable__Group_3_1__0__Impl rule__Variable__Group_3_1__1
            {
            pushFollow(FOLLOW_11);
            rule__Variable__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_3_1__0"


    // $ANTLR start "rule__Variable__Group_3_1__0__Impl"
    // InternalSelenium.g:1557:1: rule__Variable__Group_3_1__0__Impl : ( 'property' ) ;
    public final void rule__Variable__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1561:1: ( ( 'property' ) )
            // InternalSelenium.g:1562:1: ( 'property' )
            {
            // InternalSelenium.g:1562:1: ( 'property' )
            // InternalSelenium.g:1563:2: 'property'
            {
             before(grammarAccess.getVariableAccess().getPropertyKeyword_3_1_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getPropertyKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_3_1__0__Impl"


    // $ANTLR start "rule__Variable__Group_3_1__1"
    // InternalSelenium.g:1572:1: rule__Variable__Group_3_1__1 : rule__Variable__Group_3_1__1__Impl ;
    public final void rule__Variable__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1576:1: ( rule__Variable__Group_3_1__1__Impl )
            // InternalSelenium.g:1577:2: rule__Variable__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_3_1__1"


    // $ANTLR start "rule__Variable__Group_3_1__1__Impl"
    // InternalSelenium.g:1583:1: rule__Variable__Group_3_1__1__Impl : ( ( rule__Variable__AttrAssignment_3_1_1 ) ) ;
    public final void rule__Variable__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1587:1: ( ( ( rule__Variable__AttrAssignment_3_1_1 ) ) )
            // InternalSelenium.g:1588:1: ( ( rule__Variable__AttrAssignment_3_1_1 ) )
            {
            // InternalSelenium.g:1588:1: ( ( rule__Variable__AttrAssignment_3_1_1 ) )
            // InternalSelenium.g:1589:2: ( rule__Variable__AttrAssignment_3_1_1 )
            {
             before(grammarAccess.getVariableAccess().getAttrAssignment_3_1_1()); 
            // InternalSelenium.g:1590:2: ( rule__Variable__AttrAssignment_3_1_1 )
            // InternalSelenium.g:1590:3: rule__Variable__AttrAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable__AttrAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getAttrAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_3_1__1__Impl"


    // $ANTLR start "rule__Click__Group__0"
    // InternalSelenium.g:1599:1: rule__Click__Group__0 : rule__Click__Group__0__Impl rule__Click__Group__1 ;
    public final void rule__Click__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1603:1: ( rule__Click__Group__0__Impl rule__Click__Group__1 )
            // InternalSelenium.g:1604:2: rule__Click__Group__0__Impl rule__Click__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Click__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Click__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group__0"


    // $ANTLR start "rule__Click__Group__0__Impl"
    // InternalSelenium.g:1611:1: rule__Click__Group__0__Impl : ( 'click:' ) ;
    public final void rule__Click__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1615:1: ( ( 'click:' ) )
            // InternalSelenium.g:1616:1: ( 'click:' )
            {
            // InternalSelenium.g:1616:1: ( 'click:' )
            // InternalSelenium.g:1617:2: 'click:'
            {
             before(grammarAccess.getClickAccess().getClickKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getClickAccess().getClickKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group__0__Impl"


    // $ANTLR start "rule__Click__Group__1"
    // InternalSelenium.g:1626:1: rule__Click__Group__1 : rule__Click__Group__1__Impl ;
    public final void rule__Click__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1630:1: ( rule__Click__Group__1__Impl )
            // InternalSelenium.g:1631:2: rule__Click__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Click__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group__1"


    // $ANTLR start "rule__Click__Group__1__Impl"
    // InternalSelenium.g:1637:1: rule__Click__Group__1__Impl : ( ruleElement ) ;
    public final void rule__Click__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1641:1: ( ( ruleElement ) )
            // InternalSelenium.g:1642:1: ( ruleElement )
            {
            // InternalSelenium.g:1642:1: ( ruleElement )
            // InternalSelenium.g:1643:2: ruleElement
            {
             before(grammarAccess.getClickAccess().getElementParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getClickAccess().getElementParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group__1__Impl"


    // $ANTLR start "rule__Check__Group__0"
    // InternalSelenium.g:1653:1: rule__Check__Group__0 : rule__Check__Group__0__Impl rule__Check__Group__1 ;
    public final void rule__Check__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1657:1: ( rule__Check__Group__0__Impl rule__Check__Group__1 )
            // InternalSelenium.g:1658:2: rule__Check__Group__0__Impl rule__Check__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Check__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Check__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__Group__0"


    // $ANTLR start "rule__Check__Group__0__Impl"
    // InternalSelenium.g:1665:1: rule__Check__Group__0__Impl : ( 'check:' ) ;
    public final void rule__Check__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1669:1: ( ( 'check:' ) )
            // InternalSelenium.g:1670:1: ( 'check:' )
            {
            // InternalSelenium.g:1670:1: ( 'check:' )
            // InternalSelenium.g:1671:2: 'check:'
            {
             before(grammarAccess.getCheckAccess().getCheckKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getCheckAccess().getCheckKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__Group__0__Impl"


    // $ANTLR start "rule__Check__Group__1"
    // InternalSelenium.g:1680:1: rule__Check__Group__1 : rule__Check__Group__1__Impl rule__Check__Group__2 ;
    public final void rule__Check__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1684:1: ( rule__Check__Group__1__Impl rule__Check__Group__2 )
            // InternalSelenium.g:1685:2: rule__Check__Group__1__Impl rule__Check__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__Check__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Check__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__Group__1"


    // $ANTLR start "rule__Check__Group__1__Impl"
    // InternalSelenium.g:1692:1: rule__Check__Group__1__Impl : ( ( rule__Check__Alternatives_1 ) ) ;
    public final void rule__Check__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1696:1: ( ( ( rule__Check__Alternatives_1 ) ) )
            // InternalSelenium.g:1697:1: ( ( rule__Check__Alternatives_1 ) )
            {
            // InternalSelenium.g:1697:1: ( ( rule__Check__Alternatives_1 ) )
            // InternalSelenium.g:1698:2: ( rule__Check__Alternatives_1 )
            {
             before(grammarAccess.getCheckAccess().getAlternatives_1()); 
            // InternalSelenium.g:1699:2: ( rule__Check__Alternatives_1 )
            // InternalSelenium.g:1699:3: rule__Check__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Check__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getCheckAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__Group__1__Impl"


    // $ANTLR start "rule__Check__Group__2"
    // InternalSelenium.g:1707:1: rule__Check__Group__2 : rule__Check__Group__2__Impl ;
    public final void rule__Check__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1711:1: ( rule__Check__Group__2__Impl )
            // InternalSelenium.g:1712:2: rule__Check__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Check__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__Group__2"


    // $ANTLR start "rule__Check__Group__2__Impl"
    // InternalSelenium.g:1718:1: rule__Check__Group__2__Impl : ( ( rule__Check__Alternatives_2 ) ) ;
    public final void rule__Check__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1722:1: ( ( ( rule__Check__Alternatives_2 ) ) )
            // InternalSelenium.g:1723:1: ( ( rule__Check__Alternatives_2 ) )
            {
            // InternalSelenium.g:1723:1: ( ( rule__Check__Alternatives_2 ) )
            // InternalSelenium.g:1724:2: ( rule__Check__Alternatives_2 )
            {
             before(grammarAccess.getCheckAccess().getAlternatives_2()); 
            // InternalSelenium.g:1725:2: ( rule__Check__Alternatives_2 )
            // InternalSelenium.g:1725:3: rule__Check__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Check__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getCheckAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__Group__2__Impl"


    // $ANTLR start "rule__Check__Group_1_1__0"
    // InternalSelenium.g:1734:1: rule__Check__Group_1_1__0 : rule__Check__Group_1_1__0__Impl rule__Check__Group_1_1__1 ;
    public final void rule__Check__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1738:1: ( rule__Check__Group_1_1__0__Impl rule__Check__Group_1_1__1 )
            // InternalSelenium.g:1739:2: rule__Check__Group_1_1__0__Impl rule__Check__Group_1_1__1
            {
            pushFollow(FOLLOW_11);
            rule__Check__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Check__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__Group_1_1__0"


    // $ANTLR start "rule__Check__Group_1_1__0__Impl"
    // InternalSelenium.g:1746:1: rule__Check__Group_1_1__0__Impl : ( ( rule__Check__ByAssignment_1_1_0 ) ) ;
    public final void rule__Check__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1750:1: ( ( ( rule__Check__ByAssignment_1_1_0 ) ) )
            // InternalSelenium.g:1751:1: ( ( rule__Check__ByAssignment_1_1_0 ) )
            {
            // InternalSelenium.g:1751:1: ( ( rule__Check__ByAssignment_1_1_0 ) )
            // InternalSelenium.g:1752:2: ( rule__Check__ByAssignment_1_1_0 )
            {
             before(grammarAccess.getCheckAccess().getByAssignment_1_1_0()); 
            // InternalSelenium.g:1753:2: ( rule__Check__ByAssignment_1_1_0 )
            // InternalSelenium.g:1753:3: rule__Check__ByAssignment_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Check__ByAssignment_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getCheckAccess().getByAssignment_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__Group_1_1__0__Impl"


    // $ANTLR start "rule__Check__Group_1_1__1"
    // InternalSelenium.g:1761:1: rule__Check__Group_1_1__1 : rule__Check__Group_1_1__1__Impl ;
    public final void rule__Check__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1765:1: ( rule__Check__Group_1_1__1__Impl )
            // InternalSelenium.g:1766:2: rule__Check__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Check__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__Group_1_1__1"


    // $ANTLR start "rule__Check__Group_1_1__1__Impl"
    // InternalSelenium.g:1772:1: rule__Check__Group_1_1__1__Impl : ( ( rule__Check__TargetAssignment_1_1_1 ) ) ;
    public final void rule__Check__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1776:1: ( ( ( rule__Check__TargetAssignment_1_1_1 ) ) )
            // InternalSelenium.g:1777:1: ( ( rule__Check__TargetAssignment_1_1_1 ) )
            {
            // InternalSelenium.g:1777:1: ( ( rule__Check__TargetAssignment_1_1_1 ) )
            // InternalSelenium.g:1778:2: ( rule__Check__TargetAssignment_1_1_1 )
            {
             before(grammarAccess.getCheckAccess().getTargetAssignment_1_1_1()); 
            // InternalSelenium.g:1779:2: ( rule__Check__TargetAssignment_1_1_1 )
            // InternalSelenium.g:1779:3: rule__Check__TargetAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Check__TargetAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCheckAccess().getTargetAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__Group_1_1__1__Impl"


    // $ANTLR start "rule__SelectCombo__Group__0"
    // InternalSelenium.g:1788:1: rule__SelectCombo__Group__0 : rule__SelectCombo__Group__0__Impl rule__SelectCombo__Group__1 ;
    public final void rule__SelectCombo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1792:1: ( rule__SelectCombo__Group__0__Impl rule__SelectCombo__Group__1 )
            // InternalSelenium.g:1793:2: rule__SelectCombo__Group__0__Impl rule__SelectCombo__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__SelectCombo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectCombo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectCombo__Group__0"


    // $ANTLR start "rule__SelectCombo__Group__0__Impl"
    // InternalSelenium.g:1800:1: rule__SelectCombo__Group__0__Impl : ( 'select-combo:' ) ;
    public final void rule__SelectCombo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1804:1: ( ( 'select-combo:' ) )
            // InternalSelenium.g:1805:1: ( 'select-combo:' )
            {
            // InternalSelenium.g:1805:1: ( 'select-combo:' )
            // InternalSelenium.g:1806:2: 'select-combo:'
            {
             before(grammarAccess.getSelectComboAccess().getSelectComboKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getSelectComboAccess().getSelectComboKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectCombo__Group__0__Impl"


    // $ANTLR start "rule__SelectCombo__Group__1"
    // InternalSelenium.g:1815:1: rule__SelectCombo__Group__1 : rule__SelectCombo__Group__1__Impl rule__SelectCombo__Group__2 ;
    public final void rule__SelectCombo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1819:1: ( rule__SelectCombo__Group__1__Impl rule__SelectCombo__Group__2 )
            // InternalSelenium.g:1820:2: rule__SelectCombo__Group__1__Impl rule__SelectCombo__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__SelectCombo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectCombo__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectCombo__Group__1"


    // $ANTLR start "rule__SelectCombo__Group__1__Impl"
    // InternalSelenium.g:1827:1: rule__SelectCombo__Group__1__Impl : ( ( rule__SelectCombo__ByAssignment_1 ) ) ;
    public final void rule__SelectCombo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1831:1: ( ( ( rule__SelectCombo__ByAssignment_1 ) ) )
            // InternalSelenium.g:1832:1: ( ( rule__SelectCombo__ByAssignment_1 ) )
            {
            // InternalSelenium.g:1832:1: ( ( rule__SelectCombo__ByAssignment_1 ) )
            // InternalSelenium.g:1833:2: ( rule__SelectCombo__ByAssignment_1 )
            {
             before(grammarAccess.getSelectComboAccess().getByAssignment_1()); 
            // InternalSelenium.g:1834:2: ( rule__SelectCombo__ByAssignment_1 )
            // InternalSelenium.g:1834:3: rule__SelectCombo__ByAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SelectCombo__ByAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectComboAccess().getByAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectCombo__Group__1__Impl"


    // $ANTLR start "rule__SelectCombo__Group__2"
    // InternalSelenium.g:1842:1: rule__SelectCombo__Group__2 : rule__SelectCombo__Group__2__Impl ;
    public final void rule__SelectCombo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1846:1: ( rule__SelectCombo__Group__2__Impl )
            // InternalSelenium.g:1847:2: rule__SelectCombo__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectCombo__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectCombo__Group__2"


    // $ANTLR start "rule__SelectCombo__Group__2__Impl"
    // InternalSelenium.g:1853:1: rule__SelectCombo__Group__2__Impl : ( ( rule__SelectCombo__TargetAssignment_2 ) ) ;
    public final void rule__SelectCombo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1857:1: ( ( ( rule__SelectCombo__TargetAssignment_2 ) ) )
            // InternalSelenium.g:1858:1: ( ( rule__SelectCombo__TargetAssignment_2 ) )
            {
            // InternalSelenium.g:1858:1: ( ( rule__SelectCombo__TargetAssignment_2 ) )
            // InternalSelenium.g:1859:2: ( rule__SelectCombo__TargetAssignment_2 )
            {
             before(grammarAccess.getSelectComboAccess().getTargetAssignment_2()); 
            // InternalSelenium.g:1860:2: ( rule__SelectCombo__TargetAssignment_2 )
            // InternalSelenium.g:1860:3: rule__SelectCombo__TargetAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SelectCombo__TargetAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSelectComboAccess().getTargetAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectCombo__Group__2__Impl"


    // $ANTLR start "rule__Element__Group__0"
    // InternalSelenium.g:1869:1: rule__Element__Group__0 : rule__Element__Group__0__Impl rule__Element__Group__1 ;
    public final void rule__Element__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1873:1: ( rule__Element__Group__0__Impl rule__Element__Group__1 )
            // InternalSelenium.g:1874:2: rule__Element__Group__0__Impl rule__Element__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Element__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Element__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__0"


    // $ANTLR start "rule__Element__Group__0__Impl"
    // InternalSelenium.g:1881:1: rule__Element__Group__0__Impl : ( ( rule__Element__TypeAssignment_0 )? ) ;
    public final void rule__Element__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1885:1: ( ( ( rule__Element__TypeAssignment_0 )? ) )
            // InternalSelenium.g:1886:1: ( ( rule__Element__TypeAssignment_0 )? )
            {
            // InternalSelenium.g:1886:1: ( ( rule__Element__TypeAssignment_0 )? )
            // InternalSelenium.g:1887:2: ( rule__Element__TypeAssignment_0 )?
            {
             before(grammarAccess.getElementAccess().getTypeAssignment_0()); 
            // InternalSelenium.g:1888:2: ( rule__Element__TypeAssignment_0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=19 && LA14_0<=22)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSelenium.g:1888:3: rule__Element__TypeAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Element__TypeAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getElementAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__0__Impl"


    // $ANTLR start "rule__Element__Group__1"
    // InternalSelenium.g:1896:1: rule__Element__Group__1 : rule__Element__Group__1__Impl rule__Element__Group__2 ;
    public final void rule__Element__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1900:1: ( rule__Element__Group__1__Impl rule__Element__Group__2 )
            // InternalSelenium.g:1901:2: rule__Element__Group__1__Impl rule__Element__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Element__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Element__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__1"


    // $ANTLR start "rule__Element__Group__1__Impl"
    // InternalSelenium.g:1908:1: rule__Element__Group__1__Impl : ( ( rule__Element__Group_1__0 )? ) ;
    public final void rule__Element__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1912:1: ( ( ( rule__Element__Group_1__0 )? ) )
            // InternalSelenium.g:1913:1: ( ( rule__Element__Group_1__0 )? )
            {
            // InternalSelenium.g:1913:1: ( ( rule__Element__Group_1__0 )? )
            // InternalSelenium.g:1914:2: ( rule__Element__Group_1__0 )?
            {
             before(grammarAccess.getElementAccess().getGroup_1()); 
            // InternalSelenium.g:1915:2: ( rule__Element__Group_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==43) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSelenium.g:1915:3: rule__Element__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Element__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getElementAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__1__Impl"


    // $ANTLR start "rule__Element__Group__2"
    // InternalSelenium.g:1923:1: rule__Element__Group__2 : rule__Element__Group__2__Impl rule__Element__Group__3 ;
    public final void rule__Element__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1927:1: ( rule__Element__Group__2__Impl rule__Element__Group__3 )
            // InternalSelenium.g:1928:2: rule__Element__Group__2__Impl rule__Element__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__Element__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Element__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__2"


    // $ANTLR start "rule__Element__Group__2__Impl"
    // InternalSelenium.g:1935:1: rule__Element__Group__2__Impl : ( 'where' ) ;
    public final void rule__Element__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1939:1: ( ( 'where' ) )
            // InternalSelenium.g:1940:1: ( 'where' )
            {
            // InternalSelenium.g:1940:1: ( 'where' )
            // InternalSelenium.g:1941:2: 'where'
            {
             before(grammarAccess.getElementAccess().getWhereKeyword_2()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getWhereKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__2__Impl"


    // $ANTLR start "rule__Element__Group__3"
    // InternalSelenium.g:1950:1: rule__Element__Group__3 : rule__Element__Group__3__Impl rule__Element__Group__4 ;
    public final void rule__Element__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1954:1: ( rule__Element__Group__3__Impl rule__Element__Group__4 )
            // InternalSelenium.g:1955:2: rule__Element__Group__3__Impl rule__Element__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Element__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Element__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__3"


    // $ANTLR start "rule__Element__Group__3__Impl"
    // InternalSelenium.g:1962:1: rule__Element__Group__3__Impl : ( ( rule__Element__SelectorAssignment_3 ) ) ;
    public final void rule__Element__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1966:1: ( ( ( rule__Element__SelectorAssignment_3 ) ) )
            // InternalSelenium.g:1967:1: ( ( rule__Element__SelectorAssignment_3 ) )
            {
            // InternalSelenium.g:1967:1: ( ( rule__Element__SelectorAssignment_3 ) )
            // InternalSelenium.g:1968:2: ( rule__Element__SelectorAssignment_3 )
            {
             before(grammarAccess.getElementAccess().getSelectorAssignment_3()); 
            // InternalSelenium.g:1969:2: ( rule__Element__SelectorAssignment_3 )
            // InternalSelenium.g:1969:3: rule__Element__SelectorAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Element__SelectorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getSelectorAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__3__Impl"


    // $ANTLR start "rule__Element__Group__4"
    // InternalSelenium.g:1977:1: rule__Element__Group__4 : rule__Element__Group__4__Impl ;
    public final void rule__Element__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1981:1: ( rule__Element__Group__4__Impl )
            // InternalSelenium.g:1982:2: rule__Element__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Element__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__4"


    // $ANTLR start "rule__Element__Group__4__Impl"
    // InternalSelenium.g:1988:1: rule__Element__Group__4__Impl : ( ( rule__Element__Alternatives_4 ) ) ;
    public final void rule__Element__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:1992:1: ( ( ( rule__Element__Alternatives_4 ) ) )
            // InternalSelenium.g:1993:1: ( ( rule__Element__Alternatives_4 ) )
            {
            // InternalSelenium.g:1993:1: ( ( rule__Element__Alternatives_4 ) )
            // InternalSelenium.g:1994:2: ( rule__Element__Alternatives_4 )
            {
             before(grammarAccess.getElementAccess().getAlternatives_4()); 
            // InternalSelenium.g:1995:2: ( rule__Element__Alternatives_4 )
            // InternalSelenium.g:1995:3: rule__Element__Alternatives_4
            {
            pushFollow(FOLLOW_2);
            rule__Element__Alternatives_4();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__4__Impl"


    // $ANTLR start "rule__Element__Group_1__0"
    // InternalSelenium.g:2004:1: rule__Element__Group_1__0 : rule__Element__Group_1__0__Impl rule__Element__Group_1__1 ;
    public final void rule__Element__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:2008:1: ( rule__Element__Group_1__0__Impl rule__Element__Group_1__1 )
            // InternalSelenium.g:2009:2: rule__Element__Group_1__0__Impl rule__Element__Group_1__1
            {
            pushFollow(FOLLOW_25);
            rule__Element__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Element__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group_1__0"


    // $ANTLR start "rule__Element__Group_1__0__Impl"
    // InternalSelenium.g:2016:1: rule__Element__Group_1__0__Impl : ( 'n\\u00B0' ) ;
    public final void rule__Element__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:2020:1: ( ( 'n\\u00B0' ) )
            // InternalSelenium.g:2021:1: ( 'n\\u00B0' )
            {
            // InternalSelenium.g:2021:1: ( 'n\\u00B0' )
            // InternalSelenium.g:2022:2: 'n\\u00B0'
            {
             before(grammarAccess.getElementAccess().getNKeyword_1_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getNKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group_1__0__Impl"


    // $ANTLR start "rule__Element__Group_1__1"
    // InternalSelenium.g:2031:1: rule__Element__Group_1__1 : rule__Element__Group_1__1__Impl ;
    public final void rule__Element__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:2035:1: ( rule__Element__Group_1__1__Impl )
            // InternalSelenium.g:2036:2: rule__Element__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Element__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group_1__1"


    // $ANTLR start "rule__Element__Group_1__1__Impl"
    // InternalSelenium.g:2042:1: rule__Element__Group_1__1__Impl : ( ( rule__Element__NumberAssignment_1_1 ) ) ;
    public final void rule__Element__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:2046:1: ( ( ( rule__Element__NumberAssignment_1_1 ) ) )
            // InternalSelenium.g:2047:1: ( ( rule__Element__NumberAssignment_1_1 ) )
            {
            // InternalSelenium.g:2047:1: ( ( rule__Element__NumberAssignment_1_1 ) )
            // InternalSelenium.g:2048:2: ( rule__Element__NumberAssignment_1_1 )
            {
             before(grammarAccess.getElementAccess().getNumberAssignment_1_1()); 
            // InternalSelenium.g:2049:2: ( rule__Element__NumberAssignment_1_1 )
            // InternalSelenium.g:2049:3: rule__Element__NumberAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Element__NumberAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getNumberAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group_1__1__Impl"


    // $ANTLR start "rule__Element__Group_4_1__0"
    // InternalSelenium.g:2058:1: rule__Element__Group_4_1__0 : rule__Element__Group_4_1__0__Impl rule__Element__Group_4_1__1 ;
    public final void rule__Element__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:2062:1: ( rule__Element__Group_4_1__0__Impl rule__Element__Group_4_1__1 )
            // InternalSelenium.g:2063:2: rule__Element__Group_4_1__0__Impl rule__Element__Group_4_1__1
            {
            pushFollow(FOLLOW_15);
            rule__Element__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Element__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group_4_1__0"


    // $ANTLR start "rule__Element__Group_4_1__0__Impl"
    // InternalSelenium.g:2070:1: rule__Element__Group_4_1__0__Impl : ( '[' ) ;
    public final void rule__Element__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:2074:1: ( ( '[' ) )
            // InternalSelenium.g:2075:1: ( '[' )
            {
            // InternalSelenium.g:2075:1: ( '[' )
            // InternalSelenium.g:2076:2: '['
            {
             before(grammarAccess.getElementAccess().getLeftSquareBracketKeyword_4_1_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getLeftSquareBracketKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group_4_1__0__Impl"


    // $ANTLR start "rule__Element__Group_4_1__1"
    // InternalSelenium.g:2085:1: rule__Element__Group_4_1__1 : rule__Element__Group_4_1__1__Impl rule__Element__Group_4_1__2 ;
    public final void rule__Element__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:2089:1: ( rule__Element__Group_4_1__1__Impl rule__Element__Group_4_1__2 )
            // InternalSelenium.g:2090:2: rule__Element__Group_4_1__1__Impl rule__Element__Group_4_1__2
            {
            pushFollow(FOLLOW_16);
            rule__Element__Group_4_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Element__Group_4_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group_4_1__1"


    // $ANTLR start "rule__Element__Group_4_1__1__Impl"
    // InternalSelenium.g:2097:1: rule__Element__Group_4_1__1__Impl : ( ( rule__Element__VarAssignment_4_1_1 ) ) ;
    public final void rule__Element__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:2101:1: ( ( ( rule__Element__VarAssignment_4_1_1 ) ) )
            // InternalSelenium.g:2102:1: ( ( rule__Element__VarAssignment_4_1_1 ) )
            {
            // InternalSelenium.g:2102:1: ( ( rule__Element__VarAssignment_4_1_1 ) )
            // InternalSelenium.g:2103:2: ( rule__Element__VarAssignment_4_1_1 )
            {
             before(grammarAccess.getElementAccess().getVarAssignment_4_1_1()); 
            // InternalSelenium.g:2104:2: ( rule__Element__VarAssignment_4_1_1 )
            // InternalSelenium.g:2104:3: rule__Element__VarAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Element__VarAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getVarAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group_4_1__1__Impl"


    // $ANTLR start "rule__Element__Group_4_1__2"
    // InternalSelenium.g:2112:1: rule__Element__Group_4_1__2 : rule__Element__Group_4_1__2__Impl ;
    public final void rule__Element__Group_4_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:2116:1: ( rule__Element__Group_4_1__2__Impl )
            // InternalSelenium.g:2117:2: rule__Element__Group_4_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Element__Group_4_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group_4_1__2"


    // $ANTLR start "rule__Element__Group_4_1__2__Impl"
    // InternalSelenium.g:2123:1: rule__Element__Group_4_1__2__Impl : ( ']' ) ;
    public final void rule__Element__Group_4_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:2127:1: ( ( ']' ) )
            // InternalSelenium.g:2128:1: ( ']' )
            {
            // InternalSelenium.g:2128:1: ( ']' )
            // InternalSelenium.g:2129:2: ']'
            {
             before(grammarAccess.getElementAccess().getRightSquareBracketKeyword_4_1_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getRightSquareBracketKeyword_4_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group_4_1__2__Impl"


    // $ANTLR start "rule__ByProperty__Group__0"
    // InternalSelenium.g:2139:1: rule__ByProperty__Group__0 : rule__ByProperty__Group__0__Impl rule__ByProperty__Group__1 ;
    public final void rule__ByProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:2143:1: ( rule__ByProperty__Group__0__Impl rule__ByProperty__Group__1 )
            // InternalSelenium.g:2144:2: rule__ByProperty__Group__0__Impl rule__ByProperty__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__ByProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ByProperty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ByProperty__Group__0"


    // $ANTLR start "rule__ByProperty__Group__0__Impl"
    // InternalSelenium.g:2151:1: rule__ByProperty__Group__0__Impl : ( 'property' ) ;
    public final void rule__ByProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:2155:1: ( ( 'property' ) )
            // InternalSelenium.g:2156:1: ( 'property' )
            {
            // InternalSelenium.g:2156:1: ( 'property' )
            // InternalSelenium.g:2157:2: 'property'
            {
             before(grammarAccess.getByPropertyAccess().getPropertyKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getByPropertyAccess().getPropertyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ByProperty__Group__0__Impl"


    // $ANTLR start "rule__ByProperty__Group__1"
    // InternalSelenium.g:2166:1: rule__ByProperty__Group__1 : rule__ByProperty__Group__1__Impl rule__ByProperty__Group__2 ;
    public final void rule__ByProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:2170:1: ( rule__ByProperty__Group__1__Impl rule__ByProperty__Group__2 )
            // InternalSelenium.g:2171:2: rule__ByProperty__Group__1__Impl rule__ByProperty__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__ByProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ByProperty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ByProperty__Group__1"


    // $ANTLR start "rule__ByProperty__Group__1__Impl"
    // InternalSelenium.g:2178:1: rule__ByProperty__Group__1__Impl : ( ( rule__ByProperty__PropertyAssignment_1 ) ) ;
    public final void rule__ByProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:2182:1: ( ( ( rule__ByProperty__PropertyAssignment_1 ) ) )
            // InternalSelenium.g:2183:1: ( ( rule__ByProperty__PropertyAssignment_1 ) )
            {
            // InternalSelenium.g:2183:1: ( ( rule__ByProperty__PropertyAssignment_1 ) )
            // InternalSelenium.g:2184:2: ( rule__ByProperty__PropertyAssignment_1 )
            {
             before(grammarAccess.getByPropertyAccess().getPropertyAssignment_1()); 
            // InternalSelenium.g:2185:2: ( rule__ByProperty__PropertyAssignment_1 )
            // InternalSelenium.g:2185:3: rule__ByProperty__PropertyAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ByProperty__PropertyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getByPropertyAccess().getPropertyAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ByProperty__Group__1__Impl"


    // $ANTLR start "rule__ByProperty__Group__2"
    // InternalSelenium.g:2193:1: rule__ByProperty__Group__2 : rule__ByProperty__Group__2__Impl ;
    public final void rule__ByProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:2197:1: ( rule__ByProperty__Group__2__Impl )
            // InternalSelenium.g:2198:2: rule__ByProperty__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ByProperty__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ByProperty__Group__2"


    // $ANTLR start "rule__ByProperty__Group__2__Impl"
    // InternalSelenium.g:2204:1: rule__ByProperty__Group__2__Impl : ( '=' ) ;
    public final void rule__ByProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:2208:1: ( ( '=' ) )
            // InternalSelenium.g:2209:1: ( '=' )
            {
            // InternalSelenium.g:2209:1: ( '=' )
            // InternalSelenium.g:2210:2: '='
            {
             before(grammarAccess.getByPropertyAccess().getEqualsSignKeyword_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getByPropertyAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ByProperty__Group__2__Impl"


    // $ANTLR start "rule__Global__ProgramsAssignment"
    // InternalSelenium.g:2220:1: rule__Global__ProgramsAssignment : ( ruleProgram ) ;
    public final void rule__Global__ProgramsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:2224:1: ( ( ruleProgram ) )
            // InternalSelenium.g:2225:2: ( ruleProgram )
            {
            // InternalSelenium.g:2225:2: ( ruleProgram )
            // InternalSelenium.g:2226:3: ruleProgram
            {
             before(grammarAccess.getGlobalAccess().getProgramsProgramParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getGlobalAccess().getProgramsProgramParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__ProgramsAssignment"


    // $ANTLR start "rule__Program__NameAssignment_0"
    // InternalSelenium.g:2235:1: rule__Program__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Program__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:2239:1: ( ( RULE_ID ) )
            // InternalSelenium.g:2240:2: ( RULE_ID )
            {
            // InternalSelenium.g:2240:2: ( RULE_ID )
            // InternalSelenium.g:2241:3: RULE_ID
            {
             before(grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__NameAssignment_0"


    // $ANTLR start "rule__Program__RetAssignment_2"
    // InternalSelenium.g:2250:1: rule__Program__RetAssignment_2 : ( ( rule__Program__RetAlternatives_2_0 ) ) ;
    public final void rule__Program__RetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:2254:1: ( ( ( rule__Program__RetAlternatives_2_0 ) ) )
            // InternalSelenium.g:2255:2: ( ( rule__Program__RetAlternatives_2_0 ) )
            {
            // InternalSelenium.g:2255:2: ( ( rule__Program__RetAlternatives_2_0 ) )
            // InternalSelenium.g:2256:3: ( rule__Program__RetAlternatives_2_0 )
            {
             before(grammarAccess.getProgramAccess().getRetAlternatives_2_0()); 
            // InternalSelenium.g:2257:3: ( rule__Program__RetAlternatives_2_0 )
            // InternalSelenium.g:2257:4: rule__Program__RetAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Program__RetAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getRetAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__RetAssignment_2"


    // $ANTLR start "rule__Program__InsAssignment_5"
    // InternalSelenium.g:2265:1: rule__Program__InsAssignment_5 : ( ruleInstruction ) ;
    public final void rule__Program__InsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:2269:1: ( ( ruleInstruction ) )
            // InternalSelenium.g:2270:2: ( ruleInstruction )
            {
            // InternalSelenium.g:2270:2: ( ruleInstruction )
            // InternalSelenium.g:2271:3: ruleInstruction
            {
             before(grammarAccess.getProgramAccess().getInsInstructionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getInsInstructionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__InsAssignment_5"


    // $ANTLR start "rule__Go__UrlAssignment_1"
    // InternalSelenium.g:2280:1: rule__Go__UrlAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Go__UrlAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:2284:1: ( ( RULE_STRING ) )
            // InternalSelenium.g:2285:2: ( RULE_STRING )
            {
            // InternalSelenium.g:2285:2: ( RULE_STRING )
            // InternalSelenium.g:2286:3: RULE_STRING
            {
             before(grammarAccess.getGoAccess().getUrlSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGoAccess().getUrlSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Go__UrlAssignment_1"


    // $ANTLR start "rule__Verify__ElemAssignment_1_1"
    // InternalSelenium.g:2295:1: rule__Verify__ElemAssignment_1_1 : ( ruleElement ) ;
    public final void rule__Verify__ElemAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:2299:1: ( ( ruleElement ) )
            // InternalSelenium.g:2300:2: ( ruleElement )
            {
            // InternalSelenium.g:2300:2: ( ruleElement )
            // InternalSelenium.g:2301:3: ruleElement
            {
             before(grammarAccess.getVerifyAccess().getElemElementParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getVerifyAccess().getElemElementParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__ElemAssignment_1_1"


    // $ANTLR start "rule__Verify__TextAssignment_3_0"
    // InternalSelenium.g:2310:1: rule__Verify__TextAssignment_3_0 : ( RULE_STRING ) ;
    public final void rule__Verify__TextAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:2314:1: ( ( RULE_STRING ) )
            // InternalSelenium.g:2315:2: ( RULE_STRING )
            {
            // InternalSelenium.g:2315:2: ( RULE_STRING )
            // InternalSelenium.g:2316:3: RULE_STRING
            {
             before(grammarAccess.getVerifyAccess().getTextSTRINGTerminalRuleCall_3_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVerifyAccess().getTextSTRINGTerminalRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__TextAssignment_3_0"


    // $ANTLR start "rule__Verify__VarAssignment_3_1_1"
    // InternalSelenium.g:2325:1: rule__Verify__VarAssignment_3_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Verify__VarAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:2329:1: ( ( ( RULE_ID ) ) )
            // InternalSelenium.g:2330:2: ( ( RULE_ID ) )
            {
            // InternalSelenium.g:2330:2: ( ( RULE_ID ) )
            // InternalSelenium.g:2331:3: ( RULE_ID )
            {
             before(grammarAccess.getVerifyAccess().getVarVariableCrossReference_3_1_1_0()); 
            // InternalSelenium.g:2332:3: ( RULE_ID )
            // InternalSelenium.g:2333:4: RULE_ID
            {
             before(grammarAccess.getVerifyAccess().getVarVariableIDTerminalRuleCall_3_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVerifyAccess().getVarVariableIDTerminalRuleCall_3_1_1_0_1()); 

            }

             after(grammarAccess.getVerifyAccess().getVarVariableCrossReference_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__VarAssignment_3_1_1"


    // $ANTLR start "rule__Verify__ElementAssignment_3_2"
    // InternalSelenium.g:2344:1: rule__Verify__ElementAssignment_3_2 : ( ruleElement ) ;
    public final void rule__Verify__ElementAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:2348:1: ( ( ruleElement ) )
            // InternalSelenium.g:2349:2: ( ruleElement )
            {
            // InternalSelenium.g:2349:2: ( ruleElement )
            // InternalSelenium.g:2350:3: ruleElement
            {
             before(grammarAccess.getVerifyAccess().getElementElementParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getVerifyAccess().getElementElementParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__ElementAssignment_3_2"


    // $ANTLR start "rule__FillText__TextAssignment_1_0"
    // InternalSelenium.g:2359:1: rule__FillText__TextAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__FillText__TextAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:2363:1: ( ( RULE_STRING ) )
            // InternalSelenium.g:2364:2: ( RULE_STRING )
            {
            // InternalSelenium.g:2364:2: ( RULE_STRING )
            // InternalSelenium.g:2365:3: RULE_STRING
            {
             before(grammarAccess.getFillTextAccess().getTextSTRINGTerminalRuleCall_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFillTextAccess().getTextSTRINGTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillText__TextAssignment_1_0"


    // $ANTLR start "rule__FillText__VarAssignment_1_1_1"
    // InternalSelenium.g:2374:1: rule__FillText__VarAssignment_1_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__FillText__VarAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:2378:1: ( ( ( RULE_ID ) ) )
            // InternalSelenium.g:2379:2: ( ( RULE_ID ) )
            {
            // InternalSelenium.g:2379:2: ( ( RULE_ID ) )
            // InternalSelenium.g:2380:3: ( RULE_ID )
            {
             before(grammarAccess.getFillTextAccess().getVarVariableCrossReference_1_1_1_0()); 
            // InternalSelenium.g:2381:3: ( RULE_ID )
            // InternalSelenium.g:2382:4: RULE_ID
            {
             before(grammarAccess.getFillTextAccess().getVarVariableIDTerminalRuleCall_1_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFillTextAccess().getVarVariableIDTerminalRuleCall_1_1_1_0_1()); 

            }

             after(grammarAccess.getFillTextAccess().getVarVariableCrossReference_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillText__VarAssignment_1_1_1"


    // $ANTLR start "rule__FillText__PropAssignment_3"
    // InternalSelenium.g:2393:1: rule__FillText__PropAssignment_3 : ( ruleByProperty ) ;
    public final void rule__FillText__PropAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:2397:1: ( ( ruleByProperty ) )
            // InternalSelenium.g:2398:2: ( ruleByProperty )
            {
            // InternalSelenium.g:2398:2: ( ruleByProperty )
            // InternalSelenium.g:2399:3: ruleByProperty
            {
             before(grammarAccess.getFillTextAccess().getPropByPropertyParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleByProperty();

            state._fsp--;

             after(grammarAccess.getFillTextAccess().getPropByPropertyParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillText__PropAssignment_3"


    // $ANTLR start "rule__FillText__TargetAssignment_4"
    // InternalSelenium.g:2408:1: rule__FillText__TargetAssignment_4 : ( RULE_STRING ) ;
    public final void rule__FillText__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:2412:1: ( ( RULE_STRING ) )
            // InternalSelenium.g:2413:2: ( RULE_STRING )
            {
            // InternalSelenium.g:2413:2: ( RULE_STRING )
            // InternalSelenium.g:2414:3: RULE_STRING
            {
             before(grammarAccess.getFillTextAccess().getTargetSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFillTextAccess().getTargetSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillText__TargetAssignment_4"


    // $ANTLR start "rule__Variable__NameAssignment_1"
    // InternalSelenium.g:2423:1: rule__Variable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:2427:1: ( ( RULE_ID ) )
            // InternalSelenium.g:2428:2: ( RULE_ID )
            {
            // InternalSelenium.g:2428:2: ( RULE_ID )
            // InternalSelenium.g:2429:3: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__NameAssignment_1"


    // $ANTLR start "rule__Variable__AttrAssignment_3_1_1"
    // InternalSelenium.g:2438:1: rule__Variable__AttrAssignment_3_1_1 : ( RULE_STRING ) ;
    public final void rule__Variable__AttrAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:2442:1: ( ( RULE_STRING ) )
            // InternalSelenium.g:2443:2: ( RULE_STRING )
            {
            // InternalSelenium.g:2443:2: ( RULE_STRING )
            // InternalSelenium.g:2444:3: RULE_STRING
            {
             before(grammarAccess.getVariableAccess().getAttrSTRINGTerminalRuleCall_3_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getAttrSTRINGTerminalRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__AttrAssignment_3_1_1"


    // $ANTLR start "rule__Variable__ElemAssignment_5"
    // InternalSelenium.g:2453:1: rule__Variable__ElemAssignment_5 : ( ruleElement ) ;
    public final void rule__Variable__ElemAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:2457:1: ( ( ruleElement ) )
            // InternalSelenium.g:2458:2: ( ruleElement )
            {
            // InternalSelenium.g:2458:2: ( ruleElement )
            // InternalSelenium.g:2459:3: ruleElement
            {
             before(grammarAccess.getVariableAccess().getElemElementParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getElemElementParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__ElemAssignment_5"


    // $ANTLR start "rule__Check__ByAssignment_1_1_0"
    // InternalSelenium.g:2468:1: rule__Check__ByAssignment_1_1_0 : ( ruleBy ) ;
    public final void rule__Check__ByAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:2472:1: ( ( ruleBy ) )
            // InternalSelenium.g:2473:2: ( ruleBy )
            {
            // InternalSelenium.g:2473:2: ( ruleBy )
            // InternalSelenium.g:2474:3: ruleBy
            {
             before(grammarAccess.getCheckAccess().getByByParserRuleCall_1_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBy();

            state._fsp--;

             after(grammarAccess.getCheckAccess().getByByParserRuleCall_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__ByAssignment_1_1_0"


    // $ANTLR start "rule__Check__TargetAssignment_1_1_1"
    // InternalSelenium.g:2483:1: rule__Check__TargetAssignment_1_1_1 : ( RULE_STRING ) ;
    public final void rule__Check__TargetAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:2487:1: ( ( RULE_STRING ) )
            // InternalSelenium.g:2488:2: ( RULE_STRING )
            {
            // InternalSelenium.g:2488:2: ( RULE_STRING )
            // InternalSelenium.g:2489:3: RULE_STRING
            {
             before(grammarAccess.getCheckAccess().getTargetSTRINGTerminalRuleCall_1_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCheckAccess().getTargetSTRINGTerminalRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__TargetAssignment_1_1_1"


    // $ANTLR start "rule__SelectCombo__ByAssignment_1"
    // InternalSelenium.g:2498:1: rule__SelectCombo__ByAssignment_1 : ( ruleBy ) ;
    public final void rule__SelectCombo__ByAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:2502:1: ( ( ruleBy ) )
            // InternalSelenium.g:2503:2: ( ruleBy )
            {
            // InternalSelenium.g:2503:2: ( ruleBy )
            // InternalSelenium.g:2504:3: ruleBy
            {
             before(grammarAccess.getSelectComboAccess().getByByParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBy();

            state._fsp--;

             after(grammarAccess.getSelectComboAccess().getByByParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectCombo__ByAssignment_1"


    // $ANTLR start "rule__SelectCombo__TargetAssignment_2"
    // InternalSelenium.g:2513:1: rule__SelectCombo__TargetAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SelectCombo__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:2517:1: ( ( RULE_STRING ) )
            // InternalSelenium.g:2518:2: ( RULE_STRING )
            {
            // InternalSelenium.g:2518:2: ( RULE_STRING )
            // InternalSelenium.g:2519:3: RULE_STRING
            {
             before(grammarAccess.getSelectComboAccess().getTargetSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSelectComboAccess().getTargetSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectCombo__TargetAssignment_2"


    // $ANTLR start "rule__Element__TypeAssignment_0"
    // InternalSelenium.g:2528:1: rule__Element__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__Element__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:2532:1: ( ( ruleType ) )
            // InternalSelenium.g:2533:2: ( ruleType )
            {
            // InternalSelenium.g:2533:2: ( ruleType )
            // InternalSelenium.g:2534:3: ruleType
            {
             before(grammarAccess.getElementAccess().getTypeTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getElementAccess().getTypeTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__TypeAssignment_0"


    // $ANTLR start "rule__Element__NumberAssignment_1_1"
    // InternalSelenium.g:2543:1: rule__Element__NumberAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__Element__NumberAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:2547:1: ( ( RULE_INT ) )
            // InternalSelenium.g:2548:2: ( RULE_INT )
            {
            // InternalSelenium.g:2548:2: ( RULE_INT )
            // InternalSelenium.g:2549:3: RULE_INT
            {
             before(grammarAccess.getElementAccess().getNumberINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getNumberINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__NumberAssignment_1_1"


    // $ANTLR start "rule__Element__SelectorAssignment_3"
    // InternalSelenium.g:2558:1: rule__Element__SelectorAssignment_3 : ( ruleBy ) ;
    public final void rule__Element__SelectorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:2562:1: ( ( ruleBy ) )
            // InternalSelenium.g:2563:2: ( ruleBy )
            {
            // InternalSelenium.g:2563:2: ( ruleBy )
            // InternalSelenium.g:2564:3: ruleBy
            {
             before(grammarAccess.getElementAccess().getSelectorByParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBy();

            state._fsp--;

             after(grammarAccess.getElementAccess().getSelectorByParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__SelectorAssignment_3"


    // $ANTLR start "rule__Element__TargetAssignment_4_0"
    // InternalSelenium.g:2573:1: rule__Element__TargetAssignment_4_0 : ( RULE_STRING ) ;
    public final void rule__Element__TargetAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:2577:1: ( ( RULE_STRING ) )
            // InternalSelenium.g:2578:2: ( RULE_STRING )
            {
            // InternalSelenium.g:2578:2: ( RULE_STRING )
            // InternalSelenium.g:2579:3: RULE_STRING
            {
             before(grammarAccess.getElementAccess().getTargetSTRINGTerminalRuleCall_4_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getTargetSTRINGTerminalRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__TargetAssignment_4_0"


    // $ANTLR start "rule__Element__VarAssignment_4_1_1"
    // InternalSelenium.g:2588:1: rule__Element__VarAssignment_4_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Element__VarAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:2592:1: ( ( ( RULE_ID ) ) )
            // InternalSelenium.g:2593:2: ( ( RULE_ID ) )
            {
            // InternalSelenium.g:2593:2: ( ( RULE_ID ) )
            // InternalSelenium.g:2594:3: ( RULE_ID )
            {
             before(grammarAccess.getElementAccess().getVarVariableCrossReference_4_1_1_0()); 
            // InternalSelenium.g:2595:3: ( RULE_ID )
            // InternalSelenium.g:2596:4: RULE_ID
            {
             before(grammarAccess.getElementAccess().getVarVariableIDTerminalRuleCall_4_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getVarVariableIDTerminalRuleCall_4_1_1_0_1()); 

            }

             after(grammarAccess.getElementAccess().getVarVariableCrossReference_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__VarAssignment_4_1_1"


    // $ANTLR start "rule__ByProperty__PropertyAssignment_1"
    // InternalSelenium.g:2607:1: rule__ByProperty__PropertyAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ByProperty__PropertyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSelenium.g:2611:1: ( ( RULE_STRING ) )
            // InternalSelenium.g:2612:2: ( RULE_STRING )
            {
            // InternalSelenium.g:2612:2: ( RULE_STRING )
            // InternalSelenium.g:2613:3: RULE_STRING
            {
             before(grammarAccess.getByPropertyAccess().getPropertySTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getByPropertyAccess().getPropertySTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ByProperty__PropertyAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000038A34000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000038A30000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000C0000782000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000C0080782020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000004000004000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000004000048000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000040L});

}