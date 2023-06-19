package ua.lviv.iot.algo.part1.lab1;

import org.junit.Test;
import static org.junit.Assert.*;

public class SemiPreciousStoneTest {
    private final SemiPreciousStone stone1 = new SemiPreciousStone("Amber", "Yellow", false, 1.2, 100, 2.4);
    private final SemiPreciousStone stone2 = new SemiPreciousStone("Turquoise", "Blue", true, 1.5, 80, 2.25);

    @Test
    public void testGetFullPrice() {
        assertEquals(120, stone1.getFullPrice(), 0.001);
        assertEquals(120, stone1.getPricePerCarat() * stone1.getCarat(), 0.001);
        assertEquals(120, stone1.getWeightInGramm() / stone1.getCarat() * stone1.getPricePerCarat(), 0.001);

        assertEquals(120, stone1.getFullPrice(), 0.001);
        assertEquals(120, stone2.getPricePerCarat() * stone2.getCarat(), 0.001);
        assertEquals(120, stone2.getWeightInGramm() / stone2.getCarat() * stone2.getPricePerCarat(), 0.001);
    }
}

