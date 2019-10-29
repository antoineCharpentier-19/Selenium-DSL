/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.selenium;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.selenium.Element#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.selenium.Element#getNumber <em>Number</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.selenium.Element#getSelector <em>Selector</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.selenium.Element#getTarget <em>Target</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.selenium.Element#getVar <em>Var</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.selenium.SeleniumPackage#getElement()
 * @model
 * @generated
 */
public interface Element extends Click
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see org.xtext.example.mydsl.selenium.SeleniumPackage#getElement_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.selenium.Element#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Number</em>' attribute.
   * @see #setNumber(int)
   * @see org.xtext.example.mydsl.selenium.SeleniumPackage#getElement_Number()
   * @model
   * @generated
   */
  int getNumber();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.selenium.Element#getNumber <em>Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Number</em>' attribute.
   * @see #getNumber()
   * @generated
   */
  void setNumber(int value);

  /**
   * Returns the value of the '<em><b>Selector</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selector</em>' containment reference.
   * @see #setSelector(By)
   * @see org.xtext.example.mydsl.selenium.SeleniumPackage#getElement_Selector()
   * @model containment="true"
   * @generated
   */
  By getSelector();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.selenium.Element#getSelector <em>Selector</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Selector</em>' containment reference.
   * @see #getSelector()
   * @generated
   */
  void setSelector(By value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' attribute.
   * @see #setTarget(String)
   * @see org.xtext.example.mydsl.selenium.SeleniumPackage#getElement_Target()
   * @model
   * @generated
   */
  String getTarget();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.selenium.Element#getTarget <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' attribute.
   * @see #getTarget()
   * @generated
   */
  void setTarget(String value);

  /**
   * Returns the value of the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' reference.
   * @see #setVar(Variable)
   * @see org.xtext.example.mydsl.selenium.SeleniumPackage#getElement_Var()
   * @model
   * @generated
   */
  Variable getVar();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.selenium.Element#getVar <em>Var</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' reference.
   * @see #getVar()
   * @generated
   */
  void setVar(Variable value);

} // Element