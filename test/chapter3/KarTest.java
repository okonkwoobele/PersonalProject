package chapter3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KarTest {
    Kar kar;
    @BeforeEach public void setUp(){
         kar = new Kar("1800 Mecedix "," ", 8000,5);
    }
    @Test
    public void testThatCarModelCanBeSet(){
        kar.setModel("1840 Mecedix");
        assertEquals("1840 Mecedix", kar.getModel());
    }
    @Test
    public void testThatNegativePriceThrowsException(){
        assertThrows(IllegalArgumentException.class, ()-> kar.setPrice(-8000));
    }
    @Test
    public void testThatPriceCanHaveDiscount(){
        assertEquals(7995, kar.getDiscount());
    }

}
//    If the price is not positive, do not set its value.
//        Write a test application named CarApplication that demonstrates class Car’s capabilities.
//        Create two Car objects and display each object’s price.
//        Then apply a 5% discount on the price of the first car and a 7% discount on the price of the second.
//        Display each Car’s price again.
