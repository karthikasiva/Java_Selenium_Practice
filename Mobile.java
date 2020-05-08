package org.practice2;

public class Mobile {
	
	//Global Variables
	
	String mobileBrand = "OnePlus";
	long mobileNumber = 123456789999L;
	float mobilePrice = 35000.55f;

	//Methods - Functions of a mobile
	public void makeCall()
	{
		System.out.println("Make a Call");
	}
	
	public void sendMessage() {

		System.out.println("Send a Message");
	}
	 
	public void openApp() {
		System.out.println("Open an Application");

	}
	
	//Main Method
	public static void main(String[] args) {
		
		Mobile mob = new Mobile();
		//Call Functions of a Mobile
		System.out.println("Perform Functions of a Mobile");
		mob.makeCall();
		mob.sendMessage();
		mob.openApp();
		
		//Call and Print Global variables
		String mobileBrand = mob.mobileBrand;
		float mobilePrice = mob.mobilePrice;
		long mobileNumber = mob.mobileNumber;
		System.out.println(mobileBrand + " costs Rs." + mobilePrice + " with number of " + mobileNumber );
	}

}

