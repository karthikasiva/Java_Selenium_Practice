package org.practice2;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
	
		int[] studentId = {14,56,78,12,23,67};
		Arrays.sort(studentId);
		
		//Second Largest number
		System.out.println("Second Largest No is " + studentId[studentId.length-2]);

	}

}
