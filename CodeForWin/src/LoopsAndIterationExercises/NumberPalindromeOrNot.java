package LoopsAndIterationExercises;

import java.util.Scanner;

public class NumberPalindromeOrNot {
	public static void main(String[] args) {
		//palindrome is the number when rev = org num
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a numb to check plaindrome or not");
		int n = s.nextInt();
		
		int rev=0;
		int tem =n;
		while(tem>0) {
			rev = rev*10+tem%10;
			tem = tem/10;
		}
		if(rev == n) {
			System.out.println("Its a palindrome");
		}else {
			System.out.println("Its not a palindrome");
		}
		
	}

}
