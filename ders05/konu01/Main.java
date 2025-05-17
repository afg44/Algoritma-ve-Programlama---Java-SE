package ders05.konu01;

public class Main {

	public static void main(String[] args) {

//		Fruit orange = new Fruit("Blueberry");
		Fruit orange = new Fruit("Orange");
		Fruit apricot = new Fruit("Orange");
		
		System.out.println(orange.compareTo(apricot));
		System.out.println(orange.compareTo(orange));
		System.out.println(apricot.compareTo(orange));

	}

}
