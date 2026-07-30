package ders08.konu01;

import java.util.HashMap;

public class HashMapDemo02 {

	public static void main(String[] args) {

		String input = "malatya ankara istanbul kahramanmaras " +
				"denizli erzurum erzincan malatya elazig " +
				"bursa kayseri istanbul sivas erzurum " +
				"osmaniye bingol izmir istanbul izmir izmir";
		String[] arr = input.split(" ");

		for(int i=0; i<arr.length; i++) {
			String str = arr[i];
			System.out.println(i + ". " + str);
		}

		HashMap<String, Integer> sozluk = new HashMap<String, Integer>();
		for(String sehirIsmi : arr) {
//			System.out.println(str);
			if(sozluk.containsKey(sehirIsmi) == false)
				sozluk.put(sehirIsmi,1);
			else {
				int eski_value = sozluk.get(sehirIsmi);
				sozluk.put(sehirIsmi, eski_value+1);
			}
		}
		printMap(sozluk);
		System.out.println("farklı sehir sayısı: " + sozluk.size());
	}

	public static void printMap(HashMap<String, Integer> map) {
		System.out.println("Map contains:");
		for (String anahtar : map.keySet()) {
			Integer frekans = map.get(anahtar);
			System.out.println(anahtar + " --> " + frekans.intValue());
		}
		System.out.println();
	}

}
