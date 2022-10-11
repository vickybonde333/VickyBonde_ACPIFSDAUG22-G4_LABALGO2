package com.greatlearning.com;

public class Transaction {
	public void isTargetachievable(int target, int[] array) {
		int sum= 0;
		for(int i= 0; i <array.length; i++) {
			sum=sum+array[i];
			if(sum>=target) {
				System.out.println("Target achieved after " + (i+1)+ " transaction");
				break;
			}
		}
		if(sum<target) {
			System.out.println("target is not achieved.");
		}
	}
}
