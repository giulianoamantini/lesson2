package lesson2;

public class app {

	/**
	 * This method is the main entry point to the application
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {		
		// initialize integer array of temperatures
		// one-dimensional arrays
		int [] temperatureJanuary = {0, 2, 5, 2, 4, 10, 15, 1, 4, 15, 21, 22, 5, 15, 14, 23, 30, 32, 16, 20, 21, 22, 23, 15, 24, 26, 27, 28, 29, 12, 12};
		int [] temperatureFebruary = {10, 22, 15, 12, 4, 10, 15, 21, 24, 15, 21, 22, 35, 15, 14, 23, 30, 32, 16, 24, 21, 22, 22, 22, 34, 21, 12, 13};
		int [] temperatureMarch = {31, 32, 35, 32, 24, 10, 25, 21, 24, 35, 21, 22, 35, 35, 14, 33, 30, 32, 36, 34, 5, 4, 3, 7, 8, 9, 12, 28, 29, 31, 31};
		String [] months = {"January", "February", "March"};
		
		// two-dimensional array
		int [][] temperatureWinter = {temperatureJanuary, temperatureFebruary, temperatureMarch};
		
		PrintResults(months, temperatureWinter);
	}
	
	/**
	 * this method returns the statistics on temperatures for every month
	 * @param months the months of the year as in January, February, ...
	 * @param temperatures the two-dimensional array of temperatures
	 * @throws Exception
	 */
	public static void PrintResults(String [] months, int [][] temperatures) throws Exception{
		String message;
		for (int i = 0; i < temperatures.length; i++) {
			message = String.format("The month of %s has %d days", months[i], conditional.getDays(months[i]));
			System.out.println(message);
			int maximum = loops.getMaximum(temperatures[i]);
			int minimum = loops.getMinimum(temperatures[i]);
			int average = loops.getAverage(temperatures[i]);
			int median = loops.getMedian(temperatures[i]);
		    message = String.format("the minimum temperature is %d, the average is %d, the median is %d, and the maximum is %d", minimum, average, median, maximum);
			System.out.println(message);
			System.out.println("");
		}
	}

}
