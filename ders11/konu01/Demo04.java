package ders11.konu01;

/**
 *  Thread Priority ve senkronizasyon
 */


class A3 extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("(A3) Hi: " + i);
            try {
                Thread.sleep(10);
            }catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B3 extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("(B3) Hello: " + i);
            try {
                Thread.sleep(10);
            }catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Demo04 {
    public static void main(String[] args) throws NumberFormatException {

        A3 obj1=new A3();
        B3 obj2=new B3();

        obj1.setPriority(Thread.MIN_PRIORITY);
        obj2.setPriority(Thread.MAX_PRIORITY);
        System.out.println("obj1.getPriority(): " + obj1.getPriority());
        System.out.println("obj2.getPriority(): " + obj2.getPriority());

        obj1.start();
        obj2.start();
    }

}

