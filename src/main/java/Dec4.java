package main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dec4 {
	public static void main(String[] args) throws IOException {
		
		int num1 = 0;
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce la temperatura en Cº: "+leer.readLine());
		num1 = Integer.parseInt(leer.readLine());
		System.out.println("El resultado es: " + Integer.toString((num1 * 9/5) + 32));
	}
}
