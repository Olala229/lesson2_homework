package edu.training.simpleapp.main;

public class Task16 {

	public static void main(String[] args) {
		
		double x = 1234;
		int x1;
		int x2;
		int x3;
		int x4;
		int proizv;
		
		x4 = (int)((x / 10 - (int)(x / 10)) * 10);
		x3 = (int)((x / 100 - (int)(x / 100)) * 10);
		x2 = (int)((x / 1000 - (int)(x / 1000)) * 10);
		x1 = (int)((x / 10000 - (int)(x / 10000)) * 10);
		proizv = x1 * x2 * x3 * x4;
		
		System.out.println(proizv);

	}

}
