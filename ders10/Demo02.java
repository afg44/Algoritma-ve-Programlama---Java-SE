package ders10;

import java.util.Arrays;
import java.util.List;

/*
filter
 */
public class Demo02 {

    public static void main(String[] args){
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6);

        nums.stream()
                .filter(n -> n % 2 == 1)
                .forEach(System.out::println);
    }
}
