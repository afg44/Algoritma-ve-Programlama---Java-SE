package ders01;

import static ders01.Fonksiyonlar.*;


public class AritmetikveDegiskenler {

	public static void main(String[] args) {
		
		// Tamsayı: byte, short, int, long
		// Kesirli sayı: float, double : IEEE 754 standardı
		// Karakter: char
		// Doğru/Yanlış: boolean

//		int x = 10;
//		int x = 0b1010;
//		int x = 012;
		int x = 0xA;
		System.out.println("\t"+x);
		System.out.println("---------------------");

		long longInt = 10L;
//		float f = 0.5F;
		float f = (float) 0.5; // casting
		for(int i=0; i < 1000; i++)
			f += 0.0001;
		System.out.println("\tHassasiyet problemi:"+f);
		System.out.println("---------------------");

		// literals: 10, 3.14, null, true, 10L
		int maas = 10_00_000;
		System.out.println("maaşınız: " + maas);
		System.out.println("---------------------");

//		double avagadro = 602e-21;
		double pi = 314e-2;
		System.out.println("\t"+pi);
		System.out.println("---------------------");

		int aa = 384; // 256
		byte bb = 127;
		bb = (byte) aa;
		System.out.println("\t"+bb);
		System.out.println("---------------------");

		double cc = 3.14;
		aa = (int) cc;
		System.out.println("\t"+aa);
		System.out.println("---------------------");

		byte b1 = 10;
		byte b2 = 30;
		int aaa = b1 * b2; // type promotion
		System.out.println("\t"+aaa);
		System.out.println("---------------------");

		aaa = 1 + 3 * 9 - 2 / 2;
//		aaa = (1 + 3) * ((9 - 2) / 2);
		System.out.println("\t"+aaa);
		System.out.println("---------------------");

		//aaa = 8 - 3 * 2 - 1 + 1;
		aaa = (8 - 3) * (2 - (1 + 1));
		System.out.println("\t"+aaa);
		System.out.println("---------------------");

		// Local Variable Type Inference, JDK10+
//		var q; // error
		int var = 0;
//		var nums[] = new int[5]; // error
//		var p = 10;		// error
		var p = "Gaziantep";
		p = "Malatya";
		System.out.println("\tvar kullanimi: "+p);
		System.out.println("---------------------");

		int a = 28;
		int b = 12;
		int c = a % b;
		System.out.println(c);

		int xx = 6;
		int ff = faktoriyel(xx);
		System.out.println(xx + "! = " + ff);

	}

}
