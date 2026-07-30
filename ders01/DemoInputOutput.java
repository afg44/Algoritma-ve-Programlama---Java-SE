package ders01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DemoInputOutput {

    public static void main(String[] args) throws IOException {
        int num;
//        System.out.print("Bir rakam giriniz: ");
//        num = System.in.read();
//        // ASCII code 0-48, 1-49, ...
//        System.out.println("girilen rakam: " + num);

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
//        System.out.print("BufferedReader ile okumak için bir sayi giriniz: ");
//        num = br.read();
//        System.out.println("girilen sayi: " + num);
        // 10 ?
        // Reads a single character.

//        System.out.println("Şimdi yeniden giriniz: ");
//        num = Integer.parseInt(br.readLine());
//        System.out.println("girilen sayi: " + num);

        System.out.println("Şimdi bir satır veri giriniz: ");
        do{
            num = br.read();
            System.out.println("num: " + num);
        } while(num != 10);


//        System.out.print("Scanner ile girilen sayıyı okuyalım: ");
//        Scanner sc = new Scanner(System.in);
//        num = sc.nextInt();
//        System.out.println("girilen sayi: " + num);

    }
}
