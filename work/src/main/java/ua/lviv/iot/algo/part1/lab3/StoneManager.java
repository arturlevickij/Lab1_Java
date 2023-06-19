package ua.lviv.iot.algo.part1.lab3;

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
}
