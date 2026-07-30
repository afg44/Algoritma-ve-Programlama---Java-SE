package ders10;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
anyMatch(): Koşulu sağlayan eleman var mı?
 */
public class Demo11 {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(-1, 0, 1, 2, 3);

        boolean result = nums.stream().anyMatch(x -> x > 3);
        System.out.println(result);


        result = nums.stream().anyMatch(Demo11::isPrime);
        System.out.println(result);
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
