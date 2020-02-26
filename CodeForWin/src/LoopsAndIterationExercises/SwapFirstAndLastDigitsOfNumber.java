package LoopsAndIterationExercises;

import java.util.Scanner;

public class SwapFirstAndLastDigitsOfNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = s.nextInt();
		int last = n%10;
		int first=n;
		while(first>10) {
			first=first/10;
		}
//		System.out.println("Before swapping first - "+first +" last - " +last);
//		int temp =first;
//		first = last;
//		last=temp;
//		System.out.println("After swapping first - "+first +" last - " +last);
		
		System.out.println("The Actual number before swapping-"+n);
		n = n/10;
		n = n*10+first;
		System.out.println("the n value - "+n);
		
		int count =0;
		int t = n;
		while(t>0) {
			count++;
			t=t/10;
		}
		int k=1;
		for(int i=1;i<count;i++) {
			k=k*10;
		}
		System.out.println("K value -"+k);
		int f =(k*last)+(n%k);
		System.out.println("THE FINAL N - "+f);
	}
}
