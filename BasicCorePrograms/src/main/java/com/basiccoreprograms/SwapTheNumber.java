package com.basiccoreprograms;

import java.util.Scanner;

public class SwapTheNumber {

	public static void main(String[] args) {

		System.out.println("Enter the numbers");
		Scanner sc = new Scanner(System.in);
		
		//Getting number input from user
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int temp;

		System.out.println(" Before swaping Numbers are " + n1 + " , " + n2);
		//swapping the numbers using 3 variables
		temp = n1;
		n1 = n2;
		n2 = temp;
		System.out.println(" After swapping Numbers are " + n1 + " , " + n2);

	}

}
