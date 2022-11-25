/*
 * generated by Xtext 2.28.0
 */
package gameOfLife.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class GameOfLifeDSLGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class GameOfLifeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "gameOfLife.GameOfLifeDSL.GameOfLife");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGameOfLifeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cAliveCellsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cAliveCellsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cAliveCellsPointParserRuleCall_2_0 = (RuleCall)cAliveCellsAssignment_2.eContents().get(0);
		private final Keyword cEvolutionRulesKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cEvolutionRulesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cEvolutionRulesEvolutionRuleParserRuleCall_4_0 = (RuleCall)cEvolutionRulesAssignment_4.eContents().get(0);
		
		//GameOfLife: 'GameOfLife:'
		//    'aliveCells:' aliveCells += Point+
		//    'evolutionRules:' (evolutionRules += EvolutionRule)+
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'GameOfLife:'
		//   'aliveCells:' aliveCells += Point+
		//   'evolutionRules:' (evolutionRules += EvolutionRule)+
		public Group getGroup() { return cGroup; }
		
		//'GameOfLife:'
		public Keyword getGameOfLifeKeyword_0() { return cGameOfLifeKeyword_0; }
		
		//'aliveCells:'
		public Keyword getAliveCellsKeyword_1() { return cAliveCellsKeyword_1; }
		
		//aliveCells += Point+
		public Assignment getAliveCellsAssignment_2() { return cAliveCellsAssignment_2; }
		
		//Point
		public RuleCall getAliveCellsPointParserRuleCall_2_0() { return cAliveCellsPointParserRuleCall_2_0; }
		
		//'evolutionRules:'
		public Keyword getEvolutionRulesKeyword_3() { return cEvolutionRulesKeyword_3; }
		
		//(evolutionRules += EvolutionRule)+
		public Assignment getEvolutionRulesAssignment_4() { return cEvolutionRulesAssignment_4; }
		
		//EvolutionRule
		public RuleCall getEvolutionRulesEvolutionRuleParserRuleCall_4_0() { return cEvolutionRulesEvolutionRuleParserRuleCall_4_0; }
	}
	public class PointElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "gameOfLife.GameOfLifeDSL.Point");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cXAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cXINTTerminalRuleCall_1_0 = (RuleCall)cXAssignment_1.eContents().get(0);
		private final Keyword cCommaKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cYAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cYINTTerminalRuleCall_3_0 = (RuleCall)cYAssignment_3.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Point:
		//    '(' x=INT ',' y=INT ')'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'(' x=INT ',' y=INT ')'
		public Group getGroup() { return cGroup; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//x=INT
		public Assignment getXAssignment_1() { return cXAssignment_1; }
		
		//INT
		public RuleCall getXINTTerminalRuleCall_1_0() { return cXINTTerminalRuleCall_1_0; }
		
		//','
		public Keyword getCommaKeyword_2() { return cCommaKeyword_2; }
		
		//y=INT
		public Assignment getYAssignment_3() { return cYAssignment_3; }
		
		//INT
		public RuleCall getYINTTerminalRuleCall_3_0() { return cYINTTerminalRuleCall_3_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
	}
	public class EvolutionRuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "gameOfLife.GameOfLifeDSL.EvolutionRule");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEvolutionRuleKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cSurroundingKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cConditionElementAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cConditionElementConditionElementEnumRuleCall_3_0 = (RuleCall)cConditionElementAssignment_3.eContents().get(0);
		private final Assignment cAmountAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cAmountINTTerminalRuleCall_4_0 = (RuleCall)cAmountAssignment_4.eContents().get(0);
		private final Keyword cColonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cActionAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cActionActionEnumRuleCall_6_0 = (RuleCall)cActionAssignment_6.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//EvolutionRule:
		//    'EvolutionRule''(''surrounding' conditionElement=ConditionElement amount=INT ':' action=Action ')'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'EvolutionRule''(''surrounding' conditionElement=ConditionElement amount=INT ':' action=Action ')'
		public Group getGroup() { return cGroup; }
		
		//'EvolutionRule'
		public Keyword getEvolutionRuleKeyword_0() { return cEvolutionRuleKeyword_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//'surrounding'
		public Keyword getSurroundingKeyword_2() { return cSurroundingKeyword_2; }
		
		//conditionElement=ConditionElement
		public Assignment getConditionElementAssignment_3() { return cConditionElementAssignment_3; }
		
		//ConditionElement
		public RuleCall getConditionElementConditionElementEnumRuleCall_3_0() { return cConditionElementConditionElementEnumRuleCall_3_0; }
		
		//amount=INT
		public Assignment getAmountAssignment_4() { return cAmountAssignment_4; }
		
		//INT
		public RuleCall getAmountINTTerminalRuleCall_4_0() { return cAmountINTTerminalRuleCall_4_0; }
		
		//':'
		public Keyword getColonKeyword_5() { return cColonKeyword_5; }
		
		//action=Action
		public Assignment getActionAssignment_6() { return cActionAssignment_6; }
		
		//Action
		public RuleCall getActionActionEnumRuleCall_6_0() { return cActionActionEnumRuleCall_6_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_7() { return cRightParenthesisKeyword_7; }
	}
	
	public class ConditionElementElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "gameOfLife.GameOfLifeDSL.ConditionElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cLOWEREnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cLOWERLessThanSignKeyword_0_0 = (Keyword)cLOWEREnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cGREATEREnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cGREATERGreaterThanSignKeyword_1_0 = (Keyword)cGREATEREnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cEQUALEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cEQUALEqualsSignEqualsSignKeyword_2_0 = (Keyword)cEQUALEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum ConditionElement:
		//    LOWER = '<' |
		//    GREATER = '>' |
		//    EQUAL = '=='
		//;
		public EnumRule getRule() { return rule; }
		
		//LOWER = '<' |
		//GREATER = '>' |
		//EQUAL = '=='
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//LOWER = '<'
		public EnumLiteralDeclaration getLOWEREnumLiteralDeclaration_0() { return cLOWEREnumLiteralDeclaration_0; }
		
		//'<'
		public Keyword getLOWERLessThanSignKeyword_0_0() { return cLOWERLessThanSignKeyword_0_0; }
		
		//GREATER = '>'
		public EnumLiteralDeclaration getGREATEREnumLiteralDeclaration_1() { return cGREATEREnumLiteralDeclaration_1; }
		
		//'>'
		public Keyword getGREATERGreaterThanSignKeyword_1_0() { return cGREATERGreaterThanSignKeyword_1_0; }
		
		//EQUAL = '=='
		public EnumLiteralDeclaration getEQUALEnumLiteralDeclaration_2() { return cEQUALEnumLiteralDeclaration_2; }
		
		//'=='
		public Keyword getEQUALEqualsSignEqualsSignKeyword_2_0() { return cEQUALEqualsSignEqualsSignKeyword_2_0; }
	}
	public class ActionElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "gameOfLife.GameOfLifeDSL.Action");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cDIEEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cDIEDieKeyword_0_0 = (Keyword)cDIEEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cLIVEEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cLIVELiveKeyword_1_0 = (Keyword)cLIVEEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cBECOMEALIVEEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cBECOMEALIVEBecomeAliveKeyword_2_0 = (Keyword)cBECOMEALIVEEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum Action:
		//    DIE = 'die' |
		//    LIVE = 'live' |
		//    BECOMEALIVE = 'becomeAlive'
		//;
		public EnumRule getRule() { return rule; }
		
		//DIE = 'die' |
		//LIVE = 'live' |
		//BECOMEALIVE = 'becomeAlive'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//DIE = 'die'
		public EnumLiteralDeclaration getDIEEnumLiteralDeclaration_0() { return cDIEEnumLiteralDeclaration_0; }
		
		//'die'
		public Keyword getDIEDieKeyword_0_0() { return cDIEDieKeyword_0_0; }
		
		//LIVE = 'live'
		public EnumLiteralDeclaration getLIVEEnumLiteralDeclaration_1() { return cLIVEEnumLiteralDeclaration_1; }
		
		//'live'
		public Keyword getLIVELiveKeyword_1_0() { return cLIVELiveKeyword_1_0; }
		
		//BECOMEALIVE = 'becomeAlive'
		public EnumLiteralDeclaration getBECOMEALIVEEnumLiteralDeclaration_2() { return cBECOMEALIVEEnumLiteralDeclaration_2; }
		
		//'becomeAlive'
		public Keyword getBECOMEALIVEBecomeAliveKeyword_2_0() { return cBECOMEALIVEBecomeAliveKeyword_2_0; }
	}
	
	private final GameOfLifeElements pGameOfLife;
	private final PointElements pPoint;
	private final EvolutionRuleElements pEvolutionRule;
	private final ConditionElementElements eConditionElement;
	private final ActionElements eAction;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public GameOfLifeDSLGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pGameOfLife = new GameOfLifeElements();
		this.pPoint = new PointElements();
		this.pEvolutionRule = new EvolutionRuleElements();
		this.eConditionElement = new ConditionElementElements();
		this.eAction = new ActionElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("gameOfLife.GameOfLifeDSL".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//GameOfLife: 'GameOfLife:'
	//    'aliveCells:' aliveCells += Point+
	//    'evolutionRules:' (evolutionRules += EvolutionRule)+
	//;
	public GameOfLifeElements getGameOfLifeAccess() {
		return pGameOfLife;
	}
	
	public ParserRule getGameOfLifeRule() {
		return getGameOfLifeAccess().getRule();
	}
	
	//Point:
	//    '(' x=INT ',' y=INT ')'
	//;
	public PointElements getPointAccess() {
		return pPoint;
	}
	
	public ParserRule getPointRule() {
		return getPointAccess().getRule();
	}
	
	//EvolutionRule:
	//    'EvolutionRule''(''surrounding' conditionElement=ConditionElement amount=INT ':' action=Action ')'
	//;
	public EvolutionRuleElements getEvolutionRuleAccess() {
		return pEvolutionRule;
	}
	
	public ParserRule getEvolutionRuleRule() {
		return getEvolutionRuleAccess().getRule();
	}
	
	//enum ConditionElement:
	//    LOWER = '<' |
	//    GREATER = '>' |
	//    EQUAL = '=='
	//;
	public ConditionElementElements getConditionElementAccess() {
		return eConditionElement;
	}
	
	public EnumRule getConditionElementRule() {
		return getConditionElementAccess().getRule();
	}
	
	//enum Action:
	//    DIE = 'die' |
	//    LIVE = 'live' |
	//    BECOMEALIVE = 'becomeAlive'
	//;
	public ActionElements getActionAccess() {
		return eAction;
	}
	
	public EnumRule getActionRule() {
		return getActionAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
