package ders05.konu1;

public class HighSchool extends PrimarySchool {

	String liseNumarasi;
	
	public HighSchool() {
		this(0, "isimsiz", "bilinmiyor");
	}
	
	public HighSchool(int tc, String isim, String n) {
		super(tc, isim);
		this.diploma = "Lise-diploması";
		this.liseNumarasi = n;
	}
	
	@Override
	public String toString() {
		return tc + ", " + isim + ", " + diploma + " liseNo: " + this.liseNumarasi;
	}
	
}
