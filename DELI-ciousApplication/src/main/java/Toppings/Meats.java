package Toppings;

public class Meats extends Toppings {
    public Meats(String name, double price) {
        super(name, price);
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }
    public double getPrice(int size) {
        // Custom logic for pricing meat based on size
        switch (size) {
            case 4:
                return 1.00;
            case 8:
                return 2.00;
            case 12:
                return 3.00;
            default:
                throw new IllegalArgumentException("Invalid size for meat");
        }
    }
}

