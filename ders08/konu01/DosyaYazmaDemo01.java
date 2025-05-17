package ders08.konu01;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 Java provides stream classes for reading from and writing to
 files and other input/output sources.

 There are two main types:
 Byte Streams (InputStream, OutputStream) – for binary data
 Character Streams (Reader, Writer) – for text data
 */

public class DosyaYazmaDemo01 {

	public static void main(String[] args) {

		String fileName = "res//Ders08_DosyaOps.txt";
		PrintWriter outputStream = null;
		try {
			outputStream = new PrintWriter(fileName);
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
			System.exit(0);
		}
		System.out.println("Uc satir yazi yaziniz...");
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i < 3; i++) {
			System.out.print("> ");
			String line = scanner.nextLine();
			outputStream.println((i+1) + ") " + line);	
		}
		outputStream.close();
	}
}