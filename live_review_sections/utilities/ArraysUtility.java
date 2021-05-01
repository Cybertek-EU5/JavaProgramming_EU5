package utilities;

public class ArraysUtility {

	// returns the maximum number for int array
	public static int max(int[] array) {

		int max = array[0];

		for (int i = 1; i < array.length; i++) {

			if (array[i] > max) {
				max = array[i];
			}
		}

		return max;
	}

	// returns the maximum number for double array
	public static double max(double[] array) {

		double max = array[0];

		for (int i = 1; i < array.length; i++) {

			if (array[i] > max) {
				max = array[i];
			}
		}

		return max;
	}

	// returns the minimum number for int array
	public static int min(int[] array) {

		int min = array[0];

		for (int i = 1; i < array.length; i++) {

			if (array[i] < min) {
				min = array[i];
			}
		}

		return min;
	}
	

	// returns the minimum number for double array
	public static double min(double[] array) {

		double min = array[0];

		for (int i = 1; i < array.length; i++) {

			if (array[i] < min) {
				min = array[i];
			}
		}

		return min;
	}
	
	
	

}
