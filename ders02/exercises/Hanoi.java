package ders02.exercises;

public class Hanoi {

	/*** 
	 * /
	 * @param n: halka sayisi
	 * @param from: baslangic cubugunun numarasi
	 * @param to: hedef cubugunun numarasi
	 * @param free: bostaki cubugun numarasi
	 */
	static void TOH(int n, int from, int to, int free) {
		if (n == 1) {
			System.out.println(from + " den " + to + " e");
			return;
		}
		TOH(n - 1, from, free, to);						// f(n-1)
		System.out.println(from + " den " + to + " e"); 	// 1
		TOH(n - 1, free, to, from);							// f(n-1)
	}
	
	public static void main(String[] args) {
		int n = 4;
		TOH(n, 1, 3, 2);
	}

}
