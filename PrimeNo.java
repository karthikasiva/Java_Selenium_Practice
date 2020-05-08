package org.practice2;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 17;
		boolean remPresent = false;
		
		for(int i=2;i<(input/2);i++)
		{
			if(input%i==0)
			{
				remPresent = true;
				break;
			}
		}	
			
			if(remPresent)
			{
				System.out.println("Provide " + input + " is not a prime number");
			}
			else
			{
				System.out.println("Provide " + input + " is a prime number");
			}
	}

}
