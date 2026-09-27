package com.ArrayPrograms;

	import java.util.HashSet;
	import java.util.Set;

	public class Duplicate_array {


	    public static void main(String[] args) {
	        int[][] arr = {{1, 3, 2, 4, 5}, {4, 3, 6, 1, 7}};
	        Set<Integer> seen = new HashSet<>();
	        Set<Integer> duplicates = new HashSet<>();

	        for (int[] row : arr) {
	            for (int num : row) {
	                if (seen.contains(num)) {
	                    duplicates.add(num);
	                } else {
	                    seen.add(num);
	                }
	            }
	        }

	        System.out.println("Duplicates: " + duplicates);
	    }
	}


