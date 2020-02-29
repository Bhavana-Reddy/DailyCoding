package StarPatterns;

import java.util.Scanner;

public class HallowSquareStarPatternsWithDiagonals {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n - ");
		int n = s.nextInt();
		
//		//first row
//		for(int row =0;row <n;row++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		for(int row=1;row<n-1;row++) {
//			
//			for(int col=0;col<n;col++) {
//				if(col==row||col==0||col==n-1||col==n-row-1) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
//		for(int row =0;row <n;row++) {
//			System.out.print("*");
//		}
		
		for(int row =1;row<=n;row++) {
			for(int col=1;col<=n;col++) {
				if(row==1||row==n||col==row||col==n-row+1||col==1||col==n) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}
