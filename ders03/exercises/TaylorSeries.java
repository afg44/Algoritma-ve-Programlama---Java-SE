package ders03.exercises;

/**
 * e^x = 1 + x/1 + x^2/2! + x^3/3! + ... + x^i/i! + ...
 * P: x, x2, x3, x4
 * F: 1, 2,  6,  24
 */
/* Alternatif: Horner's Rule
     1 + x/1 + x^2/2! + x^3/3! + ... + x^n/n!
   = 1 + x[1 + x/2[1 + x/3[1 + x/4]]]
*/
public class TaylorSeries {

    static double P=1, F=1;
    public double TS(int x, int n){
        double r;
        if(n == 0) return 1;
        else{
            r = TS(x, n-1);
            P = P * x;
            F = F * n;
            return r + P/F;
        }
    }

    public static void main(String a[]){
//        main2();
        TaylorSeries obj = new TaylorSeries();
//        double r = obj.TS(2,10);
        double r = obj.TS(5,4);
        System.out.println(r);

    }
}
