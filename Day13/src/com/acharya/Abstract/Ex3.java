package com.acharya.Abstract;

abstract class Bank
{
	abstract int getrateOfInterest();
}
class SBI extends Bank
{
	int getrateOfInterest()
	{
		return 1;
	}
}
class ICIC extends Bank
{
	int getrateOfInterest()
	{
		return 3;
	}
}
public class Ex3 {

	public static void main(String[] args) {
		Bank b1=new SBI();
		ICIC b2=new ICIC();
		System.out.println("SBI rate of interest:"+b1.getrateOfInterest());
        System.out.println("ICIC rate of interest:"+b2.getrateOfInterest());
        
	}

}
