package ders02.exercises;

/**
 * Mukemmel sayi: tam bolenlerinin toplamı kendisine esittir.
 * 6 -->1,2,3
 * 28-->1,2,4,7,14
 */
public class MukemmelSayi {

    public static void main2(String[] args) {

        int number = 28;
        int total = 0;
        for(int i=1;i<number;i++){
            if(number % i == 0){
                total = total +i ;
            }
        }
        if(total == number){
            System.out.println(number + " mukemmel sayıdır");
        }

    }

    public static void main(String[] args) {

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
