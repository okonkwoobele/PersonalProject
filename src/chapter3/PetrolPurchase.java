package chapter3;

public class PetrolPurchase {
    private String stationLocation;
    private String typeOfPetrol;
    private int QuantityPurchaseInLitres;
    private double pricePerLitre;
    private double percentageDiscount;

    public PetrolPurchase(String stationLocation, String typeOfPetrol, int quantityPurchaseInLitres,
                          double pricePerLitre, double percentageDiscount) {
        this.stationLocation =           stationLocation;
        this.typeOfPetrol =              typeOfPetrol;
        this.QuantityPurchaseInLitres =   quantityPurchaseInLitres;
        this.pricePerLitre =             pricePerLitre;
        this.percentageDiscount =        percentageDiscount;
    }

    public String getStationLocation() {

        return stationLocation;
    }

    public void setStationLocation(String stationLocation) {

        this.stationLocation = stationLocation;
    }

    public String getTypeOfPetrol() {
        return typeOfPetrol;
    }

    public void setTypeOfPetrol(String typeOfPetrol) {

        this.typeOfPetrol = typeOfPetrol;
    }

    public int getQuantityPurchaseInLitres() {

        return QuantityPurchaseInLitres;
    }

    public void setQuantityPurchaseInLitres(int quantityPurchaseInLitres) {
        QuantityPurchaseInLitres = quantityPurchaseInLitres;
    }

    public double getPricePerLitre() {
        return pricePerLitre;
    }

    public void setPricePerLitre(double pricePerLitre) {
        this.pricePerLitre = pricePerLitre;
    }

    public double getPercentageDiscount() {
        return percentageDiscount;
    }

    public void setPercentageDiscount(double percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }
}