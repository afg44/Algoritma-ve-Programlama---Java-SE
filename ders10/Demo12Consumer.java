package ders10;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*
Consumer<T> bir functional interface’tir.
tek metodu void accept(T t); bir şey dönmez,
aldığı veri üstünde işlem yapar.
 */

public class Demo12Consumer {
    public static void main(String[] args){

        List<Integer> nums= Arrays.asList(4,5,7,3,2,6);

        // Consumer nesnesi oluşturup kullanma
    	Consumer<Integer> con1=new Consumer<Integer>() {
    		public void accept(Integer n) {
                if(n%2 == 0)
    			    System.out.println(n);
    		}
    	};
        nums.stream().forEach(con1);
        System.out.println("----------------------");

        // Doğrudan nesnesini oluşturmadan (aslında lambda arka planından Consumer var)
        nums.stream()
                .filter(n -> n % 2 == 0)
                .forEach(x -> System.out.println(x));
    }
}
