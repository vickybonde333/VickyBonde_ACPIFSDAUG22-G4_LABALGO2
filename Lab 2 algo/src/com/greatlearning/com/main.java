package com.greatlearning.com;

import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Transaction transaction = new Transaction();
		Scanner scanner = new Scanner(System.in);
		int sizeOfarray;
		System.out.println("enter the size of transaction array");
		sizeOfarray = scanner.nextInt();
		System.out.println("enter the values of array");
		int [] array= new int[sizeOfarray];
		for (int  i=0 ; i < sizeOfarray; i++) {
			array[i]=scanner.nextInt();
		}
	  System.out.println("enter the total no of targets that needs to be achieved");
	  int target = scanner.nextInt();
	  for (int i=0; i<target; i++) {
		  System.out.println("enter the value of target");
		  int value = scanner.nextInt();
		  transaction.isTargetachievable(value, array);
	  }
		
	}

}
