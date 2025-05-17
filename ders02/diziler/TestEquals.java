package ders02.diziler;

/**
 * A demonstration program to test two arrays for equality.
 */
public class TestEquals {
	
	public static void main(String[] args) {
		int[] a = new int[3];
		int[] b = new int[3];
		setArray(a);
		setArray(b);
		if (b == a)
			System.out.println("Equal by ==.");
		else
			System.out.println("Not equal by ==.");
		
		if (equals(b, a))
			System.out.println("Equal by the equals method.");
		else
			System.out.println("Not equal by the equals method.");

		Student s1 = new Student("Yusuf", 18);
		Student s2 = new Student("Yusuf", 19);
		//		if(s1 == s2)
		if(s1.equals(s2) == true)
			System.out.println("Esitlik dogru");
		else
			System.out.println("Esitlik yanlis");
	}

	public static boolean equals(int[] a, int[] b) {
		boolean elementsMatch = true;// tentatively
		if (a.length != b.length)
			elementsMatch = false;
		else {
			int i = 0;
			while (elementsMatch && (i < a.length)) {
				if (a[i] != b[i])
					elementsMatch = false;
				i++;
			}
		}
		return elementsMatch;
	}

	public static void setArray(int[] array) {
		for (int i = 0; i < array.length; i++)
			array[i] = i;
	}
}
class Student{
	private String name;
	private int age;

	public Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	@Override
	public boolean equals(Object other){
		if(other instanceof Student == false)
			return false;
		Student otherStudent = (Student) other;
		if(this.name.equals(otherStudent.name) &&
			this.age == otherStudent.age)
			return true;
		else return false;
	}
}