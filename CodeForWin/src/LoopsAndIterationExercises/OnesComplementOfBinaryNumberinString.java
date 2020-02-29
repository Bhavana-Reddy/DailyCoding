package LoopsAndIterationExercises;

import java.util.Scanner;

public class OnesComplementOfBinaryNumberinString {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a binary number");
        String n = s.next();
        
        char [] binArr = n.toCharArray();
        
        for(int i=0;i<binArr.length;i++) {
        	if(binArr[i]=='0') {
        		//System.out.print("first ");
        		System.out.print(1);
        	}else if(binArr[i]=='1')  {
        		//System.out.print("Second ");
        		System.out.print(0);
        	}
        }
        
	}

}
