package LoopsAndIterationExercises;

import java.util.Scanner;

public class StrongNumberOrNot {
	//Strong number is a special number whose sum of factorial of digits is equal to the original number.
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER NUMBER - ");
		int n = s.nextInt();
		
		int digit =1;
		int sum = 0;
		int n1=n;
		while(n1>0) {
			digit = n1%10;
			//System.out.println(digit+"! is - "+fact(digit));
			sum = sum+fact(digit);
			n1=n1/10;
		}
		System.out.println("sum  - "+sum);
		System.out.println("n - "+n);
		if(sum==n) {
			System.out.println("Its a strong number");
		}else {
			System.out.println("It is not a strong number");
		}
		
	}

	private static int fact(int digit) {
		int fact =1;
		
		for(int i=1;i<=digit;i++) {
			
			fact = fact*i;
		}
		return fact;
	}

}
