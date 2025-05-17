package ders03.exercises;

/**
 * Bu sinifi analitik geometri ozelliklerine gore tamamlayin
 */
public class Point {
    public int x;
    public int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Double slope(Point other) {
        if (this.x == other.x) {
            // Slope is undefined for vertical lines
            return null; // or throw an exception
        }
        return (double) ((other.y - this.y) / (other.x - this.x));
    }

    public double distance(Point other) {
        // ...
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public static void main(String[] a){

        Point p1 = new Point(0,0);
        Point p2 = new Point(1,1);

        System.out.println(p1);
        
    }
}
