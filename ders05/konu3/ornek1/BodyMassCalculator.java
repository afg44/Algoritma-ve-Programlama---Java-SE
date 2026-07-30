package ders05.konu3.ornek1;

public abstract class BodyMassCalculator {
    public abstract void  hesapla();

    public final void information(){
        System.out.println("body mass index:");
        hesapla();
    }
}
