package ders04.abstractClassOrnek2;

/**
 * SOLID's O: Open/Closed Principle
 * OCP yazilim varliklarinin (siniflar, moduller, islevler vb.)
 * genisletilmeye acik, ancak degisiklik yapilmaya kapali
 * olmasi gerektigini belirtir. boylece yeni ozellikler eklemek
 * istediginizde tekerlegi yeniden icat etmenize
 * (yani her seyi yeniden yazmaniza) gerek kalmaz.
 * 
 *  Strateji modelinde, bir sinif davranisi veya algoritmasi
 *  calisma zamaninda degistirilebilir.
 * */

public class Main {

    public static void main(String[] args) {

    	// yanlis olan kullanim bicimi
//    	OracleDatabaseManager odbm =
//				new OracleDatabaseManager();
//    	odbm.getData(0);
//		odbm.getData(1);
    	
    	// strateji modeline gore
	    CustomerManager customerManager = new CustomerManager();
	    customerManager.databaseManager = new OracleDatabaseManager();
	    customerManager.getCustomers();

	    // yeni ozellik eklendiginde eski kodda degisiklik yapmak
	    // zorunda degiliz sadece yeni kisimlar eklenir
	    customerManager.databaseManager = new MySqlDatabaseManager();
	    customerManager.getCustomers();
    }
}
