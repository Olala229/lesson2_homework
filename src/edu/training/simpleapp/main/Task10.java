package edu.training.simpleapp.main;

public class Task10 {

	public static void main(String[] args) {
		
		double x = 1;
		double y = 2;
		
		double znach;
		
		znach = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);
		
		System.out.println(znach);

	}

}
