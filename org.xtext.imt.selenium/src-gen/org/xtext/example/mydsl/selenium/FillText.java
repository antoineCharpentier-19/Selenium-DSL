/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.selenium;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fill Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.selenium.FillText#getText <em>Text</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.selenium.FillText#getVar <em>Var</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.selenium.FillText#getProp <em>Prop</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.selenium.FillText#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.selenium.SeleniumPackage#getFillText()
 * @model
 * @generated
 */
public interface FillText extends Instruction
{
  /**
   * Returns the value of the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' attribute.
   * @see #setText(String)
   * @see org.xtext.example.mydsl.selenium.SeleniumPackage#getFillText_Text()
   * @model
   * @generated
   */
  String getText();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.selenium.FillText#getText <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' attribute.
   * @see #getText()
   * @generated
   */
  void setText(String value);

  /**
   * Returns the value of the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' reference.
   * @see #setVar(Variable)
   * @see org.xtext.example.mydsl.selenium.SeleniumPackage#getFillText_Var()
   * @model
   * @generated
   */
  Variable getVar();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.selenium.FillText#getVar <em>Var</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' reference.
   * @see #getVar()
   * @generated
   */
  void setVar(Variable value);

  /**
   * Returns the value of the '<em><b>Prop</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prop</em>' containment reference.
   * @see #setProp(ByProperty)
   * @see org.xtext.example.mydsl.selenium.SeleniumPackage#getFillText_Prop()
   * @model containment="true"
   * @generated
   */
  ByProperty getProp();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.selenium.FillText#getProp <em>Prop</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prop</em>' containment reference.
   * @see #getProp()
   * @generated
   */
  void setProp(ByProperty value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' attribute.
   * @see #setTarget(String)
   * @see org.xtext.example.mydsl.selenium.SeleniumPackage#getFillText_Target()
   * @model
   * @generated
   */
  String getTarget();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.selenium.FillText#getTarget <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' attribute.
   * @see #getTarget()
   * @generated
   */
  void setTarget(String value);

} // FillText
