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

abstract class Stone {
	protected String name;
	protected String color;
	
	public String getHeaders() {
		return "name , color"; 
	}
	
	public String toCSV() {
		return name + ", " + color;
	}

	abstract double getFullPrice();

}
