package ders03.exercises;

public class PowerCalculation {

    static int sayac = 0;

    public static int us(int n, int p){
        int sonuc = 1;
        for(int i=1; i <= p; i++)
            sonuc *= n;
        return sonuc;
    }

    public static int usR(int n, int p){
        System.out.println("**** " + (++sayac));
        if(p == 0) return 1;
        return n * usR(n, p-1);
    }
    /**
     * 2^8 = (2^2)^4 = 4^4 = 16^2
     * 2^9 = 2 * (2^2)^4
     */
    public static int usR2(int n, int p){
        System.out.println("**** " + (++sayac));
        if(p == 0) return 1;
        if(p % 2 == 0) return usR2(n*n, p/2);
        else return n * usR2(n*n, (p-1)/2);
    }

    public static void main(String a[]){
        int x = 2, p = 20;
        System.out.println(us(x, p));
        System.out.println(usR(x, p));
        sayac = 0;
        System.out.println(usR2(x, p));
    }

}
