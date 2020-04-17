package com.test.application;

public class Calculator {

	CalculatorService calci;
	
	Calculator(CalculatorService obj)
	{
		calci=obj;
	}
	
	public static void main(String[] args) {
		
		
	}

	public int add(int num1, int num2)
	{
		return num1+num2;
	}
}
