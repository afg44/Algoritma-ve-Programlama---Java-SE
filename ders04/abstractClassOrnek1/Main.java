package ders04.abstractClassOrnek1;

/**
 * Class introduction
 * abstract class kullanimi
 * override vs abstract
 * final ve abstract methods
 * 
 * */

public class Main {

    public static void main(String[] args) {

		// hata
//		BodyMassCalculator calc = new BodyMassCalculator();
		BodyMassCalculator calc =
				new SpagettiBodyMassCalculator();
		calc.information();
//		calc.hesapla(1);
		SpagettiBodyMassCalculator calc2 =
				new SpagettiBodyMassCalculator();
		calc2.hesapla(1);

		System.out.println("*** Dogru kullanım *** ");

	    BodyMassCalculator woman =new WomanBodyMassCalculator();
	    woman.information();

	    BodyMassCalculator man =new ManBodyMassCalculator();
		man.information();

    }
}
