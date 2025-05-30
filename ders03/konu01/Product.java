package ders03.konu01;

public class Product {
    //attribute | field
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String renk;
    private String kod;

    public Product(int id, String name, String description,double price, 
    		int stockAmount, String renk){
        System.out.println("Yapici metot calisti");
        this.id = id;
        this.renk = renk;
        this.name = name;
        this.price = price;
        this.description = description;
        this.stockAmount = stockAmount;
    }

    public Product(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return this.name.substring(0,1) + id;
    }

    @Override
    public boolean equals(Object o) {
    	
    	if(o instanceof Product == false)
    	    return false;
		
    	Product other = (Product) o;
    	
    	if(this.id != other.id) 
    		return false;
    	else if(this.name.equalsIgnoreCase(other.name) == false)
    		return false;
    	else if(this.price != other.price)
    		return false;
    	else if(this.renk.equalsIgnoreCase(other.renk) == false)
    		return false;
    	else if(this.stockAmount != other.stockAmount)
    		return false;
    	
    	return true;
    }
    
}
