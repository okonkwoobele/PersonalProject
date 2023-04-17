import chapter3.Car;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {
    @Test
    public void testThatCarColourCanBeSet() {
        Car car = new Car();
        car.setCarColour("green");
        assertEquals("green", car.getCarColour());
    }
    @Test
    public void testThatCarSizeCanBeSet(){
        Car car = new Car();
                car.setCarSize("Large Body");
        assertEquals("Large Body", car.getCarSize());
    }
    @Test
    public void testThatEngineTypeCanBeSet(){
        Car car = new Car();
        car.setEngineType("v8 engine");
        assertEquals("v8 engine",car.getEngineType());
    }
    @Test
    public void testThatEngineIsSound(){
        Car car = new Car();
        car.soundEngine("first grade engine");
    }
}