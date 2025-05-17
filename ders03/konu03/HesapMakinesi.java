package ders03.konu03;

public class HesapMakinesi {

    public double add(double a, double b){
        return a + b;
    }
    public double subtract(double a, double b){
        return a - b;
    }
    public double multiply(double a, double b){
        return a * b;
    }
    public double divide(double a, double b){
        double epsilon = 1e-5;
        if(Math.abs(b) > epsilon)
            return a / b;
        else // 0 ile bolunmez
            return -1;
    }
}
