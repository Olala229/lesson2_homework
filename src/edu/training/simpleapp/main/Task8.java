package edu.training.simpleapp.main;

public class Task8 {

	public static void main(String[] args) {
		
		double a = 1;
		double b = 2;
		double c = 3;
		
		double znach;
		
		znach = ((b + Math.sqrt(b * b + 4 * a * c)) / (2 * a)) - (a * a * a * c) + (1 / (b * b));
		
		System.out.println(znach);

	}

}
