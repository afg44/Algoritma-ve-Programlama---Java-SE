package ders02;

public class Dizi1 {

	public static void main1(String[] args) {

		int[] dizi = new int[10];
		for(int i=0; i < 5; i++){
			double r = Math.random(); // [0.0 - 1.0)
			int rastgeleSayi = (int) (r*10);
			System.out.println(r + " -> " + rastgeleSayi + " olarak cast edildi");
			dizi[i] = rastgeleSayi;
		}
		for(int i=0; i < 10; i++){
			System.out.print(dizi[i] + " ");
		}
		System.out.println();

	}


	public static void main2(String[] args) {
		String ogrenci1 = "Engin";
		String ogrenci2 = "Derin";
		String ogrenci3 = "Yasemin";
		String ogrenci4 = "Pelin";

		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);

		System.out.println("-----------------------");

		String[] ogrenciler = new String[4];
		ogrenciler[0] = ogrenci1;
		ogrenciler[1] = ogrenci2;
		ogrenciler[2] = ogrenci3;
		ogrenciler[3] = ogrenci4;
//		ogrenciler[4] = "Ali";

		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		System.out.println("-----------------------");

		//collections
		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}

	}
// Jagged Array - Düzensiz dizi
public static void main(String[] a) {
		int[][] triangle = new int[10][];
		for(int i=0; i<triangle.length; i++) {
			triangle[i] = new int[i+1];
		}
		for(int i=0; i<triangle.length; i++) {
			for(int j=0; j<triangle[i].length; j++) {
				System.out.print(triangle[i][j] + " ");
			}
			System.out.println();
		}
	}
}
