# Lab Assignment 2 (Bonus Assignment)

For this lab assignment, you will correct and improve your solutions to Lab Assignment 1.  All points earned from this assignment will be considered bonus points.  You will test your API and fix any bugs.  If you lost any points on the first assignment, you will be able to recouperate the lost points by fixing the erroneous methods.  Therefore, you have the opportunity to earn perfect score on Asssignment 1.  In addition to fixing any bugs, you will be to earn additional bonus points by improving the style of your code.  This involves modifying your code so that it adheres with the Google Java Style Guide. You should also change the names of your variables so that they are more descriptive.

In this Lab Assignment you will learn to:
1. Use the debugger
2. Create and run Unit tests
3. Write cleaner code

## Answers to Assignment 1

In order to check your API, here is the correct output for each ERDataAnalyzer method:

```java
// patientsPerDayOfWeek
int[] answer = {3118, 2746, 2921, 2676};

// patientsPerDayPerWeek
int[][] answer = {{476, 537, 421, 362, 461, 431, 430},
		 {371, 362, 461, 349, 395, 486, 322},
		 {431, 531, 395, 383, 313, 434, 434},
		 {476, 461, 454, 265, 272, 348, 400}};

// averagePatientsPerWeek
int[] answer = {445.42857142857, 392.2857142857, 417.2857142857, 382.2857142857};

// averagePatientsPerDayAcrossWeeks
int[] answer = {438.5, 472.75, 432.75, 339.75, 360.25, 424.75, 396.5};

// busiestDayPerWeek
int[] answer = {1, 5, 1, 0};

//leastBusyDayPerWeek
int[]answer = {3, 6, 4, 3};
```

## Unit tests

Here is an example test class which tests one method of the ERDataAnalyzer class:

```java
package er_data_tests;

import static org.junit.Assert.*;
import org.junit.Test;

import er_data.ERDataReader;
import er_data.ERDataAnalyzer;

public class ERDataAnalyzerTest {
	private static final String DATA\_FILE = "data/data1.txt";
	// We are assuming our ERDataReader works...
	private static final int[][][] TEST\_DATA = ERDataReader.readData(DATA\_FILE);
	@Test
	public void testPatientsPerWeek() {
		int[] expecteds = {3118, 2746, 2921, 2676};
		int[] actuals = ERDataAnalyzer.patientsPerWeek(TEST\_DATA);

	}
}

