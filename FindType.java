package org.practice2;

public class FindType {

	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		
		char[] testArr = test.toCharArray();
		for(int i=0; i<test.length(); i++)
		{
			if (Character.isDigit(testArr[i]))
			{
				num = num + 1;
			}
			else if (Character.isLetter(testArr[i]))
			{
				letter = letter + 1;
			}
			else if (Character.isSpaceChar(testArr[i]))
			{
				space = space + 1;
			}
			else
			{
				specialChar = specialChar + 1;
			}
		}
		
		// Print the count here
				System.out.println("letter: " + letter);
				System.out.println("space: " + space);
				System.out.println("number: " + num);
				System.out.println("specialCharcter: " + specialChar);

	}

}
