/**
 * generated by Xtext 2.28.0
 */
package gameOfLife.validation;

import gameOfLife.gameOfLifeDSL.EvolutionRule;
import gameOfLife.gameOfLifeDSL.Point;
import org.eclipse.xtext.validation.Check;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class GameOfLifeDSLValidator extends AbstractGameOfLifeDSLValidator {
  public static final String INVALID_POINT = "Coordinate out of grid";

  public static final String INVALID_AMOUNT = "Amount should be greater than zero";

  @Check
  public void checkXCoordinateIsWithinRange(final Point point) {
    int _x = point.getX();
    boolean _greaterThan = (_x > 750);
    if (_greaterThan) {
      this.warning("X coordinate out of grid", 
        null, 
        GameOfLifeDSLValidator.INVALID_POINT);
    }
  }

  @Check
  public void checkYCoordinateIsWithinRange(final Point point) {
    int _y = point.getY();
    boolean _greaterThan = (_y > 500);
    if (_greaterThan) {
      this.warning("Y coordinate out of grid", 
        null, 
        GameOfLifeDSLValidator.INVALID_POINT);
    }
  }

  @Check
  public void checkAmountIsGreaterThanZero(final EvolutionRule evolutionRule) {
    int _amount = evolutionRule.getAmount();
    boolean _lessThan = (_amount < 0);
    if (_lessThan) {
      this.warning("Amount should be greater than zero", 
        null, 
        GameOfLifeDSLValidator.INVALID_AMOUNT);
    }
  }
}