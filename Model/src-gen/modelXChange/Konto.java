/**
 */
package modelXChange;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Konto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modelXChange.Konto#getWaehrung <em>Waehrung</em>}</li>
 *   <li>{@link modelXChange.Konto#getIBAN <em>IBAN</em>}</li>
 *   <li>{@link modelXChange.Konto#getBIC <em>BIC</em>}</li>
 *   <li>{@link modelXChange.Konto#getInhaber <em>Inhaber</em>}</li>
 * </ul>
 *
 * @see modelXChange.GeneratedPackage#getKonto()
 * @model
 * @generated
 */
public interface Konto extends EObject {
	/**
	 * Returns the value of the '<em><b>Waehrung</b></em>' attribute.
	 * The literals are from the enumeration {@link modelXChange.Waehrung}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Waehrung</em>' attribute.
	 * @see modelXChange.Waehrung
	 * @see #setWaehrung(Waehrung)
	 * @see modelXChange.GeneratedPackage#getKonto_Waehrung()
	 * @model required="true"
	 * @generated
	 */
	Waehrung getWaehrung();

	/**
	 * Sets the value of the '{@link modelXChange.Konto#getWaehrung <em>Waehrung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Waehrung</em>' attribute.
	 * @see modelXChange.Waehrung
	 * @see #getWaehrung()
	 * @generated
	 */
	void setWaehrung(Waehrung value);

	/**
	 * Returns the value of the '<em><b>IBAN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IBAN</em>' attribute.
	 * @see #setIBAN(String)
	 * @see modelXChange.GeneratedPackage#getKonto_IBAN()
	 * @model required="true"
	 * @generated
	 */
	String getIBAN();

	/**
	 * Sets the value of the '{@link modelXChange.Konto#getIBAN <em>IBAN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IBAN</em>' attribute.
	 * @see #getIBAN()
	 * @generated
	 */
	void setIBAN(String value);

	/**
	 * Returns the value of the '<em><b>BIC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BIC</em>' attribute.
	 * @see #setBIC(String)
	 * @see modelXChange.GeneratedPackage#getKonto_BIC()
	 * @model required="true"
	 * @generated
	 */
	String getBIC();

	/**
	 * Sets the value of the '{@link modelXChange.Konto#getBIC <em>BIC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BIC</em>' attribute.
	 * @see #getBIC()
	 * @generated
	 */
	void setBIC(String value);

	/**
	 * Returns the value of the '<em><b>Inhaber</b></em>' reference list.
	 * The list contents are of type {@link modelXChange.Inhaber}.
	 * It is bidirectional and its opposite is '{@link modelXChange.Inhaber#getKonto <em>Konto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inhaber</em>' reference list.
	 * @see modelXChange.GeneratedPackage#getKonto_Inhaber()
	 * @see modelXChange.Inhaber#getKonto
	 * @model opposite="konto" required="true" upper="3"
	 * @generated
	 */
	EList<Inhaber> getInhaber();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean ueberweisen(Konto zielKonto, double betrag);

} // Konto
