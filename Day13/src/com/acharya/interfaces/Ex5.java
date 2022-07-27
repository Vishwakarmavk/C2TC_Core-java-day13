package com.acharya.interfaces;

interface Bank
{
	float getrateOfInterest();
}
class SBI implements Bank
{
	public float getrateOfInterest()
	{
		return 9.1f;
	}
}
class ICIC implements Bank
{
	public float getrateOfInterest()
	{
		return 9.2f;
	}
}
public class Ex5 
{
     public static void main(String arg[])
     {
    	 Bank b=new SBI();
    	 b.getrateOfInterest();
    	 System.out.println("Interest:"+b.getrateOfInterest());
     }
}
