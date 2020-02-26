package LoopsAndIterationExercises;

import java.util.Scanner;

public class LCM {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int n2 = s.nextInt();
				
		int max = (n1>n2)?n1:n2;
		int lcm;
		while(true) {
			if(max%n1==0&&max%n2==0) {
				lcm =max;
				break;
			}
			max = max+max;
		}
		System.out.println(lcm);
	}

}
