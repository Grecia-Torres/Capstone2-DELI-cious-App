package com.pluralsight.capstone2;

import OtherProducts.Chips;
import OtherProducts.OtherProductsDisplayed;

import java.util.Scanner;

public class OrderScreen {
    public static void orderScreen() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            try {
                System.out.println("---------Order Screen---------");
                System.out.println("If you are ready to order please choose one of the options below:");
                System.out.println("1) Add Sandwich");
                System.out.println("2) Add Drink");
                System.out.println("3) Add Chips");
                System.out.println("4) Checkout");
                System.out.println("0) Cancel Order");

                int options = scanner.nextInt();
                scanner.nextLine();

                switch (options) {
                    case 1:
                        System.out.println("Add Sandwich");
                        SandwichMaker sandwich = SandwichMaker.sandwichSizeChoice();
                        sandwich.sandwichSizesDisplay();
                        break;
                    case 2:
                        System.out.println("Add Drink");
                        OtherProductsDisplayed otherProductsDisplayed1 = new OtherProductsDisplayed();
                        otherProductsDisplayed1.drinkDisplayed(scanner);
                        break;
                    case 3:
                        System.out.println("Add Chips");
                        OtherProductsDisplayed otherProductsDisplayed = new OtherProductsDisplayed();
                        otherProductsDisplayed.chipsDisplayed();


                        break;
                    case 4:
                        System.out.println("Checkout");
                        break;
                    case 0:
                        System.out.println("Cancel Order");
                        HomeScreen.homeScreen();
                    default:
                        System.out.println("Not a valid option. Please choose one of the following options:");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Not a valid option. Please choose one of the following options.");
                scanner.nextLine();
            }
        }
    }
}
