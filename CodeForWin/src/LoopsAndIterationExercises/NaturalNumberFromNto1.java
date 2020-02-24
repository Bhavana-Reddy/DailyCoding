package LoopsAndIterationExercises;

import java.util.Scanner;

public class NaturalNumberFromNto1 {
 public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter N value -");
	int n = s.nextInt();
//	for(int i=n;i>=1;i--) {
//		System.out.print(i+" ");
//	}

	
	int i = n;
	while(i>=1) {
		System.out.print(i+" ");
		i--;
	}
	
}
}
