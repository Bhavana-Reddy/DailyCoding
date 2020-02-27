package LoopsAndIterationExercises;

import java.util.Scanner;

public class ArmstrongOrNot {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the numb - ");
		int n = s.nextInt();
		
		int sum =0;
		int digit =0;
		int newN = n;
		while(newN>0) {
			digit = newN%10;
			sum = sum+digit*digit*digit;
			newN = newN/10;
		}
		System.out.println(sum);
		
		if(sum==n) {
			System.out.println("Its an armstrong");
		}else {
			System.out.println("Its not an armstrong");
		}
	}

}
