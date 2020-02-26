package LoopsAndIterationExercises;

import java.util.Scanner;

public class NumberInWords {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n -");
		int n = s.nextInt();
		int revNum = reverse(n);
		//System.out.println("revNum - "+revNum);
		while (revNum > 0) {
			switch (revNum % 10) {
			case 0:
				System.out.print("Zero ");
				break;
			case 1:
				System.out.print("One ");
				break;
			case 2:
				System.out.print("Two ");
				break;
			case 3:
				System.out.print("Three ");
				break;
			case 4:
				System.out.print("Four ");
				break;
			case 5:
				System.out.print("Five ");
				break;
			case 6:
				System.out.print("Six ");
				break;
			case 7:
				System.out.print("Seveen ");
				break;
			case 8:
				System.out.print("Eight ");
				break;
			case 9:
				System.out.print("Nine ");
				break;
             
			}
			revNum=revNum/10;
		}
	}

	private static int reverse(int n) {
		int rev = 0;
		while (n > 0) {
			rev = rev * 10 + (n % 10);
			n = n / 10;
			
//			if(n==0) {
//				break;
//			}
		}
		return rev;

	}

}
