package Toppings;

import com.pluralsight.capstone2.OrderPrice;

abstract class Meats implements Toppings, OrderPrice {
    private String type;
    private int size;

    public Meats(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public double getPrice() {
        double addedCharge;

        switch (size) {
            case 4:
                addedCharge = 1.00;
                break;
            case 8:
                addedCharge = 2.00;
                break;
            case 12:
                addedCharge = 3.00;
                break;
            default:
                addedCharge = 3.50;
                break;
        }
        return addedCharge;
    }
}
