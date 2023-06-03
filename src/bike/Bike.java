package bike;

public class Bike {
    private boolean turnoff;

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    private int speed;
    public void startBike(){
        boolean turnOn = true;
    }
    public boolean checkPowerOn(){
        return true;
    }
    public int checkSpeed() {
        return speed;
    }
    public void offBike() {
    }
    public boolean checkPowerOff() {
        return true;
    }
    public void accelerate(int initialSpeed, int Gear){
        if(Gear == 1)
            speed = initialSpeed + 1;
        else {
            if (Gear == 2)
                speed = initialSpeed + 2;
            else {
                if (Gear == 3)
                    speed = initialSpeed + 3;
                else {
                    if (Gear == 4)
                        speed = initialSpeed + 4;
                    else {
                        if (Gear >= 5)
                            speed = initialSpeed + 4;
                    }
                }
            }
        }
    }
    public void decelerate(int initialSpeed, int Gear){
        if(Gear == 1)
            speed = initialSpeed - 1;
        else {
            if (Gear == 2)
                speed = initialSpeed - 2;
            else {
                if (Gear == 3)
                    speed = initialSpeed - 3;
                else {
                    if (Gear == 4)
                        speed = initialSpeed - 4;
                    else {
                        if (Gear >= 5)
                            speed = initialSpeed - 4;
                    }
                }
            }
        }
    }



}


