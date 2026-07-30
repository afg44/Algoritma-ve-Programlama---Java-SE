package ders11.konu01;

/**
 *  Thread olan sinifi baska bir siniftan turetmemiz gerekirse ne olacak?
 *  Java multi-inheritance ozelligine kapalidir.
 *  Alternatif olarak bir interface kullanilir
 *
 *  Peki thread'ler arasında senkronizasyon nasıl sağlanmalı?
 */

class Temel {
}

class A2 extends Temel implements Runnable
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("(A2) Message " + i);
            try {
                Thread.sleep(10);
            }catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B2 extends Temel implements Runnable
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("(B2) Message " + i);
            try {
                Thread.sleep(10);
            }catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Demo03 {
    public static void main(String[] args) {

    	A2 obj1=new A2();
//    	B2 obj2=new B2();
        Runnable obj2=new B2();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

    }

}