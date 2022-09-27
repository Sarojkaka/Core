package com.daysupto16.assi;

public class reverseString {

	public static void main(String[] args) {
		String reverse = "hello";
		// hello > reverse > olleh

		// using array and converting string to character Array
		char[] rev = reverse.toCharArray();

		// using for loop
		// counting char and subtract length until 0
		for (int i = rev.length - 1; i >= 0; i--)
			System.out.print(rev[i]);

	}
}