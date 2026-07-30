package ders09.konu02;

import java.io.FileWriter;
import java.io.IOException;

/*
* Dosyaya yazma
* */
public class Demo03
{
    public static void main(String[] args)
    {
        // Writing Text File
        try {

            FileWriter Writer =
                    new FileWriter(
                            "res//myfile.txt",
                            true
                    );

            // Writing File
            Writer.write("Bugün 13.05.2026 Çarşamba");

            Writer.close();

            System.out.println("Successfully written.");
        }

        // Exception Thrown
        catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
}