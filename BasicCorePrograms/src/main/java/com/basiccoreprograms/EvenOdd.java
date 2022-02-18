package com.basiccoreprograms;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		System.out.println(" Enter the number to Check ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("The Given number is Even");
		}
		else {
			System.out.println("The Given number is Odd");
		}

	}

}
