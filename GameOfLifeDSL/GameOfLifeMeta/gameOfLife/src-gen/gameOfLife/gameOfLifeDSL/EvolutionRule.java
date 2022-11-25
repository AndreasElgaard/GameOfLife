/**
 * generated by Xtext 2.28.0
 */
package gameOfLife.gameOfLifeDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evolution Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gameOfLife.gameOfLifeDSL.EvolutionRule#getConditionElement <em>Condition Element</em>}</li>
 *   <li>{@link gameOfLife.gameOfLifeDSL.EvolutionRule#getAmount <em>Amount</em>}</li>
 *   <li>{@link gameOfLife.gameOfLifeDSL.EvolutionRule#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see gameOfLife.gameOfLifeDSL.GameOfLifeDSLPackage#getEvolutionRule()
 * @model
 * @generated
 */
public interface EvolutionRule extends EObject
{
  /**
   * Returns the value of the '<em><b>Condition Element</b></em>' attribute.
   * The literals are from the enumeration {@link gameOfLife.gameOfLifeDSL.ConditionElement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition Element</em>' attribute.
   * @see gameOfLife.gameOfLifeDSL.ConditionElement
   * @see #setConditionElement(ConditionElement)
   * @see gameOfLife.gameOfLifeDSL.GameOfLifeDSLPackage#getEvolutionRule_ConditionElement()
   * @model
   * @generated
   */
  ConditionElement getConditionElement();

  /**
   * Sets the value of the '{@link gameOfLife.gameOfLifeDSL.EvolutionRule#getConditionElement <em>Condition Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition Element</em>' attribute.
   * @see gameOfLife.gameOfLifeDSL.ConditionElement
   * @see #getConditionElement()
   * @generated
   */
  void setConditionElement(ConditionElement value);

  /**
   * Returns the value of the '<em><b>Amount</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Amount</em>' attribute.
   * @see #setAmount(int)
   * @see gameOfLife.gameOfLifeDSL.GameOfLifeDSLPackage#getEvolutionRule_Amount()
   * @model
   * @generated
   */
  int getAmount();

  /**
   * Sets the value of the '{@link gameOfLife.gameOfLifeDSL.EvolutionRule#getAmount <em>Amount</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Amount</em>' attribute.
   * @see #getAmount()
   * @generated
   */
  void setAmount(int value);

  /**
   * Returns the value of the '<em><b>Action</b></em>' attribute.
   * The literals are from the enumeration {@link gameOfLife.gameOfLifeDSL.Action}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' attribute.
   * @see gameOfLife.gameOfLifeDSL.Action
   * @see #setAction(Action)
   * @see gameOfLife.gameOfLifeDSL.GameOfLifeDSLPackage#getEvolutionRule_Action()
   * @model
   * @generated
   */
  Action getAction();

  /**
   * Sets the value of the '{@link gameOfLife.gameOfLifeDSL.EvolutionRule#getAction <em>Action</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' attribute.
   * @see gameOfLife.gameOfLifeDSL.Action
   * @see #getAction()
   * @generated
   */
  void setAction(Action value);

} // EvolutionRule
