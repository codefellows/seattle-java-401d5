package demo;

import org.junit.Before;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class DogTest {

    Dog testDog;
    @Before
    public void setUp() throws Exception {
        testDog = new Dog("Ginger", "...", 4, new Color(176, 101, 0));
    }

    @Test
    public void testToString() {
        assertEquals("ginger string should match ginger",
                "Ginger, size 4, says ...",
                testDog.toString());
    }

    @Test
    public void testAllTheThings() {
        testDog.makeNoise();
        // testDog.beHelpful();

        Dog max = new ServiceDog("max", "ruff", 6, new Color(0,0,0), "finding people");
        max.makeNoise();
        System.out.println(max.toString());
        ((ServiceDog) max).beHelpful();

        ((ServiceDog)testDog).beHelpful();
    }
}