package com.daysupto16.assi;

import java.util.Scanner;

public class searchElementMAtrix {

	public static void main(String[] args) {
		int matrix [][] = { { 2, 0, 3 }, { 2, 3, 1 }, { 1, 1, 1 } };
		System.out.println("Enter the number to find");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (matrix [i][j] == x ) {
					System.out.println("Number in the index(" + i + ", " + j + " ).");
				}
			}
		}
		sc.close();
	}			

}
