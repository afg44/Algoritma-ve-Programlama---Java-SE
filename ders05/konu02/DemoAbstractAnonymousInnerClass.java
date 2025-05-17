package ders05.konu02;

abstract class F
{
	public abstract void show();
	public abstract void config();
}

// concrete x abstract
class G extends F
{
	public void show()
	{
		System.out.println("in show (G)");
	}
	@Override
	public void config() {
	}
}


public class DemoAbstractAnonymousInnerClass{
    public static void main(String[] args) {
    	
    	F obj=new G();
    	obj.show();

    	F obj1=new F()
    	{
    		public void show()
    		{
    			System.out.println("in new show");
    		}
			@Override
			public void config() {
				System.out.println("in new config");
			}
		};
    	obj1.show();
    	
    }
}

