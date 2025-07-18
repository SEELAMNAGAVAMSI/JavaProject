package com.sample.test.Arrays;

public class FindLargest {

	public static void main(String[] args) {
	int arr[]= {12,3,4,67,89,98};
	int largest=Integer.MIN_VALUE;
	for(int num:arr) {
		if(num>largest) {
			largest=num;
		}
	}
	System.out.println("Largest Number:"+largest);
	

	}

}
