package LoopsAndIterationExercises;

import java.util.Scanner;

public class NumberOfDigitsInANumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter N value -");
		int n = s.nextInt();
		
		int count=0;
		while(n>0) {
			count++;
			n=n/10;
			//System.out.println("n value -"+n);
		}
		System.out.println(count);
		
	}

}
