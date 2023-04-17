package chapter4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirConditionerTest {
    @Test
    public void testThatTemperatureCanBeDecreased(){
        AirConditioner Ac = new AirConditioner(true,16);
        assertTrue(Ac.isOn());
        Ac.decreaseTemperature(8);
        assertEquals(8, Ac.getTemperature());
    }
    @Test
    public void testThatYouCanGetTemperature(){
        AirConditioner Ac = new AirConditioner(true,16);
        Ac.setTemperature(9);
        assertEquals(9,Ac.getTemperature());
    }

}