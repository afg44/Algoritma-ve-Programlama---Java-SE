package ders03.exercises;

public class Shape {

    private String isim;

    public Shape(String name){
        this.isim = name;
    }

    public double alan(){
        return 0;
    }
    public double cevre(){
        return 0;
    }
    public String toString(){
        return String.format("%s alan:%f cevre:%f",isim, alan(), cevre());
    }

    public static  void main(String[] args){
        Shape s1 = new Circle("daire", new Point(0,0), 5);
        System.out.println(s1);
        Circle c1 = new Circle("daire", new Point(0,0), 5);
//        c1.r = 0;
    }
}
