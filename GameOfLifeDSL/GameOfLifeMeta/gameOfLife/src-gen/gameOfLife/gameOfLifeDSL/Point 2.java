/**
 * generated by Xtext 2.28.0
 */
package gameOfLife.gameOfLifeDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gameOfLife.gameOfLifeDSL.Point#getX <em>X</em>}</li>
 *   <li>{@link gameOfLife.gameOfLifeDSL.Point#getY <em>Y</em>}</li>
 * </ul>
 *
 * @see gameOfLife.gameOfLifeDSL.GameOfLifeDSLPackage#getPoint()
 * @model
 * @generated
 */
public interface Point extends EObject
{
  /**
   * Returns the value of the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>X</em>' attribute.
   * @see #setX(int)
   * @see gameOfLife.gameOfLifeDSL.GameOfLifeDSLPackage#getPoint_X()
   * @model
   * @generated
   */
  int getX();

  /**
   * Sets the value of the '{@link gameOfLife.gameOfLifeDSL.Point#getX <em>X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>X</em>' attribute.
   * @see #getX()
   * @generated
   */
  void setX(int value);

  /**
   * Returns the value of the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Y</em>' attribute.
   * @see #setY(int)
   * @see gameOfLife.gameOfLifeDSL.GameOfLifeDSLPackage#getPoint_Y()
   * @model
   * @generated
   */
  int getY();

  /**
   * Sets the value of the '{@link gameOfLife.gameOfLifeDSL.Point#getY <em>Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Y</em>' attribute.
   * @see #getY()
   * @generated
   */
  void setY(int value);

} // Point
