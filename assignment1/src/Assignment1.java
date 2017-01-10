import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
import er_data.ERDataReader;
import er_data.ERDataAnalyzer;

public class Assignment1 {
	public static void main(String[] args){
		String dataFile = "/home/dom/code/cs111_assignments/assignment1/data/data1.txt";
		
		// You can assume the data file will have data for 4 weeks / 7 days / 24 hours 
		final int NUM_WEEKS = 4;
		final int NUM_DAYS = 7;
		final int NUM_HOURS = 24;
		
		int[][][] data =  // initialize the array.
		try {
			data = ERDataReader.readData(dataFile);
		} catch (FileNotFoundException e) {
			System.err.println("File cannot be found or accessed: " + dataFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// Try printing the data variable.  What is the output you see?
		// (Check out https://www.mkyong.com/java/java-how-to-print-an-array/)
		// If you want to test the ERDataReader but have not completed the ERDataAnalyzer functions, comment out the next two lines
		int[] patientsPerWeek = ERDataAnalyzer.patientsPerWeek(data);
		System.out.println("Patients per week: " + patientsPerWeek);
	}
}
