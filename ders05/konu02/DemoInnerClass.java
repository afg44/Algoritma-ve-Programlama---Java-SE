package ders05.konu02;

//static class A // error: only innner classes can be static
class A
{
	int age;
	
	public void show()
	{
		System.out.println("in show (A)");
	}
	
	class B
	{
		public void config()
		{
			System.out.println("in config (B)");
		}
	}
	
	static class C
	{
		public void config()
		{
			System.out.println("in config (static C)");
		}
	}
}


public class DemoInnerClass{
    public static void main(String[] args) {
    	A obj=new A();
    	obj.show();

//		A.B obj1 = new B(); // HATA
		A.B obj1=obj.new B();
    	obj1.config();
    	
    	A.C obj2=new A.C();
    	obj2.config();

    }
}

