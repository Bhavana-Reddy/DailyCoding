package LoopsAndIterationExercises;

import java.util.Scanner;

public class HCF {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER N1 - ");
		int n1 = s.nextInt();
		System.out.println("Enter N2 - ");
		int n2 = s.nextInt();
		
		int min = (n1>n2)?n2:n1;
		//System.out.println(min);
		int hcf =1;
		
		for(int i=1;i<=min;i++) {
			if(n1%i==0&&n2%i==0) {
				hcf = i;
			}
		}
		System.out.println(hcf);
	}

}
