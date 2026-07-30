package ders01;

import java.util.Scanner;

/*

Üç değişkenin içinden en büyük olan ikinci sayıyı bulan algoritma

x, y ve z değerlerini OKU
EGER x > y ise:
    EGER z > x ise: SONUC = x
    DEGILSE EGER y > z ise: SONUC = y
            DEGILSE: SONUC = z
DEGILSE (y >= x olma durumu):
    EGER y > z ise:
        EGER z > x ise: SONUC = z
        DEGILSE: SONUC = x
    DEGILSE (z >= y olma durumu): SONUC = y
PRINT SONUC

 */
public class Ornek2 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // x, y ve z değerlerini oku
        System.out.print("x değerini gir: ");
        int x = input.nextInt();
        System.out.print("y değerini gir: ");
        int y = input.nextInt();
        System.out.print("z değerini gir: ");
        int z = input.nextInt();

        int sonuc;

        if (x > y) {
            if (z > x) {
                sonuc = x;
            } else if (y > z) {
                sonuc = y;
            } else {
                sonuc = z;
            }
        } else { // y >= x durumu
            if (y > z) {
                if (z > x) {
                    sonuc = z;
                } else {
                    sonuc = x;
                }
            } else { // z >= y durumu
                sonuc = y;
            }
        }

        System.out.println("SONUC = " + sonuc);
    }

}
