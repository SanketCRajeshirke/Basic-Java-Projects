package com.tka.assignments;

public class Que13 {

	public static void main(String[] args) {
		//palindrome
		
		int num =151,temp=num,palindrome=0;
		
		while (num!=0) {
			int y = num%10;
			num/=10;
			palindrome = (palindrome*10)+y;
		}
		
		if(palindrome==temp) {
			System.out.println("num is palindrome");
		}else {
			System.out.println("num is not palindrome");
		}
	}

}
