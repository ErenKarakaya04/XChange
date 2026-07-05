/**
 */
package modelXChange.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import modelXChange.Buchung;
import modelXChange.GeneratedPackage;
import modelXChange.Konto;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Buchung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link modelXChange.impl.BuchungImpl#getBetrag <em>Betrag</em>}</li>
 *   <li>{@link modelXChange.impl.BuchungImpl#getQuellKonto <em>Quell Konto</em>}</li>
 *   <li>{@link modelXChange.impl.BuchungImpl#getZielKonto <em>Ziel Konto</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BuchungImpl extends MinimalEObjectImpl.Container implements Buchung {
	/**
	 * The default value of the '{@link #getBetrag() <em>Betrag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBetrag()
	 * @generated
	 * @ordered
	 */
	protected static final double BETRAG_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBetrag() <em>Betrag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBetrag()
	 * @generated
	 * @ordered
	 */
	protected double betrag = BETRAG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getQuellKonto() <em>Quell Konto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuellKonto()
	 * @generated
	 * @ordered
	 */
	protected Konto quellKonto;

	/**
	 * The cached value of the '{@link #getZielKonto() <em>Ziel Konto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZielKonto()
	 * @generated
	 * @ordered
	 */
	protected Konto zielKonto;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuchungImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratedPackage.Literals.BUCHUNG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getBetrag() {
		return betrag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBetrag(double newBetrag) {
		double oldBetrag = betrag;
		betrag = newBetrag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratedPackage.BUCHUNG__BETRAG, oldBetrag, betrag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Konto getQuellKonto() {
		if (quellKonto != null && quellKonto.eIsProxy()) {
			InternalEObject oldQuellKonto = (InternalEObject) quellKonto;
			quellKonto = (Konto) eResolveProxy(oldQuellKonto);
			if (quellKonto != oldQuellKonto) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeneratedPackage.BUCHUNG__QUELL_KONTO,
							oldQuellKonto, quellKonto));
			}
		}
		return quellKonto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Konto basicGetQuellKonto() {
		return quellKonto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuellKonto(Konto newQuellKonto) {
		Konto oldQuellKonto = quellKonto;
		quellKonto = newQuellKonto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratedPackage.BUCHUNG__QUELL_KONTO, oldQuellKonto,
					quellKonto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Konto getZielKonto() {
		if (zielKonto != null && zielKonto.eIsProxy()) {
			InternalEObject oldZielKonto = (InternalEObject) zielKonto;
			zielKonto = (Konto) eResolveProxy(oldZielKonto);
			if (zielKonto != oldZielKonto) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeneratedPackage.BUCHUNG__ZIEL_KONTO,
							oldZielKonto, zielKonto));
			}
		}
		return zielKonto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Konto basicGetZielKonto() {
		return zielKonto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZielKonto(Konto newZielKonto) {
		Konto oldZielKonto = zielKonto;
		zielKonto = newZielKonto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratedPackage.BUCHUNG__ZIEL_KONTO, oldZielKonto,
					zielKonto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean buchen() {
		if(validate()) {
			double conversionRate = 1.0;
			if(quellKonto.getWaehrung() != zielKonto.getWaehrung()) {
				conversionRate = getExchangerate();
			}
			if(conversionRate > 0.0) {
				this.quellKonto.setKontostand(this.quellKonto.getKontostand()- this.betrag);
				this.zielKonto.setKontostand(this.zielKonto.getKontostand()+ this.betrag * conversionRate);
				return true;
			}
		}
		return false;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("deprecation")
	public double getExchangerate() {

	    String urlStr = "https://v6.exchangerate-api.com/v6/510f7dcfda5add27debafbca/latest/"
	            + quellKonto.getWaehrung().getName();

	    try {
	        URL url = new URL(urlStr);
	        HttpURLConnection request = (HttpURLConnection) url.openConnection();
	        request.setRequestMethod("GET");
	        request.connect();

	        // JSON lesen (MODERN korrekt)
	        JsonObject jsonobj = JsonParser
	                .parseReader(new InputStreamReader(request.getInputStream()))
	                .getAsJsonObject();

	        double rate = jsonobj
	                .getAsJsonObject("conversion_rates")
	                .get(zielKonto.getWaehrung().getName())
	                .getAsDouble();

	        request.disconnect();

	        return rate;

	    } catch (Exception e) {
	        e.printStackTrace();
	        return 0.0;
	    }
	}
	
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean validate() {
		return this.quellKonto.getKontostand() - this.betrag >= 0.0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratedPackage.BUCHUNG__BETRAG:
			return getBetrag();
		case GeneratedPackage.BUCHUNG__QUELL_KONTO:
			if (resolve)
				return getQuellKonto();
			return basicGetQuellKonto();
		case GeneratedPackage.BUCHUNG__ZIEL_KONTO:
			if (resolve)
				return getZielKonto();
			return basicGetZielKonto();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case GeneratedPackage.BUCHUNG__BETRAG:
			setBetrag((Double) newValue);
			return;
		case GeneratedPackage.BUCHUNG__QUELL_KONTO:
			setQuellKonto((Konto) newValue);
			return;
		case GeneratedPackage.BUCHUNG__ZIEL_KONTO:
			setZielKonto((Konto) newValue);
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
		case GeneratedPackage.BUCHUNG__BETRAG:
			setBetrag(BETRAG_EDEFAULT);
			return;
		case GeneratedPackage.BUCHUNG__QUELL_KONTO:
			setQuellKonto((Konto) null);
			return;
		case GeneratedPackage.BUCHUNG__ZIEL_KONTO:
			setZielKonto((Konto) null);
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
		case GeneratedPackage.BUCHUNG__BETRAG:
			return betrag != BETRAG_EDEFAULT;
		case GeneratedPackage.BUCHUNG__QUELL_KONTO:
			return quellKonto != null;
		case GeneratedPackage.BUCHUNG__ZIEL_KONTO:
			return zielKonto != null;
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
		case GeneratedPackage.BUCHUNG___BUCHEN:
			return buchen();
		case GeneratedPackage.BUCHUNG___VALIDATE:
			return validate();
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
		result.append(" (betrag: ");
		result.append(betrag);
		result.append(')');
		return result.toString();
	}

} //BuchungImpl
