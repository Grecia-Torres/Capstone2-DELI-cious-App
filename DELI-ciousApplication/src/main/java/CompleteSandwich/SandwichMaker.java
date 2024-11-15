package CompleteSandwich;

import java.util.Scanner;


public class SandwichMaker extends SandwichSize {
    private String breadType;

    public SandwichMaker(int size, String breadType) {
        super(size);
        this.breadType = breadType;
    }


    public String getBreadType() {
        return breadType;
    }

    public static SandwichMaker sandwichSizeChoice(Scanner scanner) {

        int sizeChoice = getValidSizeChoice(scanner);
        String breadType = getValidBreadType(scanner);
        return new SandwichMaker(sizeChoice, breadType);
    }


    private static int getValidSizeChoice(Scanner scanner) {
        int sizeChoice;

        System.out.println("Which size would you like?");
        System.out.println("We have 4\", 8\" or 12\"");


        sizeChoice = scanner.nextInt();
        scanner.nextLine();


        while (sizeChoice != 4 && sizeChoice != 8 && sizeChoice != 12) {
            System.out.println("Invalid size! Please select 4, 8, or 12 inches.");
            sizeChoice = scanner.nextInt();
            scanner.nextLine();
        }
        return sizeChoice;
    }


    private static String getValidBreadType(Scanner scanner) {

        System.out.println("Which type of bread would you like?");
        System.out.println("We have White, Wheat, Rye, or Wrap");


        String breadType = scanner.nextLine();


        while (!breadType.equalsIgnoreCase("White") &&
                !breadType.equalsIgnoreCase("Wheat") &&
                !breadType.equalsIgnoreCase("Rye") &&
                !breadType.equalsIgnoreCase("Wrap")) {
            System.out.println("Invalid bread type! Please choose from White, Wheat, Rye, or Wrap.");
            breadType = scanner.nextLine();
        }
        return breadType;
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }


    public void displaySandwichDetails() {
        System.out.println("You selected a " + getSize() + "\" sandwich with " + breadType + " bread.");
        System.out.println("Price: $" + String.format("%.2f", getPrice()));
    }
}