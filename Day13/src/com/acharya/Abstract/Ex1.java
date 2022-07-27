package com.acharya.Abstract;

abstract class Bike
{
	abstract void run();
}
class Honda extends Bike
{
	void run()
	{
		System.out.println("running safely");
	}
}
public class Ex1 {

	public static void main(String[] args) {
		 Bike b=new Honda();
		 b.run();

	}

}
