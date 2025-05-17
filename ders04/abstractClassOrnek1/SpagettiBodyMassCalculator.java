package ders04.abstractClassOrnek1;

public class SpagettiBodyMassCalculator extends BodyMassCalculator {
	
	// Override yaparak kullanma 
	
    @Override
    public void hesapla() {

    }
    
    /**
     * Spagetti kod ornegi
     * */
    public void hesapla(int tip) {
    	if(tip == 0) { // cocuk
    		System.out.println("Puan: 100");
    	} else if(tip == 1) { // kadin
    		System.out.println("Puan: 95");
    	} else if(tip == 2) { // erkek
    		System.out.println("Puan: 90");
    	} else { // beklenmeyen durum
    		
    	} 
    	
    }
    
}
