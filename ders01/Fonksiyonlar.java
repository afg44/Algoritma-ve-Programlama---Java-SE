package ders01;

public class Fonksiyonlar {

	public static int faktoriyel(int n) {
		int sonuc = 1;
		for(int i = n; i > 1; i--)
			sonuc = sonuc * i;
		return sonuc;
	}
	
	public static int faktoriyel2(int n) {
		if(n <= 1) return 1;
		return n * faktoriyel2(n-1);
	}
	
	
	public static void main(String[] args) {
	
		int x = 3;
		int f = faktoriyel(x);
		System.out.println(x + "! = " + f);

		x = 4;
		f = faktoriyel2(x);
		System.out.println(x + "! = " + f);

	}

}
