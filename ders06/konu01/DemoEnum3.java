package ders06.konu01;

enum Color {
    WHITE("Beyaz"),
    GREEN("Yesil"),
    BLUE("Mavi"),
    BLACK("Siyah");

    private final String displayName;

    // Constructor that takes a String
    Color(String displayName) {
        this.displayName = displayName;
    }

    // Method to retrieve the String value
    public String getDisplayName() {
        return displayName;
    }
}

enum Laptop{
    Macbook(2000), XPS(2200), Surface, Predator, ThinkPad(1800);

    private int price;

    private Laptop()
    {
        price=500;
    }

    private Laptop(int price)
    {
        this.price=price;
    }

    public int getPrice()
    {
        return price;
    }
    public void setPrice(int price)
    {
        this.price=price;
        System.out.println("in Laptop" + this.name());
    }
}

public class DemoEnum3 {
    public static void main(String[] args) {

        Color greenColor = Color.GREEN;
        System.out.println("Color: " + greenColor);
        System.out.println("Display Name: " + greenColor.getDisplayName());

        for(Laptop lap : Laptop.values())
        {
            System.out.println(lap+" : "+lap.getPrice());
        }

        for(Color c : Color.values())
            for(Laptop l : Laptop.values())
                System.out.println(c + " " + l);
    }
}


