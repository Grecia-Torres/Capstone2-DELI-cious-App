package OtherProducts;

public class Chips extends OtherProducts {
    private String chipType;


    public Chips(String chipType) {
        super("Chips", 0.0);
        this.chipType = chipType;
        setPriceBasedOnType(chipType);
    }


    private void setPriceBasedOnType(String chipType) {
        double price = 1.50;
        if (chipType.equalsIgnoreCase("Lays")) {
            price = 1.49;
        } else if (chipType.equalsIgnoreCase("Pringles")) {
            price = 1.75;
        }
        super.setPrice(price);
    }

    public String getChipType() {
        return chipType;
    }
}
