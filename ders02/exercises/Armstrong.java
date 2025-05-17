package ders02.exercises;

/**
 * ABC gibi üç basamaklı bir sayının basamaklarında yer alan
 * A, B ve C sayılarının küplerinin toplamı bu ABC sayısına
 * eşitse bu sayısa Armstrong sayısı denir
 */
public class Armstrong {

	public static void main(String[] args) {
		for(int i=100; i < 999; i++) {
//			int sayi = 153;
			int sayi = i;
			int toplam = 0;
			int sayi2 = sayi;
			while (sayi2 > 0) {
				int kalan = sayi2 % 10;
				toplam += kalan * kalan * kalan;
				sayi2 = sayi2 / 10;
			}
			if (sayi == toplam)
				System.out.println(sayi + " bir Armstrong sayisidir");
		}
	}

	public static void main2(String[] args) {

		for (int a = 1; a < 9; a++) {
			for (int b = 0; b < 9; b++) {
				for (int c = 0; c < 9; c++) {
					int cube = a * a * a + b * b * b + c * c * c;
					int sum = 100 * a + 10 * b + c;
					if (sum == cube) {
						System.out.println(sum);
					}
				}
			}
		}

	}

}
