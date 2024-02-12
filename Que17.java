package com.tka.assignments;

public class Que17 {

	public static void main(String[] args) {
		int [] n = {1,91,154,100,500,10,6};
		int temp = n[0];
		
		for (int i = 0; i < n.length; i++) {
			if(n[i]>temp) {
				temp = n[i];
			}
		}
		
		System.out.println(temp);
	}

}
