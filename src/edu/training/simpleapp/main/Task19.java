package edu.training.simpleapp.main;

public class Task19 {

	public static void main(String[] args) {
		
		double a = 10;
		double polOsn = a / 2;
		double h = Math.sqrt((a * a) - (polOsn * polOsn));
		double s = 0.5 * h * a;
		double r = a / (2 * Math.sqrt(3));
		double bigR = a / Math.sqrt(3);
		
		System.out.println("Высота = " + h + ", площадь = " + s + ", радиус впис. окр. = " + r + ", радиус опис. окр. = " + bigR);;
		
		

	}

}
