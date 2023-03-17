package ua.lviv.iot.algo.part1.lab1;

import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.ToString;
import lombok.var;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class PreciousStone {
	private String name;
	private double carat;
	private String color;
	private double clarity;
	private double pricePerCarat;
	private static PreciousStone instance;
	public static PreciousStone getInstance() {
		if (instance == null) {
			instance = new PreciousStone();
		}
		return instance;
	}
	public double getTotalPrice() {
		return(pricePerCarat * carat);
	}
	public double increaseClarity() {
		return (clarity = clarity + 1);
	}
	public double increasePrice(double percentage) {
		double value = ((getTotalPrice() * percentage)/100)+getTotalPrice();
		return (value);
	}
	@Override
		public String toString() {
		return ("\nStone name = " + name + "\nNumber of Carat = "
			+ carat + "\nStone color = " + color
			+ "\nStone clarity = " + clarity + "\nPrice per carat = " + pricePerCarat
			+ "\n");
	}

	public static void main(String[] args) {
		PreciousStone[] stones = new PreciousStone[4];
		stones[0] = new PreciousStone();
		stones[1] = new PreciousStone("Diamond", 2.356, "Blue", 0.72, 29.2);
		System.out.println(stones[1].getTotalPrice());
		System.out.println(stones[1].increaseClarity());
		System.out.println(stones[1].increasePrice(20));
		stones[2] = getInstance();
		stones[3] = getInstance();
		for(PreciousStone stone:stones) {
			System.out.println(stone);
		}
}
}
