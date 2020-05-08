package org.practice2;

public class Factorial {
	
	int factIp = 10;

	public static void main(String[] args) {
		
		// Variables
		Factorial factObj = new Factorial();
		int factIp = factObj.factIp;
		int factOp = 1;
		
		//Iteration
		for (int i=1;i<=factIp;i++)
		{
			factOp = factOp * i;
		}
		
		//Output
		System.out.println("Factirail of number " + factIp + " is " + factOp);
	}

}
