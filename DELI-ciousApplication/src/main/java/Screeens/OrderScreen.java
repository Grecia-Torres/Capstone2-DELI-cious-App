package Screeens;

import Ordering.Order;

import java.util.Scanner;

public class OrderScreen {


    private static Scanner scanner = new Scanner(System.in);


    public static void orderScreen() {
        Order order = new Order();
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

                int option = scanner.nextInt();
                scanner.nextLine();


                switch (option) {
                    case 1:
                        System.out.println("Add Sandwich");
                        order.addSandwich(scanner);
                        break;
                    case 2:
                        System.out.println("Add Drink");
                        order.addDrink(scanner);
                        break;
                    case 3:
                        System.out.println("Add Chips");
                        order.addChips(scanner);
                        break;
                    case 4:
                        System.out.println("Checkout");
                        order.checkout();
                        break;
                    case 0:
                        System.out.println("Cancel Order");
                        HomeScreen.homeScreen();
                        running = false;
                        break;
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
