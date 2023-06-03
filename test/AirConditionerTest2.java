import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

 class AirConditionerTest {
    private Ac ac;

    @BeforeEach
    void setUp(){
    ac = new Ac();
    }
    @Test
    public void testThatAirConditionCanBeInstalled(){
        assertNotNull(ac);
    }
    @Test
    public void testThatACIsOff(){
        boolean isAcOn = ac.isAcOn();
        assertFalse(isAcOn);
    }
    @Test
    public void testThatTheAcCanBeOn(){
        assertFalse(ac.isAcOn());
        ac.turnOn();
        assertTrue(ac.isAcOn());
    }
    @Test
    public void testThatAcCanBeTurnOffWhileItsBeenOn(){
         boolean isAcOn = ac.isAcOn();
         assertFalse(isAcOn);
         assertFalse(ac.isAcOn());
         ac.turnOn();
         assertTrue(ac.isAcOn());
         ac.turnoff();
         assertFalse(ac.isAcOn());
    }
    @Test
    public void testThatTheACCanBeTurnedOffWhileItIsOn(){
        boolean isAcOff = ac.isAcOn();
        assertFalse(isAcOff);
    }
    @Test
    public void testThatDefaultTemperatureIsSetTo16(){
        assertFalse(ac.isAcOn());
        ac.turnOn();
   assertEquals(16,ac.getTemperature());
    }
    @Test
    public void testThatTemperatureOfTheACCanBeIncreased(){
        assertEquals(16, ac.getTemperature());
        ac.increaseTemperature();
        ac.increaseTemperature();
    assertEquals(18, ac.getTemperature());
    }
    @Test
    public void testThatTemperatureOfTheACCanBeDecreased(){
        assertEquals(16, ac.getTemperature());
        ac.increaseTemperature();
        ac.increaseTemperature();
        assertEquals(18,ac.getTemperature());
        ac.decreasedTemperature();
        assertEquals(17,ac.getTemperature());

    }
@Test
    public void testThatTheTemperatureOfTheACCannotBeGreaterThan30(){
    ac.increaseTemperature();
    ac.increaseTemperature();
    ac.increaseTemperature();
    ac.increaseTemperature();
    ac.increaseTemperature();
    ac.increaseTemperature();
    ac.increaseTemperature();
    ac.increaseTemperature();
    ac.increaseTemperature();
    ac.increaseTemperature();
    ac.increaseTemperature();
    ac.increaseTemperature();
    ac.increaseTemperature();
    ac.increaseTemperature();
    ac.increaseTemperature();
    ac.increaseTemperature();
    ac.increaseTemperature();
    ac.increaseTemperature();
    assertEquals(29, ac.getTemperature());
    ac.increaseTemperature();
    assertEquals(29,ac.getTemperature());
}
@Test
    public void testThatTheTemperatureCannotBeLessThan16(){
        ac.decreasedTemperature();
        assertEquals(16, ac.getTemperature());
    }
}