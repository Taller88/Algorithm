package com.algorithm.sort;

public class SelectedSort {

	public static int[] selectedSort(int [] num) {
		//선택 정렬의 핵심 
		// 가장 작은 수를 가장 앞에 둔다.
		
		int[]sort=num;
		for(int i=0; i<sort.length;i++) {
			int min=9999;
			int index=0;
			for(int j=i; j<sort.length; j++) {
				if(min>sort[j]) {
					min=sort[j];
					index=j;
				}
			}
			//스와핑한다.
			int tmp=sort[index];
			sort[index]=sort[i];
			sort[i]=tmp;
		}
		
		
		return sort;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num= {1,10,5,8,7,6,4,3,2,9};
		int[] tmp=selectedSort(num);
		for(int i=0; i<tmp.length; i++) {
			System.out.print(tmp[i]+",");
		}
	}

}
