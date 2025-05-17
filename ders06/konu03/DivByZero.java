package ders06.konu03;

public class DivByZero {

	public static void main(String[] args) {

		exceptionVerenMetot();
		metot1();
		System.out.println("main metodu bitti.");
	}

	private static void metot1() {
		System.out.println("Metot 1");
		metot2();
	}
	
	private static void metot2() {
		System.out.println("Metot 2");
		try {
			exceptionVerenMetot();
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
		} catch (Exception exception){
            System.out.println("Exception");
        }
	}
	
	private static void exceptionVerenMetot() {
//		System.out.println(3./0);
		System.out.println(3/0);
		System.out.println("Beni ekrana yazar misin?");
	}

}
