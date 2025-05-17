package ders04.ornek2;

/***
 *
 * Polymorphism, overloading, overriding
 * this ve super
 *
 */
public class Main {

	public static void main(String[] args) {
		
		Student ogrenciler[] = new Student[3];
		ogrenciler[0] = new PrimarySchool(12345, "ali guney");
		ogrenciler[1] = new HighSchool(67890, "zehra kuzey", "pekiyi");
		ogrenciler[2] = new UnderGraduate();
		
		for(Student s : ogrenciler)
//			System.out.println(s);
			System.out.println(s.toString());
		
	}
	
}
