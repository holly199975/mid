package com.fju.mid;

import java.util.Random;

public class DiceRoller {

	public static void main(String[] args) {
		int count  = 0;
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		for(int i = 0;i<i+1;i++) {
		Random r = new Random();
		int n1 = r.nextInt(6)+1;
		if(n1 == 1) {
			 count1++;//++代表計算入
		}
		if(n1 == 2) {
			 count2++;//++代表計算入
		}
		if(n1 == 3) {
			 count3++;//++代表計算入
		}
		if(n1 == 4) {
			 count4++;//++代表計算入
		}
		if(n1 == 5) {
			 count5++;//++代表計算入
		}if(n1 == 6) {
			 count++;//++代表計算入
		}
		int n2 = r.nextInt(6)+1;
		if(n2 == 1) {
			 count1++;//++代表計算入
		}
		if(n2 == 2) {
			 count2++;//++代表計算入
		}
		if(n2 == 3) {
			 count3++;//++代表計算入
		}
		if(n2 == 4) {
			 count4++;//++代表計算入
		}
		if(n2 == 5) {
			 count5++;//++代表計算入
		}if(n2 == 6) {
			 count++;//++代表計算入
		}
		int n3 = r.nextInt(6)+1;
		if(n3 == 1) {
			 count1++;//++代表計算入
		}
		if(n3 == 2) {
			 count2++;//++代表計算入
		}
		if(n3 == 3) {
			 count3++;//++代表計算入
		}
		if(n3 == 4) {
			 count4++;//++代表計算入
		}
		if(n3 == 5) {
			 count5++;//++代表計算入
		}if(n3 == 6) {
			 count++;//++代表計算入
		}
		System.out.println(n1+" "+n2+" "+n3);
		if(n1 == n2||n2 == n3||n3 == n1) {
			break;
		}
		}
		System.out.println("1點出現"+count1+"次");
		System.out.println("2點出現"+count2+"次");
		System.out.println("3點出現"+count3+"次");
		System.out.println("4點出現"+count4+"次");
		System.out.println("5點出現"+count5+"次");
		System.out.println("6點出現"+count+"次");
	}

}
