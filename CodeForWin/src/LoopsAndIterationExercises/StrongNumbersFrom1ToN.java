package LoopsAndIterationExercises;

import java.util.Scanner;

public class StrongNumbersFrom1ToN {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number till where you want to print strong numbers - ");
		int n = s.nextInt();
		
		//for numbers from 1-N
		for(int i =1;i<n;i++) {
			
			//checking whether it is strong number or not
			int newi=i;
			int digit =0;
			int sum=0;
			while(newi>0) {
				digit  = newi%10;
				sum = sum+fact(digit);
				newi = newi/10;
			}
			if(sum==i) {
				System.out.println(i);
			}
		}
		
	}

	private static int fact(int digit) {
		int fact =1;
		for(int i=1;i<=digit;i++) {
			fact= fact*i;
		}
		return fact;
	}

}
