package LoopsAndIterationExercises;

import java.util.Scanner;

public class SumOfPrimeNumbersFrom1ToN {
 public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter n - ");
	int n = s.nextInt();
	
	int sum=0;
	
	for(int i=1;i<=n;i++) {
		if(n%i==0) {
			sum = sum+i;
		}
	}
	System.out.println(sum);
}
}
