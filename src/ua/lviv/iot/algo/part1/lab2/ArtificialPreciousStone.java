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

public class ArtificialPreciousStone extends Stone{
	private String labName;
	private double priceForGramm;
	private double weightInGramm;
	
	double getFullPrice() {
		return(priceForGramm*weightInGramm);
	}
	
	
	public ArtificialPreciousStone(String name, String color, String labName, double
	  priceForGramm, double weightInGramm) { super(name, color); 
	  this.labName=labName;
	  this.priceForGramm=priceForGramm; 
	  this.weightInGramm=weightInGramm; 
	  }
	 
}
