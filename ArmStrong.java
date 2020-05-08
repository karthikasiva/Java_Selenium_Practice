package org.practice2;

public class ArmStrong {

	int input = 370;

	public static void main(String[] args) {

		//Variables
		ArmStrong obj = new ArmStrong();
		int input = obj.input;
		int rem = 0;
		int remFinal = 0;
		
		while((input)!=0)
		{
			rem = (input%10);
			remFinal = remFinal + (rem*rem*rem);
			input = input/10;			
		}
		
		System.out.println("Armstrong number of " + obj.input + " is " + remFinal);
	}
}
