package com.basiccoreprograms;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		System.out.println("Enter the number ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("Factor of " + num + " is " + fact);

	}

}
