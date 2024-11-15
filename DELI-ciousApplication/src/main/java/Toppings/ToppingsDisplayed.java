package Toppings;

import CompleteSandwich.SandwichSize;
import CompleteSandwich.SandwichMaker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToppingsDisplayed {
    private List<String> selectedMeats = new ArrayList<>();
    private List<String> selectedCheeses = new ArrayList<>();
    private List<String> selectedRegularToppings = new ArrayList<>();
    private List<String> selectedSauces = new ArrayList<>();


    public double meatDisplayed(Scanner scanner) {
        double meatPrice = 0.0;
        try {

            SandwichMaker sandwich = SandwichMaker.sandwichSizeChoice(scanner);
            sandwich.displaySandwichDetails();
            SandwichSize sandwichSize = sandwich;


            System.out.println("What type of meat would you like?");
            String meatType = scanner.nextLine();
            selectedMeats.add(meatType);

            System.out.println("Would you like extra meat? (yes/no)");
            String extraMeatChoice = scanner.nextLine();
            boolean extraCharge1 = extraMeatChoice.equalsIgnoreCase("yes");

            Meats meats = new Meats(meatType, sandwichSize, extraCharge1);
            meatPrice = meats.getPrice();

            System.out.println("You have added: " + meats.getName() + " meat");
            System.out.println("Price: $" + String.format("%.2f", meats.getPrice()));
            System.out.println("Meat type: " + meats.getType());
            System.out.println("Meat size: " + meats.getSandwichSize().getSize());


            System.out.println("What type of cheese would you like?");
            String cheeseType = scanner.nextLine();
            selectedCheeses.add(cheeseType);

            System.out.println("Would you like extra cheese? (yes/no)");
            String extraCheeseChoice = scanner.nextLine();
            boolean extraCharge2 = extraCheeseChoice.equalsIgnoreCase("yes");

            Cheeses cheeses = new Cheeses(cheeseType, sandwichSize, extraCharge2);

            System.out.println("You have added: " + cheeses.getName() + " cheese");
            System.out.println("Price: $" + String.format("%.2f", cheeses.getPrice()));


            System.out.println("\nNow, let's add regular toppings to your sandwich (Included):");
            RegularToppings selectedTopping = RegularToppings.selectTopping(scanner); // Select a topping
            selectedRegularToppings.add(selectedTopping.getName());
            System.out.println("You have selected: " + selectedTopping.getName() + " (Included)");


            System.out.println("\nNow, let's add sauces to your sandwich (Included):");
            selectedSauces = Sauces.selectSauces(scanner);

        } catch (Exception e) {
            System.out.println("An error occurred while processing your order: " + e.getMessage());
            e.printStackTrace();
        }
        return meatPrice;
    }


    public List<String> getSelectedMeats() {
        return selectedMeats;
    }

    public List<String> getSelectedCheeses() {
        return selectedCheeses;
    }

    public List<String> getSelectedRegularToppings() {
        return selectedRegularToppings;
    }

    public List<String> getSelectedSauces() {
        return selectedSauces;
    }
}
