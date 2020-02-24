package LoopsAndIterationExercises;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number for which you want the table");
		int n = s.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.println(n+"*"+i+" = " +n*i);
		}
	}

}
