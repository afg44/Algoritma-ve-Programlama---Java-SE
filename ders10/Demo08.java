package ders10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
collect(): Sonuçları koleksiyona dönüştürür.
 */
public class Demo08 {

    public static void main(String[] args){
        List<String> names = Arrays.asList(
                "malatya", "bursa", "amasya",
                "zonguldak", "malatya", "bursa");

        List<String> upper =
                names.stream()
                        .map(String::toUpperCase)
                        .collect(Collectors.toList());

        for(String s : upper)
            System.out.println(s);
    }
}
