package ders02.exercises;

public class AsalSayi {

	public static void main(String[] args) {
		int x = 11;
		System.out.println(x + " icin: " + asalMi(x));
	}

	public static boolean asalMi(int x) {
		if(x == 2) return true;
		else return asalHelper(x);
	}
	
	// 2 haricindeki asal sayilar icin
	private static boolean asalHelper(int x) {
		
		boolean bayrak = true;
		int limit = x / 2 + 1;
		
		for(int i=2; i < limit; i++) {
			if(x % i == 0) {
				System.out.println(x + " sayisi asal degildir!");
				bayrak = false;
				break;
			}
		}
		if(bayrak == true) {
			System.out.println(x + " asaldir");
		}
		return bayrak;
	}

}
