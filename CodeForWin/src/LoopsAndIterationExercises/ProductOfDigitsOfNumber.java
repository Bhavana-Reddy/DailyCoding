package LoopsAndIterationExercises;

import java.util.Scanner;

public class ProductOfDigitsOfNumber {
	public static void main(String[] args) {
		Scanner  s = new Scanner(System.in);
		System.out.println("Enter n -");
		int n = s.nextInt();
		
		int prod =1;
		while(n>0) {
			prod = prod*(n%10);
			n=n/10;
		}
		System.out.println(prod);
	}

}
