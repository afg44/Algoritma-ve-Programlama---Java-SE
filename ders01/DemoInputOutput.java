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


        System.out.print("Simdi de bir sayi giriniz: ");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
//        num = br.read();
//        System.out.println("girilen sayi: " + num); // 10 ?
        num = Integer.parseInt(br.readLine());
        System.out.println("girilen sayi: " + num);
//
        System.out.print("Girilen sayiyi Scanner ile de okuyabiliriz: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println("girilen sayi: " + num);

    }
}
