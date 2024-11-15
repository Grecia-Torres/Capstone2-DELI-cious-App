package CompleteSandwich;

import Ordering.OrderPrice;


public abstract class SandwichSize implements OrderPrice {
    private int size;

    public SandwichSize(int size) {
        this.size = size;
    }

    @Override
    public double getPrice() {
        double totalPrice;

        switch (size) {
            case 4:
                totalPrice = 5.50;
                break;
            case 8:
                totalPrice = 7.00;
                break;
            case 12:
                totalPrice = 8.50;
                break;
            default:
                totalPrice = 8.50;
                break;
        }
        return totalPrice;
    }

    public int getSize() {
        return size;

    }

    @Override
    public void setPrice(double price) {
    }
}

