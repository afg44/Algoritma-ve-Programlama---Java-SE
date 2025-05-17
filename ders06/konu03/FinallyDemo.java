package ders06.konu03;

public class FinallyDemo {

	static void myMethod(int n) throws Exception {
		try {
			switch (n) {
			case 1:
				System.out.println("1st case");
				return;
			case 3:
				System.out.println("3rd case");
				throw new RuntimeException("3!");
			case 4:
				System.out.println("4th case");
				throw new Exception("4!");
			case 2:
				System.out.println("2nd case");
			}
		} catch (RuntimeException e) {
			System.out.println("RuntimeException in myMethod");
//			System.out.println(e.getMessage());
		} finally {
			System.out.println("Finally in myMethod");
		}
		System.out.println("myMethod tamamlandi");
	}

	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			try {
				FinallyDemo.myMethod(i);
			} catch (Exception e) {
				System.out.print("Exception main icinde yakalandi: " + i);
			}
			System.out.println();
		}
	}

}
