package ders05.konu01.ornek1;

/***
 * Belediyenin temizlik ekibinde isciler gorev yapmaktadir.
 * Dar sokaklarda yuk tasimak icin esekler kullanmakta ve bu hayvanlar
 * kayit altinda tutulmaktadir.
 * Ayrica son teknoloji urunu robotlarla da temizlik yapilmaktadir.
 * 
 */

public class Main {

    public static void main(String[] args) {
        IWorkable worker1 = new Worker();
        IWorkable worker2 = new Donkey();
        IWorkable worker3 = new Robot();

        worker1.work();
        worker2.work();
        worker3.work();
    }
}
