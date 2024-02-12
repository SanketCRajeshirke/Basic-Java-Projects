package com.tka.assignments;

public class Que5 {

	public static void main(String[] args) {
		// 123 to 6
		int num = 1234;
		int sum = 0;

		while (num != 0) {
			int a = num % 10;
			sum = sum + a;
			num /= 10;
		}

		System.out.println(sum);
	}

}
