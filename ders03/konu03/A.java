package ders03.konu03;

class D {
    public A a;
    public D(A obj){
        a = obj;
        System.out.println("D");
    }
}


class C extends B{
    public C(){
        System.out.println("C");
    }
    public void show(){
        System.out.println("*** C ***");
    }
}

class B extends A{
    public B(){
        System.out.println("B");
    }
    public void show(){
        System.out.println("*** B ***");
    }
}

public class A {

    public A(){
        System.out.println("A");
    }
    public void show(){
        System.out.println("*** A ***");
    }


    public static  void main(String[] args){
        C c = new C();      // yapici metotlar sirayla calisir
        D d1 = new D(new A()); // anonim nesne ornegi
        D d2 = new D(new B()); // polimorfizim

        A dizi[] = {new A(), new B(), new C()};
        for(A obj : dizi)
            obj.show();
    }
}
