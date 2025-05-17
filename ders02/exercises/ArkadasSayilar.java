package ders02.exercises;
/**
 * Birinci sayının tam bölenlerinin toplamı ikinciye
 * ve ikinci sayının tam bölenlerinin toplamı da birinciye eşittir
 */
public class ArkadasSayilar {

	public static void main(String[] args) {

		ArkadasSayilar obj = new ArkadasSayilar();
		for(int s=100; s<2222; s++){
			for(int ss=s+1; ss<2222; ss++)
				if(obj.arkadasMi(s,ss) == true)
					System.out.println(s + " ve " + ss + " arkadas");
		}
	}

	public boolean arkadasMi(int _1, int _2) {
		int bolenler_1 = 0;
		int bolenler_2 = 0;

		for (int i = 1; i < _1; i++) {
			if (_1 % i == 0)
				bolenler_1 += i;
		}
		for (int i = 1; i < _2; i++) {
			if (_2 % i == 0)
				bolenler_2 += i;
		}
		if (_1 == bolenler_2 && _2 == bolenler_1)
			return true;
		else return false;
	}

	public static void main2(String[] args) {

		int bir = 220;
		int iki = 284;

		int toplam1 = 0;
		int toplam2 = 0;

		for (int i = 1; i < bir; i++) {
			if (bir % i == 0)
				toplam1 += i;
		}
		for (int i = 1; i < iki; i++) {
			if (iki % i == 0)
				toplam2 += i;
		}

		if (bir == toplam2 && iki == toplam1)
			System.out.println(bir + " ve " + iki + " arkadas");
	}
}
