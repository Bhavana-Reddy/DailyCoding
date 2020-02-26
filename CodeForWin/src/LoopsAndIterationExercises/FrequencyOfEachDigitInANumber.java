package LoopsAndIterationExercises;

import java.util.Scanner;

public class FrequencyOfEachDigitInANumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n -");
		int n = s.nextInt();
		
		//Using an array to provide 0-9 digits frequency 
		int [] freq = new int[10];
		
		int mydigit;
		
		while(n>0) {
			mydigit = n%10;
			freq[mydigit]++;
			n=n/10;
		}
		
		for(int i=0;i<freq.length;i++) {
			System.out.println("The freq of"+i+" is  "+freq[i]+" ");
		}
	}

}
