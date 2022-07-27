package com.acharya.Abstract;

abstract class Bike1
{
	Bike1()
	{
		System.out.println("Bike1 is Created");
	}
	abstract void run();
	void changegear()
	{
		System.out.println("Changed gear");
	}
class Honda extends Bike1
{
	void run()
	{
		System.out.println("Running safely");
	}
}
}
public class Ex4 {

	public static void main(String[] args) {
		Honda b1=new Honda();
		b1.run();
		

	}

}
