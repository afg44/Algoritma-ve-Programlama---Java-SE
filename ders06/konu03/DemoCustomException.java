package ders06.konu03;

class MyFirstException extends Exception {
    public MyFirstException(String string)
    {
        super("(MyFirstException) " + string);
    }
}

class MySecondException extends Exception {
    public MySecondException(String string)
    {
        super("(MySecondException) " + string);
    }
}

class MyThirdException extends Exception {
    public MyThirdException(String string)
    {
        super("(MyThirdException) " + string);
    }
}

public class DemoCustomException {

    public static void main(String[] args){
        for(int i=1; i<=3; i++){
            try{
                switch (i) {
                    case 1 -> throw new MyFirstException("Exception 1");
                    case 2 -> throw new MySecondException("Exception 2");
                    case 3 -> throw new MyThirdException("Exception 3");
                }
            } catch (MyFirstException e) {
                System.out.println(e.getMessage());
            } catch (MyThirdException e) {
                System.out.println(e.getMessage());
            } catch (MySecondException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
