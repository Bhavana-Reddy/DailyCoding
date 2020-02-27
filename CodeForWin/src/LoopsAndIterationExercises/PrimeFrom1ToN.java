package LoopsAndIterationExercises;

import java.util.Scanner;

public class PrimeFrom1ToN {
 public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter n :");
	int n = s.nextInt();
	boolean primeOrNot = true;
	
	// for each element from 1 - N
	for(int i=2;i<n;i++) {
		 primeOrNot = true;
		// now cheeck whether i is prime or not 
		
		for(int j=2;j<i;j++) {
			if(i%j==0) {
				primeOrNot = false;
				break;
			}
		}
		
		if(primeOrNot == true) {
			System.out.print(i+" ");
		}
		
	}
}
}
