package ders03;

import java.util.Scanner;

/**
 * Mukemmel sayi: tam bolenlerinin toplamı kendisine esittir.
 * 6 -->1,2,3
 * 28-->1,2,4,7,14
 *
 KABAKOD
 BAŞLA
    n oku
    toplam = 0

    i = 1
    TEKRAR i < n olduğu sürece
        EĞER n mod i = 0 ise
            toplam = toplam + i
        BİTİR EĞER
    i = i + 1
    TEKRAR SONU

    EĞER toplam = n ise
        "Mükemmel sayıdır" yaz
    DEĞİLSE
        "Mükemmel sayı değildir" yaz
    BİTİR EĞER
 DUR

 */
public class MukemmelSayi {

    public static void main(String[] args) {

//        int n = 28;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int toplam = 0;

        int i = 1;
        while(i < n){
            if(n % i == 0){
                toplam = toplam + i ;
            }
            i++;
        }

        if(toplam == n)
            System.out.println(n + " mukemmel sayıdır");
        else
            System.out.println(n + " mukemmel sayıdır DEĞİLDİR");

    }

    public static void main2(String[] args) {

        for(int number = 2; number < 999; number++)
            if(mukemmelMi(number) == true)
                System.out.println(number + " mukemmel sayıdır");
    }

    public static boolean mukemmelMi(int number) {
        int total = 0;
        for(int i = 1; i< number; i++){
            if(number % i == 0){
                total = total +i ;
            }
        }
        if(total == number) return true;
        return false;
    }
}
