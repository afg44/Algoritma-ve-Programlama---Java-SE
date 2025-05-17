package ders07.konu02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparisonDemo01 {
    public static void main(String[] args) {

        // onlar basamagina gore ozel siralama
    	Comparator<Integer> com=new Comparator<Integer>()
    	{
    		public int compare(Integer i,Integer j)
    		{
    			if(i%10 >j%10)
    				return 1;
    			else
    				return -1;
    		}
    	};

    	List<Integer> nums= new ArrayList<>();
    	nums.add(43);
    	nums.add(31);
    	nums.add(72);
    	nums.add(29);

        System.out.println("** Once ** ");
        System.out.println(nums);

        Collections.sort(nums);
        System.out.println("** Collections.sort(nums) ** ");
        System.out.println(nums);

        Collections.sort(nums, com);
        System.out.println("** Collections.sort(nums, com) : Ozel Siralama ** ");
        System.out.println(nums);

    }
}
