package LoopsAndIterationExercises;

import java.util.Scanner;

public class SumOfPrimeNumbersFrom1ToN {
 public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter n - ");
	int n = s.nextInt();
	boolean isPrime = true;
	int primeSum=0;
	
	for(int i=2;i<n;i++) {
		isPrime = true;
		for(int j=2;j<i;j++) {
			if(i%j==0) {
				isPrime = false;
				break;
			}
		}
		
		if(isPrime) {
			primeSum = primeSum+i;
		}
	}
	System.out.println(primeSum);
}
}
