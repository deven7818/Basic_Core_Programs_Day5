package com.basiccoreprograms;

import java.util.Scanner;

public class LargestOfThree {

	public static void main(String[] args) {

		// getting Numbers form user
		System.out.println("Enter three numbers ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		// comparing numbers a with b and a with c
		// if both conditions are true then print a
		if (a >= b && a >= c) {
			System.out.println("The largest of three is " + a);
		}

		// comparing numbers b with a and b with c
		// if both conditions are true then print b
		else if (b >= a && b >= c) {
			System.out.println("The largest of Three is " + b);
		}
		// if both conditions are false then print c
		else {
			System.out.println("The Largest of three is " + c);
		}

	}

}
