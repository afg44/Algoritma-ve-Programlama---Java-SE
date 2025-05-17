package ders03.konu02;

public class AnonimNesne {

    public AnonimNesne() {
        System.out.println("Anonim nesne olusturuldu...");
    }
    public void show(){
        System.out.println("Anonim nesne fonksiyonu calisti");
    }

    public static  void main(String[] args){
        new AnonimNesne();          // anonymous object created
        new AnonimNesne().show();   // another anonymous object created
    }
}
