package com.tka.assignments;

public class Que20 {

	public static void main(String[] args) {
	
		int [] n = {9,2,3,1,100};
		int temp = n[0];
		
		for (int i = 0; i < n.length; i++) {
			if(n[i]<temp) {
				temp = n[i];
			}
		}

		System.out.println(temp);
		
		
	}

}
