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

public class DecorationStone extends Stone {
	private String type; 
	private double priceForGramm;
	private double weightInGramm;
	
	double getFullPrice() {
		return priceForGramm * weightInGramm;
	}
	public DecorationStone(final String name,final  String color, final String type,
			final double priceForGramm, final double weightInGramm) { super(name, color); 
			  this.type = type;
			  this.priceForGramm = priceForGramm; 
			  this.weightInGramm = weightInGramm; 
			  }
	
	@Override
	public String getHeaders() {
		return super.getHeaders() + "type , priceForGramm , weightInGramm";
	}

	@Override
	public String toCSV() {
		return super.toCSV() + "," + type + "," + priceForGramm + "," + weightInGramm;
	}
}
