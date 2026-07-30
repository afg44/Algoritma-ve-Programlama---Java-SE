package ders09.konu02;

import java.io.File;
import java.io.IOException;

/*
* Dosya okunabilir/yazılabilir mi kontrol edelim
* */
public class Demo06 {
    public static void main(String[] args) {
        try {
            // Create a new file
            File obj = new File("res//myfile.txt");

            if (obj.createNewFile()) {
                System.out.println("File created: " + obj.getName());
            } else {
                System.out.println("File already exists.");
            }

            // Check if the file is readable
            if (obj.canRead()) {
                System.out.println("The file is readable.");
            } else {
                System.out.println("The file is not readable.");
            }

            // Check if the file is writable
            if (obj.canWrite()) {
                System.out.println("Bu dosyaya yazılabilir.");
            } else {
                System.out.println("Bu dosyanın yazma izni yok");
            }

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}