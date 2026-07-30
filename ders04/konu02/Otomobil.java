package ders04.konu02;

class TOGG{
    public String renk;
    public String plaka;
    public static String isim;

    static {
        isim = "T10X";
        System.out.println("static blok");
    }
    public TOGG(String renk, String plaka){
        this.renk = renk;
        this.plaka = plaka;
        System.out.println("TOGG(String, String) Constructor method");
    }

    public TOGG(){
        System.out.println("TOGG() Constructor method");
        this("PINK", "00-ABC-000");
    }

    // HATALI KULLANIM
    public TOGG(String renk){
//        renk = renk;
        TOGG obj = new TOGG();
        obj.renk = renk;
//        this.renk = renk;
        System.out.println("TOGG(String) Constructor method");
    }

    public void show() {
        System.out.printf("%s %s %s\n", isim, plaka, renk);
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }
}

public class Otomobil {

    public static void main1(String[] args) {
        // 0 TOGG, 0 static call
    }

    public static void main(String[] args) {
        TOGG arac1 = new TOGG("beyaz", "44 WHT 444");
        TOGG arac2 = new TOGG("siyah", "23 BLK 456");

        arac1.show();
        arac2.show();

        TOGG arac3 = new TOGG("yesil");
        arac3.show();
        arac3.setRenk("bej");
        arac3.show();

        TOGG arac4 = new TOGG();
        arac4.show();
    }
}
