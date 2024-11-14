package Toppings;

import com.pluralsight.capstone2.SandwichSize;

abstract class Bread extends SandwichSize {
    private String breadType;

    public Bread(int size, String breadType) {
        super(size);
        this.breadType = breadType;
    }
}