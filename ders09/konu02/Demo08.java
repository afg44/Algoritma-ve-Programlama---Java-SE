package ders09.konu02;

import java.io.File;

/*
* Tam (Absolute) path
* */
public class Demo08 {
    public static void main(String[] args) {
        // Create a File object
        File obj = new File("res//myfile.txt");

        // Print the absolute path of the file
        System.out.println("Absolute Path: " + obj.getAbsolutePath());
    }
}