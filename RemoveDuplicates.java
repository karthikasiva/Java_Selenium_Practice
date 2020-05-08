package org.practice2;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";		
		String[] textArray = text.split(" ");
		for(int i=0;i<textArray.length;i++)
		{
			for(int j=i+1;j<textArray.length;j++)
			{
				if(textArray[i].equals(textArray[j]))
				{
					textArray[j] = "";
				}
			}
		}
		text = Arrays.toString(textArray);
		text = text.replace("[", "");
		text = text.replace("]", "");
		text = text.replace(",", "");
		text = text.replace("  ", " ");
		System.out.println("Duplicates removed - " + text);
	}

}
