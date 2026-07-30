package ders08.konu01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {
//  	Collection nums=new ArrayList();
//    	Collection<Integer> nums= new ArrayList<Integer>();
//        List<Integer> nums = new ArrayList<Integer>();
//        ArrayList<Integer> nums = new ArrayList<Integer>();
        var nums = new ArrayList<Integer>();

        System.out.println(nums.getClass());

        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);
        nums.add(6);
        nums.add(2,15);
//        nums.add("25"); // hata

        System.out.println(nums.get(2));
        System.out.println(nums.indexOf(2));

    	for(int n:nums) {
    		System.out.print(n + " ");
    	}
        System.out.println();

        for (Object n : nums) {
//            int num = (Integer) n;
            Integer num = (Integer) n;
            int nn = num.intValue();
            System.out.print(nn + " ");
        }
    }

}
