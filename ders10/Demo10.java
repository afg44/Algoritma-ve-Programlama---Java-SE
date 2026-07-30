package ders10;


import java.util.stream.Stream;

/*
reduce(): Elemanları tek değere indirger.
Kullanım: reduce(identity, accumulator)
 identity: başlangıç değeri
 accumulator: Elemanları birleştiren işlem

Örnek: toplama, çarpma, maksimum bulma, string birleştirme, custom aggregation

 */
public class Demo10 {

    public static void main(String[] args){
        int result = Stream.of(2,3,4)
                .reduce(1, (a,b) -> a*b);

        System.out.println("result: " + result);

        result = Stream.of(1,2,3,4)
                .reduce(0, (a,b) -> a+b);

        System.out.println("result: " + result);

        result = Stream.of(3,7,2,9,1)
                .reduce(Integer.MIN_VALUE,
                        (a,b) -> a > b ? a : b);

        System.out.println("result: " + result);

        String text =
                Stream.of("Şanlı", "-", "Urfa")
                        .reduce("", (a,b) -> a + " " + b);

        System.out.println(text);
    }
}
