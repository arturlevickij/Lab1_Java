package ua.lviv.iot.algo.part1.lab3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArtificialPreciousStoneTest {
    private final ArtificialPreciousStone diamond = new ArtificialPreciousStone("Diamond", "Clear", "Synthetic Diamonds", 5.5, 2.0);
    private final ArtificialPreciousStone diamond2 = new ArtificialPreciousStone("Diamond", "Clear", "Synthetic Diamonds", 7.5, 3.0);
    private final ArtificialPreciousStone diamond3 = new ArtificialPreciousStone();

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
