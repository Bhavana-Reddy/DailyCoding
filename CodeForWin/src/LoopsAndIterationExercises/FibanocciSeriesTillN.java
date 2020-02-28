package LoopsAndIterationExercises;

import java.util.Scanner;

public class FibanocciSeriesTillN {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of terms to print -");
		int n = s.nextInt();
		
		//initalizing 
		int n1 =0;
		int n2=1;
		int sum = n1+n2;
		
		
		for(int i=1;i<=n;i++) {
			System.out.print(n1+" ");
			n1=n2;
			n2=sum;
			sum = n1+n2;
			
		}
		
		
	}

}
