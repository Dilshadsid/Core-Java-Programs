//int [] a={2,3,1,6}; short array without using predifined java method

import java.util.Iterator;

public class Test_simple {
	public static void main(String[] args) {

		int[] intArray = { 2, 3, 1, 6 };
		short[] shortArray = new short[intArray.length];

		for (int i = 0; i < intArray.length; i++) {

			if (intArray[i] >= Short.MIN_VALUE && intArray[i] <= Short.MAX_VALUE) {
				shortArray[i] = (short) intArray[i];
			} else {
				System.err.println("Integer value " + intArray[i] + " is out of range for a short.");
			}
		}

		for (short value : shortArray) {
			System.out.print(value + " ");
		}
	}

}
