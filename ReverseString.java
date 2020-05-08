package org.practice2;

public class ReverseString {


	public static void main(String[] args) {
	String test = "feeling good";
	System.out.println(reverseString(test));
	}


	public static String reverseString(String test)
	{
		char[] testArr = test.toCharArray();
		
//		System.out.print("Reverse of string " + test + " is ");
		char[] testArr1 = new char[testArr.length];
		int j=0;
		for(int i= testArr.length-1; i >= 0; i--)
		{
			testArr1[j]=testArr[i];
			j++;
		}

//		System.out.println();
//		System.out.println("Other way:");
//		System.out.print("Reverse of string " + test + " is ");
//
//		for(int j=test.length()-1; j>=0 ; j--)
//		{
//			System.out.print(test.charAt(j));
//
//		}
		String output = String.valueOf(testArr1);
		return output;
	}}


