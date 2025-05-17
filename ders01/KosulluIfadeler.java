package ders01;

//import java.lang.Math.*;

public class KosulluIfadeler {

	public static void main1(String[] args) {
		float hesap = 0.0F;
		for(int i=0; i < 1000; i++)
			hesap += 0.001;
		System.out.println(hesap);

		hesap = 1.0F - 1.0F;
		System.out.printf("%.8f\n", hesap);

		double x = 0.1 * 3 - 0.3; // May not be exactly 0 due to precision errors
		double epsilon = 1e-9; // Tolerance level

		boolean b = Math.abs(x) < epsilon;
//		boolean b = x == 0.0;
		if( b == true ) {
			System.out.println("x 0 gibi bir değer (" + x + ")");
		} else {
			System.out.println("x 0'dan farkli");
		}

		double balance = 0.000001;
		if(balance < 0.01 && balance > -0.01)
			System.out.println("Hesapta para yok");
		else
			System.out.println("Hesapta para var");

	}

	public static void main2(String[] args) {

		int ogrNotu = 94;
		if(ogrNotu > 94)
			System.out.println("A1");
		else if(ogrNotu > 89)
			System.out.println("A2");
		else if(ogrNotu > 84)
			System.out.println("A3");
		else if(ogrNotu > 79)
			System.out.println("B1");
		else if(ogrNotu > 74)
			System.out.println("B2");
		else if(ogrNotu > 69)
			System.out.println("B3");
		else if(ogrNotu > 64)
			System.out.println("C1");
		else if(ogrNotu > 59)
			System.out.println("C2");
		else if(ogrNotu > 54)
			System.out.println("C3");
		else 
			System.out.println("Diger durumlar");
		
		switch (ogrNotu) {
			case 100:
			case 99:
			case 98:
				System.out.println("A1");
				break;
			case 95:
			case 94:
				System.out.println("A2");
				break;
			case 89:
			case 88:
				System.out.println("A3");
				break;
			default:
				System.out.println("Dusunulmeyen durumlar");
		}

		boolean flag = true;
		if(flag == true)
//		if(flag)
			System.out.println("Kosul saglandi");
	}

	public static void main(String[] args) {
//		String day = "Monday";
		String day = "Sunday";
		switch (day){
			case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"
				-> System.out.println("Haftaici");
//				break;
			case "Saturday", "Sunday" ->
				System.out.println("Haftasonu");
//				break;
			default -> System.out.println("Error");
		}

		int gunNo = switch (day){
			case "Monday" : yield(1);
			case "Tuesday" : yield (2);
			case "Wednesday" : yield (3);
			case "Thursday": yield (4);
			case "Friday": yield (5);
			case "Saturday": yield(6);
			case "Sunday": yield(7);
			default: yield (-1);
		};
		System.out.println("\tgunNo: "+gunNo);

	}

}
