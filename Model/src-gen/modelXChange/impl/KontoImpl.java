/**
 */
package modelXChange.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import modelXChange.GeneratedPackage;
import modelXChange.Inhaber;
import modelXChange.Konto;
import modelXChange.Waehrung;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Konto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link modelXChange.impl.KontoImpl#getWaehrung <em>Waehrung</em>}</li>
 *   <li>{@link modelXChange.impl.KontoImpl#getIBAN <em>IBAN</em>}</li>
 *   <li>{@link modelXChange.impl.KontoImpl#getBIC <em>BIC</em>}</li>
 *   <li>{@link modelXChange.impl.KontoImpl#getInhaber <em>Inhaber</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KontoImpl extends MinimalEObjectImpl.Container implements Konto {
	/**
	 * The default value of the '{@link #getWaehrung() <em>Waehrung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaehrung()
	 * @generated
	 * @ordered
	 */
	protected static final Waehrung WAEHRUNG_EDEFAULT = Waehrung.EUR;

	/**
	 * The cached value of the '{@link #getWaehrung() <em>Waehrung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaehrung()
	 * @generated
	 * @ordered
	 */
	protected Waehrung waehrung = WAEHRUNG_EDEFAULT;

	/**
	 * The default value of the '{@link #getIBAN() <em>IBAN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIBAN()
	 * @generated
	 * @ordered
	 */
	protected static final String IBAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIBAN() <em>IBAN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIBAN()
	 * @generated
	 * @ordered
	 */
	protected String iBAN = IBAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getBIC() <em>BIC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBIC()
	 * @generated
	 * @ordered
	 */
	protected static final String BIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBIC() <em>BIC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBIC()
	 * @generated
	 * @ordered
	 */
	protected String bIC = BIC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInhaber() <em>Inhaber</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInhaber()
	 * @generated
	 * @ordered
	 */
	protected EList<Inhaber> inhaber;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KontoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratedPackage.Literals.KONTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Waehrung getWaehrung() {
		return waehrung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWaehrung(Waehrung newWaehrung) {
		Waehrung oldWaehrung = waehrung;
		waehrung = newWaehrung == null ? WAEHRUNG_EDEFAULT : newWaehrung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratedPackage.KONTO__WAEHRUNG, oldWaehrung,
					waehrung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIBAN() {
		return iBAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIBAN(String newIBAN) {
		String oldIBAN = iBAN;
		iBAN = newIBAN;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratedPackage.KONTO__IBAN, oldIBAN, iBAN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBIC() {
		return bIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBIC(String newBIC) {
		String oldBIC = bIC;
		bIC = newBIC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratedPackage.KONTO__BIC, oldBIC, bIC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Inhaber> getInhaber() {
		if (inhaber == null) {
			inhaber = new EObjectWithInverseResolvingEList.ManyInverse<Inhaber>(Inhaber.class, this,
					GeneratedPackage.KONTO__INHABER, GeneratedPackage.INHABER__KONTO);
		}
		return inhaber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean ueberweisen(Konto zielKonto, double betrag) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratedPackage.KONTO__INHABER:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getInhaber()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratedPackage.KONTO__INHABER:
			return ((InternalEList<?>) getInhaber()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratedPackage.KONTO__WAEHRUNG:
			return getWaehrung();
		case GeneratedPackage.KONTO__IBAN:
			return getIBAN();
		case GeneratedPackage.KONTO__BIC:
			return getBIC();
		case GeneratedPackage.KONTO__INHABER:
			return getInhaber();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case GeneratedPackage.KONTO__WAEHRUNG:
			setWaehrung((Waehrung) newValue);
			return;
		case GeneratedPackage.KONTO__IBAN:
			setIBAN((String) newValue);
			return;
		case GeneratedPackage.KONTO__BIC:
			setBIC((String) newValue);
			return;
		case GeneratedPackage.KONTO__INHABER:
			getInhaber().clear();
			getInhaber().addAll((Collection<? extends Inhaber>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case GeneratedPackage.KONTO__WAEHRUNG:
			setWaehrung(WAEHRUNG_EDEFAULT);
			return;
		case GeneratedPackage.KONTO__IBAN:
			setIBAN(IBAN_EDEFAULT);
			return;
		case GeneratedPackage.KONTO__BIC:
			setBIC(BIC_EDEFAULT);
			return;
		case GeneratedPackage.KONTO__INHABER:
			getInhaber().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case GeneratedPackage.KONTO__WAEHRUNG:
			return waehrung != WAEHRUNG_EDEFAULT;
		case GeneratedPackage.KONTO__IBAN:
			return IBAN_EDEFAULT == null ? iBAN != null : !IBAN_EDEFAULT.equals(iBAN);
		case GeneratedPackage.KONTO__BIC:
			return BIC_EDEFAULT == null ? bIC != null : !BIC_EDEFAULT.equals(bIC);
		case GeneratedPackage.KONTO__INHABER:
			return inhaber != null && !inhaber.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case GeneratedPackage.KONTO___UEBERWEISEN__KONTO_DOUBLE:
			return ueberweisen((Konto) arguments.get(0), (Double) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (waehrung: ");
		result.append(waehrung);
		result.append(", iBAN: ");
		result.append(iBAN);
		result.append(", bIC: ");
		result.append(bIC);
		result.append(')');
		return result.toString();
	}

} //KontoImpl
