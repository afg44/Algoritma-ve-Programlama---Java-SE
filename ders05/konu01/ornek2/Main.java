package ders05.konu01.ornek2;

//https://github.com/IsrafilHallac-ih/springIntro/blob/main/Main.java
public class Main {

    public static void main(String[] args) {
	    CustomerManager customerManager =new CustomerManager(new MySqlCustomerDal());
	    customerManager.add();
	    
	    customerManager.setCustomerDal(new OracleCustomerDal());
	    customerManager.add();
    }
}
