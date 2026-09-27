package com.ArrayPrograms;

public class multiDymantionArray {
	
	    public static void main(String[] args) {
	    	
	    	        // First matrix
	    	        int[][] a = {
	    	            {1, 2, 3},
	    	            {4, 5, 6}
	    	        };

	    	        // Second matrix
	    	        int[][] b = {
	    	            {7, 8, 9},
	    	            {10, 11, 12},
	    	            {13,14,15}
	    	        };

	    	        // Result matrix
	    	        int[][] sum = new int[2][3];

	    	        // Adding matrices
	    	        for (int i = 0; i < a.length; i++) {            // Rows
	    	            for (int j = 0; j < a[i].length; j++) {     // Columns
	    	                sum[i][j] = a[i][j] + b[i][j];
	    	            }
	    	        }

	    	        // Printing result
	    	        System.out.println("Matrix Addition Result:");
	    	        for (int i = 0; i < sum.length; i++) {
	    	            for (int j = 0; j < sum[i].length; j++) {
	    	                System.out.print(sum[i][j] + " ");
	    	            }
	    	            System.out.println();
	    	        }
	    	    }
	    }
	  
