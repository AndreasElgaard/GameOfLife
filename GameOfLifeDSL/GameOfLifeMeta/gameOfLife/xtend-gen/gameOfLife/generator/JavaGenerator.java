package gameOfLife.generator;

import com.google.common.base.Objects;
import gameOfLife.gameOfLifeDSL.Action;
import gameOfLife.gameOfLifeDSL.ConditionElement;
import gameOfLife.gameOfLifeDSL.EvolutionRule;
import gameOfLife.gameOfLifeDSL.GameOfLife;
import gameOfLife.gameOfLifeDSL.Point;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class JavaGenerator {
  public static CharSequence toJava(final GameOfLife root) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("package GameOfLife;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("import java.awt.Point;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("import java.util.ArrayList;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public class RulesOfLife {");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("public static ArrayList<Point> setAliveCells() {");
    _builder.newLine();
    _builder.append("      \t");
    _builder.append("ArrayList<Point> points = new ArrayList<Point>(0);");
    _builder.newLine();
    _builder.append("        ");
    _builder.newLine();
    {
      EList<Point> _aliveCells = root.getAliveCells();
      for(final Point q : _aliveCells) {
        _builder.append("        ");
        _builder.append("points.add(new Point(");
        int _x = q.getX();
        _builder.append(_x, "        ");
        _builder.append(", ");
        int _y = q.getY();
        _builder.append(_y, "        ");
        _builder.append("));");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("        ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return points;");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static void computeSurvivors(boolean[][] gameBoard, ArrayList<Point> survivingCells) {");
    _builder.newLine();
    _builder.append("        \t");
    _builder.append("// Iterate through the array, follow game of life rules");
    _builder.newLine();
    _builder.append("       \t ");
    _builder.append("for (int i=1; i<gameBoard.length-1; i++) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("for (int j=1; j<gameBoard[0].length-1; j++) {");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("int surrounding = 0;");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("if (gameBoard[i-1][j-1]) { surrounding++; }");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("if (gameBoard[i-1][j])   { surrounding++; }");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("if (gameBoard[i-1][j+1]) { surrounding++; }");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("if (gameBoard[i][j-1])   { surrounding++; }");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("if (gameBoard[i][j+1])   { surrounding++; }");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("if (gameBoard[i+1][j-1]) { surrounding++; }");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("if (gameBoard[i+1][j])   { surrounding++; }");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("if (gameBoard[i+1][j+1]) { surrounding++; }");
    _builder.newLine();
    {
      EList<EvolutionRule> _evolutionRules = root.getEvolutionRules();
      for(final EvolutionRule eR : _evolutionRules) {
        _builder.append("\t\t\t        ");
        String _evolutionRules_1 = JavaGenerator.getEvolutionRules(eR);
        _builder.append(_evolutionRules_1, "\t\t\t        ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("            ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    return _builder;
  }

  public static String getEvolutionRules(final EvolutionRule r) {
    Action _action = r.getAction();
    boolean _equals = Objects.equal(_action, Action.LIVE);
    if (_equals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("if (gameBoard[i][j] && (surrounding ");
      String _conditionElement = JavaGenerator.getConditionElement(r.getConditionElement());
      _builder.append(_conditionElement);
      int _amount = r.getAmount();
      _builder.append(_amount);
      _builder.append(")){");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("survivingCells.add(new Point(i-1,j-1));");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      return _builder.toString();
    } else {
      Action _action_1 = r.getAction();
      boolean _equals_1 = Objects.equal(_action_1, Action.BECOMEALIVE);
      if (_equals_1) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("if ((!gameBoard[i][j]) && (surrounding ");
        String _conditionElement_1 = JavaGenerator.getConditionElement(r.getConditionElement());
        _builder_1.append(_conditionElement_1);
        int _amount_1 = r.getAmount();
        _builder_1.append(_amount_1);
        _builder_1.append(")){");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t");
        _builder_1.append("survivingCells.add(new Point(i-1,j-1));");
        _builder_1.newLine();
        _builder_1.append("}");
        _builder_1.newLine();
        return _builder_1.toString();
      } else {
        Action _action_2 = r.getAction();
        boolean _equals_2 = Objects.equal(_action_2, Action.DIE);
        if (_equals_2) {
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("if (gameBoard[i][j] && (surrounding ");
          String _conditionElement_2 = JavaGenerator.getConditionElement(r.getConditionElement());
          _builder_2.append(_conditionElement_2);
          int _amount_2 = r.getAmount();
          _builder_2.append(_amount_2);
          _builder_2.append(")){");
          _builder_2.newLineIfNotEmpty();
          _builder_2.append("\t");
          _builder_2.append("continue;");
          _builder_2.newLine();
          _builder_2.append("}");
          _builder_2.newLine();
          return _builder_2.toString();
        }
      }
    }
    return null;
  }

  public static String getConditionElement(final ConditionElement condition) {
    boolean _equals = Objects.equal(condition, ConditionElement.GREATER);
    if (_equals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(">");
      return _builder.toString();
    } else {
      boolean _equals_1 = Objects.equal(condition, ConditionElement.LOWER);
      if (_equals_1) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("<");
        return _builder_1.toString();
      } else {
        boolean _equals_2 = Objects.equal(condition, ConditionElement.EQUAL);
        if (_equals_2) {
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("==");
          return _builder_2.toString();
        }
      }
    }
    return null;
  }
}
