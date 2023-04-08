package ua.lviv.iot.algo.part1.lab3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class StoneManagerTest {
	private final List<Stone> stones = new LinkedList<Stone>();
	
	@Test
	@DisplayName("Add Stone method should work")
	public void testAddStone() {
	    for (int index = 0; index < 8; index++) {
	        stoneManager.addStone(new Diamond("Big Diamond", "White", 50000));
	    }
	    assertEquals(8, stoneManager.getStones().size());
	}

	@Test
	@DisplayName("Find Stones with price range should work")
	public void testFindStonesWithPriceRange() {
	    stoneManager.addStone(new Diamond("Big Diamond", "White", 50000));
	    stoneManager.addStone(new Ruby("Small Ruby", "Red", 1000));
	    stoneManager.addStone(new Emerald("Emerald", "Green", 3000));

	    List<Stone> actualStones = new LinkedList<>();
	    actualStones.add(new Diamond("Big Diamond", "White", 50000));
	    actualStones.add(new Emerald("Emerald", "Green", 3000));

	    assertEquals(actualStones.size(), stoneManager.findStonesWithPriceRange(2000, 50000).size());
	}

	@Test
	@DisplayName("Find Stones by color should work")
	public void testFindStonesByColor() {
	    stoneManager.addStone(new Diamond("Big Diamond", "White", 50000));
	    stoneManager.addStone(new Ruby("Small Ruby", "Red", 1000));
	    stoneManager.addStone(new Emerald("Emerald", "Green", 3000));

	    List<Stone> actualStones = new LinkedList<>();
	    actualStones.add(new Ruby("Small Ruby", "Red", 1000));

	    assertEquals(actualStones.size(), stoneManager.findStonesByColor("Red").size());
	}

	@Test
	@DisplayName("Remove Stone method should work")
	public void testRemoveStone() {
	    stoneManager.addStone(new Diamond("Big Diamond", "White", 50000));
	    stoneManager.addStone(new Ruby("Small Ruby", "Red", 1000));
	    stoneManager.addStone(new Emerald("Emerald", "Green", 3000));

	    List<Stone> actualStones = new LinkedList<>();
	    actualStones.add(new Diamond("Big Diamond", "White", 50000));
	    actualStones.add(new Emerald("Emerald", "Green", 3000));

	    stoneManager.removeStone(new Ruby("Small Ruby", "Red", 1000));

	    assertEquals(actualStones.size(), stoneManager.getStones().size());
	}
}
