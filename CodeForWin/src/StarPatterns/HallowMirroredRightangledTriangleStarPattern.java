package StarPatterns;

import java.util.Scanner;

public class HallowMirroredRightangledTriangleStarPattern {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n - ");
	    int n = s.nextInt();
	    
	    for(int row=1;row<=n;row++) {
	    	
	    	for(int col =1; col<=n-row;col++) {
	    		System.out.print(" ");
	    	}
	    	for(int col=1;col<=row;col++) {
	    		if(col==1||row==n||col==row)
	    		System.out.print("*");
	    		else {
	    			System.out.print(" ");
	    		}
	    	}
	    	System.out.println();
	    }
	}

}
