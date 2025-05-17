package ders07.konu01;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Integer> nums = new HashSet<Integer>();
		nums.add(62);
		nums.add(54);
		nums.add(82);
		nums.add(21);
		nums.add(21);
		
		printSet(nums);
		nums.remove(54);
		printSet(nums);
		System.out.println("Set contains 62: " + nums.contains(62));
		System.out.println("Set contains 31: " + nums.contains(31));
	}

	public static void printSet(HashSet<Integer> intSet) {
		System.out.println("The set contains:");
		for (Object obj : intSet.toArray()) {
			Integer num = (Integer) obj;
			System.out.println(num.intValue());
		}
	}

}
