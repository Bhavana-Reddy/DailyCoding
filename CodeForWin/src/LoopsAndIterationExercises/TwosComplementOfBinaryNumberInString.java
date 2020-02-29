package LoopsAndIterationExercises;

import java.util.Scanner;

public class TwosComplementOfBinaryNumberInString {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the input binary string");
	    String str = s.next();
	    
	    char[] binArr = str.toCharArray();
	    char[] onesComArr = new char[binArr.length];
	    char carry ='1';
	    char[] twosComArr = new char[binArr.length];
	    
	    for(int i=0;i<binArr.length;i++) {
	    	if(binArr[i]==0) {
	    		onesComArr[i]=1;
	    	}else if(binArr[i]==1) {
	    		onesComArr[i]=0;
	    	}
	    	
	    }
//	    for(int i=0;i<onesComArr.length;i++) {
//	    	System.out.println(binArr[i]);
//	    }
	    
	    for(int i=0;i<onesComArr.length;i++) {
	    	System.out.println(onesComArr[i]);
	    }
	    
	}

}
