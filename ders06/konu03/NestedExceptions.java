package ders06.konu03;

import java.util.Scanner;

public class NestedExceptions {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String bir = scanner.nextLine();
		String iki = scanner.nextLine();
		
		try {
			int rBir = Integer.parseInt(bir);
			int rIki = Integer.parseInt(iki);
			try {
//				System.out.println(rBir/(double)rIki); // Inf
				System.out.println(rBir/rIki); // exception
			} catch(ArithmeticException e) {
				System.out.println("ArithmeticException");
			}
		} catch(NumberFormatException e) {
			System.out.println("Format hatasi");
		} 
		
	}

}
