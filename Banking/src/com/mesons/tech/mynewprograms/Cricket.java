package com.mesons.tech.mynewprograms;

public class Cricket 
{
	String name = "Anilkumar";
	String name12;
	
	int a ;
	int b=10;
	
	boolean c ;
	
	char d;
	
	short c1 ;
	
	static int j=100;
	public void surya()
	{
		int a =10;
		int b=23;
		 int c = a+b;
		 System.out.println("sum of the value are"+ c);
	}
	
	public static void main(String[] args) 
	{
		int a =10;
		int b=200;
		int e = a+b;
		System.out.println("sum of the variable are "+e);
		
		Cricket   c = new Cricket();
		
		c.surya();
		
}
}
