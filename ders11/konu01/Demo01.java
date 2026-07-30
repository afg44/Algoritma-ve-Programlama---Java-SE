package ders11.konu01;
/*
* JOIN *
*
* Bu örnekte 3 thread var: main thread, t1 ve t2
* Thread'lerin çalışma sırasını join yaparak değiştirmezsek
* main çalışıp tamamlanır ve count değeri 0 olarak ekrana yazılır.
* t1.join() ve t2.join() sayesinde main thread, diğer thread’lerin bitmesini bekler.
* t1.join() ve t2.join() yoruma alınınca oluşan farkı incele
*
* "Race Condition" ve "Thread Safety"
* Ayrica t1 ve t2 ayni anda calisip sonucu yanlış etkileyebilir.
* count++ aslında üç adımlı bir işlem:
* 1) count değerini oku.
* 2) bir artır.
* 3) yeni değeri geri yaz.
*
* Eğer increment() synchronized yapılırsa her artırma güvenli şekilde yapılır.
* */
class Counter
{
    int count;
//    public void increment() { count++; }
    public synchronized void increment() { count++; }
}

public class Demo01 {
    public static void main(String[] args) throws InterruptedException{

        Counter c=new Counter();

        Runnable obj1=()->
        {
            for(int i=1;i<=10_000;i++)
            {
                c.increment();
            }
            System.out.println("Obj1: " + c.count);
        };

        Runnable obj2 = new Runnable()
        {
            public void run()
            {
                for(int i=1;i<=10_000;i++)
                {
                    c.increment();
                }
                System.out.println("Obj2: " + c.count);
            }
        };

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);

        t1.start();
        t2.start();

        // bu kısım önemli. join main thread'e bekleme emrini verir.
//        t1.join();
        // aynı şekilde t2.join(); de t2 thread'i bitene kadar bekletir.
//        t2.join();

        System.out.println("Main: " + c.count);
    }
}




