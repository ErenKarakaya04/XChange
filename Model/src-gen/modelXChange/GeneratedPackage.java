/**
 */
package modelXChange;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see modelXChange.GeneratedFactory
 * @model kind="package"
 * @generated
 */
public interface GeneratedPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "modelXChange";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/modelXChange";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "modelXChange";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GeneratedPackage eINSTANCE = modelXChange.impl.GeneratedPackageImpl.init();

	/**
	 * The meta object id for the '{@link modelXChange.impl.KontoImpl <em>Konto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelXChange.impl.KontoImpl
	 * @see modelXChange.impl.GeneratedPackageImpl#getKonto()
	 * @generated
	 */
	int KONTO = 0;

	/**
	 * The feature id for the '<em><b>Waehrung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTO__WAEHRUNG = 0;

	/**
	 * The feature id for the '<em><b>IBAN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTO__IBAN = 1;

	/**
	 * The feature id for the '<em><b>BIC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTO__BIC = 2;

	/**
	 * The feature id for the '<em><b>Inhaber</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTO__INHABER = 3;

	/**
	 * The number of structural features of the '<em>Konto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTO_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Ueberweisen</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTO___UEBERWEISEN__KONTO_DOUBLE = 0;

	/**
	 * The number of operations of the '<em>Konto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTO_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link modelXChange.impl.InhaberImpl <em>Inhaber</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelXChange.impl.InhaberImpl
	 * @see modelXChange.impl.GeneratedPackageImpl#getInhaber()
	 * @generated
	 */
	int INHABER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHABER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Anschrift</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHABER__ANSCHRIFT = 1;

	/**
	 * The feature id for the '<em><b>Telefonnummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHABER__TELEFONNUMMER = 2;

	/**
	 * The feature id for the '<em><b>Konto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHABER__KONTO = 3;

	/**
	 * The number of structural features of the '<em>Inhaber</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHABER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Inhaber</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHABER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link modelXChange.impl.BuchungImpl <em>Buchung</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelXChange.impl.BuchungImpl
	 * @see modelXChange.impl.GeneratedPackageImpl#getBuchung()
	 * @generated
	 */
	int BUCHUNG = 2;

	/**
	 * The feature id for the '<em><b>Betrag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUCHUNG__BETRAG = 0;

	/**
	 * The feature id for the '<em><b>Quell Konto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUCHUNG__QUELL_KONTO = 1;

	/**
	 * The feature id for the '<em><b>Ziel Konto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUCHUNG__ZIEL_KONTO = 2;

	/**
	 * The number of structural features of the '<em>Buchung</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUCHUNG_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Buchen</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUCHUNG___BUCHEN = 0;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUCHUNG___VALIDATE = 1;

	/**
	 * The number of operations of the '<em>Buchung</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUCHUNG_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link modelXChange.Waehrung <em>Waehrung</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelXChange.Waehrung
	 * @see modelXChange.impl.GeneratedPackageImpl#getWaehrung()
	 * @generated
	 */
	int WAEHRUNG = 3;

	/**
	 * Returns the meta object for class '{@link modelXChange.Konto <em>Konto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Konto</em>'.
	 * @see modelXChange.Konto
	 * @generated
	 */
	EClass getKonto();

	/**
	 * Returns the meta object for the attribute '{@link modelXChange.Konto#getWaehrung <em>Waehrung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Waehrung</em>'.
	 * @see modelXChange.Konto#getWaehrung()
	 * @see #getKonto()
	 * @generated
	 */
	EAttribute getKonto_Waehrung();

	/**
	 * Returns the meta object for the attribute '{@link modelXChange.Konto#getIBAN <em>IBAN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IBAN</em>'.
	 * @see modelXChange.Konto#getIBAN()
	 * @see #getKonto()
	 * @generated
	 */
	EAttribute getKonto_IBAN();

	/**
	 * Returns the meta object for the attribute '{@link modelXChange.Konto#getBIC <em>BIC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BIC</em>'.
	 * @see modelXChange.Konto#getBIC()
	 * @see #getKonto()
	 * @generated
	 */
	EAttribute getKonto_BIC();

	/**
	 * Returns the meta object for the reference list '{@link modelXChange.Konto#getInhaber <em>Inhaber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inhaber</em>'.
	 * @see modelXChange.Konto#getInhaber()
	 * @see #getKonto()
	 * @generated
	 */
	EReference getKonto_Inhaber();

	/**
	 * Returns the meta object for the '{@link modelXChange.Konto#ueberweisen(modelXChange.Konto, double) <em>Ueberweisen</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Ueberweisen</em>' operation.
	 * @see modelXChange.Konto#ueberweisen(modelXChange.Konto, double)
	 * @generated
	 */
	EOperation getKonto__Ueberweisen__Konto_double();

	/**
	 * Returns the meta object for class '{@link modelXChange.Inhaber <em>Inhaber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inhaber</em>'.
	 * @see modelXChange.Inhaber
	 * @generated
	 */
	EClass getInhaber();

	/**
	 * Returns the meta object for the attribute '{@link modelXChange.Inhaber#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see modelXChange.Inhaber#getName()
	 * @see #getInhaber()
	 * @generated
	 */
	EAttribute getInhaber_Name();

	/**
	 * Returns the meta object for the attribute '{@link modelXChange.Inhaber#getAnschrift <em>Anschrift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anschrift</em>'.
	 * @see modelXChange.Inhaber#getAnschrift()
	 * @see #getInhaber()
	 * @generated
	 */
	EAttribute getInhaber_Anschrift();

	/**
	 * Returns the meta object for the attribute '{@link modelXChange.Inhaber#getTelefonnummer <em>Telefonnummer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telefonnummer</em>'.
	 * @see modelXChange.Inhaber#getTelefonnummer()
	 * @see #getInhaber()
	 * @generated
	 */
	EAttribute getInhaber_Telefonnummer();

	/**
	 * Returns the meta object for the reference list '{@link modelXChange.Inhaber#getKonto <em>Konto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Konto</em>'.
	 * @see modelXChange.Inhaber#getKonto()
	 * @see #getInhaber()
	 * @generated
	 */
	EReference getInhaber_Konto();

	/**
	 * Returns the meta object for class '{@link modelXChange.Buchung <em>Buchung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Buchung</em>'.
	 * @see modelXChange.Buchung
	 * @generated
	 */
	EClass getBuchung();

	/**
	 * Returns the meta object for the attribute '{@link modelXChange.Buchung#getBetrag <em>Betrag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Betrag</em>'.
	 * @see modelXChange.Buchung#getBetrag()
	 * @see #getBuchung()
	 * @generated
	 */
	EAttribute getBuchung_Betrag();

	/**
	 * Returns the meta object for the reference '{@link modelXChange.Buchung#getQuellKonto <em>Quell Konto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Quell Konto</em>'.
	 * @see modelXChange.Buchung#getQuellKonto()
	 * @see #getBuchung()
	 * @generated
	 */
	EReference getBuchung_QuellKonto();

	/**
	 * Returns the meta object for the reference '{@link modelXChange.Buchung#getZielKonto <em>Ziel Konto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ziel Konto</em>'.
	 * @see modelXChange.Buchung#getZielKonto()
	 * @see #getBuchung()
	 * @generated
	 */
	EReference getBuchung_ZielKonto();

	/**
	 * Returns the meta object for the '{@link modelXChange.Buchung#buchen() <em>Buchen</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Buchen</em>' operation.
	 * @see modelXChange.Buchung#buchen()
	 * @generated
	 */
	EOperation getBuchung__Buchen();

	/**
	 * Returns the meta object for the '{@link modelXChange.Buchung#validate() <em>Validate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate</em>' operation.
	 * @see modelXChange.Buchung#validate()
	 * @generated
	 */
	EOperation getBuchung__Validate();

	/**
	 * Returns the meta object for enum '{@link modelXChange.Waehrung <em>Waehrung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Waehrung</em>'.
	 * @see modelXChange.Waehrung
	 * @generated
	 */
	EEnum getWaehrung();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GeneratedFactory getGeneratedFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link modelXChange.impl.KontoImpl <em>Konto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelXChange.impl.KontoImpl
		 * @see modelXChange.impl.GeneratedPackageImpl#getKonto()
		 * @generated
		 */
		EClass KONTO = eINSTANCE.getKonto();

		/**
		 * The meta object literal for the '<em><b>Waehrung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KONTO__WAEHRUNG = eINSTANCE.getKonto_Waehrung();

		/**
		 * The meta object literal for the '<em><b>IBAN</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KONTO__IBAN = eINSTANCE.getKonto_IBAN();

		/**
		 * The meta object literal for the '<em><b>BIC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KONTO__BIC = eINSTANCE.getKonto_BIC();

		/**
		 * The meta object literal for the '<em><b>Inhaber</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KONTO__INHABER = eINSTANCE.getKonto_Inhaber();

		/**
		 * The meta object literal for the '<em><b>Ueberweisen</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation KONTO___UEBERWEISEN__KONTO_DOUBLE = eINSTANCE.getKonto__Ueberweisen__Konto_double();

		/**
		 * The meta object literal for the '{@link modelXChange.impl.InhaberImpl <em>Inhaber</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelXChange.impl.InhaberImpl
		 * @see modelXChange.impl.GeneratedPackageImpl#getInhaber()
		 * @generated
		 */
		EClass INHABER = eINSTANCE.getInhaber();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INHABER__NAME = eINSTANCE.getInhaber_Name();

		/**
		 * The meta object literal for the '<em><b>Anschrift</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INHABER__ANSCHRIFT = eINSTANCE.getInhaber_Anschrift();

		/**
		 * The meta object literal for the '<em><b>Telefonnummer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INHABER__TELEFONNUMMER = eINSTANCE.getInhaber_Telefonnummer();

		/**
		 * The meta object literal for the '<em><b>Konto</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INHABER__KONTO = eINSTANCE.getInhaber_Konto();

		/**
		 * The meta object literal for the '{@link modelXChange.impl.BuchungImpl <em>Buchung</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelXChange.impl.BuchungImpl
		 * @see modelXChange.impl.GeneratedPackageImpl#getBuchung()
		 * @generated
		 */
		EClass BUCHUNG = eINSTANCE.getBuchung();

		/**
		 * The meta object literal for the '<em><b>Betrag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUCHUNG__BETRAG = eINSTANCE.getBuchung_Betrag();

		/**
		 * The meta object literal for the '<em><b>Quell Konto</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUCHUNG__QUELL_KONTO = eINSTANCE.getBuchung_QuellKonto();

		/**
		 * The meta object literal for the '<em><b>Ziel Konto</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUCHUNG__ZIEL_KONTO = eINSTANCE.getBuchung_ZielKonto();

		/**
		 * The meta object literal for the '<em><b>Buchen</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BUCHUNG___BUCHEN = eINSTANCE.getBuchung__Buchen();

		/**
		 * The meta object literal for the '<em><b>Validate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BUCHUNG___VALIDATE = eINSTANCE.getBuchung__Validate();

		/**
		 * The meta object literal for the '{@link modelXChange.Waehrung <em>Waehrung</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelXChange.Waehrung
		 * @see modelXChange.impl.GeneratedPackageImpl#getWaehrung()
		 * @generated
		 */
		EEnum WAEHRUNG = eINSTANCE.getWaehrung();

	}

} //GeneratedPackage
