package com.fju.mid;

import java.util.Random;

public class DiceRoller {

	public static void main(String[] args) {
		for(int i = 0;i<i+1;i++) {
		Random r = new Random();
		int n1 = r.nextInt(6)+1;
		int n2 = r.nextInt(6)+1;
		int n3 = r.nextInt(6)+1;
		System.out.println(n1+" "+n2+" "+n3);
		if(n1 == n2||n2 == n3||n3 == n1) {
			break;
		}
		}
	}

}
