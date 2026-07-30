package ders02;

import java.util.Scanner;
/*
BAŞLA
n oku
toplam = 0
i = 1
i ≤ n ?
    EVET →
        toplam += i
        i = i + 1
        geri dön koşula
    HAYIR →
        toplam yaz
DUR
 */
public class Ornek3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("n değerini giriniz: ");
        int n = scanner.nextInt();

        int toplam = 0;
        int i = 1;

        while (i < n) {
            i = i + 1;
            toplam = toplam + i;
        }

        System.out.println("Toplam = " + toplam);
    }
}