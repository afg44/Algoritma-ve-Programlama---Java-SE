package ders05.konu01.ornek2;


public class MySqlCustomerDal implements ICustomerDal {
    @Override
    public void Add() {
       System.out.println("MySQL veritabanina eklendi");
    }
}
