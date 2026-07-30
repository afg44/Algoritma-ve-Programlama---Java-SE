package ders05.konu3.ornek1;

/**
 * Abstract class introduction
 * override vs abstract
 * final ve abstract methods
 * 
 * */

public class Main {

    public static void main(String[] args) {

		// hata
//		BodyMassCalculator calc = new BodyMassCalculator();
		BodyMassCalculator calc1 =
				new SpagettiBodyMassCalculator();
//		SpagettiBodyMassCalculator calc1 = new SpagettiBodyMassCalculator();
		calc1.information();
//		calc1.hesapla(1);

		System.out.println("*** Dogru kullanım *** ");

	    BodyMassCalculator woman =new WomanBodyMassCalculator();
		woman.hesapla();
	    woman.information();

	    BodyMassCalculator man =new ManBodyMassCalculator();
		woman.hesapla();
		man.information();

    }
}
