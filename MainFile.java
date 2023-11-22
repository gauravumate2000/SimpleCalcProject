package com.calculator;

import java.util.Scanner;

public class MainFile {

	public static void main(String[] args) {
		Scanner scannerObject=new Scanner(System.in);
		double result;
		System.out.println("Enter 1st no:");
		double firstNo=scannerObject.nextDouble();
		
		System.out.println("Enter 2nd no:");
		double secondNo=scannerObject.nextDouble();
		
		System.out.println("Enter your choice of operation");
		System.out.println("1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3. Addition");
		System.out.println("4. Addition");
		System.out.println("5. Addition");
		
		int choiceOfOperation=scannerObject.nextInt();
		
		switch(choiceOfOperation)
		{
			case 1:
				Addition add=new Addition();
				result=add.addition(firstNo, 32);
				System.out.println("Addition:"+result);
				break;
			case 2:
				Substraction sub=new Substraction();
				result=sub.substraction(10, 32);
				System.out.println("Substraction:"+result);
				break;
			case 3:
				Multiplication mul=new Multiplication();
				result=mul.multiplication(10, 32);
				System.out.println("Multiplication:"+result);
				break;
			case 4:
				Division div=new Division();
				result=div.divison(10, 32);
				System.out.println("Division:"+result);
				break;
			case 5:
				Modulus mod=new Modulus();
				result=mod.modulus(10, 32);
				System.out.println("Modulus:"+result);
				break;
		}
		scannerObject.close();
		
	}
}
