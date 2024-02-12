package com.tka.assignments;

public class Que4 {

	public static void main(String[] args) {
		
		int num = 153,temp =num, armstrong=0;

		while(num!=0) {
			int a = num%10;
			armstrong=(armstrong)+(a*a*a);
			num=num/10;
		}

		
		if(armstrong == temp) {
			System.out.println("armstrong number"+armstrong);
		}else {
			System.out.println("not an armstrong");
		}
	}

}
