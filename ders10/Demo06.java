package ders10;

import java.util.Arrays;
import java.util.List;

/*
distinct: farklı, benzersiz
 */
public class Demo06 {

    public static void main(String[] args){
        List<String> names = Arrays.asList(
                "malatya", "bursa", "amasya",
                "zonguldak", "malatya", "bursa");

        names.stream()
                .distinct()
                .forEach(System.out::println);

        List<Integer> nums = Arrays.asList(2,1,1,2,3,3,5,4,4,5);

        nums.stream()
                .distinct()
                .forEach(System.out::println);
    }
}
