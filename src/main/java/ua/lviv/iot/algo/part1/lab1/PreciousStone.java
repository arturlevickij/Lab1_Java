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
@ToString(callSuper = true)

public class PreciousStone extends Stone {
	private double carat;
	private double clarity;
	private double pricePerCarat;
	private double weightInGramm;

	public double getTotalPrice() {
		return pricePerCarat * carat;
	}
	public double increaseClarity() {
		return clarity = clarity + 1;
	}
	public double increasePrice(double percentage) {
		double value = getTotalPrice() * percentage / 100 + getTotalPrice();
		return value;
	}
	double getFullPrice() {
		return getTotalPrice();
	}
	public PreciousStone(final String name,final String color,final double carat,
			final double clarity,double pricePerCarat, double weightInGramm) { 
			super(name, color); 
			  this.carat = carat;
			  this.clarity = clarity; 
			  this.pricePerCarat = pricePerCarat; 
			  this.weightInGramm = weightInGramm;
			  }
	
	@Override
	public String getHeaders() {
		return super.getHeaders() + "carat , clarity, pricePerCarat , weightInGramm";
	}
	@Override
	public String toCSV() {
		return super.toCSV() + "," + carat + "," + clarity+ "," + pricePerCarat + "," + weightInGramm;
	}

}
