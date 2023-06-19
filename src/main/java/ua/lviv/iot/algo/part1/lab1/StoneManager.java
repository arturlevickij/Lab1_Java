package ua.lviv.iot.algo.part1.lab1;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.Getter;

@Getter

public class StoneManager {
	private final List<Stone> stones = new LinkedList<Stone>();
	
	public void addStone(final Stone stone) {
        stones.add(stone);
    }
	
	public List<Stone> findPriceGreaterThan(final double price) {
	    return stones.stream()
	    		.filter(stone -> stone.getFullPrice() > price)
	    		.collect(Collectors.toList());
	}
	
	public List<Stone> findWithColor(final String color) {
	    return stones.stream()
	            .filter(stone -> stone.getColor().equals(color))
	            .collect(Collectors.toList());
	}
}

