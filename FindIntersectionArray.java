package org.practice2;

public class FindIntersectionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input1={3,2,11,4,6,7};
		int[] input2={1,2,8,4,9,7};
		int[] input3 = new int[input1.length];
		int index=0;
		
		for(int i=0;i<input1.length;i++)
		{
			for(int j=0;j<input2.length;j++)
			{
				if(input1[i]==input2[j])
				{
					input3[index]=input1[i];
					index=index + 1;
				}
			}
		}
		System.out.println("Intersection of 2 arrays");
		for(int k=0;k<index;k++)
		{
			System.out.println(input3[k]);
		}

	}

}
