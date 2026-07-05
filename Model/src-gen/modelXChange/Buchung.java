/**
 */
package modelXChange;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Buchung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modelXChange.Buchung#getBetrag <em>Betrag</em>}</li>
 *   <li>{@link modelXChange.Buchung#getQuellKonto <em>Quell Konto</em>}</li>
 *   <li>{@link modelXChange.Buchung#getZielKonto <em>Ziel Konto</em>}</li>
 * </ul>
 *
 * @see modelXChange.GeneratedPackage#getBuchung()
 * @model
 * @generated
 */
public interface Buchung extends EObject {
	/**
	 * Returns the value of the '<em><b>Betrag</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Betrag</em>' attribute.
	 * @see #setBetrag(double)
	 * @see modelXChange.GeneratedPackage#getBuchung_Betrag()
	 * @model default="0.0"
	 * @generated
	 */
	double getBetrag();

	/**
	 * Sets the value of the '{@link modelXChange.Buchung#getBetrag <em>Betrag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Betrag</em>' attribute.
	 * @see #getBetrag()
	 * @generated
	 */
	void setBetrag(double value);

	/**
	 * Returns the value of the '<em><b>Quell Konto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quell Konto</em>' reference.
	 * @see #setQuellKonto(Konto)
	 * @see modelXChange.GeneratedPackage#getBuchung_QuellKonto()
	 * @model required="true"
	 * @generated
	 */
	Konto getQuellKonto();

	/**
	 * Sets the value of the '{@link modelXChange.Buchung#getQuellKonto <em>Quell Konto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quell Konto</em>' reference.
	 * @see #getQuellKonto()
	 * @generated
	 */
	void setQuellKonto(Konto value);

	/**
	 * Returns the value of the '<em><b>Ziel Konto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ziel Konto</em>' reference.
	 * @see #setZielKonto(Konto)
	 * @see modelXChange.GeneratedPackage#getBuchung_ZielKonto()
	 * @model required="true"
	 * @generated
	 */
	Konto getZielKonto();

	/**
	 * Sets the value of the '{@link modelXChange.Buchung#getZielKonto <em>Ziel Konto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ziel Konto</em>' reference.
	 * @see #getZielKonto()
	 * @generated
	 */
	void setZielKonto(Konto value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void buchen();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean validate();

} // Buchung
