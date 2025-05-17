package ders07.konu01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo02 {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Strawberry");
		
		fruits.set(1, "Elma");
		fruits.add(2, "Orange");
//		fruits.clear();
//		fruits.remove(4);
		System.out.println(fruits.indexOf("Strawberry"));

		// Guvenli olmayan silme-1
//		for (String fruit : fruits) {
//			System.out.println(fruit);
//			if ("Apple".equals(fruit)) {
//				fruits.remove(fruit);
//			}
//		}
		// Guvenli olmayan silme-2
//		for (int i = 0; i < fruits.size(); i++) {
//			String fruit = fruits.get(i);
//			System.out.println(fruit);
//			if ("Apple".equals(fruit)) {
//				fruits.remove(i);
//			}
//		}
		for(String f : fruits)
			System.out.print(f + " ");
		System.out.println();

		Iterator<String> fruitIterator = fruits.iterator();
		while (fruitIterator.hasNext()) {
			String fruit = fruitIterator.next();
			System.out.println(fruit);
			if ("Apple".equals(fruit)) {
				fruitIterator.remove();
			}
		}

		System.out.println("--- Silme Sonrasi ---");
		for(String f : fruits)
			System.out.print(f + " ");
		System.out.println();
	}

}
