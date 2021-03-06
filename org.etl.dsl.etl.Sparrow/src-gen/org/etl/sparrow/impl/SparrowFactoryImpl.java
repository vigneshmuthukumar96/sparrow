/**
 * generated by Xtext 2.12.0
 */
package org.etl.sparrow.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.etl.sparrow.Action;
import org.etl.sparrow.Callprocess;
import org.etl.sparrow.Catch;
import org.etl.sparrow.Copydata;
import org.etl.sparrow.Doozle;
import org.etl.sparrow.Dropfile;
import org.etl.sparrow.Expression;
import org.etl.sparrow.FBCLead;
import org.etl.sparrow.Fetch;
import org.etl.sparrow.Finally;
import org.etl.sparrow.GooglecalPUT;
import org.etl.sparrow.LoadCsv;
import org.etl.sparrow.Rest;
import org.etl.sparrow.RestPart;
import org.etl.sparrow.SlackPUT;
import org.etl.sparrow.Sms;
import org.etl.sparrow.SparrowFactory;
import org.etl.sparrow.SparrowPackage;
import org.etl.sparrow.Transform;
import org.etl.sparrow.TrelloGET;
import org.etl.sparrow.TrelloPUT;
import org.etl.sparrow.Try;
import org.etl.sparrow.Updatedaudit;
import org.etl.sparrow.WriteCsv;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SparrowFactoryImpl extends EFactoryImpl implements SparrowFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SparrowFactory init()
  {
    try
    {
      SparrowFactory theSparrowFactory = (SparrowFactory)EPackage.Registry.INSTANCE.getEFactory(SparrowPackage.eNS_URI);
      if (theSparrowFactory != null)
      {
        return theSparrowFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SparrowFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SparrowFactoryImpl()
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
      case SparrowPackage.PROCESS: return createProcess();
      case SparrowPackage.TRY: return createTry();
      case SparrowPackage.FINALLY: return createFinally();
      case SparrowPackage.CATCH: return createCatch();
      case SparrowPackage.ACTION: return createAction();
      case SparrowPackage.FBC_LEAD: return createFBCLead();
      case SparrowPackage.DROPFILE: return createDropfile();
      case SparrowPackage.DOOZLE: return createDoozle();
      case SparrowPackage.REST: return createRest();
      case SparrowPackage.REST_PART: return createRestPart();
      case SparrowPackage.TRELLO_GET: return createTrelloGET();
      case SparrowPackage.TRELLO_PUT: return createTrelloPUT();
      case SparrowPackage.FETCH: return createFetch();
      case SparrowPackage.CALLPROCESS: return createCallprocess();
      case SparrowPackage.UPDATEDAUDIT: return createUpdatedaudit();
      case SparrowPackage.SMS: return createSms();
      case SparrowPackage.SLACK_PUT: return createSlackPUT();
      case SparrowPackage.GOOGLECAL_PUT: return createGooglecalPUT();
      case SparrowPackage.COPYDATA: return createCopydata();
      case SparrowPackage.WRITE_CSV: return createWriteCsv();
      case SparrowPackage.LOAD_CSV: return createLoadCsv();
      case SparrowPackage.TRANSFORM: return createTransform();
      case SparrowPackage.EXPRESSION: return createExpression();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.etl.sparrow.Process createProcess()
  {
    ProcessImpl process = new ProcessImpl();
    return process;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Try createTry()
  {
    TryImpl try_ = new TryImpl();
    return try_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Finally createFinally()
  {
    FinallyImpl finally_ = new FinallyImpl();
    return finally_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Catch createCatch()
  {
    CatchImpl catch_ = new CatchImpl();
    return catch_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action createAction()
  {
    ActionImpl action = new ActionImpl();
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FBCLead createFBCLead()
  {
    FBCLeadImpl fbcLead = new FBCLeadImpl();
    return fbcLead;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dropfile createDropfile()
  {
    DropfileImpl dropfile = new DropfileImpl();
    return dropfile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Doozle createDoozle()
  {
    DoozleImpl doozle = new DoozleImpl();
    return doozle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rest createRest()
  {
    RestImpl rest = new RestImpl();
    return rest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RestPart createRestPart()
  {
    RestPartImpl restPart = new RestPartImpl();
    return restPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrelloGET createTrelloGET()
  {
    TrelloGETImpl trelloGET = new TrelloGETImpl();
    return trelloGET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrelloPUT createTrelloPUT()
  {
    TrelloPUTImpl trelloPUT = new TrelloPUTImpl();
    return trelloPUT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Fetch createFetch()
  {
    FetchImpl fetch = new FetchImpl();
    return fetch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Callprocess createCallprocess()
  {
    CallprocessImpl callprocess = new CallprocessImpl();
    return callprocess;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Updatedaudit createUpdatedaudit()
  {
    UpdatedauditImpl updatedaudit = new UpdatedauditImpl();
    return updatedaudit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sms createSms()
  {
    SmsImpl sms = new SmsImpl();
    return sms;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SlackPUT createSlackPUT()
  {
    SlackPUTImpl slackPUT = new SlackPUTImpl();
    return slackPUT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GooglecalPUT createGooglecalPUT()
  {
    GooglecalPUTImpl googlecalPUT = new GooglecalPUTImpl();
    return googlecalPUT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Copydata createCopydata()
  {
    CopydataImpl copydata = new CopydataImpl();
    return copydata;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WriteCsv createWriteCsv()
  {
    WriteCsvImpl writeCsv = new WriteCsvImpl();
    return writeCsv;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LoadCsv createLoadCsv()
  {
    LoadCsvImpl loadCsv = new LoadCsvImpl();
    return loadCsv;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transform createTransform()
  {
    TransformImpl transform = new TransformImpl();
    return transform;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SparrowPackage getSparrowPackage()
  {
    return (SparrowPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SparrowPackage getPackage()
  {
    return SparrowPackage.eINSTANCE;
  }

} //SparrowFactoryImpl
