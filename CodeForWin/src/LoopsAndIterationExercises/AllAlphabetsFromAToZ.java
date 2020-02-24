package LoopsAndIterationExercises;

import java.util.Scanner;

public class AllAlphabetsFromAToZ {
	public static void main(String[] args) {
	   System.out.println("printing lower alphabets from a-z");
//	   for(char c='a';c<='z';c++) {
//		   System.out.print(c+" ");
//	   }
//	   
//	   System.out.println();
//	   System.out.println("Printing from A-Z");
//	   for(char c='A';c<='Z';c++) {
//		   System.out.print(c+" ");
//	   }
	   
	   //while loop
	   char c='a';
	   while(c<='z') {
		   System.out.print(c+" ");
		   c++;
	   }
	}

}
