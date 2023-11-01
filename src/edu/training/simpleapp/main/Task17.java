package edu.training.simpleapp.main;

public class Task17 {

	public static void main(String[] args) {
		
		double a = 2;
		double b = 3;
		
		double ariph;
		double geometr;
		
		ariph = (Math.pow(a, 3) + Math.pow(b, 3)) / 2;
		geometr = Math.sqrt(Math.abs(a) * Math.abs(b));
		
		System.out.println("Ср. арифметич. кубов = " + ariph + ", ср. геометрич. модулей = " + geometr);
		
		
	}

}
