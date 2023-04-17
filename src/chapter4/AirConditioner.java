package chapter4;

public class AirConditioner {
    private  boolean isOn;
    private int temperature;

    public AirConditioner(boolean isOn, int temperature) {
        this.isOn = isOn;
        this.temperature = temperature;
    }
    public boolean isOn() {
        return isOn;
    }
    public void setOn(boolean on) {
        isOn = on;
    }
    public int getTemperature() {
        return temperature;
    }
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void decreaseTemperature(int number) {
        setTemperature(getTemperature()-number);

    }
}
