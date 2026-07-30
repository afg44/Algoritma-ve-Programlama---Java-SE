package ders11.konu01;

class A1 extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("(A1) Message " + i);
        }
    }
}

class B1 extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("(B1) Message " + i);
        }
    }
}

public class Demo02 {
    public static void main(String[] args) {

        A1 obj1=new A1();
        B1 obj2=new B1();

        obj1.start();
        obj2.start();
    }

}
