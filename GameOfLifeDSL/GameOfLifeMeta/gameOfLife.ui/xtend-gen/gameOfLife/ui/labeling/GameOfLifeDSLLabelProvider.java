/**
 * generated by Xtext 2.28.0
 */
package gameOfLife.ui.labeling;

import com.google.inject.Inject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#label-provider
 */
@SuppressWarnings("all")
public class GameOfLifeDSLLabelProvider extends DefaultEObjectLabelProvider {
  @Inject
  public GameOfLifeDSLLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
}
