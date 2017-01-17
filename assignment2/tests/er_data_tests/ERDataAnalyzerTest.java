package er_data_tests;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.util.NoSuchElementException;

import org.junit.Test;

import er_data.ERDataReader;
import er_data.ERDataAnalyzer;

public class ERDataAnalyzerTest {
	private static final String DATA_FILE = "data/data1.txt";

	@Test
	public void testPatientsPerWeek()
			throws FileNotFoundException, NoSuchElementException, IllegalStateException {
	// We are assuming our ERDataReader works...
		int[][][] testData = ERDataReader.readData(DATA_FILE);
		int[] expecteds = {3118, 2746, 2921, 2676};
		int[] actuals = ERDataAnalyzer.patientsPerWeek(testData);
		assertArrayEquals(expecteds, actuals);
	}
}
