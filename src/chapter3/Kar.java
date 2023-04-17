package chapter3;

public class Kar {

    private String model;
    private String year;
    private double price;
    private double discount;

    public double getDiscount() {
        return price-discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount/100;
    }

    public Kar(String model, String year, double price, double discount) {
        this.model = model;
        this.year = year;
        this.price = price;
        this.discount = discount;
    }


    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public String getYear() {
        return year;
    }
    public void setPrice(double price) {
        validatePrice(price);
        this.price = price;
    }

    private void validatePrice(double price) {
        if (price <= 0) throw new IllegalArgumentException("invalid price, please enter a valid price: ");
    }

    public double getPrice() {
        return price;

    }


}
