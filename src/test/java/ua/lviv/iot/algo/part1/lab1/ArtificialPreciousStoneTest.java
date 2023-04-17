package ua.lviv.iot.algo.part1.lab1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ArtificialPreciousStoneTest {
    private final ArtificialPreciousStone diamond = new ArtificialPreciousStone( "Diamond", "Blue",  "Lab1", 29.2, 36);
    private final ArtificialPreciousStone diamond2 = new ArtificialPreciousStone( "Diamond", "Blue",  "lab2", 0.72, 50);
    @Test
    public void testGetFullPrice() {
        assertEquals(11.0, diamond.getFullPrice(), 0.0);
    }
    @Test
    public void testSetWeightInGramm() {
        diamond.setWeightInGramm(3.0);
        assertEquals(diamond2.toString(), diamond.toString());
    }
    @Test
    public void testLabName() {
        assertEquals("Synthetic Diamonds", diamond.getLabName());
    }
}
