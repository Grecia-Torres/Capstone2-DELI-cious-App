package com.pluralsight.capstone2;

import java.util.Scanner;

public class SandwichMaker extends SandwichSize {
    private String breadType;
    public SandwichMaker(int size, String breadType) {
        super(size);
        this.breadType = breadType;
    }
    @Override
    public double getPrice() {
        return super.getPrice();
    }


    public void sandwichSizesDisplay() {
        System.out.println("You have selected the " + getSize() + "\" as your sandwich size");
        System.out.println("The price of a " + getSize() + "\" sandwich is $" + String.format("%.2f", getPrice()));

    }

    public static void sandwichSizes() {
        System.out.println("Which size would you like?");
        System.out.println("We have 4\", 8\" or 12\"");

    }
    /*public void meatDisplay() {
        System.out.println("The price of a " + getType() + "\" sandwich is $" + String.format("%.2f", price())); */
 //   }
}

