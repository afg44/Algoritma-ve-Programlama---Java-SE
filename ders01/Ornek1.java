package ders01;

import java.util.Scanner;

/*
Kullanıcıdan x, y ve z değişkenlerini alıp
bu üç değişkenin içinden en büyük olanı bulan kabakod

x, y ve z değerlerini OKU
max = x
EGER y > max ise:
    max = y
EGER z > max ise:
    max = z
YAZDIR (max)

 */
public class Ornek1 {

    public static void main(String args[]){

        int x = 3;
        int y = 2;
        int z = 4;

        Scanner obje = new Scanner(System.in);
        x = obje.nextInt();
        y = obje.nextInt();
        z = obje.nextInt();

        int max = x;
        if(y > max)
            max = y;
        if(z > max)
            max = z;
        System.out.println(max);



    }

}
