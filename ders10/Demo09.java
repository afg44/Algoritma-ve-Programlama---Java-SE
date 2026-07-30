package ders10;

import java.util.Arrays;
import java.util.List;

/*
count(): Eleman sayısını verir.
 */
public class Demo09 {

    public static void main(String[] args){
        List<String> names = Arrays.asList(
                "malatya", "bursa", "istanbul",
                "zonguldak", "malatya", "bursa",
                "istanbul", "ısparta", "kastamonu");

        long count = names.stream().count();
        System.out.println("count: " + count);

        count = names.stream()
                .distinct()
                .count();
        System.out.println("(distinct) count: " + count);
    }
}
