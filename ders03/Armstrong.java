package ders03;

import java.util.Scanner;

/**
 * ABC gibi üç basamaklı bir sayının basamaklarında yer alan
 * A, B ve C sayılarının küplerinin toplamı bu ABC sayısına
 * eşitse bu sayısa Armstrong sayısı denir

 KABAKOD:
 BAŞLA
 	sayi oku
 	temp = sayi
 	toplam = 0

 	TEKRAR temp > 0 olduğu sürece
 		basamak = temp mod 10
 		toplam = toplam + (basamak * basamak * basamak)
 		temp = temp / 10   // tam sayı bölme
 	TEKRAR SONU

 	EĞER toplam = sayi ise
 		"Armstrong sayısıdır" yaz
 	DEĞİLSE
 		"Armstrong sayısı değildir" yaz
 	BİTİR EĞER

 DUR

 */
public class Armstrong {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sayi = sc.nextInt();

		int temp = sayi;
		int toplam = 0;
		for(; temp > 0; temp /= 10){
			int basamak = temp % 10;
			toplam += basamak * basamak * basamak;
		}
		if(toplam == sayi)
			System.out.println(sayi + " Armstrong sayisisidir. ");
		else
			System.out.println(sayi + " Armstrong sayisisidir DEĞİLDİR.");

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

	public static void main3(String[] args) {
		for(int i=100; i < 999; i++) {
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


}
