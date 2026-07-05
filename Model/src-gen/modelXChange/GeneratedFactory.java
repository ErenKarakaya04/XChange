/**
 */
package modelXChange;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see modelXChange.GeneratedPackage
 * @generated
 */
public interface GeneratedFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GeneratedFactory eINSTANCE = modelXChange.impl.GeneratedFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Konto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Konto</em>'.
	 * @generated
	 */
	Konto createKonto();

	/**
	 * Returns a new object of class '<em>Inhaber</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inhaber</em>'.
	 * @generated
	 */
	Inhaber createInhaber();

	/**
	 * Returns a new object of class '<em>Buchung</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Buchung</em>'.
	 * @generated
	 */
	Buchung createBuchung();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GeneratedPackage getGeneratedPackage();

} //GeneratedFactory
