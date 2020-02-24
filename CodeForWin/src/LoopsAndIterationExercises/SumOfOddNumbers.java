package LoopsAndIterationExercises;

import java.util.Scanner;

public class SumOfOddNumbers {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter N value -");
		int n = s.nextInt();
		
		int sum =0;
		for(int i=1;i<=n;i=i+2) {
			sum = sum+i;
		}
		System.out.println("sum -"+sum);
		
	}

}
