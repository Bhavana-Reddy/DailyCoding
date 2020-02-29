package LoopsAndIterationExercises;

import java.util.Scanner;

public class NaturalNumbersFrom1toN {
	void random(){
	int p=28;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n value - ");
		int n = s.nextInt();
		
//		//using for loop
//		for(int i=1;i<=n;i++) {
//			System.out.print(i+" ");
//		}
		
		int i=1;
		while(i<=n) {
			System.out.print(i+" ");
			i++;
		}
		
		myMethod();
		myClass m = new myClass();
		m.newMethod();
	}

	private static void myMethod() {
	   int a = 10;
	// p=4;
		
	}

}


class myClass{
	int a =10;
	void newMethod() {
		System.out.println("jhdfgcfgjkhj");
	}
}










