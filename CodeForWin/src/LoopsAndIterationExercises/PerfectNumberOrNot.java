package LoopsAndIterationExercises;

import java.util.Scanner;

public class PerfectNumberOrNot {
//	Perfect number is a positive integer which is equal to the sum of its proper positive divisors.
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number - ");
		int n = s.nextInt();
		int sum=0;
		
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum = sum+i;
			}
		}
		
		if(sum == n) {
			System.out.println("Its a perfect square");
		}else {
			System.out.println("It is not a perfect square number");
		}
	}

}
