package ders06.konu01.ornek2;

/*
DAL: Data Access Layer
*/
public class MSSqlCustomerDal implements ICustomerDal {

	@Override
	public void Add() {
		System.out.println("MSSql veritabanina eklendi");
	}

}
