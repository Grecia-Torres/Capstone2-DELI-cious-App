package com.pluralsight.capstone2;

import java.util.Scanner;

public abstract class SandwichSize implements OrderPrice {
    private int size;

    public SandwichSize(int size) {
        this.size = size;
    }

    @Override
    public double price() {
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

    public static SandwichMaker sandwichSizeChoice() {
        Scanner scanner = new Scanner(System.in);
        SandwichMaker.sandwichSizes();

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
