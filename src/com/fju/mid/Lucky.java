package com.fju.mid;

import java.util.Random;

public class Lucky {

	public static void main(String[] args) {
		Random r = new Random();
		int n1 = r.nextInt(10)+1;
		int n2 = r.nextInt(10)+1;
		int n3 = r.nextInt(10)+1;
		int n4 = r.nextInt(10)+1;
		int n5 = r.nextInt(10)+1;
		int n6 = r.nextInt(10)+1;
		System.out.println(n1+" "+n2+" "+n3+" "+n4+" "+n5+" "+n6);
	}

}
