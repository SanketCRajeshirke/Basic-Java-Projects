package com.tka.assignments;

public class Que15 {

	public static void main(String[] args) {

		int [] n = {2,9,41,10,1};
		int temp;
		
		for (int i = 0; i < n.length; i++) {
			for (int j = i+1; j < n.length; j++) {
				temp = n[i];
				if(n[i]>n[j]) {
					n[i]=n[j];
					n[j]=temp;
				}
			}
			System.out.println(n[i]);
		}
	}

}
