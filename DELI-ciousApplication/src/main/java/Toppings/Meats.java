package Toppings;

import CompleteSandwich.SandwichSize;


public class Meats extends Toppings {
    private SandwichSize sandwichSize;
    private boolean extraCharge;

    public Meats(String name, SandwichSize sandwichSize, boolean extraCharge) {
        super(name, 0.00);
        this.sandwichSize = sandwichSize;
        this.extraCharge = extraCharge;
    }

    @Override
    public double getPrice() {

        double meatPrice = super.getPrice();


        double sizePrice = sandwichSize.getPrice();


        double extraMeatCharge = extraCharge ? extraMeatCharge() : 0;


        return meatPrice + sizePrice + extraMeatCharge;
    }
    private double getSizePrice() {
        int size = sandwichSize.getSize();
        switch (size) {
            case 4:
                return 1.00;
            case 8:
                return 2.00;
            case 12:
                return 3.00;
            default:
                throw new IllegalArgumentException("Not valid " + size);
        }
    }


    private double extraMeatCharge() {
        int size = sandwichSize.getSize();

        switch (size) {
            case 4:
                return 0.50;
            case 8:
                return 1.00;
            case 12:
                return 1.50;
            default:
                throw new IllegalArgumentException("Not valid");
        }
    }

    public String getType() {
        return getName();
    }

    public SandwichSize getSandwichSize() {
        return sandwichSize;
    }
}
