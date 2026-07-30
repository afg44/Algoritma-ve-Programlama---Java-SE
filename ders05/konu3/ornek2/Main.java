package ders05.konu3.ornek2;

/**
 * SOLID's O: Open/Closed Principle
 * OCP yazilim varliklarinin (siniflar, moduller, islevler vb.)
 * genisletilmeye acik, ancak degisiklik yapilmaya kapali
 * olmasi gerektigini belirtir. Boylece yeni ozellikler eklemek
 * istediginizde tekerlegi yeniden icat etmenize
 * (yani her seyi yeniden yazmaniza) gerek kalmaz.
 * 
 *  Strateji modelinde, bir sinif davranisi veya algoritmasi
 *  calisma zamaninda degistirilebilir.
 * */

public class Main {

	// yanlis olan kullanim bicimi
	public static void main1(String[] args){
    	OracleDatabaseManager odbm =
				new OracleDatabaseManager();
    	odbm.getData(0);
		odbm.getData(1);
	}

	// strateji modeline gore
    public static void main(String[] args) {

	    CustomerManager customerManager = new CustomerManager();
	    customerManager.databaseManager = new OracleDatabaseManager();
	    customerManager.getCustomers();

	    // yeni ozellik eklendiginde eski kodda degisiklik yapmak
	    // zorunda degiliz sadece yeni kisimlar eklenir
	    customerManager.databaseManager = new MySqlDatabaseManager();
	    customerManager.getCustomers();
    }
}
