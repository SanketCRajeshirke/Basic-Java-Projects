package com.tka.assignments;

public class Que3 {

	public static void main(String[] args) {
		int n1=0,n2=1,n3,sum;
		int terms =8;

		System.out.print(n1+" "+n2+ " ");
		
		for (int i = 0; i <= terms; i++) {
			n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
		}
	}

}
