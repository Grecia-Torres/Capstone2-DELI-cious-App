package OtherProducts;

public class Drink extends OtherProducts {
    private String size;
    private String type;

    public Drink(String type, String size) {
        super("Drink!", 0);
        this.size = size;
        this.type = type.toLowerCase().trim();
        drinkPrices(size);
    }
    private void drinkPrices(String size) {
        double price = 0;
        switch (size.toLowerCase()) {
            case "small":
                price = 2.00;
                break;
            case "medium":
                price = 2.50;
                break;
            case "large":
                price = 3.00;
                break;
            default:
                throw new IllegalArgumentException("Not a size option.");
        }
        super.setPrice(price);
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }
}
