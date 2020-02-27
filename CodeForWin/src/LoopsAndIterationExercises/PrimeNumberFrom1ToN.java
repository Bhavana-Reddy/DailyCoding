package LoopsAndIterationExercises;

import java.util.Scanner;

public class PrimeNumberFrom1ToN {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n value - ");
		int n = s.nextInt();
		boolean isPrime = true;
		
		// till that number from 1 -N
		for(int i=2;i<=n;i++) {
			//System.out.println("inside first for loop with i value - "+i);
	
			isPrime = true;// Thinking that the number is prime 
			
			//code for verifying prime
			for(int j =2;j<i;j++) {
				//System.out.println("Inside second for loop with i -"+i+" j - "+j);
				
			if(i%j==0) {
				//System.out.println("inside if");
				isPrime = false;
				break;
			}
		
			}
//			System.out.println("after break");	
			//System.out.println("The isPrime value for i"+i+" is - "+isPrime);
					if(isPrime==true) {
						System.out.println("the prime number - "+i);
						//System.out.println();
					}
			
		}
	}

}
