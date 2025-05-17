package ders07.konu01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo01 {

    public static void main(String[] args) {

//    	Collection<Integer> nums= new ArrayList<Integer>();
//  	Collection nums=new ArrayList();
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);
        nums.add(2,5);
//        nums.add("5"); // hata

        System.out.println(nums.get(2));

        System.out.println(nums.indexOf(2));

    	for(int n:nums) {
    		System.out.print(n + " ");
    	}
        System.out.println();

        for (Object n : nums) {
            int num = (Integer) n;
            System.out.print(n + " ");
        }
    }

}
