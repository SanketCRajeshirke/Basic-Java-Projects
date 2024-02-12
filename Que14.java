package com.tka.assignments;

public class Que14 {

	public static void main(String[] args) {
		//rem whitespaces from string
		
		String str = "jai shree ram";
		
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)==' ') {
				continue;
			}
			System.out.println(str.charAt(i));
		}
	}

}
