package org.practice2;

public class CharOccurrence {

	public static void main(String[] args) {
		String str = "welcome to chennai";
		char[] strArray = str.toCharArray();
		char charOcr = 'e';
		int OcrCount = 0;
		
		for(int i=0; i<strArray.length; i++)
		{
			if(strArray[i]==charOcr)
			{
				OcrCount = OcrCount + 1;
			}
		}
		
		System.out.println("Occurrences of character" + charOcr + " in " + str + " is " + OcrCount);
	}

}
