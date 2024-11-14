package com.pluralsight.capstone2;

import java.util.Scanner;

public abstract class Sandwich implements OrderPrice {
    private int size;

    public Sandwich(int size) {
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

    public static void sandwichSizes() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which type of bread would you like from the following:");
        System.out.println("White, Wheat, Rye or a Wrap");
        String breadType = scanner.nextLine();
        System.out.println("Which size would you like?");
        System.out.println("We have 4\", 8\" or 12\"");

    }
}


