package org.practice2;

public class MissingElement {

	public static void main(String[] args) {

		int[] studentId = {1,2,3,4,6,7,8};
		
		for (int i=0; i< studentId.length ; i++) {	
		
			if((i+1) != (studentId[i]))
			{
				System.out.println("Missing element in array is " + (i+1));
				break;
			}
		}
	}

}
