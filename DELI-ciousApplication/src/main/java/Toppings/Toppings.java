package Toppings;

import com.pluralsight.capstone2.OrderPrice;

public class Toppings implements OrderPrice {
    String name;
    private double price;

    public Toppings(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;

    }

    @Override
    public double getPrice() {
        return price;
    }
    @Override
    public void setPrice(double price) {
        this.price = price;
    }

}
