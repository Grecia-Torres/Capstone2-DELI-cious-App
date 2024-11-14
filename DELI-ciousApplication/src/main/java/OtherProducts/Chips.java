package OtherProducts;

public class Chips extends OtherProducts {
    private String type;

    public Chips(String type) {
        super("Chips!", 1.50);
        this.type = type;
    }
    public String chipType() {
        return type;
    }
}

