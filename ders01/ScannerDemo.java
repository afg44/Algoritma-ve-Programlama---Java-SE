package ders01;

import java.util.Scanner;

public class ScannerDemo {
	
	public void omletYap(){
		
		System.out.println("Omlet icin kac yumurta istersiniz?");
		Scanner keyboard = new Scanner(System.in);
		int sayi = keyboard.nextInt();
		System.out.println(sayi + " tane yumurta ile omlet yapalim");
	}
	public void delimeterOrnek(){
//		Scanner scanner = new Scanner("This is a sentence");
		Scanner scanner = new Scanner("This-is-a-sentence");
		scanner.useDelimiter("-");
		while(scanner.hasNext())
			System.out.println(scanner.next());
	}

	public static void main(String[] args){
		ScannerDemo obj = new ScannerDemo();
//		obj.omletYap();
		obj.delimeterOrnek();
	}
	
}