package CompleteSandwich;

import com.pluralsight.capstone2.OrderPrice;

import java.util.Scanner;

public abstract class SandwichSize implements OrderPrice {
    private int size;

    public SandwichSize(int size) {
        this.size = size;
    }

    @Override
    public double getPrice() {
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

    @Override
    public void setPrice(double price) {
}

    public static SandwichMaker sandwichSizeChoice() {
        Scanner scanner = new Scanner(System.in);
        SandwichMaker.sandwichSizes();

        SandwichMaker sandwich = null;

        boolean availableSizes = false;
        while (!availableSizes) {

            System.out.println("Select sandwich size");
            int sizeChoice = scanner.nextInt();
            scanner.nextLine();


            if (sizeChoice == 4 || sizeChoice == 8 || sizeChoice == 12) {
                System.out.println("Which type of bread would you like?");
                System.out.println("We have White, Wheat, Rye or a Wrap");
                String breadType = scanner.nextLine();
                sandwich = new SandwichMaker(sizeChoice, breadType);
                availableSizes = true;
            } else {

                System.out.println("Not a sandwich size choice!");
            }
        }

        return sandwich;

    }
}
