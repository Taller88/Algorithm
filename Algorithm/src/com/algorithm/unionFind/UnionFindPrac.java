package com.algorithm.unionFind;

import java.util.Scanner;

public class UnionFindPrac {

	/***
	 * x의 부모 노드를 찾아주는 알고리즘 
	 * @param parent
	 * @param x
	 * @return
	 */
	public static int getParent(int[] parent, int x) {
		if(parent[x]==x) {
			return x;
		}
		return parent[x]=getParent(parent, parent[x]);
	}
	
	public static int getUnion(int[] parent, int x, int y) {
		int a=getParent(parent, x);
		int b=getParent(parent, y);
		if(a<b) {
			return parent[y]=a;
		}else {
			return parent[x]=b;
		}
		
	}
	public static boolean findParent(int[] parent, int x, int y) {
		int a=getParent(parent, x);
		int b=getParent(parent, y);
		return a==b?true:false;
	}
	public static void main(String[] args) {

		int[]parent=new int[11];
		for(int i=0; i<parent.length; i++) {
			parent[i]=i;
		}
		getUnion(parent, 1, 2);//1번 노드와 2번 노드를 합친다. 
		getUnion(parent, 2, 3);//1번 노드와 2번 노드를 합친다. 
		getUnion(parent, 3, 4);//1번 노드와 2번 노드를 합친다. 
		getUnion(parent, 5, 6);//1번 노드와 2번 노드를 합친다. 
		getUnion(parent, 6, 7);//1번 노드와 2번 노드를 합친다. 
		getUnion(parent, 7, 8);//1번 노드와 2번 노드를 합친다. 
		for(int i=0; i<parent.length; i++) {
			System.out.print(parent[i]+" ");
		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("확인하고자 하는 노드의 두 값을 입력해주세요.");

		int a= sc.nextInt();
		int b= sc.nextInt();
		
		System.out.println(a+"와 "+b+"가 연결되어 있습니까?");
		if(findParent(parent, a, b)) {
			System.out.println("네");
		}else {
			System.out.println("아니오.");
		}
		
		
	}

}
