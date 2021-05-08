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
	
	// merges two arrays of int
	public static int[] merge(int[] arr1, int[] arr2) {
		int[] arr3 = new int[arr1.length + arr2.length];  //Make sure that this array can contain all the elements of arr1 & arr2
		int i = 0; // will represents the index numbers of third array
		
		for (int each : arr1) {
			  arr3[i++]=each;
		}
		
		for (int each : arr2) {
			arr3[i++] = each;
		}
		return arr3;
	}
	
	
	// merges two arrays of double
	public static double[] merge(double[] arr1, double[] arr2) {
		double[] arr3 = new double[arr1.length + arr2.length];  //Make sure that this array can contain all the elements of arr1 & arr2
		int i = 0; // will represents the index numbers of third array
		
		for (double each : arr1) {
			  arr3[i++]=each;
		}
		
		for (double each : arr2) {
			arr3[i++] = each;
		}
		return arr3;
	}
	
	
	// merges two arrays of char
	public static char[] merge(char[] arr1, char[] arr2) {
		char[] arr3 = new char[arr1.length + arr2.length];  //Make sure that this array can contain all the elements of arr1 & arr2
		int i = 0; // will represents the index numbers of third array
		
		for (char each : arr1) {
			  arr3[i++]=each;
		}
		
		for (char each : arr2) {
			arr3[i++] = each;
		}
		return arr3;
	}
	
// merges two arrays of String
	public static String[] merge(String[] arr1, String[] arr2) {
		String[] arr3 = new String[arr1.length + arr2.length];  //Make sure that this array can contain all the elements of arr1 & arr2
		int i = 0; // will represents the index numbers of third array
		
		for (String each : arr1) {
			  arr3[i++]=each;
		}
		
		for (String each : arr2) {
			arr3[i++] = each;
		}
		return arr3;
	}

		
	//adds the element into the array
	public static  int[] addElement(int[] arr, int element) {
		int[] newArray = new int[arr.length + 1]; // {1,2,3,4}
		 int i = 0; 
		 for (int each : arr) {
			 newArray[i++]= each;
		 }
		 
		 newArray[i] = element;
		 return newArray;
	}
	
	
	//adds the element double the array
	public static  double[] addElement(double[] arr, double element) {
		double[] newArray = new double[arr.length + 1]; // {1,2,3,4}
		 int i = 0; 
		 for (double each : arr) {
			 newArray[i++]= each;
		 }
		 
		 newArray[i] = element;
		 return newArray;
	}
	
	
	//adds the element char the array
	public static  char[] addElement(char[] arr, char element) {
		char[] newArray = new char[arr.length + 1]; // {1,2,3,4}
		 int i = 0; 
		 for (char each : arr) {
			 newArray[i++]= each;
		 }
		 
		 newArray[i] = element;
		 return newArray;
	}

	
	//adds the element String the array
	public static String[] addElement(String[] arr, String element) {
		String[] newArray = new String[arr.length + 1]; // {1,2,3,4}
		 int i = 0; 
		 for (String each : arr) {
			 newArray[i++]= each;
		 }
		 
		 newArray[i] = element;
		 return newArray;
	}
	
	
	

}
