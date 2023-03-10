package ua.lviv.iot.algo.part1.lab1;

import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.ToString;
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
			instance = new PreciousStone("Gold", 5.378, "Yellow", 0.05, 107.4);
		}
		return instance;
	}
	public double getTotalPrice() {
		return(pricePerCarat * carat);
	}
	public void increaseClarity() {
		System.out.println(clarity + 1);
	}
	public void increasePrice(double percentage) {
		System.out.println(((getTotalPrice() * percentage)/100)+getTotalPrice());
	}
	@Override
		public String toString() {
		return ("\nStone name = " + name + "\nNumber of Carat = "
			+ carat + "\nStone color = " + color
			+ "\nStone clarity = " + clarity + "\nPrice per carat = " + pricePerCarat
			+ "\n");
	}

	public static void main(String[] args) {
		PreciousStone[] stone = new PreciousStone[4];
		stone[0] = new PreciousStone();
		stone[1] = new PreciousStone("Diamond", 2.356, "Blue", 0.72, 29.2);
		System.out.println(stone[1].getTotalPrice());
		stone[1].increaseClarity();
		stone[1].increasePrice(20);
		stone[2] = getInstance();
		stone[3] = getInstance();
		for (int i = 0; i < stone.length; i++) {
			System.out.println(stone[i].toString());
		}
	}
}
