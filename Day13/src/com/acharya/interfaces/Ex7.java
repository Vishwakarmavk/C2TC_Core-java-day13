package com.acharya.interfaces;

interface Writeable
{
	void write();
}
interface Readable
{
	void reads();
}

public class Ex7 implements Writeable, Readable  {
	public void reads() 
	{
		System.out.println("Student reads...");
	}
	public void write()
	{
		System.out.println("Student writes...");
	}

	public static void main(String[] args) {
		Ex7 s =new Ex7();
		Writeable s1= new Ex7();
		s1.write();
		 s.reads();
		 s.write();
		

	}

	
		
	}


