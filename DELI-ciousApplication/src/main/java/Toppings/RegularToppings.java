package Toppings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegularToppings extends Toppings {


    private static List<RegularToppings> toppingsList = new ArrayList<>();


    static {
        toppingsList.add(new RegularToppings("Lettuce"));
        toppingsList.add(new RegularToppings("Tomato"));
        toppingsList.add(new RegularToppings("Cucumber"));
        toppingsList.add(new RegularToppings("Onions"));
        toppingsList.add(new RegularToppings("Pickles"));
        toppingsList.add(new RegularToppings("Olives"));
        toppingsList.add(new RegularToppings("Bell Peppers"));
    }


    public RegularToppings(String name) {
        super(name, 0);
    }


    public static List<RegularToppings> getAllToppings() {
        return toppingsList;
    }


    public static void displayRegularToppings() {
        System.out.println("Regular Toppings (included):");
        for (int i = 0; i < toppingsList.size(); i++) {
            RegularToppings topping = toppingsList.get(i);
            System.out.println((i + 1) + ". " + topping.getName() + " - Included");
        }
    }


    public static RegularToppings selectTopping(Scanner scanner) {
        displayRegularToppings();

        int choice = scanner.nextInt();
        scanner.nextLine();

        while (choice < 1 || choice > toppingsList.size()) {
            System.out.println("Please choose one of the following toppings.");
            choice = scanner.nextInt();
            scanner.nextLine();
        }

        return toppingsList.get(choice - 1);
    }
}
