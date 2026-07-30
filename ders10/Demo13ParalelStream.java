package ders10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/*
parallelStream(): stream işlemlerini birden fazla thread kullanarak paralel çalıştırır.
Veriyi parçalara böler:
[1 2] [3 4] [5 6] [7 8] gibi
Her parçayı farklı thread işler.

Amaç:
1-Büyük veri üzerinde performansı artırmak
2-Çok çekirdekli CPU kullanmak

*/

public class Demo13ParalelStream {
    public static void main1(String[] args) {

        List<Integer> nums =
                Arrays.asList(1,2,3,4,5,6,7,8);

        nums.parallelStream()
                .forEach(x -> {
                    System.out.println(
                            x + " -> " + Thread.currentThread().getName()
                    );
                });
    }
    public static void main(String[] args) {

        int sum = Stream.of(1,2,3,4,5,6)
                        .parallel()
                        .reduce(0, Integer::sum);
        System.out.println(sum);
    }
}

