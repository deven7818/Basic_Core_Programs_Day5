package com.basiccoreprograms;

import java.util.Scanner;

public class QuotientAndReminder {

	public static void main(String args[]) {
		System.out.println(" Enter the value of num1 and num2 ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int quotient = 0, reminder = 0;

		quotient = num1 / num2;

		reminder = num1 % num2;

		System.out.println(" Quotient " + num1 + " / " + num2 + " is " + quotient);
		System.out.println(" Reminder " + num1 + " divided by " + num2 + " is " + reminder);
	}
}
