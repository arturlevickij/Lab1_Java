package ua.lviv.iot.algo.part1.lab1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import lombok.var;

public class StoneWriter {
	public void writeToFile(List<Stone> stones) {
		if (stones == null || stones.isEmpty()) {
			return;
		}
		try (FileWriter writer 
				= new FileWriter("src//main//resources//result.csv")){
			for (var stone : stones) {
			writer.write(stone.getHeaders());
			writer.write("\n");
			writer.write(stone.toCSV());
			writer.write("\n");
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
