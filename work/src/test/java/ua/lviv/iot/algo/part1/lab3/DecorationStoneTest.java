package ua.lviv.iot.algo.part1.lab3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DecorationStoneTest {
    private final DecorationStone stone = new DecorationStone("Amber", "Yellow", "Bead", 1.5, 10);
    private final DecorationStone stone2 = new DecorationStone("Amber", "Yellow", "Necklace", 3.0, 20);
    private final DecorationStone stone3 = new DecorationStone();

    @Test
    public void testGetFullPrice() {
        assertEquals(15, stone.getFullPrice(), 0.001);
        assertEquals(60, stone2.getFullPrice(), 0.001);
    }

    @Test
    public void testGetType() {
        stone.setType("Ring");
        assertEquals("Ring", stone.getType());
    }

    @Test
    public void testGetWeightInGramm() {
        assertEquals(10, stone.getWeightInGramm(), 0.001);
        assertEquals(20, stone2.getWeightInGramm(), 0.001);
    }
}
