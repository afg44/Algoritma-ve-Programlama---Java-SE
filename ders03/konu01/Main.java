package ders03.konu01;

/**
 * OOP Concepts
 * Referans tip degiskenler nasil degistirilir
 * Overloading
 * */

public class Main {

	public static void foo(Product a, Product b) {
		System.out.println("---- " + a.equals(b));
		a.setDescription(b.getDescription());
		a.setId(b.getId());
		a.setName(b.getName());
		a.setPrice(b.getPrice());
		a.setRenk(b.getRenk());
		System.out.println("---- " + a.equals(b));
	}
	
	public static void bar(int a, int b) {
		System.out.println("---- " + (a == b));
		a = b;
		System.out.println("---- " + (a == b));
	}
	
	
    public static void main1(String[] args) {

        Product product_1 = new Product(1,"Laptop", "Asus Laptop", 3000, 2, "Siyah");
        Product product_2 = new Product(1,"Laptop", "Asus Laptop", 3000, 2, "Beyaz");
        
        System.out.println("**** " + product_1.equals(product_2));
        foo(product_1, product_2);
        System.out.println("**** " + product_1.equals(product_2));
        
        int a = 123, b = 456;
        System.out.println("**** " + (a == b));
        bar(a, b);
        System.out.println("**** " + (a == b));
    }

	public static void main(String[] args) {
		Ship s1 = new Ship(1);
		s1.move();
		s1.move(2);
	}
}
