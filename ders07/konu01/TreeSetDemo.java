package ders07.konu01;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

/*
-Sorted Order: Automatically sorts elements as they are added.
-Unique Elements: Like all Set implementations, it does not allow
duplicate values.
-Efficient Operations: Provides fast retrieval of elements, with
operations like add(), remove(), and contains() running in O(log n) time
-NavigableSet Interface: Supports methods for finding subsets, lower/higher
elements, and first/last elements.
* */
public class TreeSetDemo {
    public static void main(String[] args){

//    	Set<Integer> nums=new HashSet<Integer>();
//    	Set<Integer> nums=new TreeSet<Integer>();
        Collection<Integer> nums=new TreeSet<Integer>();
        nums.add(62);
        nums.add(54);
        nums.add(82);
        nums.add(21);
        nums.add(62);


        //nums.add("5");

        Iterator<Integer> values = nums.iterator();

        while(values.hasNext())
            System.out.println(values.next());

//    	for(int n:nums)
//    	{
//    		System.out.println(n);
//   	}
    }
}
