package ua.lviv.iot.algo.part1.lab1;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.var;

public class StoneManager {
	private final List<Stone> stones = new LinkedList<Stone>();
	
	public void addStone(Stone stone) {
        stones.add(stone);
    }
	
	public List<Stone> findPriceGreaterThan(double price) {
	    return stones.stream()
	    		.filter(stone -> stone.getFullPrice() > price)
	    		.collect(Collectors.toList());
	}
	
	public List<Stone> findWithColor(String color) {
	    return stones.stream()
	            .filter(stone -> stone.getColor().equals(color))
	            .collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		StoneManager stoneManager = new StoneManager();
		stoneManager.addStone(new PreciousStone( "Diamond", "Blue",  2.356, 0.72, 29.2, 36));
		stoneManager.addStone(new PreciousStone( "Ruby", "Red", 1.0, 0.85, 50, 68));
	    stoneManager.addStone(new ArtificialPreciousStone("Stoke", "Yellow", "Lab B", 2.2, 75.5));
	    stoneManager.addStone(new ArtificialPreciousStone("Siamond", "White", "Lab A", 1.5, 100));
	    stoneManager.addStone(new DecorationStone("Land", "White", "Clear", 2.1, 30.6));
	    stoneManager.addStone(new DecorationStone("Ametust", "Purple", "Mat", 2.1, 30.6));
	    stoneManager.addStone(new SemiPreciousStone( "Lapis", "Blue",  true, 0.95, 41.2, 90));
	    stoneManager.addStone(new SemiPreciousStone( "Quartz", "White",  false, 0.45, 11.6, 32));
	    
	    for (Stone stone : stoneManager.stones) {
	        System.out.println(stone);
	        System.out.println("Full price: " + stone.getFullPrice() + "\n");
	    }
	    var stonePriceGreaterThan = stoneManager.findPriceGreaterThan(50);
	    for (Stone stone : stonePriceGreaterThan) {
	    	System.out.println(stone);
	    }
	    
	    System.out.println("\n");
	    
	    var stoneWithColor = stoneManager.findWithColor("Blue");
	    for (Stone stone : stoneWithColor) {
	    	System.out.println(stone);
	    }
	    
	}
}

