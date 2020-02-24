package LoopsAndIterationExercises;

import java.util.Scanner;

public class NaturalNumbersFrom1toN {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n value - ");
		int n = s.nextInt();
		
//		//using for loop
//		for(int i=1;i<=n;i++) {
//			System.out.print(i+" ");
//		}
		
		int i=1;
		while(i<=n) {
			System.out.print(i+" ");
			i++;
		}
		
	}

}
