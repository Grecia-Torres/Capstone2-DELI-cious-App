package Toppings;

import CompleteSandwich.SandwichSize;

abstract class Bread extends SandwichSize {
    private String breadType;

    public Bread(int size, String breadType) {
        super(size);
        this.breadType = breadType;
    }
}