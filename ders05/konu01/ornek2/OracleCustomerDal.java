package ders05.konu01.ornek2;

public class OracleCustomerDal implements ICustomerDal {
    @Override
    public void Add() {
        System.out.println("Oracle veritabanina eklendi");
    }
}
