package LoopsAndIterationExercises;

import java.util.Scanner;

public class PowerOfNum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter base -");
		int base = s.nextInt();
		System.out.println("Enter Exponent - ");
		int exp = s.nextInt();
		int val = 1;
		for(int i=1;i<=exp;i++) {
			val = val*base;
		}
		System.out.println("The pow val - "+val);
	}

}
