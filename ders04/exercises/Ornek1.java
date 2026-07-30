package ders04.exercises;

public class Ornek1 {

    public static void main(String[] args) {

        int x = 1000;

        for (int i = x; i < 9999; i++) {

            int k = i / 100;
            int m = i % 100;

            int s = k * k + m * m;

            if (i == s) {
                System.out.println(s);
            }
        }
    }

}
