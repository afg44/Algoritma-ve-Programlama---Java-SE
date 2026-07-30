package ders10;

import java.util.stream.Stream;

/*
limit: ilk n elemanı alır
skip: ilk n elemanı atlar
 */
public class Demo07 {

    public static void main(String[] args){
        Stream.of(1,2,3,4,5)
                .limit(3)
                .forEach(System.out::println);
        System.out.println("-------------");
        Stream.of(1,2,3,4,5)
                .skip(2)
                .forEach(System.out::println);
    }
}
