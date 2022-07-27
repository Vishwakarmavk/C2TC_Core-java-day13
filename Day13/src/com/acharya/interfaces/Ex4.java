package com.acharya.interfaces;
interface Bike
{
	void getmileage();
}
class R15 implements Bike
{
	public void getmileage()
	{
		System.out.println("Mileage is 40KM/L");
	}
}

public class Ex4 {
	static void main (String arg[])
	
	{
		Bike b=new R15();
	     b.getmileage();
		
	}

}
