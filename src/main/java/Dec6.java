package main.java;

public class Dec6 {

	public static void main(String[] args) {

		int num1 = 5;
		int num2 = 10;
		System.out.println(num1+", "+ num2);	
		num1 = num1 + num2;  // num1 = 15
		num2 = num1 - num2;  // num2 = 5
		num1 = num1 - num2;  // num1 = 10
		System.out.println(num1+", "+ num2);	
		
	}
}
