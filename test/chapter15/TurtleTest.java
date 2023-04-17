package chapter15;

import turtlework.Turtle;
import org.junit.jupiter.api.Test;

//import static javax.swing.SwingConstants.EAST;
//import static javax.swing.SwingConstants.SOUTH;
import static org.junit.jupiter.api.Assertions.*;

class TurtleTest {
    Turtle ijapa;

    public void startWith(){
        ijapa = new Turtle();
    }

    @Test
    public void turtleCanMovePenDownTest(){
        assertTrue(ijapa.penIsUp());
        ijapa.penDown();
        assertFalse(ijapa.penIsUp());
    }
    @Test
    public void turtleCanMovePenUpTest(){
        ijapa.penDown();
        assertFalse(ijapa.penIsUp());
        ijapa.penUp();
        assertFalse(ijapa.penIsUp());
    }
    @Test
    public void turtleCanTurnRightWhileFacingEastTest(){
        Turtle ijapa = new Turtle();
        ijapa.getCurrentDirection();
       // assertSame( EAST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        //assertSame(SOUTH,ijapa.getCurrentDirection());
    }

}