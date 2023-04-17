package chapter3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClockTest {

    @BeforeEach
    void setUp() {
        Clock clock = new Clock();
    }

    @Test
    public void testThatClockTimeCanBeSetInSeconds() {
        Clock clock = new Clock();
        clock.setSeconds(20);
        assertEquals(20, clock.getSeconds());
    }

    @Test
    public void testThatClockTimeCanBeSetInMinute() {
        Clock clock = new Clock();
        clock.setMinute(20);
        assertEquals(20, clock.getMinute());
    }

    @Test
    public void testThatClockTimeCanBeSetInHours() {
        Clock clock = new Clock();
        clock.setHour(20);
        assertEquals(20, clock.getHour());
    }
}