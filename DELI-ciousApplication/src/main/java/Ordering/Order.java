package Ordering;

import CompleteSandwich.SandwichMaker;
import OtherProducts.OtherProductsDisplayed;
import Toppings.ToppingsDisplayed;

import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Order {
    private StringBuilder orderDetails;
    private double totalPrice;

    public Order() {
        this.orderDetails = new StringBuilder();
        this.totalPrice = 0.0;
    }

    public void addSandwich(Scanner scanner) {

        SandwichMaker sandwich = SandwichMaker.sandwichSizeChoice(scanner);
        sandwich.displaySandwichDetails();

        double sandwichPrice = sandwich.getPrice();
        totalPrice += sandwichPrice;
        orderDetails.append("Sandwich: " + sandwich.getSize() + "\" with " + sandwich.getBreadType() + " bread - $"
                + String.format("%.2f", sandwichPrice) + "\n");


        ToppingsDisplayed toppingsDisplayed = new ToppingsDisplayed();
        double meatPrice = toppingsDisplayed.meatDisplayed(scanner);
        totalPrice += meatPrice;


        List<String> selectedMeats = toppingsDisplayed.getSelectedMeats();
        orderDetails.append("Meat: ");
        if (!selectedMeats.isEmpty()) {
            for (String meat : selectedMeats) {
                orderDetails.append(meat + ", ");
            }
            orderDetails.setLength(orderDetails.length() - 2);
        } else {
            orderDetails.append("No meat selected");
        }
        orderDetails.append(" - $" + String.format("%.2f", meatPrice) + "\n");


        List<String> selectedCheeses = toppingsDisplayed.getSelectedCheeses();
        orderDetails.append("Cheese: ");
        if (!selectedCheeses.isEmpty()) {
            for (String cheese : selectedCheeses) {
                orderDetails.append(cheese + ", ");
            }
            orderDetails.setLength(orderDetails.length() - 2);
        } else {
            orderDetails.append("No cheese selected");
        }
        orderDetails.append("\n");


        List<String> selectedRegularToppings = toppingsDisplayed.getSelectedRegularToppings();
        orderDetails.append("Regular Toppings: ");
        if (!selectedRegularToppings.isEmpty()) {
            for (String topping : selectedRegularToppings) {
                orderDetails.append(topping + ", ");
            }
            orderDetails.setLength(orderDetails.length() - 2);
        } else {
            orderDetails.append("No regular toppings selected");
        }
        orderDetails.append("\n");


        List<String> selectedSauces = toppingsDisplayed.getSelectedSauces();
        orderDetails.append("Sauces: ");
        if (!selectedSauces.isEmpty()) {
            for (String sauce : selectedSauces) {
                orderDetails.append(sauce + ", ");
            }
            orderDetails.setLength(orderDetails.length() - 2);
        } else {
            orderDetails.append("No sauces selected");
        }
        orderDetails.append("\n");
    }

    public void addDrink(Scanner scanner) {
        OtherProductsDisplayed otherProductsDisplayed = new OtherProductsDisplayed();
        double drinkPrice = otherProductsDisplayed.drinkDisplayed(scanner);
        totalPrice += drinkPrice;


        orderDetails.append("Drink: " + " (" + drinkPrice + ") - $" + String.format("%.2f", drinkPrice) + "\n");
    }

    public void addChips(Scanner scanner) {
        OtherProductsDisplayed otherProductsDisplayed = new OtherProductsDisplayed();
        double chipPrice = otherProductsDisplayed.chipsDisplayed();
        totalPrice += chipPrice;


        orderDetails.append("Chips: " + " - $" + String.format("%.2f", chipPrice) + "\n");
    }

    public void checkout() {
        System.out.println("Processing your checkout...");
        saveReceipt();
    }

    private void saveReceipt() {

        File receiptsDir = new File("Receipts");
        if (!receiptsDir.exists()) {
            receiptsDir.mkdir();
        }


        String timestamp = new SimpleDateFormat("yyyyMMdd-HHmmss").format(new Date());
        File receiptFile = new File(receiptsDir, timestamp + ".txt");


        try (FileWriter writer = new FileWriter(receiptFile)) {
            writer.write("Order Receipt\n");
            writer.write("Date: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + "\n");
            writer.write("\nOrder Details:\n");
            writer.write(orderDetails.toString());
            writer.write("\nTotal Price: $" + String.format("%.2f", totalPrice) + "\n");
            System.out.println("Receipt saved to " + receiptFile.getPath());
        } catch (IOException e) {
            System.err.println("Error saving receipt: " + e.getMessage());
        }
    }
}

