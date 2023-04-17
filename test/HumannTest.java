import chapter3.Human;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HumannTest {

        @Test
        public void testThatAnObjectCanBeCreated(){
            Humann humann = new Humann();
            assertNotNull(humann);
        }
        @Test
        public void testThatHumannNameCanBeSet(){
            Humann humann =new Humann();
            humann.setName("Ellu_p");
            assertEquals("Ellu_p", humann.getName());
        }
        @Test
    public void testThatHumanAgeCanBeSet(){
            Humann humann =new Humann();
            humann.setAge(18);
            assertEquals(18, humann.getAge());
        }
        @Test
    public void testThatHumanAgeLessThan18CannotBeSet(){
            Humann humann = new Humann();
            assertThrows(IllegalArgumentException.class,() -> humann.setAge(17));
    }

    }
