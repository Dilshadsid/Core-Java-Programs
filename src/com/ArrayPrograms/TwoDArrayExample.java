package com.ArrayPrograms;

public class TwoDArrayExample {
	    public static void main(String[] args) {
	        // 2D array(3 rows, 3 columns)
	        int[][] numbers = {
	            {1, 2, 3},  // row 0
	            {4, 5, 6},  // row 1
	            {7, 8, 1}   // row 2
	        };
	  
 
	        for (int i = 0; i < numbers.length; i++) { // rows
	            for (int j = 0; j < numbers[i].length; j++) { // columns
	                System.out.print(numbers[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	}