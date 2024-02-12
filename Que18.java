package com.tka.assignments;

public class Que18 {

	public static void main(String[] args) {
	
		int [] n = {1,9,10,120,200};
		int temp;
		
		for (int i = 0; i < n.length; i++) {
			for (int j = i+1; j < n.length; j++) {
				if(n[i]>n[j]) {
					temp = n[i];
					n[i] = n[j];
					n[j] =temp;
				}
			}
		}
		
		System.out.println(n[n.length-2]);
	}
	
}
