package ders10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
Stream Oluşturma
 */
public class Demo01 {

    public static void main(String[] args){

        // listeden stream oluşturma
        List<String> names = Arrays.asList("Ali", "Ayşe", "Mehmet");
        Stream<String> stream1 = names.stream();
        System.out.println(stream1);

        // diziden oluşturma
        String[] arr = {"A", "B", "C"};
        Stream<String> stream2 = Arrays.stream(arr);

        // stream.of metodu
        Stream<Integer> stream3 = Stream.of(1, 2, 3, 4);
        System.out.println(stream3.toList());
        /*
        Önemli Not: Bir Stream nesnesi sadece bir kez tüketilebilir.
        Yukarıdaki şekilde elemanları yazdırınca, o stream kapanır.
        Aşağıdaki gibi tekrar yazdırmak IllegalStateException atar
         */
//        System.out.println(stream3.toList());

    }
}
