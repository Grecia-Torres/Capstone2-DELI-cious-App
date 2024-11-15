package Toppings;

import CompleteSandwich.SandwichSize;

public class Cheeses extends Toppings {
    private SandwichSize sandwichSize;
    private boolean extraCharge;

    public Cheeses(String name, SandwichSize sandwichSize, boolean extraCharge) {
        super(name, 0.00);
        this.sandwichSize = sandwichSize;
        this.extraCharge = extraCharge;
    }

    @Override
    public double getPrice() {

        double cheesePrice = super.getPrice();
        double sizePrice = sandwichSize.getPrice();
        double extraCheeseCharge = extraCharge ? extraCheeseCharge() : 0;


        return cheesePrice + sizePrice + extraCheeseCharge;
    }
    private double getSizePrice() {
        int size = sandwichSize.getSize();
        switch (size) {
            case 4:
                return 0.75;
            case 8:
                return 1.50;
            case 12:
                return 2.25;
            default:
                throw new IllegalArgumentException("Invalid sandwich size for meat price: " + size);
        }
    }

    private double extraCheeseCharge() {
        int size = sandwichSize.getSize();

        switch (size) {
            case 4:
                return 0.30;
            case 8:
                return 0.60;
            case 12:
                return 0.90;
            default:
                throw new IllegalArgumentException("Invalid size for extra meat charge");
        }
    }

    public String getType() {
        return getName();
    }

    public SandwichSize getSandwichSize() {
        return sandwichSize;
    }
}