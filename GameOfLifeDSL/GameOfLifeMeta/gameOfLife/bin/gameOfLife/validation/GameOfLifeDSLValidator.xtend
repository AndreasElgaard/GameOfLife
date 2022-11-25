/*
 * generated by Xtext 2.28.0
 */
package gameOfLife.validation

import gameOfLife.gameOfLifeDSL.Point
import org.eclipse.xtext.validation.Check
import gameOfLife.gameOfLifeDSL.EvolutionRule

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class GameOfLifeDSLValidator extends AbstractGameOfLifeDSLValidator {
	public static val INVALID_POINT = 'Coordinate out of grid'
	public static val INVALID_AMOUNT = 'Amount should be greater than zero'
	
	@Check
	def checkXCoordinateIsWithinRange(Point point) {
		if (point.getX() > 750) {
			warning('X coordinate out of grid', 
				null, 
				INVALID_POINT
			)
		}
	} // bobby
	
	@Check
	def checkYCoordinateIsWithinRange(Point point) {
		if (point.getY() > 500) {
			warning('Y coordinate out of grid', 
				null, 
				INVALID_POINT
			)
		}
	}
	
	@Check
	def checkAmountIsGreaterThanZero(EvolutionRule evolutionRule) {
		if (evolutionRule.getAmount() < 0) {
			warning('Amount should be greater than zero', 
				null, 
				INVALID_AMOUNT
			)
		}
	}
}
