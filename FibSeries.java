package org.practice2;

public class FibSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int seriesCount = 8;
		int a=0;
		int b=1;
		int c=0;
		System.out.println(a);
		System.out.println(b);

		for(int i=0;i<seriesCount-2;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;

		}

	}

}
