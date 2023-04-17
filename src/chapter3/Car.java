package chapter3;

public class Car {
    private String carColour;
    private String carSize;
    private String engineType;

    public Car() {

    }

    public void setCarColour(String carColour) {
        this.carColour = carColour;
    }

    public void setCarSize(String carSize) {

        this.carSize = carSize;
    }

    public void setEngineType(String engineType) {

        this.engineType = engineType;
    }

    public String getCarColour() {

        return carColour;
    }

    public String getCarSize() {
        return carSize;
    }

    public String getEngineType() {
        return engineType;
    }

    public Car(String carColour, String carSize, String engineType) {
        this.carColour = carColour;
        this.carSize = carSize;
        this.engineType = engineType;
    }

    public void soundEngine(String first_grade_engine) {
    }
}
