package bike;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeTest {
    @Test
    public void powerOnTest(){
        Bike bike = new Bike();
        bike.startBike();
        assertTrue(bike.checkPowerOn());
    }
@Test
    public void powerOffTest(){
        Bike bike = new Bike();
        bike.startBike();
        bike.offBike();
        assertTrue(bike.checkPowerOff());
}
    @Test
    public void accelerateGear1Test(){
        Bike bike = new Bike();
        bike.startBike();
        bike.accelerate(15, 1);
        assertEquals(16,bike.checkSpeed());
    }
    @Test
    public void accelerateGear2Test(){
        Bike bike = new Bike();
        bike.startBike();
        bike.accelerate(24, 2);
        assertEquals(26, bike.checkSpeed());
    }

    @Test
    public void accelerateGear3Test(){
        Bike bike = new Bike();
        bike.startBike();
        bike.accelerate(35, 3);
        assertEquals(38, bike.checkSpeed());
    }

    @Test
    public void accelerateGear4Test() {
        Bike bike = new Bike();
        bike.startBike();
        bike.accelerate(44, 4);
        assertEquals(48, bike.checkSpeed());
    }
    @Test
    public void decelerateGear1Test(){
        Bike bike = new Bike();
        bike.startBike();
        bike.decelerate(15, 1);
        assertEquals(14, bike.checkSpeed());
    }
    @Test
    public void decelerateGear2Test() {
        Bike bike = new Bike();
        bike.startBike();
        bike.decelerate(24,2);
        assertEquals(22, bike.checkSpeed());
    }
    @Test
    public void decelerateGear3Test(){
        Bike bike = new Bike();
        bike.startBike();
        bike.decelerate(35, 3);
        Assertions.assertEquals(32, bike.checkSpeed());
    }
    @Test
    public void decelerateGear4Test(){
        Bike bike = new Bike();
        bike.startBike();
        bike.decelerate(44, 4);
        assertEquals(40, bike.checkSpeed());
    }
}