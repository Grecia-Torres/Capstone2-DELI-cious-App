package com.pluralsight.capstone2;

import java.util.Scanner;

public class SandwichMaker extends Sandwich {
    public SandwichMaker(int size) {
        super(size);
    }

    public void sandwichSizesDisplay() {
        System.out.println("You have selected the " + getSize() + "\" as your sandwich size");
        System.out.println("The price of a " + getSize() + "\" sandwich is $" + String.format("%.2f", price()));

    }

    public static SandwichMaker sandwichSizeChoice() {
        Scanner scanner = new Scanner(System.in);
        Sandwich.sandwichSizes();

        SandwichMaker sandwich = null;

        boolean availableSizes = false;
        while (!availableSizes) {

            System.out.println("Select sandwich size");
            int sizeChoice = scanner.nextInt();


            if (sizeChoice == 4 || sizeChoice == 8 || sizeChoice == 12) {
                sandwich = new SandwichMaker(sizeChoice);
                availableSizes = true;
            } else {

                System.out.println("Not a sandwich size choice!");
            }
        }

        return sandwich;
    }

}

