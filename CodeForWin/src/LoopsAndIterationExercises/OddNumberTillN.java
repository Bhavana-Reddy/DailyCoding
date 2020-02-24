package LoopsAndIterationExercises;

import java.util.Scanner;

public class OddNumberTillN {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter N value -");
		int n = s.nextInt();
		
//		for(int i=1;i<=n;i=i+2) {
//			System.out.print(i+" ");
//		}
		
		int i=1;
		while(i<=n) {
			System.out.print(i+" ");
			i=i+2;
		}
		
	}

}
