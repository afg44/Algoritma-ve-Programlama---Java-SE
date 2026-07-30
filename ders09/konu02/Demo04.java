package ders09.konu02;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
* Dosyadan okuma
* */
public class Demo04
{
    public static void main(String[] args)
    {
        // Reading File
        try {
            File Obj = new File("res//myfile.txt");
            Scanner sc = new Scanner(Obj);

            // Traversing File Data
            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                System.out.println(data);
            }

            sc.close();
        }

        // Exception Cases
        catch (FileNotFoundException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
}