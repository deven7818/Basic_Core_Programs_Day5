package com.basiccoreprograms;

import java.util.Scanner;

//Program for Harmonic Number
public class HarmonicNumber {

	public static void main(String[] args) {
		int n;
		float sum=0;
		
		System.out.println("Enter a number ");
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			sum = sum+(float)1/i;
		}
		System.out.println("Harmonic Value is " + sum);

	}

}
