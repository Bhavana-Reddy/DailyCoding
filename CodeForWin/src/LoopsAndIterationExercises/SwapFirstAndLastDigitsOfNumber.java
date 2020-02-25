package LoopsAndIterationExercises;

import java.util.Scanner;

public class SwapFirstAndLastDigitsOfNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = s.nextInt();
		int last = n%10;
		int first=n;
		while(first>10) {
			first=first/10;
		}
		System.out.println("Before swapping first - "+first +" last - " +last);
		int temp =first;
		first = last;
		last=temp;
		System.out.println("After swapping first - "+first +" last - " +last);
		
		System.out.println("The Actual number before swapping-"+n);
		
		
	}
}
