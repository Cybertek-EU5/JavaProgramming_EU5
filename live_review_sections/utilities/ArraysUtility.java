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

	// reverse any given integer array
	public static int[] reverse(int[] array) {
		int[] result = new int[array.length];
		for (int i = 0, j = array.length - 1; i < result.length; i++, j--) {
			result[i] = array[j];
		}
		return result;
	}

	// reverse any given double array
	public static double[] reverse(double[] array) {
		double[] result = new double[array.length];
		for (int i = 0, j = array.length - 1; i < result.length; i++, j--) {
			result[i] = array[j];
		}
		return result;
	}

	// reverse any given char array
	public static char[] reverse(char[] array) {
		char[] result = new char[array.length];
		for (int i = 0, j = array.length - 1; i < result.length; i++, j--) {
			result[i] = array[j];
		}
		return result;
	}

	
	// reverse any given String array
	public static String[] reverse(String[] array) {
		String[] result = new String[array.length];
		for (int i = 0, j = array.length - 1; i < result.length; i++, j--) {
			result[i] = array[j];
		}
		return result;
	}
	
	

}
