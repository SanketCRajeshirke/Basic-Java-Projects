package com.tka.assignments;

public class Que12 {

	public static void main(String[] args) {
		//vovel is present in string
		
		String str= "jai shree ram";
		
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'  ||str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U') {
				System.out.println("vovel is:"+str.charAt(i));
			}
		}

	}

}
