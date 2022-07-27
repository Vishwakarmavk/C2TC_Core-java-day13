package com.acharya.interfaces;

interface Vehicle
{
	void Engine();
}
interface Bike2 extends Vehicle
{
	void getMileage();
}
class R16 implements Bike2
{
	public void Engine()
	{
		System.out.println("Mileage is 40Km/L");
	}
	public void getMileage()
	{
		System.out.println("Mileage is 50 Km/L");
	}
}
public class Ex6 {

	public static void main(String[] args) {
		R16 b=new R16();
		b.Engine();
		b.getMileage();

	}

}
