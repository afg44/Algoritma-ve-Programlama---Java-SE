package ders01;

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
		System.out.println("\t\t x: " + x);
		System.out.println("---------------------");

		// long max: $$9.223.372.036.854.775.807$$
		long max = Long.MAX_VALUE;
		System.out.println("Long Maksimum Değer: " + max);

		long longInt = 2147483647 + 1;
//		long longInt = 2147483648L;
		System.out.println("\t\t longInt: " + longInt);
		System.out.println("---------------------");

//		float f = 0.5F;
//		float f = (float) 0.5; // casting
		double f = 0.5;
		for(int i=0; i < 10_000; i++)
			f += 0.0001;
		System.out.println("\t(Hassasiyet problemi) f:" + f);
		System.out.println("---------------------");

		// literals: 10, 3.14, null, true, 10L
		int maas = 10_00_000;
		System.out.println("Aylık Maaşınız: " + maas);
		System.out.println("---------------------");

//		Bilimsel gösterim
		double pi = 314e-2;
		System.out.println("\t pi sayısı: "+pi);
		System.out.println("---------------------");

		int aa = 256;
		byte bb = (byte) aa;
		System.out.println("\t bb: " + bb);
		System.out.println("---------------------");

		double cc = 3.99;
		aa = (int) cc;
		System.out.println("\t aa: " + aa);
		System.out.println("---------------------");

		byte b1 = 10;
		byte b2 = 30;
		int aaa = b1 * b2; // type promotion
		System.out.println("\t aaa: " + aaa);
		System.out.println("---------------------");

		int a = 28;
		int b = 12;
		int c = a % b;	// kalan işlemi
		System.out.println("\t c:"+c);

		// Local Variable Type Inference, JDK10 ve sonrası (JDK10+)
//		var q; // error
		var q = 1;
		System.out.println("\t q:"+q);

		/*
		Java'da (Java 10 ve sonrası) sadece yerel değişkenlerde kullanılır ve
		köşeli parantez [] ile birlikte kullanılamaz. Yani var nums[] şeklinde yazmak
		sentaks hatasıdır.
		*/
//		var nums[] = new int[5]; // error
		var nums = new int[5]; // çalışır, derleyici int[] olduğunu anlar
		System.out.println("\t 0. eleman " + nums[0]);
		System.out.println("\t 4. eleman " + nums[4]);

		var p = "Gaziantep"; //derleyici burada p'nin tipini String olarak belirler (infer eder)
//		p = 10;				// error
		/*
		Java statically typed (statik tipli) bir dildir, değişkenin tipi
		derleme zamanında kesinleşir ve bir daha değişmez.
		*/
		System.out.println("\t (var kullanimi) p: "+ p);
		System.out.println("---------------------");

	}

}
