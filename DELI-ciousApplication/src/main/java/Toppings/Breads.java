package Toppings;

import com.pluralsight.capstone2.Sandwich;

abstract class Breads extends Sandwich {
    private String breadType;
    private String toppings;

    public Breads(String breadType) {
        this.breadType = breadType;
    }

    @Override
    public void bread() {
        System.out.println("You have picked: " + breadType);
    }
}
