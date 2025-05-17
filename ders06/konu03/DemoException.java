package ders06.konu03;

public class DemoException {

    public void metot01() throws Exception {
        metot02();
    }

    public void metot02() throws Exception {
        metot03();
    }

    public void metot03() throws Exception {
        throw new Exception("Bu bir hata mesajidir...");
    }

    public static void main(String[] args){
        DemoException obj = new DemoException();
        try {
            obj.metot01();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
