package org.practice2;

public class SumDigits {
	
	int input = 123456789;

	public static void main(String[] args) {

		//Variables
		SumDigits obj = new SumDigits();
		int input = obj.input;
		int rem = 0;
		
		while((input)!=0)
		{
			rem = rem + (input%10);
			input = input/10;			
		}
		
		System.out.println("Sum of the digits of " + obj.input + " is " + rem);
	}

}
