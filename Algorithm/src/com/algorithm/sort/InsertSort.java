package com.algorithm.sort;

public class InsertSort {

	public static void main(String[] args) {
		
//		int[]array= {1,10,5,8,7,6,4,3,2,9};
		int[]array= {2,3,4,5,6,7,8,9,10,1};
		int j;
		for(int i=0; i<array.length-1; i++) {
			j=i;
			while(j>=0&&array[j]>array[j+1]) {
					int tmp=array[j+1];
					array[j+1]=array[j];
					array[j]=tmp;
					j--;
				}
		}

		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}	
	}

}
