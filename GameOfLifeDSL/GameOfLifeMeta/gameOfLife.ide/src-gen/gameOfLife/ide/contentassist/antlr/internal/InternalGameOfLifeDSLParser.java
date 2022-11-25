package gameOfLife.ide.contentassist.antlr.internal;

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
import gameOfLife.services.GameOfLifeDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGameOfLifeDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<'", "'>'", "'=='", "'die'", "'live'", "'becomeAlive'", "'GameOfLife:'", "'aliveCells:'", "'evolutionRules:'", "'('", "','", "')'", "'EvolutionRule'", "'surrounding'", "':'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=4;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalGameOfLifeDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGameOfLifeDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGameOfLifeDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGameOfLifeDSL.g"; }


    	private GameOfLifeDSLGrammarAccess grammarAccess;

    	public void setGrammarAccess(GameOfLifeDSLGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleGameOfLife"
    // InternalGameOfLifeDSL.g:53:1: entryRuleGameOfLife : ruleGameOfLife EOF ;
    public final void entryRuleGameOfLife() throws RecognitionException {
        try {
            // InternalGameOfLifeDSL.g:54:1: ( ruleGameOfLife EOF )
            // InternalGameOfLifeDSL.g:55:1: ruleGameOfLife EOF
            {
             before(grammarAccess.getGameOfLifeRule()); 
            pushFollow(FOLLOW_1);
            ruleGameOfLife();

            state._fsp--;

             after(grammarAccess.getGameOfLifeRule()); 
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
    // $ANTLR end "entryRuleGameOfLife"


    // $ANTLR start "ruleGameOfLife"
    // InternalGameOfLifeDSL.g:62:1: ruleGameOfLife : ( ( rule__GameOfLife__Group__0 ) ) ;
    public final void ruleGameOfLife() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:66:2: ( ( ( rule__GameOfLife__Group__0 ) ) )
            // InternalGameOfLifeDSL.g:67:2: ( ( rule__GameOfLife__Group__0 ) )
            {
            // InternalGameOfLifeDSL.g:67:2: ( ( rule__GameOfLife__Group__0 ) )
            // InternalGameOfLifeDSL.g:68:3: ( rule__GameOfLife__Group__0 )
            {
             before(grammarAccess.getGameOfLifeAccess().getGroup()); 
            // InternalGameOfLifeDSL.g:69:3: ( rule__GameOfLife__Group__0 )
            // InternalGameOfLifeDSL.g:69:4: rule__GameOfLife__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GameOfLife__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGameOfLifeAccess().getGroup()); 

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
    // $ANTLR end "ruleGameOfLife"


    // $ANTLR start "entryRulePoint"
    // InternalGameOfLifeDSL.g:78:1: entryRulePoint : rulePoint EOF ;
    public final void entryRulePoint() throws RecognitionException {
        try {
            // InternalGameOfLifeDSL.g:79:1: ( rulePoint EOF )
            // InternalGameOfLifeDSL.g:80:1: rulePoint EOF
            {
             before(grammarAccess.getPointRule()); 
            pushFollow(FOLLOW_1);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getPointRule()); 
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
    // $ANTLR end "entryRulePoint"


    // $ANTLR start "rulePoint"
    // InternalGameOfLifeDSL.g:87:1: rulePoint : ( ( rule__Point__Group__0 ) ) ;
    public final void rulePoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:91:2: ( ( ( rule__Point__Group__0 ) ) )
            // InternalGameOfLifeDSL.g:92:2: ( ( rule__Point__Group__0 ) )
            {
            // InternalGameOfLifeDSL.g:92:2: ( ( rule__Point__Group__0 ) )
            // InternalGameOfLifeDSL.g:93:3: ( rule__Point__Group__0 )
            {
             before(grammarAccess.getPointAccess().getGroup()); 
            // InternalGameOfLifeDSL.g:94:3: ( rule__Point__Group__0 )
            // InternalGameOfLifeDSL.g:94:4: rule__Point__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Point__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPointAccess().getGroup()); 

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
    // $ANTLR end "rulePoint"


    // $ANTLR start "entryRuleEvolutionRule"
    // InternalGameOfLifeDSL.g:103:1: entryRuleEvolutionRule : ruleEvolutionRule EOF ;
    public final void entryRuleEvolutionRule() throws RecognitionException {
        try {
            // InternalGameOfLifeDSL.g:104:1: ( ruleEvolutionRule EOF )
            // InternalGameOfLifeDSL.g:105:1: ruleEvolutionRule EOF
            {
             before(grammarAccess.getEvolutionRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleEvolutionRule();

            state._fsp--;

             after(grammarAccess.getEvolutionRuleRule()); 
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
    // $ANTLR end "entryRuleEvolutionRule"


    // $ANTLR start "ruleEvolutionRule"
    // InternalGameOfLifeDSL.g:112:1: ruleEvolutionRule : ( ( rule__EvolutionRule__Group__0 ) ) ;
    public final void ruleEvolutionRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:116:2: ( ( ( rule__EvolutionRule__Group__0 ) ) )
            // InternalGameOfLifeDSL.g:117:2: ( ( rule__EvolutionRule__Group__0 ) )
            {
            // InternalGameOfLifeDSL.g:117:2: ( ( rule__EvolutionRule__Group__0 ) )
            // InternalGameOfLifeDSL.g:118:3: ( rule__EvolutionRule__Group__0 )
            {
             before(grammarAccess.getEvolutionRuleAccess().getGroup()); 
            // InternalGameOfLifeDSL.g:119:3: ( rule__EvolutionRule__Group__0 )
            // InternalGameOfLifeDSL.g:119:4: rule__EvolutionRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EvolutionRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEvolutionRuleAccess().getGroup()); 

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
    // $ANTLR end "ruleEvolutionRule"


    // $ANTLR start "ruleConditionElement"
    // InternalGameOfLifeDSL.g:128:1: ruleConditionElement : ( ( rule__ConditionElement__Alternatives ) ) ;
    public final void ruleConditionElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:132:1: ( ( ( rule__ConditionElement__Alternatives ) ) )
            // InternalGameOfLifeDSL.g:133:2: ( ( rule__ConditionElement__Alternatives ) )
            {
            // InternalGameOfLifeDSL.g:133:2: ( ( rule__ConditionElement__Alternatives ) )
            // InternalGameOfLifeDSL.g:134:3: ( rule__ConditionElement__Alternatives )
            {
             before(grammarAccess.getConditionElementAccess().getAlternatives()); 
            // InternalGameOfLifeDSL.g:135:3: ( rule__ConditionElement__Alternatives )
            // InternalGameOfLifeDSL.g:135:4: rule__ConditionElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ConditionElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConditionElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleConditionElement"


    // $ANTLR start "ruleAction"
    // InternalGameOfLifeDSL.g:144:1: ruleAction : ( ( rule__Action__Alternatives ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:148:1: ( ( ( rule__Action__Alternatives ) ) )
            // InternalGameOfLifeDSL.g:149:2: ( ( rule__Action__Alternatives ) )
            {
            // InternalGameOfLifeDSL.g:149:2: ( ( rule__Action__Alternatives ) )
            // InternalGameOfLifeDSL.g:150:3: ( rule__Action__Alternatives )
            {
             before(grammarAccess.getActionAccess().getAlternatives()); 
            // InternalGameOfLifeDSL.g:151:3: ( rule__Action__Alternatives )
            // InternalGameOfLifeDSL.g:151:4: rule__Action__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Action__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "rule__ConditionElement__Alternatives"
    // InternalGameOfLifeDSL.g:159:1: rule__ConditionElement__Alternatives : ( ( ( '<' ) ) | ( ( '>' ) ) | ( ( '==' ) ) );
    public final void rule__ConditionElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:163:1: ( ( ( '<' ) ) | ( ( '>' ) ) | ( ( '==' ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalGameOfLifeDSL.g:164:2: ( ( '<' ) )
                    {
                    // InternalGameOfLifeDSL.g:164:2: ( ( '<' ) )
                    // InternalGameOfLifeDSL.g:165:3: ( '<' )
                    {
                     before(grammarAccess.getConditionElementAccess().getLOWEREnumLiteralDeclaration_0()); 
                    // InternalGameOfLifeDSL.g:166:3: ( '<' )
                    // InternalGameOfLifeDSL.g:166:4: '<'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getConditionElementAccess().getLOWEREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGameOfLifeDSL.g:170:2: ( ( '>' ) )
                    {
                    // InternalGameOfLifeDSL.g:170:2: ( ( '>' ) )
                    // InternalGameOfLifeDSL.g:171:3: ( '>' )
                    {
                     before(grammarAccess.getConditionElementAccess().getGREATEREnumLiteralDeclaration_1()); 
                    // InternalGameOfLifeDSL.g:172:3: ( '>' )
                    // InternalGameOfLifeDSL.g:172:4: '>'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getConditionElementAccess().getGREATEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGameOfLifeDSL.g:176:2: ( ( '==' ) )
                    {
                    // InternalGameOfLifeDSL.g:176:2: ( ( '==' ) )
                    // InternalGameOfLifeDSL.g:177:3: ( '==' )
                    {
                     before(grammarAccess.getConditionElementAccess().getEQUALEnumLiteralDeclaration_2()); 
                    // InternalGameOfLifeDSL.g:178:3: ( '==' )
                    // InternalGameOfLifeDSL.g:178:4: '=='
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getConditionElementAccess().getEQUALEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__ConditionElement__Alternatives"


    // $ANTLR start "rule__Action__Alternatives"
    // InternalGameOfLifeDSL.g:186:1: rule__Action__Alternatives : ( ( ( 'die' ) ) | ( ( 'live' ) ) | ( ( 'becomeAlive' ) ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:190:1: ( ( ( 'die' ) ) | ( ( 'live' ) ) | ( ( 'becomeAlive' ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                alt2=2;
                }
                break;
            case 16:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalGameOfLifeDSL.g:191:2: ( ( 'die' ) )
                    {
                    // InternalGameOfLifeDSL.g:191:2: ( ( 'die' ) )
                    // InternalGameOfLifeDSL.g:192:3: ( 'die' )
                    {
                     before(grammarAccess.getActionAccess().getDIEEnumLiteralDeclaration_0()); 
                    // InternalGameOfLifeDSL.g:193:3: ( 'die' )
                    // InternalGameOfLifeDSL.g:193:4: 'die'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionAccess().getDIEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGameOfLifeDSL.g:197:2: ( ( 'live' ) )
                    {
                    // InternalGameOfLifeDSL.g:197:2: ( ( 'live' ) )
                    // InternalGameOfLifeDSL.g:198:3: ( 'live' )
                    {
                     before(grammarAccess.getActionAccess().getLIVEEnumLiteralDeclaration_1()); 
                    // InternalGameOfLifeDSL.g:199:3: ( 'live' )
                    // InternalGameOfLifeDSL.g:199:4: 'live'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionAccess().getLIVEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGameOfLifeDSL.g:203:2: ( ( 'becomeAlive' ) )
                    {
                    // InternalGameOfLifeDSL.g:203:2: ( ( 'becomeAlive' ) )
                    // InternalGameOfLifeDSL.g:204:3: ( 'becomeAlive' )
                    {
                     before(grammarAccess.getActionAccess().getBECOMEALIVEEnumLiteralDeclaration_2()); 
                    // InternalGameOfLifeDSL.g:205:3: ( 'becomeAlive' )
                    // InternalGameOfLifeDSL.g:205:4: 'becomeAlive'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionAccess().getBECOMEALIVEEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__Action__Alternatives"


    // $ANTLR start "rule__GameOfLife__Group__0"
    // InternalGameOfLifeDSL.g:213:1: rule__GameOfLife__Group__0 : rule__GameOfLife__Group__0__Impl rule__GameOfLife__Group__1 ;
    public final void rule__GameOfLife__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:217:1: ( rule__GameOfLife__Group__0__Impl rule__GameOfLife__Group__1 )
            // InternalGameOfLifeDSL.g:218:2: rule__GameOfLife__Group__0__Impl rule__GameOfLife__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__GameOfLife__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameOfLife__Group__1();

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
    // $ANTLR end "rule__GameOfLife__Group__0"


    // $ANTLR start "rule__GameOfLife__Group__0__Impl"
    // InternalGameOfLifeDSL.g:225:1: rule__GameOfLife__Group__0__Impl : ( 'GameOfLife:' ) ;
    public final void rule__GameOfLife__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:229:1: ( ( 'GameOfLife:' ) )
            // InternalGameOfLifeDSL.g:230:1: ( 'GameOfLife:' )
            {
            // InternalGameOfLifeDSL.g:230:1: ( 'GameOfLife:' )
            // InternalGameOfLifeDSL.g:231:2: 'GameOfLife:'
            {
             before(grammarAccess.getGameOfLifeAccess().getGameOfLifeKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getGameOfLifeAccess().getGameOfLifeKeyword_0()); 

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
    // $ANTLR end "rule__GameOfLife__Group__0__Impl"


    // $ANTLR start "rule__GameOfLife__Group__1"
    // InternalGameOfLifeDSL.g:240:1: rule__GameOfLife__Group__1 : rule__GameOfLife__Group__1__Impl rule__GameOfLife__Group__2 ;
    public final void rule__GameOfLife__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:244:1: ( rule__GameOfLife__Group__1__Impl rule__GameOfLife__Group__2 )
            // InternalGameOfLifeDSL.g:245:2: rule__GameOfLife__Group__1__Impl rule__GameOfLife__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__GameOfLife__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameOfLife__Group__2();

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
    // $ANTLR end "rule__GameOfLife__Group__1"


    // $ANTLR start "rule__GameOfLife__Group__1__Impl"
    // InternalGameOfLifeDSL.g:252:1: rule__GameOfLife__Group__1__Impl : ( 'aliveCells:' ) ;
    public final void rule__GameOfLife__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:256:1: ( ( 'aliveCells:' ) )
            // InternalGameOfLifeDSL.g:257:1: ( 'aliveCells:' )
            {
            // InternalGameOfLifeDSL.g:257:1: ( 'aliveCells:' )
            // InternalGameOfLifeDSL.g:258:2: 'aliveCells:'
            {
             before(grammarAccess.getGameOfLifeAccess().getAliveCellsKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getGameOfLifeAccess().getAliveCellsKeyword_1()); 

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
    // $ANTLR end "rule__GameOfLife__Group__1__Impl"


    // $ANTLR start "rule__GameOfLife__Group__2"
    // InternalGameOfLifeDSL.g:267:1: rule__GameOfLife__Group__2 : rule__GameOfLife__Group__2__Impl rule__GameOfLife__Group__3 ;
    public final void rule__GameOfLife__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:271:1: ( rule__GameOfLife__Group__2__Impl rule__GameOfLife__Group__3 )
            // InternalGameOfLifeDSL.g:272:2: rule__GameOfLife__Group__2__Impl rule__GameOfLife__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__GameOfLife__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameOfLife__Group__3();

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
    // $ANTLR end "rule__GameOfLife__Group__2"


    // $ANTLR start "rule__GameOfLife__Group__2__Impl"
    // InternalGameOfLifeDSL.g:279:1: rule__GameOfLife__Group__2__Impl : ( ( ( rule__GameOfLife__AliveCellsAssignment_2 ) ) ( ( rule__GameOfLife__AliveCellsAssignment_2 )* ) ) ;
    public final void rule__GameOfLife__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:283:1: ( ( ( ( rule__GameOfLife__AliveCellsAssignment_2 ) ) ( ( rule__GameOfLife__AliveCellsAssignment_2 )* ) ) )
            // InternalGameOfLifeDSL.g:284:1: ( ( ( rule__GameOfLife__AliveCellsAssignment_2 ) ) ( ( rule__GameOfLife__AliveCellsAssignment_2 )* ) )
            {
            // InternalGameOfLifeDSL.g:284:1: ( ( ( rule__GameOfLife__AliveCellsAssignment_2 ) ) ( ( rule__GameOfLife__AliveCellsAssignment_2 )* ) )
            // InternalGameOfLifeDSL.g:285:2: ( ( rule__GameOfLife__AliveCellsAssignment_2 ) ) ( ( rule__GameOfLife__AliveCellsAssignment_2 )* )
            {
            // InternalGameOfLifeDSL.g:285:2: ( ( rule__GameOfLife__AliveCellsAssignment_2 ) )
            // InternalGameOfLifeDSL.g:286:3: ( rule__GameOfLife__AliveCellsAssignment_2 )
            {
             before(grammarAccess.getGameOfLifeAccess().getAliveCellsAssignment_2()); 
            // InternalGameOfLifeDSL.g:287:3: ( rule__GameOfLife__AliveCellsAssignment_2 )
            // InternalGameOfLifeDSL.g:287:4: rule__GameOfLife__AliveCellsAssignment_2
            {
            pushFollow(FOLLOW_6);
            rule__GameOfLife__AliveCellsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGameOfLifeAccess().getAliveCellsAssignment_2()); 

            }

            // InternalGameOfLifeDSL.g:290:2: ( ( rule__GameOfLife__AliveCellsAssignment_2 )* )
            // InternalGameOfLifeDSL.g:291:3: ( rule__GameOfLife__AliveCellsAssignment_2 )*
            {
             before(grammarAccess.getGameOfLifeAccess().getAliveCellsAssignment_2()); 
            // InternalGameOfLifeDSL.g:292:3: ( rule__GameOfLife__AliveCellsAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==20) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGameOfLifeDSL.g:292:4: rule__GameOfLife__AliveCellsAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__GameOfLife__AliveCellsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getGameOfLifeAccess().getAliveCellsAssignment_2()); 

            }


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
    // $ANTLR end "rule__GameOfLife__Group__2__Impl"


    // $ANTLR start "rule__GameOfLife__Group__3"
    // InternalGameOfLifeDSL.g:301:1: rule__GameOfLife__Group__3 : rule__GameOfLife__Group__3__Impl rule__GameOfLife__Group__4 ;
    public final void rule__GameOfLife__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:305:1: ( rule__GameOfLife__Group__3__Impl rule__GameOfLife__Group__4 )
            // InternalGameOfLifeDSL.g:306:2: rule__GameOfLife__Group__3__Impl rule__GameOfLife__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__GameOfLife__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameOfLife__Group__4();

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
    // $ANTLR end "rule__GameOfLife__Group__3"


    // $ANTLR start "rule__GameOfLife__Group__3__Impl"
    // InternalGameOfLifeDSL.g:313:1: rule__GameOfLife__Group__3__Impl : ( 'evolutionRules:' ) ;
    public final void rule__GameOfLife__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:317:1: ( ( 'evolutionRules:' ) )
            // InternalGameOfLifeDSL.g:318:1: ( 'evolutionRules:' )
            {
            // InternalGameOfLifeDSL.g:318:1: ( 'evolutionRules:' )
            // InternalGameOfLifeDSL.g:319:2: 'evolutionRules:'
            {
             before(grammarAccess.getGameOfLifeAccess().getEvolutionRulesKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getGameOfLifeAccess().getEvolutionRulesKeyword_3()); 

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
    // $ANTLR end "rule__GameOfLife__Group__3__Impl"


    // $ANTLR start "rule__GameOfLife__Group__4"
    // InternalGameOfLifeDSL.g:328:1: rule__GameOfLife__Group__4 : rule__GameOfLife__Group__4__Impl ;
    public final void rule__GameOfLife__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:332:1: ( rule__GameOfLife__Group__4__Impl )
            // InternalGameOfLifeDSL.g:333:2: rule__GameOfLife__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GameOfLife__Group__4__Impl();

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
    // $ANTLR end "rule__GameOfLife__Group__4"


    // $ANTLR start "rule__GameOfLife__Group__4__Impl"
    // InternalGameOfLifeDSL.g:339:1: rule__GameOfLife__Group__4__Impl : ( ( ( rule__GameOfLife__EvolutionRulesAssignment_4 ) ) ( ( rule__GameOfLife__EvolutionRulesAssignment_4 )* ) ) ;
    public final void rule__GameOfLife__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:343:1: ( ( ( ( rule__GameOfLife__EvolutionRulesAssignment_4 ) ) ( ( rule__GameOfLife__EvolutionRulesAssignment_4 )* ) ) )
            // InternalGameOfLifeDSL.g:344:1: ( ( ( rule__GameOfLife__EvolutionRulesAssignment_4 ) ) ( ( rule__GameOfLife__EvolutionRulesAssignment_4 )* ) )
            {
            // InternalGameOfLifeDSL.g:344:1: ( ( ( rule__GameOfLife__EvolutionRulesAssignment_4 ) ) ( ( rule__GameOfLife__EvolutionRulesAssignment_4 )* ) )
            // InternalGameOfLifeDSL.g:345:2: ( ( rule__GameOfLife__EvolutionRulesAssignment_4 ) ) ( ( rule__GameOfLife__EvolutionRulesAssignment_4 )* )
            {
            // InternalGameOfLifeDSL.g:345:2: ( ( rule__GameOfLife__EvolutionRulesAssignment_4 ) )
            // InternalGameOfLifeDSL.g:346:3: ( rule__GameOfLife__EvolutionRulesAssignment_4 )
            {
             before(grammarAccess.getGameOfLifeAccess().getEvolutionRulesAssignment_4()); 
            // InternalGameOfLifeDSL.g:347:3: ( rule__GameOfLife__EvolutionRulesAssignment_4 )
            // InternalGameOfLifeDSL.g:347:4: rule__GameOfLife__EvolutionRulesAssignment_4
            {
            pushFollow(FOLLOW_8);
            rule__GameOfLife__EvolutionRulesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getGameOfLifeAccess().getEvolutionRulesAssignment_4()); 

            }

            // InternalGameOfLifeDSL.g:350:2: ( ( rule__GameOfLife__EvolutionRulesAssignment_4 )* )
            // InternalGameOfLifeDSL.g:351:3: ( rule__GameOfLife__EvolutionRulesAssignment_4 )*
            {
             before(grammarAccess.getGameOfLifeAccess().getEvolutionRulesAssignment_4()); 
            // InternalGameOfLifeDSL.g:352:3: ( rule__GameOfLife__EvolutionRulesAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==23) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGameOfLifeDSL.g:352:4: rule__GameOfLife__EvolutionRulesAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__GameOfLife__EvolutionRulesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getGameOfLifeAccess().getEvolutionRulesAssignment_4()); 

            }


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
    // $ANTLR end "rule__GameOfLife__Group__4__Impl"


    // $ANTLR start "rule__Point__Group__0"
    // InternalGameOfLifeDSL.g:362:1: rule__Point__Group__0 : rule__Point__Group__0__Impl rule__Point__Group__1 ;
    public final void rule__Point__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:366:1: ( rule__Point__Group__0__Impl rule__Point__Group__1 )
            // InternalGameOfLifeDSL.g:367:2: rule__Point__Group__0__Impl rule__Point__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Point__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Point__Group__1();

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
    // $ANTLR end "rule__Point__Group__0"


    // $ANTLR start "rule__Point__Group__0__Impl"
    // InternalGameOfLifeDSL.g:374:1: rule__Point__Group__0__Impl : ( '(' ) ;
    public final void rule__Point__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:378:1: ( ( '(' ) )
            // InternalGameOfLifeDSL.g:379:1: ( '(' )
            {
            // InternalGameOfLifeDSL.g:379:1: ( '(' )
            // InternalGameOfLifeDSL.g:380:2: '('
            {
             before(grammarAccess.getPointAccess().getLeftParenthesisKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPointAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__Point__Group__0__Impl"


    // $ANTLR start "rule__Point__Group__1"
    // InternalGameOfLifeDSL.g:389:1: rule__Point__Group__1 : rule__Point__Group__1__Impl rule__Point__Group__2 ;
    public final void rule__Point__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:393:1: ( rule__Point__Group__1__Impl rule__Point__Group__2 )
            // InternalGameOfLifeDSL.g:394:2: rule__Point__Group__1__Impl rule__Point__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Point__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Point__Group__2();

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
    // $ANTLR end "rule__Point__Group__1"


    // $ANTLR start "rule__Point__Group__1__Impl"
    // InternalGameOfLifeDSL.g:401:1: rule__Point__Group__1__Impl : ( ( rule__Point__XAssignment_1 ) ) ;
    public final void rule__Point__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:405:1: ( ( ( rule__Point__XAssignment_1 ) ) )
            // InternalGameOfLifeDSL.g:406:1: ( ( rule__Point__XAssignment_1 ) )
            {
            // InternalGameOfLifeDSL.g:406:1: ( ( rule__Point__XAssignment_1 ) )
            // InternalGameOfLifeDSL.g:407:2: ( rule__Point__XAssignment_1 )
            {
             before(grammarAccess.getPointAccess().getXAssignment_1()); 
            // InternalGameOfLifeDSL.g:408:2: ( rule__Point__XAssignment_1 )
            // InternalGameOfLifeDSL.g:408:3: rule__Point__XAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Point__XAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPointAccess().getXAssignment_1()); 

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
    // $ANTLR end "rule__Point__Group__1__Impl"


    // $ANTLR start "rule__Point__Group__2"
    // InternalGameOfLifeDSL.g:416:1: rule__Point__Group__2 : rule__Point__Group__2__Impl rule__Point__Group__3 ;
    public final void rule__Point__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:420:1: ( rule__Point__Group__2__Impl rule__Point__Group__3 )
            // InternalGameOfLifeDSL.g:421:2: rule__Point__Group__2__Impl rule__Point__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Point__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Point__Group__3();

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
    // $ANTLR end "rule__Point__Group__2"


    // $ANTLR start "rule__Point__Group__2__Impl"
    // InternalGameOfLifeDSL.g:428:1: rule__Point__Group__2__Impl : ( ',' ) ;
    public final void rule__Point__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:432:1: ( ( ',' ) )
            // InternalGameOfLifeDSL.g:433:1: ( ',' )
            {
            // InternalGameOfLifeDSL.g:433:1: ( ',' )
            // InternalGameOfLifeDSL.g:434:2: ','
            {
             before(grammarAccess.getPointAccess().getCommaKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPointAccess().getCommaKeyword_2()); 

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
    // $ANTLR end "rule__Point__Group__2__Impl"


    // $ANTLR start "rule__Point__Group__3"
    // InternalGameOfLifeDSL.g:443:1: rule__Point__Group__3 : rule__Point__Group__3__Impl rule__Point__Group__4 ;
    public final void rule__Point__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:447:1: ( rule__Point__Group__3__Impl rule__Point__Group__4 )
            // InternalGameOfLifeDSL.g:448:2: rule__Point__Group__3__Impl rule__Point__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Point__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Point__Group__4();

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
    // $ANTLR end "rule__Point__Group__3"


    // $ANTLR start "rule__Point__Group__3__Impl"
    // InternalGameOfLifeDSL.g:455:1: rule__Point__Group__3__Impl : ( ( rule__Point__YAssignment_3 ) ) ;
    public final void rule__Point__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:459:1: ( ( ( rule__Point__YAssignment_3 ) ) )
            // InternalGameOfLifeDSL.g:460:1: ( ( rule__Point__YAssignment_3 ) )
            {
            // InternalGameOfLifeDSL.g:460:1: ( ( rule__Point__YAssignment_3 ) )
            // InternalGameOfLifeDSL.g:461:2: ( rule__Point__YAssignment_3 )
            {
             before(grammarAccess.getPointAccess().getYAssignment_3()); 
            // InternalGameOfLifeDSL.g:462:2: ( rule__Point__YAssignment_3 )
            // InternalGameOfLifeDSL.g:462:3: rule__Point__YAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Point__YAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPointAccess().getYAssignment_3()); 

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
    // $ANTLR end "rule__Point__Group__3__Impl"


    // $ANTLR start "rule__Point__Group__4"
    // InternalGameOfLifeDSL.g:470:1: rule__Point__Group__4 : rule__Point__Group__4__Impl ;
    public final void rule__Point__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:474:1: ( rule__Point__Group__4__Impl )
            // InternalGameOfLifeDSL.g:475:2: rule__Point__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Point__Group__4__Impl();

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
    // $ANTLR end "rule__Point__Group__4"


    // $ANTLR start "rule__Point__Group__4__Impl"
    // InternalGameOfLifeDSL.g:481:1: rule__Point__Group__4__Impl : ( ')' ) ;
    public final void rule__Point__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:485:1: ( ( ')' ) )
            // InternalGameOfLifeDSL.g:486:1: ( ')' )
            {
            // InternalGameOfLifeDSL.g:486:1: ( ')' )
            // InternalGameOfLifeDSL.g:487:2: ')'
            {
             before(grammarAccess.getPointAccess().getRightParenthesisKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPointAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__Point__Group__4__Impl"


    // $ANTLR start "rule__EvolutionRule__Group__0"
    // InternalGameOfLifeDSL.g:497:1: rule__EvolutionRule__Group__0 : rule__EvolutionRule__Group__0__Impl rule__EvolutionRule__Group__1 ;
    public final void rule__EvolutionRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:501:1: ( rule__EvolutionRule__Group__0__Impl rule__EvolutionRule__Group__1 )
            // InternalGameOfLifeDSL.g:502:2: rule__EvolutionRule__Group__0__Impl rule__EvolutionRule__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__EvolutionRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvolutionRule__Group__1();

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
    // $ANTLR end "rule__EvolutionRule__Group__0"


    // $ANTLR start "rule__EvolutionRule__Group__0__Impl"
    // InternalGameOfLifeDSL.g:509:1: rule__EvolutionRule__Group__0__Impl : ( 'EvolutionRule' ) ;
    public final void rule__EvolutionRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:513:1: ( ( 'EvolutionRule' ) )
            // InternalGameOfLifeDSL.g:514:1: ( 'EvolutionRule' )
            {
            // InternalGameOfLifeDSL.g:514:1: ( 'EvolutionRule' )
            // InternalGameOfLifeDSL.g:515:2: 'EvolutionRule'
            {
             before(grammarAccess.getEvolutionRuleAccess().getEvolutionRuleKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getEvolutionRuleAccess().getEvolutionRuleKeyword_0()); 

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
    // $ANTLR end "rule__EvolutionRule__Group__0__Impl"


    // $ANTLR start "rule__EvolutionRule__Group__1"
    // InternalGameOfLifeDSL.g:524:1: rule__EvolutionRule__Group__1 : rule__EvolutionRule__Group__1__Impl rule__EvolutionRule__Group__2 ;
    public final void rule__EvolutionRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:528:1: ( rule__EvolutionRule__Group__1__Impl rule__EvolutionRule__Group__2 )
            // InternalGameOfLifeDSL.g:529:2: rule__EvolutionRule__Group__1__Impl rule__EvolutionRule__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__EvolutionRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvolutionRule__Group__2();

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
    // $ANTLR end "rule__EvolutionRule__Group__1"


    // $ANTLR start "rule__EvolutionRule__Group__1__Impl"
    // InternalGameOfLifeDSL.g:536:1: rule__EvolutionRule__Group__1__Impl : ( '(' ) ;
    public final void rule__EvolutionRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:540:1: ( ( '(' ) )
            // InternalGameOfLifeDSL.g:541:1: ( '(' )
            {
            // InternalGameOfLifeDSL.g:541:1: ( '(' )
            // InternalGameOfLifeDSL.g:542:2: '('
            {
             before(grammarAccess.getEvolutionRuleAccess().getLeftParenthesisKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getEvolutionRuleAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__EvolutionRule__Group__1__Impl"


    // $ANTLR start "rule__EvolutionRule__Group__2"
    // InternalGameOfLifeDSL.g:551:1: rule__EvolutionRule__Group__2 : rule__EvolutionRule__Group__2__Impl rule__EvolutionRule__Group__3 ;
    public final void rule__EvolutionRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:555:1: ( rule__EvolutionRule__Group__2__Impl rule__EvolutionRule__Group__3 )
            // InternalGameOfLifeDSL.g:556:2: rule__EvolutionRule__Group__2__Impl rule__EvolutionRule__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__EvolutionRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvolutionRule__Group__3();

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
    // $ANTLR end "rule__EvolutionRule__Group__2"


    // $ANTLR start "rule__EvolutionRule__Group__2__Impl"
    // InternalGameOfLifeDSL.g:563:1: rule__EvolutionRule__Group__2__Impl : ( 'surrounding' ) ;
    public final void rule__EvolutionRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:567:1: ( ( 'surrounding' ) )
            // InternalGameOfLifeDSL.g:568:1: ( 'surrounding' )
            {
            // InternalGameOfLifeDSL.g:568:1: ( 'surrounding' )
            // InternalGameOfLifeDSL.g:569:2: 'surrounding'
            {
             before(grammarAccess.getEvolutionRuleAccess().getSurroundingKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getEvolutionRuleAccess().getSurroundingKeyword_2()); 

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
    // $ANTLR end "rule__EvolutionRule__Group__2__Impl"


    // $ANTLR start "rule__EvolutionRule__Group__3"
    // InternalGameOfLifeDSL.g:578:1: rule__EvolutionRule__Group__3 : rule__EvolutionRule__Group__3__Impl rule__EvolutionRule__Group__4 ;
    public final void rule__EvolutionRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:582:1: ( rule__EvolutionRule__Group__3__Impl rule__EvolutionRule__Group__4 )
            // InternalGameOfLifeDSL.g:583:2: rule__EvolutionRule__Group__3__Impl rule__EvolutionRule__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__EvolutionRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvolutionRule__Group__4();

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
    // $ANTLR end "rule__EvolutionRule__Group__3"


    // $ANTLR start "rule__EvolutionRule__Group__3__Impl"
    // InternalGameOfLifeDSL.g:590:1: rule__EvolutionRule__Group__3__Impl : ( ( rule__EvolutionRule__ConditionElementAssignment_3 ) ) ;
    public final void rule__EvolutionRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:594:1: ( ( ( rule__EvolutionRule__ConditionElementAssignment_3 ) ) )
            // InternalGameOfLifeDSL.g:595:1: ( ( rule__EvolutionRule__ConditionElementAssignment_3 ) )
            {
            // InternalGameOfLifeDSL.g:595:1: ( ( rule__EvolutionRule__ConditionElementAssignment_3 ) )
            // InternalGameOfLifeDSL.g:596:2: ( rule__EvolutionRule__ConditionElementAssignment_3 )
            {
             before(grammarAccess.getEvolutionRuleAccess().getConditionElementAssignment_3()); 
            // InternalGameOfLifeDSL.g:597:2: ( rule__EvolutionRule__ConditionElementAssignment_3 )
            // InternalGameOfLifeDSL.g:597:3: rule__EvolutionRule__ConditionElementAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__EvolutionRule__ConditionElementAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEvolutionRuleAccess().getConditionElementAssignment_3()); 

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
    // $ANTLR end "rule__EvolutionRule__Group__3__Impl"


    // $ANTLR start "rule__EvolutionRule__Group__4"
    // InternalGameOfLifeDSL.g:605:1: rule__EvolutionRule__Group__4 : rule__EvolutionRule__Group__4__Impl rule__EvolutionRule__Group__5 ;
    public final void rule__EvolutionRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:609:1: ( rule__EvolutionRule__Group__4__Impl rule__EvolutionRule__Group__5 )
            // InternalGameOfLifeDSL.g:610:2: rule__EvolutionRule__Group__4__Impl rule__EvolutionRule__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__EvolutionRule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvolutionRule__Group__5();

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
    // $ANTLR end "rule__EvolutionRule__Group__4"


    // $ANTLR start "rule__EvolutionRule__Group__4__Impl"
    // InternalGameOfLifeDSL.g:617:1: rule__EvolutionRule__Group__4__Impl : ( ( rule__EvolutionRule__AmountAssignment_4 ) ) ;
    public final void rule__EvolutionRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:621:1: ( ( ( rule__EvolutionRule__AmountAssignment_4 ) ) )
            // InternalGameOfLifeDSL.g:622:1: ( ( rule__EvolutionRule__AmountAssignment_4 ) )
            {
            // InternalGameOfLifeDSL.g:622:1: ( ( rule__EvolutionRule__AmountAssignment_4 ) )
            // InternalGameOfLifeDSL.g:623:2: ( rule__EvolutionRule__AmountAssignment_4 )
            {
             before(grammarAccess.getEvolutionRuleAccess().getAmountAssignment_4()); 
            // InternalGameOfLifeDSL.g:624:2: ( rule__EvolutionRule__AmountAssignment_4 )
            // InternalGameOfLifeDSL.g:624:3: rule__EvolutionRule__AmountAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__EvolutionRule__AmountAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEvolutionRuleAccess().getAmountAssignment_4()); 

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
    // $ANTLR end "rule__EvolutionRule__Group__4__Impl"


    // $ANTLR start "rule__EvolutionRule__Group__5"
    // InternalGameOfLifeDSL.g:632:1: rule__EvolutionRule__Group__5 : rule__EvolutionRule__Group__5__Impl rule__EvolutionRule__Group__6 ;
    public final void rule__EvolutionRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:636:1: ( rule__EvolutionRule__Group__5__Impl rule__EvolutionRule__Group__6 )
            // InternalGameOfLifeDSL.g:637:2: rule__EvolutionRule__Group__5__Impl rule__EvolutionRule__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__EvolutionRule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvolutionRule__Group__6();

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
    // $ANTLR end "rule__EvolutionRule__Group__5"


    // $ANTLR start "rule__EvolutionRule__Group__5__Impl"
    // InternalGameOfLifeDSL.g:644:1: rule__EvolutionRule__Group__5__Impl : ( ':' ) ;
    public final void rule__EvolutionRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:648:1: ( ( ':' ) )
            // InternalGameOfLifeDSL.g:649:1: ( ':' )
            {
            // InternalGameOfLifeDSL.g:649:1: ( ':' )
            // InternalGameOfLifeDSL.g:650:2: ':'
            {
             before(grammarAccess.getEvolutionRuleAccess().getColonKeyword_5()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getEvolutionRuleAccess().getColonKeyword_5()); 

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
    // $ANTLR end "rule__EvolutionRule__Group__5__Impl"


    // $ANTLR start "rule__EvolutionRule__Group__6"
    // InternalGameOfLifeDSL.g:659:1: rule__EvolutionRule__Group__6 : rule__EvolutionRule__Group__6__Impl rule__EvolutionRule__Group__7 ;
    public final void rule__EvolutionRule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:663:1: ( rule__EvolutionRule__Group__6__Impl rule__EvolutionRule__Group__7 )
            // InternalGameOfLifeDSL.g:664:2: rule__EvolutionRule__Group__6__Impl rule__EvolutionRule__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__EvolutionRule__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvolutionRule__Group__7();

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
    // $ANTLR end "rule__EvolutionRule__Group__6"


    // $ANTLR start "rule__EvolutionRule__Group__6__Impl"
    // InternalGameOfLifeDSL.g:671:1: rule__EvolutionRule__Group__6__Impl : ( ( rule__EvolutionRule__ActionAssignment_6 ) ) ;
    public final void rule__EvolutionRule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:675:1: ( ( ( rule__EvolutionRule__ActionAssignment_6 ) ) )
            // InternalGameOfLifeDSL.g:676:1: ( ( rule__EvolutionRule__ActionAssignment_6 ) )
            {
            // InternalGameOfLifeDSL.g:676:1: ( ( rule__EvolutionRule__ActionAssignment_6 ) )
            // InternalGameOfLifeDSL.g:677:2: ( rule__EvolutionRule__ActionAssignment_6 )
            {
             before(grammarAccess.getEvolutionRuleAccess().getActionAssignment_6()); 
            // InternalGameOfLifeDSL.g:678:2: ( rule__EvolutionRule__ActionAssignment_6 )
            // InternalGameOfLifeDSL.g:678:3: rule__EvolutionRule__ActionAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__EvolutionRule__ActionAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getEvolutionRuleAccess().getActionAssignment_6()); 

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
    // $ANTLR end "rule__EvolutionRule__Group__6__Impl"


    // $ANTLR start "rule__EvolutionRule__Group__7"
    // InternalGameOfLifeDSL.g:686:1: rule__EvolutionRule__Group__7 : rule__EvolutionRule__Group__7__Impl ;
    public final void rule__EvolutionRule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:690:1: ( rule__EvolutionRule__Group__7__Impl )
            // InternalGameOfLifeDSL.g:691:2: rule__EvolutionRule__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvolutionRule__Group__7__Impl();

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
    // $ANTLR end "rule__EvolutionRule__Group__7"


    // $ANTLR start "rule__EvolutionRule__Group__7__Impl"
    // InternalGameOfLifeDSL.g:697:1: rule__EvolutionRule__Group__7__Impl : ( ')' ) ;
    public final void rule__EvolutionRule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:701:1: ( ( ')' ) )
            // InternalGameOfLifeDSL.g:702:1: ( ')' )
            {
            // InternalGameOfLifeDSL.g:702:1: ( ')' )
            // InternalGameOfLifeDSL.g:703:2: ')'
            {
             before(grammarAccess.getEvolutionRuleAccess().getRightParenthesisKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEvolutionRuleAccess().getRightParenthesisKeyword_7()); 

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
    // $ANTLR end "rule__EvolutionRule__Group__7__Impl"


    // $ANTLR start "rule__GameOfLife__AliveCellsAssignment_2"
    // InternalGameOfLifeDSL.g:713:1: rule__GameOfLife__AliveCellsAssignment_2 : ( rulePoint ) ;
    public final void rule__GameOfLife__AliveCellsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:717:1: ( ( rulePoint ) )
            // InternalGameOfLifeDSL.g:718:2: ( rulePoint )
            {
            // InternalGameOfLifeDSL.g:718:2: ( rulePoint )
            // InternalGameOfLifeDSL.g:719:3: rulePoint
            {
             before(grammarAccess.getGameOfLifeAccess().getAliveCellsPointParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getGameOfLifeAccess().getAliveCellsPointParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__GameOfLife__AliveCellsAssignment_2"


    // $ANTLR start "rule__GameOfLife__EvolutionRulesAssignment_4"
    // InternalGameOfLifeDSL.g:728:1: rule__GameOfLife__EvolutionRulesAssignment_4 : ( ruleEvolutionRule ) ;
    public final void rule__GameOfLife__EvolutionRulesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:732:1: ( ( ruleEvolutionRule ) )
            // InternalGameOfLifeDSL.g:733:2: ( ruleEvolutionRule )
            {
            // InternalGameOfLifeDSL.g:733:2: ( ruleEvolutionRule )
            // InternalGameOfLifeDSL.g:734:3: ruleEvolutionRule
            {
             before(grammarAccess.getGameOfLifeAccess().getEvolutionRulesEvolutionRuleParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEvolutionRule();

            state._fsp--;

             after(grammarAccess.getGameOfLifeAccess().getEvolutionRulesEvolutionRuleParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__GameOfLife__EvolutionRulesAssignment_4"


    // $ANTLR start "rule__Point__XAssignment_1"
    // InternalGameOfLifeDSL.g:743:1: rule__Point__XAssignment_1 : ( RULE_INT ) ;
    public final void rule__Point__XAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:747:1: ( ( RULE_INT ) )
            // InternalGameOfLifeDSL.g:748:2: ( RULE_INT )
            {
            // InternalGameOfLifeDSL.g:748:2: ( RULE_INT )
            // InternalGameOfLifeDSL.g:749:3: RULE_INT
            {
             before(grammarAccess.getPointAccess().getXINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPointAccess().getXINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Point__XAssignment_1"


    // $ANTLR start "rule__Point__YAssignment_3"
    // InternalGameOfLifeDSL.g:758:1: rule__Point__YAssignment_3 : ( RULE_INT ) ;
    public final void rule__Point__YAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:762:1: ( ( RULE_INT ) )
            // InternalGameOfLifeDSL.g:763:2: ( RULE_INT )
            {
            // InternalGameOfLifeDSL.g:763:2: ( RULE_INT )
            // InternalGameOfLifeDSL.g:764:3: RULE_INT
            {
             before(grammarAccess.getPointAccess().getYINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPointAccess().getYINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Point__YAssignment_3"


    // $ANTLR start "rule__EvolutionRule__ConditionElementAssignment_3"
    // InternalGameOfLifeDSL.g:773:1: rule__EvolutionRule__ConditionElementAssignment_3 : ( ruleConditionElement ) ;
    public final void rule__EvolutionRule__ConditionElementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:777:1: ( ( ruleConditionElement ) )
            // InternalGameOfLifeDSL.g:778:2: ( ruleConditionElement )
            {
            // InternalGameOfLifeDSL.g:778:2: ( ruleConditionElement )
            // InternalGameOfLifeDSL.g:779:3: ruleConditionElement
            {
             before(grammarAccess.getEvolutionRuleAccess().getConditionElementConditionElementEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionElement();

            state._fsp--;

             after(grammarAccess.getEvolutionRuleAccess().getConditionElementConditionElementEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__EvolutionRule__ConditionElementAssignment_3"


    // $ANTLR start "rule__EvolutionRule__AmountAssignment_4"
    // InternalGameOfLifeDSL.g:788:1: rule__EvolutionRule__AmountAssignment_4 : ( RULE_INT ) ;
    public final void rule__EvolutionRule__AmountAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:792:1: ( ( RULE_INT ) )
            // InternalGameOfLifeDSL.g:793:2: ( RULE_INT )
            {
            // InternalGameOfLifeDSL.g:793:2: ( RULE_INT )
            // InternalGameOfLifeDSL.g:794:3: RULE_INT
            {
             before(grammarAccess.getEvolutionRuleAccess().getAmountINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEvolutionRuleAccess().getAmountINTTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__EvolutionRule__AmountAssignment_4"


    // $ANTLR start "rule__EvolutionRule__ActionAssignment_6"
    // InternalGameOfLifeDSL.g:803:1: rule__EvolutionRule__ActionAssignment_6 : ( ruleAction ) ;
    public final void rule__EvolutionRule__ActionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:807:1: ( ( ruleAction ) )
            // InternalGameOfLifeDSL.g:808:2: ( ruleAction )
            {
            // InternalGameOfLifeDSL.g:808:2: ( ruleAction )
            // InternalGameOfLifeDSL.g:809:3: ruleAction
            {
             before(grammarAccess.getEvolutionRuleAccess().getActionActionEnumRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getEvolutionRuleAccess().getActionActionEnumRuleCall_6_0()); 

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
    // $ANTLR end "rule__EvolutionRule__ActionAssignment_6"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000001C000L});

}