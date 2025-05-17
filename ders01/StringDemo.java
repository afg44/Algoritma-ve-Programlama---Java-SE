package ders01;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String bir = "Malatya";
//		String iki = "Zonguldak";
		String bir = new String("Malatya");
		String iki = new String("Zonguldak");
		
		System.out.println(bir + iki);
		System.out.println(bir.length());
		System.out.println(bir.charAt(1));
		System.out.println("Karşılaştırma sonucu: " + (bir == iki));
		System.out.println("compareTo: "+bir.compareTo(iki));
		System.out.println(bir.equals(iki));
		System.out.println(bir.substring(1,3));
		// String 'immutable' objelerdir, yani obje olarak değiştirilemezler.
		System.out.println(bir.replace('a', 'z'));
		System.out.println(bir);

		// Değiştirilebilir (mutable) string ihtiyacı olduğunda kullanılan
		// iki sınıf vardır: StringBuffer ve StringBuilder
		StringBuffer sb = new StringBuffer("Malatya");
		for (int i = 0; i < sb.length(); ++i){
			if(sb.charAt(i) == 'a')
				sb.setCharAt(i, 'z');
		}
		//sb.replace(0, 1, "S");
		System.out.println(sb);

		StringBuilder sb2 = new StringBuilder("Kahraman");
		System.out.println("Ilk hali: " + sb2);

		sb2.append(" Maras");
		System.out.println("Son hali: " + sb2);

		// referans değiştirilebilir (ama bu hafızadaki nesnenin degistigi anlamına gelmez)
		bir = "Elazig";
		System.out.println(bir);

		boolean b = "araba" == "araba";
		System.out.println("b:" + b);

	}

}
