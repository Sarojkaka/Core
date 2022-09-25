package com.days3.assi;

import java.util.Scanner;

public class HighestCommonFactor {
	static int a;
	static int b;
	static String again;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hcf();
	}

	private static void hcf() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		a = sc.nextInt();
		System.out.println("Enter the Second number : ");
		b = sc.nextInt();
		int hcf = 0;
		for (int i = 1; i <= a || i <= b; i++) {
			if (a % i == 0 && b % i == 0)
				hcf = i;
		}
		System.out.println("HCF of given two numbers is : " + hcf);
		//reload the program
		System.out.print("Do you wanna continue : (y/n)");
		again = sc.next();
		if (again.equalsIgnoreCase("Y")) {
			hcf();
		}
	}
}