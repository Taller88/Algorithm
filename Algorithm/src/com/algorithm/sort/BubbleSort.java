package com.algorithm.sort;

public class BubbleSort {

	public static void main(String[]args) {
		int [] array= {1,10,5,8,7,6,3,2,9};
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array.length-i-1; j++) {
				if(array[j+1]<array[j]) {
					int tmp=array[j];
					array[j]=array[j+1];
					array[j+1]=tmp;
				}
				
			}
		}//for
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+",");
		}
	}
}
