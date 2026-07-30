package ders06.konu01;

interface A
{
    //	public abstract void show();
    //	public abstract void config();
    int plaka =44;            // final and static
    String place="Malatya";

    void show();
    void config();
}

class B implements A
{
    public void show()
    {
//        plaka = 23;
        System.out.println("Plaka: " + plaka);
    }
    public void config()
    {
        System.out.println("in config");
    }
}

public class DemoInterface {
    public static void main(String[] args) {
        A obj;
        obj=new B();

        obj.show();
        obj.config();

//        A.place="Tokyo";
//        obj.place="Tokyo";
        System.out.println(A.place);

    }

}
