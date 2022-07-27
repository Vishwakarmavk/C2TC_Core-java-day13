package com.acharya.Abstract;

abstract class Shape
{
	abstract void draw();
}
class Triangle extends Shape
{
	void draw()
	{
		System.out.println("drawing Triangle");
	}
}
class Circle extends Shape
{
	void draw()
	{
		System.out.println("drawing circle");
	}
}
public class Ex2 {

	public static void main(String[] args) {
		Shape s=new Triangle();
		Circle s1=new Circle ();
		s.draw();
		s1.draw();

	}

}
