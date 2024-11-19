package Screeens;

import java.util.Scanner;

public class HomeScreen {

    public static void homeScreen() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("--------------Home Screen-----------------");
                System.out.println("Press 1 if you would like to order");
                System.out.println("Press 0 if you would like to exit the app");
                int options = scanner.nextInt();

                scanner.nextLine();

                switch (options) {
                    case 1:
                        OrderScreen.orderScreen(scanner);
                        break;
                    case 0:
                        System.out.println("Exiting Now...");
                        scanner.close();
                        return;
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
