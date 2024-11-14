package OtherProducts;

import java.util.Scanner;

public class OtherProductsDisplayed {
    public void chipsDisplayed() {
        Scanner scanner = new Scanner(System.in);
        try {

            System.out.println("What kind of chips would you like?");
            String inputChipType = scanner.nextLine();

            Chips chip = new Chips(inputChipType);
            System.out.println("You have added " + chip.getName());
            System.out.println("Price: $ " + String.format("%.2f",chip.getPrice()));
            System.out.println("Chip type: " + chip.chipType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        }


        public void drinkDisplayed (Scanner scanner) {

            try {

                System.out.println("What type of drink would you like?");
                String inputDrinkType = scanner.nextLine();

                System.out.println("What size drink would you like?");
                System.out.println("Small, Medium, or Large");
                String inputDrinkSize = scanner.nextLine();

                Drink drink = new Drink(inputDrinkType, inputDrinkSize);
                System.out.println("You have added a " + drink.getName());
                System.out.println("Price: $ " + String.format("%.2f",drink.getPrice()));
                System.out.println("Drink type: " + drink.getType());
                System.out.println("Drink size: " + drink.getSize());
                //System.out.println("The price of a " + getSize() + "\" sandwich is $" + String.format("%.2f", getPrice()));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            }
        }

