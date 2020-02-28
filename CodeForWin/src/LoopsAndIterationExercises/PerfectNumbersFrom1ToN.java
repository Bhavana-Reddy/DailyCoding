package LoopsAndIterationExercises;

import java.util.Scanner;

public class PerfectNumbersFrom1ToN {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number till where you want to print perfect numbers -");
		int n = s.nextInt();
		
		//for numbers from 1-N
		for(int i=1;i<n;i++) {
			//for the number to check whether it is perfect number or not
			int sum =0;
			for(int j=1;j<i;j++) {
				if(i%j==0) {
					sum = sum+j;
				}
			}
			if(sum==i) {
				System.out.println(i);
			}
			
		}
	}

}
