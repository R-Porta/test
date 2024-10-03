package main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dec5 {
	public static void main(String[] args) throws IOException {
		
		int num1 = 0;
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce el radio del círculo: "+leer.readLine());
		num1 = Integer.parseInt(leer.readLine());
		System.out.println("El perímetro es: " + Double.toString(2 * Math.PI * num1));
	}
}