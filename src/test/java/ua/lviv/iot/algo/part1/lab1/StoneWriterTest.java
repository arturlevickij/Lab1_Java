package ua.lviv.iot.algo.part1.lab1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.algo.part1.lab1.StoneWriter;

public class StoneWriterTest {
	private static final String RESULT_FILE = "src\\test\\resources\\result.csv";
    private static final String EXPECTED_FILE = "src\\test\\resources\\expected.csv";
    StoneWriter writer;
    StoneManager stones;
    @BeforeEach
    void setUp() {
        writer = new StoneWriter();
        stones = new StoneManager();
        for (int i = 0; i < 2; i++) {
        	stones.addStone(
        			new ArtificialPreciousStone( "Diamond", "Blue",  "Lab1", 29.2, 36));
        	stones.addStone(
        			new DecorationStone("Amber", "Yellow", "Bead", 1.5, 10));
        	stones.addStone(
        			new PreciousStone("Diamond", "Colorless", 1.5, 7.5, 10000, 3.0));
        	stones.addStone(
        			new SemiPreciousStone("Amber", "Yellow", false, 1.2, 100, 2.4));
        }
    }
        @Test
        public void testWriteNull() throws IOException {
            writer.writeToFile(null);
            File result = new File("src\\main\\resources\\result.csv");
            assertFalse(result.exists());
        }
        @Test
        public void testWriteToFile() throws IOException {
            writer.writeToFile(stones.getStones());

            Path expected = new File(EXPECTED_FILE).toPath();
            Path actual = new File(RESULT_FILE).toPath();

            assertEquals(-1L, Files.mismatch(expected, actual));
        }
        @AfterEach
        void tearDown() throws IOException {
            Files.deleteIfExists(Path.of("src\\main\\resources\\result.csv"));
            Files.deleteIfExists(Path.of("src\\main\\resources\\expected.csv"));
        }

}
