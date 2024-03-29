/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.selenium;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Combo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.selenium.SelectCombo#getBy <em>By</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.selenium.SelectCombo#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.selenium.SeleniumPackage#getSelectCombo()
 * @model
 * @generated
 */
public interface SelectCombo extends Instruction
{
  /**
   * Returns the value of the '<em><b>By</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>By</em>' containment reference.
   * @see #setBy(By)
   * @see org.xtext.example.mydsl.selenium.SeleniumPackage#getSelectCombo_By()
   * @model containment="true"
   * @generated
   */
  By getBy();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.selenium.SelectCombo#getBy <em>By</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>By</em>' containment reference.
   * @see #getBy()
   * @generated
   */
  void setBy(By value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' attribute.
   * @see #setTarget(String)
   * @see org.xtext.example.mydsl.selenium.SeleniumPackage#getSelectCombo_Target()
   * @model
   * @generated
   */
  String getTarget();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.selenium.SelectCombo#getTarget <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' attribute.
   * @see #getTarget()
   * @generated
   */
  void setTarget(String value);

} // SelectCombo
