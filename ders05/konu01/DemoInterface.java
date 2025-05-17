package ders05.konu01;

interface A
{
    //	public abstract void show();
    //	public abstract void config();
    int age=44;            // final and static
    String place="Malatya";

    void show();
    void config();
}

class B implements A
{
    public void show()
    {
//        age++;
        System.out.println("Showing age: " + age);
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

        System.out.println(A.place);

    }

}
