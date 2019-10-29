/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.selenium.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.mydsl.selenium.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SeleniumFactoryImpl extends EFactoryImpl implements SeleniumFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SeleniumFactory init()
  {
    try
    {
      SeleniumFactory theSeleniumFactory = (SeleniumFactory)EPackage.Registry.INSTANCE.getEFactory(SeleniumPackage.eNS_URI);
      if (theSeleniumFactory != null)
      {
        return theSeleniumFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SeleniumFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SeleniumFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SeleniumPackage.GLOBAL: return createGlobal();
      case SeleniumPackage.PROGRAM: return createProgram();
      case SeleniumPackage.INSTRUCTION: return createInstruction();
      case SeleniumPackage.GO: return createGo();
      case SeleniumPackage.VERIFY: return createVerify();
      case SeleniumPackage.FILL_TEXT: return createFillText();
      case SeleniumPackage.VARIABLE: return createVariable();
      case SeleniumPackage.CLICK: return createClick();
      case SeleniumPackage.CHECK: return createCheck();
      case SeleniumPackage.SELECT_COMBO: return createSelectCombo();
      case SeleniumPackage.ELEMENT: return createElement();
      case SeleniumPackage.BY: return createBy();
      case SeleniumPackage.BY_PROPERTY: return createByProperty();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Global createGlobal()
  {
    GlobalImpl global = new GlobalImpl();
    return global;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Program createProgram()
  {
    ProgramImpl program = new ProgramImpl();
    return program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Instruction createInstruction()
  {
    InstructionImpl instruction = new InstructionImpl();
    return instruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Go createGo()
  {
    GoImpl go = new GoImpl();
    return go;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Verify createVerify()
  {
    VerifyImpl verify = new VerifyImpl();
    return verify;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FillText createFillText()
  {
    FillTextImpl fillText = new FillTextImpl();
    return fillText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Click createClick()
  {
    ClickImpl click = new ClickImpl();
    return click;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Check createCheck()
  {
    CheckImpl check = new CheckImpl();
    return check;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SelectCombo createSelectCombo()
  {
    SelectComboImpl selectCombo = new SelectComboImpl();
    return selectCombo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Element createElement()
  {
    ElementImpl element = new ElementImpl();
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public By createBy()
  {
    ByImpl by = new ByImpl();
    return by;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ByProperty createByProperty()
  {
    ByPropertyImpl byProperty = new ByPropertyImpl();
    return byProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SeleniumPackage getSeleniumPackage()
  {
    return (SeleniumPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SeleniumPackage getPackage()
  {
    return SeleniumPackage.eINSTANCE;
  }

} //SeleniumFactoryImpl