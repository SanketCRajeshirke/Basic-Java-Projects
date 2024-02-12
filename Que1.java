package com.tka.assignments;

import java.util.Scanner;

public class Que1 {

	public static void main(String[] args) {
		// wap to check given no is prime
		int n = 47;
		boolean isPrime = true;

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				isPrime = false;
				break;
			} else {
				isPrime = true;
			}
		}

		if (isPrime) {
			System.out.println("prime");
		} else {
			System.out.println("no prime");
		}

		// wap to print prime num
		
		int i,j,count;
		
		
		for (i = 2 ; i <= 10; i++) {
			count = 0;
			for (j = 2;  j<i; j++) {
				if(i%j==0) {
					count++;
					break;
				}
			}
			if(count==0) {
				System.out.print(i);
			}
		}

		
	}

}
