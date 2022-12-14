/*
 * generated by Xtext 2.28.0
 */
package gameOfLife.parser.antlr;

import com.google.inject.Inject;
import gameOfLife.parser.antlr.internal.InternalGameOfLifeDSLParser;
import gameOfLife.services.GameOfLifeDSLGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class GameOfLifeDSLParser extends AbstractAntlrParser {

	@Inject
	private GameOfLifeDSLGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalGameOfLifeDSLParser createParser(XtextTokenStream stream) {
		return new InternalGameOfLifeDSLParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "GameOfLife";
	}

	public GameOfLifeDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(GameOfLifeDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
