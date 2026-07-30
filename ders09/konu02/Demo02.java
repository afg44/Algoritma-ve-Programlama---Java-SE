package ders09.konu02;

import java.io.File;
import java.io.IOException;
/*
* Dosya oluşturma
* */
public class Demo02
{
    public static void main(String[] args)
    {

        try {
            File Obj = new File("res//myfile.txt");

            // Creating File
            if (Obj.createNewFile()) {
                System.out.println("File created: " + Obj.getName());
            }
            else {
                System.out.println("File already exists.");
            }
        }

        // Exception Thrown
        catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
}