/*
 * generated by Xtext 2.28.0
 */
package gameOfLife.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractGameOfLifeDSLValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(gameOfLife.gameOfLifeDSL.GameOfLifeDSLPackage.eINSTANCE);
		return result;
	}
}
