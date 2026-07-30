package ders07.konu01;

//enum Status{
//    Running, Failed, Pending, Success;
//}

public class DemoEnum2 {
    public static void main(String[] args) {

        Status s2=Status.Pending;

        switch(s2)
        {
            case Running:
                System.out.println("All Good");
                break;

            case Failed:
                System.out.println("Try Again");
                break;

            case Pending:
                System.out.println("Please Wait");
                break;

            default:
                System.out.println("Done");
                break;
        }

        if(s2==Status.Running)
            System.out.println("All Good");
        else if(s2==Status.Failed)
            System.out.println("Try Again");
        else if ( s2==Status.Pending)
            System.out.println("Please Wait");
        else
            System.out.println("Done");

    }
}