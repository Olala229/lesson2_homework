package edu.training.simpleapp.main;

public class Task15 {

	public static void main(String[] args) {
		
		double pi = 3.1415;
		
		int x1;
		int x2;
		int x3;
		int x4;
		
		x1 = (int)((pi - (int)pi) * 10);
		x2 = (int)(((pi * 10) - (int)(pi * 10)) * 10);
		x3 = (int)(((pi * 100) - (int)(pi * 100)) * 10);
		x4 = (int)(((pi * 1000) - (int)(pi * 1000)) * 10);
		
		System.out.println(x1 + ", " + x2 + ", " + x3 + ", " + x4);
		
	}

}
