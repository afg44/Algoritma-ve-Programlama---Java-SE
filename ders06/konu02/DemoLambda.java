package ders06.konu02;

/*
* Lambda expressions Java 8 ve sonrası
* anonymous functions: isimsiz fonksiyonlar
* Interface'le üçe ayrılır: normal, marker ve fonksiyonel
* Lambda ifadeleri sadece tek bir abstract metot içeren fonksiyonel
* interface ile kullanilir
* */

@FunctionalInterface
interface MyFunction {
    void workhard();
}

@FunctionalInterface
interface MyFunction2 {
    void letstry(int i);
}

@FunctionalInterface
interface IMyInterface
{
    int add(int i, int j);
}

public class DemoLambda {
    public static void main(String[] args){

        MyFunction ref = new MyFunction() {
            @Override
            public void workhard() {
                System.out.println("Cok iyi calisin!");
                System.out.println("tebrikler basardin!");
            }
        };
        ref.workhard();

        MyFunction f = () -> System.out.println("Worked hard!");
        f.workhard();

        MyFunction2 f2 = (int j) -> {
            for(int i=0; i<j; i++)
                System.out.println("Try again");
        };
        f2.letstry(5);

        IMyInterface obj=(i,j) -> i+j;
        int result=obj.add(5, 4);
        System.out.println(result);

        IMyInterface obj2=(i,j) -> i*j;
        result=obj2.add(5, 4);
        System.out.println(result);
    }
}
