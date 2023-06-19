package ua.lviv.iot.algo.part1.lab3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PreciousStoneTest {
    private final PreciousStone diamond = new PreciousStone("Diamond", "Colorless", 1.5, 7.5, 10000, 3.0);

    @Test
    public void testGetTotalPrice() {
        assertEquals(15000, diamond.getTotalPrice(), 0.01);
    }

    @Test
    public void testIncreaseClarity() {
        assertEquals(8.5, diamond.increaseClarity(), 0.01);
    }

    @Test
    public void testIncreasePrice() {
        assertEquals(15750, diamond.increasePrice(5), 0.01);
    }

    @Test
    public void testGetFullPrice() {
        assertEquals(15000, diamond.getFullPrice(), 0.01);
    }

    @Test
    public void testConstructor() {
        assertEquals("Diamond", diamond.getName());
        assertEquals("Colorless", diamond.getColor());
        assertEquals(1.5, diamond.getCarat(), 0.01);
        assertEquals(7.5, diamond.getClarity(), 0.01);
        assertEquals(10000, diamond.getPricePerCarat(), 0.01);
        assertEquals(3.0, diamond.getWeightInGramm(), 0.01);
    }

    @Test
    public void testToString() {
        String expected = "PreciousStone(super=Stone(name=Diamond, color=Colorless), "
        		+ "carat=1.5, clarity=7.5, pricePerCarat=10000.0, weightInGramm=3.0)";
        assertEquals(expected, diamond.toString());
    }

    @Test
    public void testNotEquals() {
        PreciousStone emerald = new PreciousStone("Emerald", "Green", 1.5, 7.5, 10000, 3.0);
        assertEquals(false, diamond.equals(emerald));
    }
}
