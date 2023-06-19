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

public class ArtificialPreciousStone extends Stone {
	private String labName;
	private double priceForGramm;
	private double weightInGramm;
	
	double getFullPrice() {
		return priceForGramm * weightInGramm;
	}

public ArtificialPreciousStone(final String name, final String color, final String labName, 
		final double priceForGramm, final double weightInGramm) { super(name, color); 
	  this.labName = labName;
	  this.priceForGramm = priceForGramm; 
	  this.weightInGramm = weightInGramm; 
	  }
@Override
public String getHeaders() {
	return super.getHeaders() + "labName , priceForGramm , weightInGramm";
}

@Override
public String toCSV() {
	return super.toCSV() + "," + labName + "," + priceForGramm + "," + weightInGramm;
}

	 
}
