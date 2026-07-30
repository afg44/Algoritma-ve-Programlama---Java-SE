package ders09.konu02;

import java.io.File;

/*
* Dosya silme
* */
public class Demo09
{
    public static void main(String[] args)
    {
        File Obj = new File("res//myfile.txt");

        // Deleting File
        if (Obj.delete()) {
            System.out.println("The deleted file is : " + Obj.getName());
        }
        else {
            System.out.println(
                    "Failed in deleting the file.");
        }
    }
}