package ders05.konu1;

public class PrimarySchool extends Student {

	public PrimarySchool() {
		this(0, "isimsiz");
	}
	
	public PrimarySchool(int tc, String isim) {
		super(tc, isim, "ilkokul-diploması");
	}
}
