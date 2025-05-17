package ders03.konu01;

public class Ship {

    double x;
    double y;
    double speed;
    double direction;
    String name;

    public Ship(double speed){
        this.speed = speed;
    }
    public Ship(String name) { this.speed = 0; this.name = name; }

    public void move() {
        move(1);
    }
    public void move(int steps) {
        double angle = degreesToRadians(direction);
        x = x + steps * speed * Math.cos(angle);
        y = y + steps * speed * Math.sin(angle);
        System.out.printf("moved to (%f-%f)\n", x, y);
    }
    private double degreesToRadians(double degrees) {
        return(degrees * Math.PI / 180.0);
    }

}
