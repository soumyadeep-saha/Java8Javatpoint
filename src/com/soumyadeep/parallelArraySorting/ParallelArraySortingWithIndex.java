package com.soumyadeep.parallelArraySorting;

import java.util.Arrays;

public class ParallelArraySortingWithIndex {

	public static void main(String[] args) {

		// Creating an integer array
		int[] arr = { 6, 5, 8, 7, 2, 4, 1, 3, 10, 9 };

		// Iterating array elements
		for (int i : arr) {
			System.out.print(i + " ");
		}

		/*
		 * In the following example, we are passing starting and end index of the array.
		 * The first index is inclusive and end index is exclusive i.e. if we pass 0 as
		 * start index and 4 as end index, only 0 to 3 index elements will be sorted.
		 * 
		 * It throws IllegalArgumentException if start index > end index.
		 * 
		 * It throws ArrayIndexOutOfBoundsException if start index < 0 or end index >
		 * a.length.
		 */
		Arrays.parallelSort(arr, 0, 6);
		System.out.println("\nArray elements after sorting");

		// Iterating array elements
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
