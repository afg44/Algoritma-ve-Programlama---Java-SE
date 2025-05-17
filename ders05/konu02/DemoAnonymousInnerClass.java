package ders05.konu02;

class D
{
	public void show() 
	{
		System.out.println("in show (D)");
	}
}
class E extends D
{
	public void show()
	{
		System.out.println("in show (E)");
	}
}

public class DemoAnonymousInnerClass{
    public static void main(String[] args) {

		D obj = new D();
		obj.show();

    	D obj1=new E();
		obj1.show();
    	
    	D obj2=new D()
    	{
    		public void show()
    		{
    			System.out.println("in new show");
    		}
    	};
    	obj2.show();
    }
}

