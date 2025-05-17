package ders03.konu03;

/**
 * Inheritance
 * Multiple inheritance is not allowed
 */
public class Main {

    public static  void main1(String[] args){
        BilimselHesapMakinesi calc = new BilimselHesapMakinesi();
        double res = calc.add(3,5);
        System.out.println(res);
//        calc.power(3,4);

        EnGelismisHesapMakinesi calc2 = new EnGelismisHesapMakinesi();
        calc2.power(3,4);
    }

}
