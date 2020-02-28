package LoopsAndIterationExercises;

import java.util.Scanner;

public class ArmstrongsFrom1ToN {
	public static void main(String[] args) {
	  Scanner  s = new Scanner(System.in);
	  System.out.println("enter the number till which you want to cal Armstrong - ");
	  int n = s.nextInt();
	 
	  // from 1-N numbers
	  
	  for(int i=1;i<=n;i++) {
		  int newN = i;
		  int sum =0;
		  int digit = 0;
		 // System.out.println("newN - "+newN);
		     while(newN >0) {
		    	 digit = newN%10;
		    	 sum = sum+(digit*digit*digit);
		    	 newN = newN/10;
		     }
		  //   System.out.println("newN - "+newN);
//		     System.out.println("Sum is - "+sum);
//		     System.out.println("The i (present no) - "+i);
		  if(sum==i) {
			  System.out.println(i);
		  }
		  
		  
	  }
	  
	}
}





