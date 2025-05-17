package ders05.konu03;

// @FunctionalInterface tek metod içeren interface tanımlamak icin kullanılır
@FunctionalInterface
interface A{
    void show();
//    void config();  // ikinci metoda izin verilmez
}

// ileriki versiyonlarda desteklenmeyecek class, method veya variable
@Deprecated
class B{
    int x;
    public B(int x) { this.x = x;}
}

public class DemoAnnotations {
    public static void main(String[] args) {

        A o = new A(){
            @Override
            public void show() {
                System.out.println("show of (A)");
            }
        };
        o.show();

        B obj = new B(10);
        System.out.println(obj.x);
    }
}
