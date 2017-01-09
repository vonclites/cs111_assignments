import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
import er_data.ERDataReader;
import er_data.ERDataAnalyzer;

public class Assignment1 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String dataFile = in.next();
		in.close();

		int[][][] data = new int[4][7][24];
		try {
			data = ERDataReader.readData(dataFile);
		} catch (FileNotFoundException e) {
			System.err.println("File cannot be found or accessed: " + dataFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		int[] patientsPerWeek = ERDataAnalyzer.patientsPerWeek(data);
		System.out.println("Patients per week: " + patientsPerWeek);
	}
}
