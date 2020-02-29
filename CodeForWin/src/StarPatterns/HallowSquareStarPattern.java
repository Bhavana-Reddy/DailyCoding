package StarPatterns;

import java.util.Scanner;

public class HallowSquareStarPattern {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n -");
		int n = s.nextInt();
		
		//rows
		for(int i=0;i<n;i++) {
		  System.out.print("*");
		}
		System.out.println();
		for(int i = 1;i<n-1;i++) {
	
			for(int j=0;j<n;j++) {
				if(j==0||j==n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=0;i<n;i++) {
			  System.out.print("*");
			}
	}

}
