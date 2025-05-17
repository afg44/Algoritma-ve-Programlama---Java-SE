package ders04.ornek2;

public class HighSchool extends PrimarySchool {

	String ilkOkulMezuniyetDerecesi;
	
	public HighSchool() {
		this(0, "isimsiz", "iyi");
	}
	
	public HighSchool(int tc, String isim, String mezuniyetDerece) {
//		this.ilkOkulDerecesi = i;
		super(tc, isim);
		this.diploma = "Lise";
		this.ilkOkulMezuniyetDerecesi = mezuniyetDerece;
	}
	
	@Override
	public String toString() {
		return tc + ", " + isim + ", " + diploma + " ilkokul mezuniyet derecesi: " + this.ilkOkulMezuniyetDerecesi;
	}
	
}
