package modelXChange.impl;

import modelXChange.GeneratedFactory;
import modelXChange.Konto;
import modelXChange.Waehrung;

public class Main {
	public static void main(String[] args) {
		GeneratedFactory factory = GeneratedFactory.eINSTANCE;
		Konto konto1 = factory.createKonto();
		Konto konto2 = factory.createKonto();
		
		konto1.setWaehrung(Waehrung.EUR);
		konto2.setWaehrung(Waehrung.NKR);
		
		konto1.setKontostand(263.34);
		konto2.setKontostand(342.56);
		
		konto1.ueberweisen(konto2, 50);
		System.out.println(konto1.getKontostand() + " " + konto2.getKontostand());
	}
}
