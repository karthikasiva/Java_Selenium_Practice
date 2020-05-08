package org.practice2;

public class ReverseEven {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      String test="I am a software tester"; 
	      String[] testArray = test.split(" ");
	      ReverseString obj = new ReverseString();
	      for(int i=0;i<testArray.length;i++)
	      {
	    	  if(i%2!=0)
	    	  {
	    		  	testArray[i]= obj.reverseString(testArray[i]);    
	    	  }
	    	  System.out.print(" " + testArray[i]);
	      } 

	}

}
