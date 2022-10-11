package com.greatlearning.app;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Denomination currency = new Denomination();
		Scanner currency1 = new Scanner(System.in);
		int nuofDenomi;
		System.out.println("enter the size of Currency denominations");
		nuofDenomi = currency1.nextInt();
	    System.out.println("enter the currency denominations value");
	    int valueofDenomi;
	    int [] array = new int [nuofDenomi];
	    for (int a=0 ; a < nuofDenomi; a ++) {
	    	array[a]= currency1.nextInt();
	    }
	    System.out.println ("enter the amount you want to pay");
	    int amount = currency1.nextInt();
	    currency.bubblesort(array);
	    currency.nuOfNotes(array,amount);

	}

}
