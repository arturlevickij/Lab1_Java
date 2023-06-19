package ua.lviv.iot.algo.part1.lab3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class StoneManagerTest {
	StoneManager stoneManager = new StoneManager();

	@Test
	@DisplayName("Add Stone method should work")
	public void testAddStone() {
	    for (int index = 0; index < 8; index++) {
	    	stoneManager.addStone(new PreciousStone( "Diamond", "Blue",  2.356, 0.72, 29.2, 36));
	    }
	    assertEquals(8, stoneManager.getStones().size());
	}
	
	@Test
	@DisplayName("Find Stones with price range should work")
	public void testFindPriceGreaterThan() {
		stoneManager.addStone(new PreciousStone( "Diamond", "Blue",  2.356, 0.72, 29.2, 36));
	    stoneManager.addStone(new PreciousStone( "Ruby", "Blue",  1.3, 0.2, 2.2, 6));
	    stoneManager.addStone(new ArtificialPreciousStone( "Diamond", "Blue",  "Lab3", 0.72, 29.2));

	    List<Stone> actualStones = new LinkedList<>();
	    actualStones.add(new PreciousStone( "Diamond", "Blue",  2.356, 0.72, 29.2, 36));
	    actualStones.add(new ArtificialPreciousStone( "Diamond", "Blue",  "Lab3", 0.72, 29.2));

	    assertEquals(actualStones.size(), stoneManager.findPriceGreaterThan(20).size());
	}
	
	@Test
	@DisplayName("Find Stones by color should work")
	public void testFindStonesByColor() {
	    stoneManager.addStone(new PreciousStone( "Diamond", "Blue",  2.356, 0.72, 29.2, 36));
	    stoneManager.addStone(new PreciousStone( "Ruby", "Red",  1.3, 0.2, 2.2, 6));
	    stoneManager.addStone(new ArtificialPreciousStone( "Diamond", "Blue",  "Lab3", 0.72, 29.2));

	    List<Stone> actualStones = new LinkedList<>();
	    actualStones.add(new PreciousStone( "Diamond", "Blue",  2.356, 0.72, 29.2, 36));

	    assertEquals(actualStones.size(), stoneManager.findWithColor("Red").size());
	}
}
