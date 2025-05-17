package ders04.ornek1;

/**
 *	Inheritance: Miras neden gerekli 
 *  SOLID's L: Liskov Substitution Principle, alt siniflarin ata
 *  siniflarin yerine gecebilmesi gerektigini belirtir. Bir B sinifinin
 *  A sinifindan turedigini dusunelim. Bir alt sinif olan B sinifindan
 *  bir nesneyi, A sinifindan bir nesne bekleyen herhangi bir yonteme
 *  parametre olarak verebilmemiz ve bu durumda yontemin herhangi bir
 *  garip cikti vermemesi gerektigi anlamina gelir.
 * 
 * */

public class Main {

    public static void main(String[] args) {
        Customer customer =new Customer();
        Employee employee =new Employee();

        EmployeeManager employeeManager=new EmployeeManager();
        CustomerManager customerManager =new CustomerManager();
        
        employeeManager.addOne(employee);
        employeeManager.listThem();

        employeeManager.bestEmployee(employee);
    }
}
