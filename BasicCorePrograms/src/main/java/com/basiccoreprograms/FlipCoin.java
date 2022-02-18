package com.basiccoreprograms;

import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		System.out.println("Enter the Number of times to flip the coin");
		Scanner sc = new Scanner(System.in);
		int numberOfFlip = sc.nextInt();
		System.out.println(numberOfFlip);
		int heads = 0, tails = 0;

		for (int i = 0; i < numberOfFlip; i++) {
			double side = Math.random();
			if (side > 0.5) {
				heads++;
			} else {
				tails++;
			}
		}
		System.out.println("HeadsCount " + heads);
		System.out.println("TailsCount " + (numberOfFlip - heads));
		double headPercent = ((heads * 100 / numberOfFlip));
		System.out.println("Head Percentage = " + headPercent);
		double tailPercent = ((tails * 100 / numberOfFlip));
		System.out.println("Tail Percentage = " + tailPercent);

	}

}
