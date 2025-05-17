package ders04.ornek2;

public class Student {

	protected long tc;
	protected String isim;
	protected String diploma;

	public Student() {
		this(0, "isimsiz", "belirsiz");
	}

	public Student(int tc, String isim, String derece) {
		this.tc = tc;
		this.isim = isim;
		this.diploma = derece;
	}
	
	@Override
	public String toString() {
		return tc + ", " + isim + ", " + diploma;
	}
	
}
