package com.soumyadeep.parallelArraySorting;

import java.util.Arrays;

public class ParallelArraySortingWithoutIndex {

	public static void main(String[] args) {

		// Creating an integer array
		int[] arr = { 6, 5, 8, 7, 2, 4, 1, 3, 10, 9, 6, 5, 8, 7, 2, 4, 1, 3, 10, 9 };

		// Iterating array elements
		for (int i : arr) {
			System.out.print(i + " ");
		}

		// Sorting array elements parallel
		Arrays.parallelSort(arr);
		System.out.println("\nArray elements after sorting");
		// Iterating array elements
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
