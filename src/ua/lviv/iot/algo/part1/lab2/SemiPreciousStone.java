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

public class SemiPreciousStone extends Stone{
	private boolean polyrized;
	private double carat;
	private double pricePerCarat;
	private double weightInGramm;
	
	public double getFullPrice() {
		return(pricePerCarat * carat);
	}
	
	public SemiPreciousStone(String name, String color, boolean polyrized, double carat,
			double pricePerCarat, double weightInGramm) { 
			super(name, color); 
			  this.polyrized=polyrized;
			  this.carat=carat; 
			  this.pricePerCarat=pricePerCarat;
			  this.weightInGramm = weightInGramm;
			  }
}
