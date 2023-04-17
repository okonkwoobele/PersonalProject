import chapter3.Human;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class HumanTest {
    @Test
    public void testThatAnObjectCanBeCreated(){
        Human human = new Human();
        assertNotNull(human);
    }
    @Test
    public void testThatHumanHeightCanBeSetAndGet(){
        Human human =new Human();
        human.setHumanHeight("Tall");
        assertEquals("Tall", human.getHumanHeight());
    }
    @Test
    public void testThatHumanSkinColourCanBeSet(){
        Human human = new Human();
        human.setSkinColour("Dark Brown");
        assertEquals("Dark Brown",human.getSkinColour());
    }
    @Test
    public void testThatHumanAgeCanBeSet(){
        Human human = new Human();
        human.setAge("50yrs");
        assertEquals("50yrs",human.getAge());
    }
    @Test
    public void testThatTheManCanWalk(){
        Human human = new Human();
        human.Walk("i love to catWalk");
    }
    @Test
    public void testThatTheManCanTalk(){
        Human human = new Human();
        human.talk("i talk in tougues");
    }
}
