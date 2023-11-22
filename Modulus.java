package com.calculator;

public class Modulus {

	private double result;
	
	public final double modulus(double num1, double num2)
	{
		if(num1 <=0 || num2 <=0)
			System.out.println("Invalid No");
		else
			result=num1 % num2;
	
		return result;
	}
	
}
