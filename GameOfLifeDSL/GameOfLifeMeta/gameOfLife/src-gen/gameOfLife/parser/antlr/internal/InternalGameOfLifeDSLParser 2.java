package gameOfLife.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import gameOfLife.services.GameOfLifeDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGameOfLifeDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'GameOfLife:'", "'aliveCells:'", "'evolutionRules:'", "'('", "','", "')'", "'EvolutionRule'", "'surrounding'", "':'", "'<'", "'>'", "'=='", "'die'", "'live'", "'becomeAlive'"
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

        public InternalGameOfLifeDSLParser(TokenStream input, GameOfLifeDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "GameOfLife";
       	}

       	@Override
       	protected GameOfLifeDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGameOfLife"
    // InternalGameOfLifeDSL.g:65:1: entryRuleGameOfLife returns [EObject current=null] : iv_ruleGameOfLife= ruleGameOfLife EOF ;
    public final EObject entryRuleGameOfLife() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGameOfLife = null;


        try {
            // InternalGameOfLifeDSL.g:65:51: (iv_ruleGameOfLife= ruleGameOfLife EOF )
            // InternalGameOfLifeDSL.g:66:2: iv_ruleGameOfLife= ruleGameOfLife EOF
            {
             newCompositeNode(grammarAccess.getGameOfLifeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGameOfLife=ruleGameOfLife();

            state._fsp--;

             current =iv_ruleGameOfLife; 
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
    // $ANTLR end "entryRuleGameOfLife"


    // $ANTLR start "ruleGameOfLife"
    // InternalGameOfLifeDSL.g:72:1: ruleGameOfLife returns [EObject current=null] : (otherlv_0= 'GameOfLife:' otherlv_1= 'aliveCells:' ( (lv_aliveCells_2_0= rulePoint ) )+ otherlv_3= 'evolutionRules:' ( (lv_evolutionRules_4_0= ruleEvolutionRule ) )+ ) ;
    public final EObject ruleGameOfLife() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_aliveCells_2_0 = null;

        EObject lv_evolutionRules_4_0 = null;



        	enterRule();

        try {
            // InternalGameOfLifeDSL.g:78:2: ( (otherlv_0= 'GameOfLife:' otherlv_1= 'aliveCells:' ( (lv_aliveCells_2_0= rulePoint ) )+ otherlv_3= 'evolutionRules:' ( (lv_evolutionRules_4_0= ruleEvolutionRule ) )+ ) )
            // InternalGameOfLifeDSL.g:79:2: (otherlv_0= 'GameOfLife:' otherlv_1= 'aliveCells:' ( (lv_aliveCells_2_0= rulePoint ) )+ otherlv_3= 'evolutionRules:' ( (lv_evolutionRules_4_0= ruleEvolutionRule ) )+ )
            {
            // InternalGameOfLifeDSL.g:79:2: (otherlv_0= 'GameOfLife:' otherlv_1= 'aliveCells:' ( (lv_aliveCells_2_0= rulePoint ) )+ otherlv_3= 'evolutionRules:' ( (lv_evolutionRules_4_0= ruleEvolutionRule ) )+ )
            // InternalGameOfLifeDSL.g:80:3: otherlv_0= 'GameOfLife:' otherlv_1= 'aliveCells:' ( (lv_aliveCells_2_0= rulePoint ) )+ otherlv_3= 'evolutionRules:' ( (lv_evolutionRules_4_0= ruleEvolutionRule ) )+
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGameOfLifeAccess().getGameOfLifeKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getGameOfLifeAccess().getAliveCellsKeyword_1());
            		
            // InternalGameOfLifeDSL.g:88:3: ( (lv_aliveCells_2_0= rulePoint ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGameOfLifeDSL.g:89:4: (lv_aliveCells_2_0= rulePoint )
            	    {
            	    // InternalGameOfLifeDSL.g:89:4: (lv_aliveCells_2_0= rulePoint )
            	    // InternalGameOfLifeDSL.g:90:5: lv_aliveCells_2_0= rulePoint
            	    {

            	    					newCompositeNode(grammarAccess.getGameOfLifeAccess().getAliveCellsPointParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_aliveCells_2_0=rulePoint();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGameOfLifeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"aliveCells",
            	    						lv_aliveCells_2_0,
            	    						"gameOfLife.GameOfLifeDSL.Point");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getGameOfLifeAccess().getEvolutionRulesKeyword_3());
            		
            // InternalGameOfLifeDSL.g:111:3: ( (lv_evolutionRules_4_0= ruleEvolutionRule ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGameOfLifeDSL.g:112:4: (lv_evolutionRules_4_0= ruleEvolutionRule )
            	    {
            	    // InternalGameOfLifeDSL.g:112:4: (lv_evolutionRules_4_0= ruleEvolutionRule )
            	    // InternalGameOfLifeDSL.g:113:5: lv_evolutionRules_4_0= ruleEvolutionRule
            	    {

            	    					newCompositeNode(grammarAccess.getGameOfLifeAccess().getEvolutionRulesEvolutionRuleParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_evolutionRules_4_0=ruleEvolutionRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGameOfLifeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"evolutionRules",
            	    						lv_evolutionRules_4_0,
            	    						"gameOfLife.GameOfLifeDSL.EvolutionRule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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
    // $ANTLR end "ruleGameOfLife"


    // $ANTLR start "entryRulePoint"
    // InternalGameOfLifeDSL.g:134:1: entryRulePoint returns [EObject current=null] : iv_rulePoint= rulePoint EOF ;
    public final EObject entryRulePoint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoint = null;


        try {
            // InternalGameOfLifeDSL.g:134:46: (iv_rulePoint= rulePoint EOF )
            // InternalGameOfLifeDSL.g:135:2: iv_rulePoint= rulePoint EOF
            {
             newCompositeNode(grammarAccess.getPointRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePoint=rulePoint();

            state._fsp--;

             current =iv_rulePoint; 
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
    // $ANTLR end "entryRulePoint"


    // $ANTLR start "rulePoint"
    // InternalGameOfLifeDSL.g:141:1: rulePoint returns [EObject current=null] : (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')' ) ;
    public final EObject rulePoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_x_1_0=null;
        Token otherlv_2=null;
        Token lv_y_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalGameOfLifeDSL.g:147:2: ( (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')' ) )
            // InternalGameOfLifeDSL.g:148:2: (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')' )
            {
            // InternalGameOfLifeDSL.g:148:2: (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')' )
            // InternalGameOfLifeDSL.g:149:3: otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getPointAccess().getLeftParenthesisKeyword_0());
            		
            // InternalGameOfLifeDSL.g:153:3: ( (lv_x_1_0= RULE_INT ) )
            // InternalGameOfLifeDSL.g:154:4: (lv_x_1_0= RULE_INT )
            {
            // InternalGameOfLifeDSL.g:154:4: (lv_x_1_0= RULE_INT )
            // InternalGameOfLifeDSL.g:155:5: lv_x_1_0= RULE_INT
            {
            lv_x_1_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            					newLeafNode(lv_x_1_0, grammarAccess.getPointAccess().getXINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPointRule());
            					}
            					setWithLastConsumed(
            						current,
            						"x",
            						lv_x_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getPointAccess().getCommaKeyword_2());
            		
            // InternalGameOfLifeDSL.g:175:3: ( (lv_y_3_0= RULE_INT ) )
            // InternalGameOfLifeDSL.g:176:4: (lv_y_3_0= RULE_INT )
            {
            // InternalGameOfLifeDSL.g:176:4: (lv_y_3_0= RULE_INT )
            // InternalGameOfLifeDSL.g:177:5: lv_y_3_0= RULE_INT
            {
            lv_y_3_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_y_3_0, grammarAccess.getPointAccess().getYINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPointRule());
            					}
            					setWithLastConsumed(
            						current,
            						"y",
            						lv_y_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPointAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "rulePoint"


    // $ANTLR start "entryRuleEvolutionRule"
    // InternalGameOfLifeDSL.g:201:1: entryRuleEvolutionRule returns [EObject current=null] : iv_ruleEvolutionRule= ruleEvolutionRule EOF ;
    public final EObject entryRuleEvolutionRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvolutionRule = null;


        try {
            // InternalGameOfLifeDSL.g:201:54: (iv_ruleEvolutionRule= ruleEvolutionRule EOF )
            // InternalGameOfLifeDSL.g:202:2: iv_ruleEvolutionRule= ruleEvolutionRule EOF
            {
             newCompositeNode(grammarAccess.getEvolutionRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvolutionRule=ruleEvolutionRule();

            state._fsp--;

             current =iv_ruleEvolutionRule; 
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
    // $ANTLR end "entryRuleEvolutionRule"


    // $ANTLR start "ruleEvolutionRule"
    // InternalGameOfLifeDSL.g:208:1: ruleEvolutionRule returns [EObject current=null] : (otherlv_0= 'EvolutionRule' otherlv_1= '(' otherlv_2= 'surrounding' ( (lv_conditionElement_3_0= ruleConditionElement ) ) ( (lv_amount_4_0= RULE_INT ) ) otherlv_5= ':' ( (lv_action_6_0= ruleAction ) ) otherlv_7= ')' ) ;
    public final EObject ruleEvolutionRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_amount_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_conditionElement_3_0 = null;

        Enumerator lv_action_6_0 = null;



        	enterRule();

        try {
            // InternalGameOfLifeDSL.g:214:2: ( (otherlv_0= 'EvolutionRule' otherlv_1= '(' otherlv_2= 'surrounding' ( (lv_conditionElement_3_0= ruleConditionElement ) ) ( (lv_amount_4_0= RULE_INT ) ) otherlv_5= ':' ( (lv_action_6_0= ruleAction ) ) otherlv_7= ')' ) )
            // InternalGameOfLifeDSL.g:215:2: (otherlv_0= 'EvolutionRule' otherlv_1= '(' otherlv_2= 'surrounding' ( (lv_conditionElement_3_0= ruleConditionElement ) ) ( (lv_amount_4_0= RULE_INT ) ) otherlv_5= ':' ( (lv_action_6_0= ruleAction ) ) otherlv_7= ')' )
            {
            // InternalGameOfLifeDSL.g:215:2: (otherlv_0= 'EvolutionRule' otherlv_1= '(' otherlv_2= 'surrounding' ( (lv_conditionElement_3_0= ruleConditionElement ) ) ( (lv_amount_4_0= RULE_INT ) ) otherlv_5= ':' ( (lv_action_6_0= ruleAction ) ) otherlv_7= ')' )
            // InternalGameOfLifeDSL.g:216:3: otherlv_0= 'EvolutionRule' otherlv_1= '(' otherlv_2= 'surrounding' ( (lv_conditionElement_3_0= ruleConditionElement ) ) ( (lv_amount_4_0= RULE_INT ) ) otherlv_5= ':' ( (lv_action_6_0= ruleAction ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEvolutionRuleAccess().getEvolutionRuleKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getEvolutionRuleAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getEvolutionRuleAccess().getSurroundingKeyword_2());
            		
            // InternalGameOfLifeDSL.g:228:3: ( (lv_conditionElement_3_0= ruleConditionElement ) )
            // InternalGameOfLifeDSL.g:229:4: (lv_conditionElement_3_0= ruleConditionElement )
            {
            // InternalGameOfLifeDSL.g:229:4: (lv_conditionElement_3_0= ruleConditionElement )
            // InternalGameOfLifeDSL.g:230:5: lv_conditionElement_3_0= ruleConditionElement
            {

            					newCompositeNode(grammarAccess.getEvolutionRuleAccess().getConditionElementConditionElementEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_conditionElement_3_0=ruleConditionElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvolutionRuleRule());
            					}
            					set(
            						current,
            						"conditionElement",
            						lv_conditionElement_3_0,
            						"gameOfLife.GameOfLifeDSL.ConditionElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGameOfLifeDSL.g:247:3: ( (lv_amount_4_0= RULE_INT ) )
            // InternalGameOfLifeDSL.g:248:4: (lv_amount_4_0= RULE_INT )
            {
            // InternalGameOfLifeDSL.g:248:4: (lv_amount_4_0= RULE_INT )
            // InternalGameOfLifeDSL.g:249:5: lv_amount_4_0= RULE_INT
            {
            lv_amount_4_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            					newLeafNode(lv_amount_4_0, grammarAccess.getEvolutionRuleAccess().getAmountINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvolutionRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"amount",
            						lv_amount_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getEvolutionRuleAccess().getColonKeyword_5());
            		
            // InternalGameOfLifeDSL.g:269:3: ( (lv_action_6_0= ruleAction ) )
            // InternalGameOfLifeDSL.g:270:4: (lv_action_6_0= ruleAction )
            {
            // InternalGameOfLifeDSL.g:270:4: (lv_action_6_0= ruleAction )
            // InternalGameOfLifeDSL.g:271:5: lv_action_6_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getEvolutionRuleAccess().getActionActionEnumRuleCall_6_0());
            				
            pushFollow(FOLLOW_10);
            lv_action_6_0=ruleAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvolutionRuleRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_6_0,
            						"gameOfLife.GameOfLifeDSL.Action");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getEvolutionRuleAccess().getRightParenthesisKeyword_7());
            		

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
    // $ANTLR end "ruleEvolutionRule"


    // $ANTLR start "ruleConditionElement"
    // InternalGameOfLifeDSL.g:296:1: ruleConditionElement returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '==' ) ) ;
    public final Enumerator ruleConditionElement() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalGameOfLifeDSL.g:302:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '==' ) ) )
            // InternalGameOfLifeDSL.g:303:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '==' ) )
            {
            // InternalGameOfLifeDSL.g:303:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '==' ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt3=1;
                }
                break;
            case 21:
                {
                alt3=2;
                }
                break;
            case 22:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalGameOfLifeDSL.g:304:3: (enumLiteral_0= '<' )
                    {
                    // InternalGameOfLifeDSL.g:304:3: (enumLiteral_0= '<' )
                    // InternalGameOfLifeDSL.g:305:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getConditionElementAccess().getLOWEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getConditionElementAccess().getLOWEREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGameOfLifeDSL.g:312:3: (enumLiteral_1= '>' )
                    {
                    // InternalGameOfLifeDSL.g:312:3: (enumLiteral_1= '>' )
                    // InternalGameOfLifeDSL.g:313:4: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getConditionElementAccess().getGREATEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getConditionElementAccess().getGREATEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGameOfLifeDSL.g:320:3: (enumLiteral_2= '==' )
                    {
                    // InternalGameOfLifeDSL.g:320:3: (enumLiteral_2= '==' )
                    // InternalGameOfLifeDSL.g:321:4: enumLiteral_2= '=='
                    {
                    enumLiteral_2=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getConditionElementAccess().getEQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getConditionElementAccess().getEQUALEnumLiteralDeclaration_2());
                    			

                    }


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
    // $ANTLR end "ruleConditionElement"


    // $ANTLR start "ruleAction"
    // InternalGameOfLifeDSL.g:331:1: ruleAction returns [Enumerator current=null] : ( (enumLiteral_0= 'die' ) | (enumLiteral_1= 'live' ) | (enumLiteral_2= 'becomeAlive' ) ) ;
    public final Enumerator ruleAction() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalGameOfLifeDSL.g:337:2: ( ( (enumLiteral_0= 'die' ) | (enumLiteral_1= 'live' ) | (enumLiteral_2= 'becomeAlive' ) ) )
            // InternalGameOfLifeDSL.g:338:2: ( (enumLiteral_0= 'die' ) | (enumLiteral_1= 'live' ) | (enumLiteral_2= 'becomeAlive' ) )
            {
            // InternalGameOfLifeDSL.g:338:2: ( (enumLiteral_0= 'die' ) | (enumLiteral_1= 'live' ) | (enumLiteral_2= 'becomeAlive' ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt4=1;
                }
                break;
            case 24:
                {
                alt4=2;
                }
                break;
            case 25:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalGameOfLifeDSL.g:339:3: (enumLiteral_0= 'die' )
                    {
                    // InternalGameOfLifeDSL.g:339:3: (enumLiteral_0= 'die' )
                    // InternalGameOfLifeDSL.g:340:4: enumLiteral_0= 'die'
                    {
                    enumLiteral_0=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getActionAccess().getDIEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getActionAccess().getDIEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGameOfLifeDSL.g:347:3: (enumLiteral_1= 'live' )
                    {
                    // InternalGameOfLifeDSL.g:347:3: (enumLiteral_1= 'live' )
                    // InternalGameOfLifeDSL.g:348:4: enumLiteral_1= 'live'
                    {
                    enumLiteral_1=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getActionAccess().getLIVEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getActionAccess().getLIVEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGameOfLifeDSL.g:355:3: (enumLiteral_2= 'becomeAlive' )
                    {
                    // InternalGameOfLifeDSL.g:355:3: (enumLiteral_2= 'becomeAlive' )
                    // InternalGameOfLifeDSL.g:356:4: enumLiteral_2= 'becomeAlive'
                    {
                    enumLiteral_2=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getActionAccess().getBECOMEALIVEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getActionAccess().getBECOMEALIVEEnumLiteralDeclaration_2());
                    			

                    }


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
    // $ANTLR end "ruleAction"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000003800000L});

}