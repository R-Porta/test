package main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dec3 {
	public static void main(String[] args) throws IOException {
		
		int num1 = 0;
		int num2 = 0;
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce la altura: "+leer.readLine());
		num1 = Integer.parseInt(leer.readLine());
		System.out.println("Introduce la anchura: "+leer.readLine());
		num2 = Integer.parseInt(leer.readLine());
		System.out.println("El resultado es: " + Integer.toString(num1 * num2));
	}
}
