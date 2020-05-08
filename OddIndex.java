package org.practice2;

public class OddIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "testleaf";
		char[] inputArray = input.toCharArray();
		for(int i=0;i<inputArray.length;i++)
		{
			if(i%2==0)
			{
				continue;
			}
			else
			{
				char orgCharacter = input.charAt(i);
				char changeCharacter = Character.toUpperCase(orgCharacter);
				inputArray[i]=changeCharacter;
			}
		}
		input = String.valueOf(inputArray);
		System.out.println("Changed odd index to uppercase - " + input);
	}

}
