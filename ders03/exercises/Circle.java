package ders03.exercises;

public class Circle extends Shape {

    private int r;
    private Point merkez;

    public Circle(String name, Point m, int r) {
        super(name);
        this.merkez = m;
        this.r = r;
    }
    public double alan(){
        return 3.14 * r * r;
    }
    public double cevre(){
        return 2 * 3.14 * r;
    }
}
