package org.practice2;

public class OddNumber {
	
	int rangeStart = 15;
	int rangeEnd = 60;

	public static void main(String[] args) {

		//Variables
		OddNumber obj = new OddNumber();
		int rangeStart = obj.rangeStart;
		int rangeEnd = obj.rangeEnd;
		
		System.out.println("Odd Numbers from " + rangeStart + " to " + rangeEnd + ":");
		
		//Iteration
		for(int i=rangeStart; i<=rangeEnd; i++)
		{
			if((i%2)!=0)
			{
				System.out.println(i);
			}
		}
	}

}
