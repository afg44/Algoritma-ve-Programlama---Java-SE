package ders09.konu02;

import java.io.File;

/*
* Dosya mevcut mu?
* */
public class Demo07 {
    public static void main(String[] args) {
        // Create a File object
        File obj = new File("res//myfile.txt");

        // Check if the file exists
        if (obj.exists()) {
            System.out.println("The file exists.");  // One-line explanation
        } else {
            System.out.println("The file does not exist.");
        }
    }
}