package OtherProducts;

import com.pluralsight.capstone2.OrderPrice;

public class OtherProducts implements OrderPrice {
    private String name;
    private double price;

    public OtherProducts(String name, double price) {
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
