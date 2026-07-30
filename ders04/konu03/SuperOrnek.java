package ders04.konu03;

class Hayvan {
    String isim = "Hayvan";

    Hayvan() {
        System.out.println("Hayvan constructor çalıştı");
    }

    void sesCikar() {
        System.out.println("Hayvan ses çıkarır");
    }
}

class Kedi extends Hayvan {
    String isim = "Kedi";

    Kedi() {
        super(); // Üst sınıf constructor çağrılır
        System.out.println("Kedi constructor çalıştı");
    }

    void sesCikar() {
        super.sesCikar(); // Üst sınıfın metodu çağrılır
        System.out.println("Miyav");
    }

    void yazdir() {
        System.out.println("Alt sınıf isim: " + isim);
        System.out.println("Üst sınıf isim: " + super.isim); // Üst sınıf değişkeni
    }
}

public class SuperOrnek {
    public static void main(String[] args) {
        Kedi k = new Kedi();
        k.sesCikar();
        k.yazdir();
    }
}