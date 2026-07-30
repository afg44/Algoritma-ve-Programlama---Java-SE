package ders10;

import java.util.Arrays;
import java.util.List;

/*
map(): Her elemanı dönüştürür.
 */
public class Demo03 {

    public static void main(String[] args){
        List<String> names = Arrays.asList("malatya", "bursa", "amasya");

        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
