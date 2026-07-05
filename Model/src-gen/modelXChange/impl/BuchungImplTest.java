package modelXChange.impl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modelXChange.Buchung;
import modelXChange.GeneratedFactory;
import modelXChange.Konto;
import modelXChange.Waehrung;

class BuchungImplTest {
	GeneratedFactory factory = GeneratedFactory.eINSTANCE;
	Konto konto1 = factory.createKonto();
	Konto konto2 = factory.createKonto();
	Konto konto3 = factory.createKonto();
	Buchung buchung1 = factory.createBuchung();
	Buchung buchung2 = factory.createBuchung();
	Buchung buchung3 = factory.createBuchung();
	Buchung buchung4 = factory.createBuchung();
	Buchung buchung5 = factory.createBuchung();

	@BeforeEach
	void setUp() throws Exception {
		konto1.setWaehrung(Waehrung.EUR);
		konto2.setWaehrung(Waehrung.NKR);
		konto3.setWaehrung(Waehrung.EUR);
		
		konto1.setKontostand(263.34);
		konto2.setKontostand(342.56);
		konto3.setKontostand(0);
		
		buchung1.setQuellKonto(konto1); // Gültige Buchung EUR-EUR
		buchung2.setQuellKonto(konto1); // Gültige Buchung EUR-NRK
		buchung3.setQuellKonto(konto1); // Ungültig Betrag zu hoch
		buchung4.setQuellKonto(null); // Quellkonto nicht gesetzt
		buchung5.setQuellKonto(konto1); // Zielkonto nicht gesetzt
		
		buchung1.setZielKonto(konto3);
		buchung2.setZielKonto(konto2);
		buchung3.setZielKonto(konto1);
		buchung4.setZielKonto(konto2);
		buchung5.setZielKonto(null);
		
		buchung1.setBetrag(10.57);
		buchung2.setBetrag(29.45);
		buchung3.setBetrag(300.34);
		buchung4.setBetrag(2);
		buchung5.setBetrag(5);
	}

	@Test
	void testBuchen() {
		assertTrue(buchung1.buchen());
		assertTrue(buchung2.buchen());
		assertFalse(buchung3.buchen());
		assertFalse(buchung4.buchen());
		assertFalse(buchung5.buchen());
	}

	@Test
	void testValidate() {
		assertTrue(buchung1.validate());
		assertTrue(buchung2.validate());
		assertFalse(buchung3.validate());
		assertFalse(buchung4.validate());
		assertFalse(buchung5.validate());
	}

}
