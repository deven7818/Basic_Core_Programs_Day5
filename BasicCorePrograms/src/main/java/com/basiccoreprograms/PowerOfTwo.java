package com.basiccoreprograms;

import java.util.Scanner;

public class PowerOfTwo {

    //To Check Power Of Two
    public static void getPoweroftwo(int n) {
        if (n>=0 && n<=31)
        {
            int power = 1;
            for (int i=0; i<=n; i++) {
                power = (1<<i);
                System.out.println("2^"+i+ " = " +power);
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the value of power");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        getPoweroftwo(n);

    }
}
