package org.practice2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "madam";
		char[] inputArray = input.toCharArray();
		char[] outputArray = new char[inputArray.length];
		int j=0;
		for(int i=inputArray.length-1;i>=0;i--)
		{
			outputArray[j]=inputArray[i];
			j++;
		}
		String output = String.valueOf(outputArray);
		if(input.equals(output))
		{
			System.out.println("String " + input + " is a Palindrome");
		}
		else
		{
			System.out.println("String " + input + " is not a Palindrome");
		}
	}

}
