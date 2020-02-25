package LoopsAndIterationExercises;

import java.util.Scanner;

public class SumOfFirstAndLastDigitsOfNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = s.nextInt();
		
		int last = n%10;
		System.out.println("The last digit is - "+last);
		
		while(n>=10) {
			n=n/10;
		}
		System.out.println("The first digit is - "+n);
		
		System.out.println("Sum of First and Last digits -"+(n+last));
	}

}
