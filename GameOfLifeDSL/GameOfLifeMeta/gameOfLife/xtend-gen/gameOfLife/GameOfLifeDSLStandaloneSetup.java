/**
 * generated by Xtext 2.28.0
 */
package gameOfLife;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class GameOfLifeDSLStandaloneSetup extends GameOfLifeDSLStandaloneSetupGenerated {
  public static void doSetup() {
    new GameOfLifeDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}