package edu.training.simpleapp.main;

public class Task13 {

	public static void main(String[] args) {
		
		double x1 = 1, y1 = 1;
		
		double x2 = 3, y2 = 3;
		
		double x3 = 5, y3 = 1;
		
		double h;
		double osn;
		double a;
		double p;
		double s;
		
		h = y2 - y1; /* y1 == y3 */
		osn = x3 - x1;
		s = 0.5 * h * osn;
		
		a = Math.sqrt((osn * osn) + (x2 - x1)*(x2 - x1));
		p = a + a + osn;
		
		System.out.println("Площадь = " + s + ", Периметр = " + p);	
		
	}

}
