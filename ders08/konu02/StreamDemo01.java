package ders08.konu02;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


/*
* Java Streams, Java 8'de tanıtılan ve nesne koleksiyonlarını
* işlemeye işlevsel bir yaklasim sağlayan guclu bir özelliktir.
* Koleksiyonlar üzerinde özlü, bildirimsel kodla karmaşık veri işleme
* işlemleri gerçekleştirmeye olanak tanırlar.
*
* OZELLIKLER
1) Not a data structure: Streams don't store data; they operate on a source (like a collection, array, or I/O channel)
2) Functional in nature: Operations produce results without modifying the source
3) Lazy evaluation: Many stream operations are only executed when needed
4) Consumable: Streams can only be traversed once
* */

public class StreamDemo01 {
    public static void main(String[] args){

        List<Integer> nums= Arrays.asList(4,5,7,3,2,6);

    	Consumer<Integer> con1=new Consumer<Integer>() {

    		public void accept(Integer n)
    		{
                if(n%2 == 0)
    			    System.out.println(n);
    		}
    	};

        Consumer<Integer> con2= n -> System.out.println(n);

        nums.forEach(n -> System.out.println(n));

        System.out.println("----------------------");
        //  	nums.forEach(null);
        nums.forEach(con1);


        //nums.forEach(n -> System.out.println(n));

    }
}
