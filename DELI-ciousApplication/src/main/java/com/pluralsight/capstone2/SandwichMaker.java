package com.pluralsight.capstone2;

import java.util.Scanner;

public class SandwichMaker extends SandwichSize {
    public SandwichMaker(int size) {
        super(size);
    }

    public void sandwichSizesDisplay() {
        System.out.println("You have selected the " + getSize() + "\" as your sandwich size");
        System.out.println("The price of a " + getSize() + "\" sandwich is $" + String.format("%.2f", price()));

    }

    public static void sandwichSizes() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which type of bread would you like from the following:");
        System.out.println("White, Wheat, Rye or a Wrap");
        String breadType = scanner.nextLine();
        System.out.println("Which size would you like?");
        System.out.println("We have 4\", 8\" or 12\"");

    }
    /*public void meatDisplay() {
        System.out.println("The price of a " + getType() + "\" sandwich is $" + String.format("%.2f", price())); */
 //   }
}

