package ders05.konu01.ornek2;

// BLL: Business Logic Layer veya Service Layer
public class CustomerManager {

    private ICustomerDal customerDal;

    public CustomerManager(ICustomerDal customerDal){
        this.customerDal = customerDal;
    }

    public void  add(){
        // is kodlari
        System.out.println("burada iş kodları çalışır...");
        customerDal.Add();
    }
    
    void setCustomerDal(ICustomerDal customerDal) {
    	this.customerDal = customerDal;
    }
}
