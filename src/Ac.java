public class Ac {
    private boolean isOn;

    private int count;

    private  int temperature = 16;

    public boolean isAcOn() {
        return isOn;
    }

    public int setTemperature(int i) {
        return temperature;
    }

    public int getTemperature() {
        return temperature;
    }
    public void increaseTemperature() {
        if( temperature < 29 ) temperature++;


    }
    public void decreasedTemperature(){
        if( temperature > 16 ) temperature--;
    }
    public void turnOn() {
        isOn = true;
    }

    public void turnoff() {
        isOn = false;
    }
}
