package ders08.konu01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Object serialization *

 Java provides stream classes for reading from and writing to
 files and other input/output sources.

 There are two main types:
 Byte Streams (InputStream, OutputStream) – for binary data
 Character Streams (Reader, Writer) – for text data

 */

public class DosyaYazmaDemo02 {

	public static void main(String[] args) {

		String fileName = "res//Ders08_DosyaOps.txt";
		ObjectOutputStream outputStream = null;

		try {
			outputStream = new ObjectOutputStream(new FileOutputStream(fileName));
		} catch (IOException e) {
			System.out.println("Exception!");
			System.exit(0);
		}

		Demo02Obj califCondor = new Demo02Obj("Calif. Condor", 27, 0.02);
		Demo02Obj blackRhino = new Demo02Obj("Black Rhino", 100, 1.0);

		try {
			outputStream.writeObject(califCondor);
			outputStream.writeObject(blackRhino);
			outputStream.close();
		} catch (IOException e) {
			System.out.println(e);
			System.exit(0);
		}

		ObjectInputStream inputStream = null;
		try {
			inputStream = new ObjectInputStream(new FileInputStream(fileName));
		} catch (IOException e) {
			System.out.println("Error opening input file " + fileName + ".");
			System.exit(0);
		}
		Demo02Obj readOne = null, readTwo = null;
		try {
			readOne = (Demo02Obj) inputStream.readObject();
			readTwo = (Demo02Obj) inputStream.readObject();
			inputStream.close();
		} catch (Exception e) {
			System.exit(0);
		}
		System.out.println("The following were read\n" + "from the file '" + fileName + "'");
		System.out.println(readOne);
		System.out.println();
		System.out.println(readTwo);
		System.out.println("End of program.");
	}
}