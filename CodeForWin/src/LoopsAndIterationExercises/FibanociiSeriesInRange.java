package LoopsAndIterationExercises;

import java.util.Scanner;

public class FibanociiSeriesInRange {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Starting number -");
		int start = s.nextInt();
		System.out.println("Enter ending number -");
		int end = s.nextInt();
		
		//initalizing
		int n1 = 0;
		int n2 = 1;
		int sum =n1+n2;
		
		while(n1<end) {
			
			
				if(n1>=start) {
					System.out.println(n1);
				}
				n1=n2;
				n2= sum;
				sum=n1+n2;
		}
		
	}

}
