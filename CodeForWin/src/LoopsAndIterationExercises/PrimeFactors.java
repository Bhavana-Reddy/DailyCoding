package LoopsAndIterationExercises;

import java.util.Scanner;

public class PrimeFactors {
	public static void main(String[] args) {
		Scanner  s = new Scanner(System.in);
		System.out.println("Enter n - ");
		int n = s.nextInt();
	    boolean isPrime = true;
		
		for(int i =2;i<n;i++) {
			if(n%i==0) {
				isPrime = true;
				// now check whether it is prime or not 
				for(int j=2;j<i;j++) {
					
					if(i%j==0) {
						isPrime = false;
						break;
					}
				}
				
				if(isPrime) {
					System.out.println(i);
				}
			}
		}
	}

}
