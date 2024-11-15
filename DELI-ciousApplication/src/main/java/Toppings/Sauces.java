package Toppings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sauces {
    private static List<String> availableSauces = new ArrayList<>();

    static {
        availableSauces.add("Mayo");
        availableSauces.add("Mustard");
        availableSauces.add("Ketchup");
        availableSauces.add("Ranch");
        availableSauces.add("Thousand Islands");
        availableSauces.add("Vinaigrette");
    }

    public static List<String> selectSauces(Scanner scanner) {
        List<String> selectedSauces = new ArrayList<>();
        boolean selecting = true;

        while (selecting) {

            System.out.println("Please enter a sauce number or 'quit' to continue with your order");
            for (int i = 0; i < availableSauces.size(); i++) {
                System.out.println((i + 1) + ". " + availableSauces.get(i));
            }


            String choice = scanner.nextLine().trim();

            if (choice.equalsIgnoreCase("quit")) {
                selecting = false;
            } else {
                try {
                    int sauceChoice = Integer.parseInt(choice);
                    if (sauceChoice >= 1 && sauceChoice <= availableSauces.size()) {
                        String sauce = availableSauces.get(sauceChoice - 1);
                        if (!selectedSauces.contains(sauce)) {
                            selectedSauces.add(sauce);
                            System.out.println(sauce + " has been added to your sandwich.");
                        } else {
                            System.out.println(sauce + " is already added.");
                        }
                    } else {
                        System.out.println("Not a valid entry! Please enter a sauce number.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Not a valid entry! Please enter a sauce number or 'quit' to continue with your order");
                }
            }
        }

        return selectedSauces;
    }
}
