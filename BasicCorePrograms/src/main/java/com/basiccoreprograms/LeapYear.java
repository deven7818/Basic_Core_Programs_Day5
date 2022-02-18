package com.basiccoreprograms;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		System.out.println("Enter the Year ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		if(((year % 4 ==0) && (year % 100 != 0)) || (year % 400 == 0))
			System.out.println("Given Year is leap Year");
		else
			System.out.println("Given Year is not Leap Year");
			

	}

}
