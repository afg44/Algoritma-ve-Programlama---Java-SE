package ders09.konu02;

import java.io.File;

/*
* File nesnesi mevcut mu
* */
class Demo01{

    public static void main(String[] args){

        // File name specified
        File obj = new File("res//myfile.txt");
        System.out.println(obj.exists());
    }
}