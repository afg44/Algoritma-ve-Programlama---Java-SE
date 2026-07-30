package ders10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

/*
Geleneksel yöntemle karşılaştır
 */
public class Demo04 {
    public static void main(String[] a){
        List<String> liste = Arrays.asList("malatya", "ankara", "bursa", "amasya");

        List<String> sonuc = new ArrayList<>();
        for (String s : liste) {
            if (s.startsWith("a"))
                sonuc.add(s.toUpperCase());
        }

        List<String> sonuc2 = liste.stream()
                .filter(s -> s.startsWith("a"))
                .map(String::toUpperCase)
                .collect(toList());

        System.out.println(sonuc.get(0));
        System.out.println(sonuc2.get(0));
    }
}
