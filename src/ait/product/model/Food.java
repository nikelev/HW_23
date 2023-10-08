package ait.product.model;

public class Food extends Product{
    private String expDates;
    private boolean organic;


    public Food(long barcode, String name, double price, String expDates, boolean organic) {
        super(barcode, name, price);
        this.expDates = expDates;
        this.organic = organic;
    }

    public String getExpDates() {
        return expDates;
    }

    public boolean isOrganic() {
        return organic;
    }

    @Override
    public String toString() {
        return "Food{" +
                "expDates='" + expDates + '\'' +
                ", organic=" + organic +
                "} " + super.toString();
    }
}
