package com.ArrayPrograms;

public class arrayfirstIndexINLastPosition {
	
	    public static void main(String[] args) {
	        int[] arr = {10, 20, 30, 40, 50};

	        // Pehle element ko save karo
	        int first = arr[0];

	        // Left shift
	        for (int i = 0; i < arr.length - 1; i++) {
	            arr[i] = arr[i + 1];
	        }

	        // Last position me pehle element daal do
	        arr[arr.length - 1] = first;

	        // Output print karo
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }
	}


