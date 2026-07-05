/**
 */
package modelXChange.impl;

import java.util.Collection;

import modelXChange.GeneratedPackage;
import modelXChange.Inhaber;
import modelXChange.Konto;

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
 * An implementation of the model object '<em><b>Inhaber</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link modelXChange.impl.InhaberImpl#getName <em>Name</em>}</li>
 *   <li>{@link modelXChange.impl.InhaberImpl#getAnschrift <em>Anschrift</em>}</li>
 *   <li>{@link modelXChange.impl.InhaberImpl#getTelefonnummer <em>Telefonnummer</em>}</li>
 *   <li>{@link modelXChange.impl.InhaberImpl#getKonto <em>Konto</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InhaberImpl extends MinimalEObjectImpl.Container implements Inhaber {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnschrift() <em>Anschrift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnschrift()
	 * @generated
	 * @ordered
	 */
	protected static final String ANSCHRIFT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnschrift() <em>Anschrift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnschrift()
	 * @generated
	 * @ordered
	 */
	protected String anschrift = ANSCHRIFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTelefonnummer() <em>Telefonnummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelefonnummer()
	 * @generated
	 * @ordered
	 */
	protected static final String TELEFONNUMMER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTelefonnummer() <em>Telefonnummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelefonnummer()
	 * @generated
	 * @ordered
	 */
	protected String telefonnummer = TELEFONNUMMER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getKonto() <em>Konto</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKonto()
	 * @generated
	 * @ordered
	 */
	protected EList<Konto> konto;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InhaberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratedPackage.Literals.INHABER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratedPackage.INHABER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAnschrift() {
		return anschrift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnschrift(String newAnschrift) {
		String oldAnschrift = anschrift;
		anschrift = newAnschrift;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratedPackage.INHABER__ANSCHRIFT, oldAnschrift,
					anschrift));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTelefonnummer() {
		return telefonnummer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTelefonnummer(String newTelefonnummer) {
		String oldTelefonnummer = telefonnummer;
		telefonnummer = newTelefonnummer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratedPackage.INHABER__TELEFONNUMMER,
					oldTelefonnummer, telefonnummer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Konto> getKonto() {
		if (konto == null) {
			konto = new EObjectWithInverseResolvingEList.ManyInverse<Konto>(Konto.class, this,
					GeneratedPackage.INHABER__KONTO, GeneratedPackage.KONTO__INHABER);
		}
		return konto;
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
		case GeneratedPackage.INHABER__KONTO:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getKonto()).basicAdd(otherEnd, msgs);
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
		case GeneratedPackage.INHABER__KONTO:
			return ((InternalEList<?>) getKonto()).basicRemove(otherEnd, msgs);
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
		case GeneratedPackage.INHABER__NAME:
			return getName();
		case GeneratedPackage.INHABER__ANSCHRIFT:
			return getAnschrift();
		case GeneratedPackage.INHABER__TELEFONNUMMER:
			return getTelefonnummer();
		case GeneratedPackage.INHABER__KONTO:
			return getKonto();
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
		case GeneratedPackage.INHABER__NAME:
			setName((String) newValue);
			return;
		case GeneratedPackage.INHABER__ANSCHRIFT:
			setAnschrift((String) newValue);
			return;
		case GeneratedPackage.INHABER__TELEFONNUMMER:
			setTelefonnummer((String) newValue);
			return;
		case GeneratedPackage.INHABER__KONTO:
			getKonto().clear();
			getKonto().addAll((Collection<? extends Konto>) newValue);
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
		case GeneratedPackage.INHABER__NAME:
			setName(NAME_EDEFAULT);
			return;
		case GeneratedPackage.INHABER__ANSCHRIFT:
			setAnschrift(ANSCHRIFT_EDEFAULT);
			return;
		case GeneratedPackage.INHABER__TELEFONNUMMER:
			setTelefonnummer(TELEFONNUMMER_EDEFAULT);
			return;
		case GeneratedPackage.INHABER__KONTO:
			getKonto().clear();
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
		case GeneratedPackage.INHABER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case GeneratedPackage.INHABER__ANSCHRIFT:
			return ANSCHRIFT_EDEFAULT == null ? anschrift != null : !ANSCHRIFT_EDEFAULT.equals(anschrift);
		case GeneratedPackage.INHABER__TELEFONNUMMER:
			return TELEFONNUMMER_EDEFAULT == null ? telefonnummer != null
					: !TELEFONNUMMER_EDEFAULT.equals(telefonnummer);
		case GeneratedPackage.INHABER__KONTO:
			return konto != null && !konto.isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(" (Name: ");
		result.append(name);
		result.append(", Anschrift: ");
		result.append(anschrift);
		result.append(", Telefonnummer: ");
		result.append(telefonnummer);
		result.append(')');
		return result.toString();
	}

} //InhaberImpl
