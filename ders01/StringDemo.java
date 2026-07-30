package ders01;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String bir = "Malatya";
//		String iki = "Malatya";
		String bir = new String("Malatya");
		String iki = new String("Zonguldak");
//		bir = iki;
//		System.out.println("Karşılaştırma sonucu: " + (bir == iki));
		/*
		Java'da string literal "Malatya" String Pool içinde saklanır.
		Aynı literal tekrar kullanıldığında, yeni bir nesne oluşturulmaz; mevcut olan referans edilir.
		new String(...) her çağrıldığında heap üzerinde yeni bir nesne oluşturur.
		İçeriği aynı olsa bile, referansları farklıdır, (bir == iki) sonucu false çıkar, çünkü == referans karşılaştırması yapar.
		*/

		String uc = bir + iki;
//		System.out.println("\t\t"+ uc);
//		System.out.println("\t\t"+bir.length());
//		System.out.println("\t\t"+bir.charAt(1));

//		System.out.println("\t\t"+bir.equals(iki));
//		System.out.println("\t\tcompareTo: "+bir.compareTo(iki));
//		System.out.println("\t\t\t\t"+bir.substring(0,5));
//		System.out.println("\t\t\t\t"+iki.substring(iki.length()-1,iki.length()));
		// String 'immutable' objelerdir, yani obje olarak değiştirilemezler.
//		System.out.println("\t\t\t\t"+bir.replace('a', 'z'));
//		System.out.println("\t\t\t\t"+bir);
/*
		String immutable'dır (değiştirilemez).
		Değiştirilebilir (mutable) string ihtiyacı olduğunda kullanılan
		iki sınıf vardır: StringBuffer ve StringBuilder
 */
		StringBuffer sb = new StringBuffer("Malatya");
		for (int i = 0; i < sb.length(); ++i){
			if(sb.charAt(i) == 'a')
				sb.setCharAt(i, 'z');
		}
//		System.out.println("\t\t\t\t"+sb);
//		sb.replace(3, 5, "e");
//		System.out.println("\t\t\t\t"+sb);

		StringBuilder sbu = new StringBuilder("Kahraman");
		System.out.println("Ilk hali: " + sbu);
		sbu.append(" Maras");
		System.out.println("Son hali: " + sbu);

		// referans değiştirilebilir ama bu hafızadaki
		// nesnenin degistigi anlamına gelmez
//		bir = bir.substring(1,5);
//		System.out.println(bir);

//		iki = bir;
//		bir = "Elazig";
//		System.out.println(bir);
//		System.out.println(iki);
//
//		boolean b = ("araba" == "araba");
//		System.out.println("b: " + b);

	}

}
