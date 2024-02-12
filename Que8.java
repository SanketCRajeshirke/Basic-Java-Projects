package com.tka.assignments;

public class Que8 {

	public static void main(String[] args) {
		
		int num = 240,rev;
		String digitWord="";
		
		while(num!=0) {
			rev = num%10;
			num/=10;
			
			switch (rev) {
			case 0:
				digitWord = "zero "+digitWord;
				break;
			case 1:
				digitWord ="one " +  digitWord;
				break;
			case 2:
				digitWord = "two " +  digitWord;
				break;
			case 3:
				digitWord = "three " +  digitWord;
				break;
			case 4:
				digitWord = "four " +  digitWord;
				break;
			case 5:
				digitWord = "five " +  digitWord;
				break;
			case 6:
				digitWord = "six " +  digitWord;
				break;
			case 7:
				digitWord = "seven " +  digitWord;
				break;
			case 8:
				digitWord = "eight " +  digitWord;
				break;
			case 9:
				digitWord = "nine " +  digitWord;
				break;
			default:
				System.out.println("enter only digit");
			}
			
		}
		
		System.out.println(digitWord);

	}

}
