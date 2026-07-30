package ders08.konu01;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIteratorDemo {

	public static void main(String[] args) {

		List<String> fruits = new ArrayList<String>();
		fruits.add("Orange"); // tekrarlı elemanın silinme problemi
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Strawberry");
		fruits.add(2, "Pineapple");

		fruits.set(3, "Elma");
//		fruits.clear();
//		fruits.remove(4);
		System.out.println(fruits.indexOf("Orange"));

		System.out.println("--- Orjinal liste ---");
		for(String f : fruits)
			System.out.print(f + " ");
		System.out.println();


		// Guvenli olmayan silme-1
//		for (String fruit : fruits) {
//			System.out.println(fruit);
//			if ("Orange".equals(fruit)) {
//				fruits.remove(fruit);
//			}
//		}
		// Guvenli olmayan silme-2
//		for (int i = 0; i < fruits.size(); i++) {
//			String fruit = fruits.get(i);
//			System.out.println(fruit);
//			if ("Orange".equals(fruit)) {
//				fruits.remove(i);
//			}
//		}

		// Doğru silme şekli
		Iterator<String> fruitIterator = fruits.iterator();
		while (fruitIterator.hasNext()) {
			String fruit = fruitIterator.next();
			System.out.println(fruit);
			if ("Orange".equals(fruit)) {
				fruitIterator.remove();
			}
		}

		System.out.println("--- Silme Sonrasi ---");
		for(String f : fruits)
			System.out.print(f + " ");
		System.out.println();
	}

}
