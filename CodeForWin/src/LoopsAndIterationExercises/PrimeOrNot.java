package LoopsAndIterationExercises;

import java.util.Scanner;

public class PrimeOrNot {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n -");
		int n = s.nextInt();
		
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				System.out.println("Number is not prime");
				break;
			}else {
				System.out.println("Number is a prime");
				break;
			}
		}
	}

}
