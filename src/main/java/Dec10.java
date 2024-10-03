package main.java;

public class Dec10 {

	public static void main(String[] args) {
		double precio = 10.30;
		double iva = 21;
		System.out.println(Double.toString(precio + (precio*(iva/100))));

	}

}
