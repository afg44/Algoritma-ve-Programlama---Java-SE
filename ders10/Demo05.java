package ders10;

import java.util.Arrays;
import java.util.List;

/*
sorted
 */
public class Demo05 {

    public static void main(String[] args){
        List<String> names = Arrays.asList("malatya", "bursa", "amasya");

        names.stream()
                .sorted()
                .forEach(System.out::println);

        List<Integer> nums = Arrays.asList(4,5,1,3,2);

        nums.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
