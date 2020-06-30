package com.algorithm.dfs;

public class DFS {
	static int answer=0;
	
	public static void dfs(int[] numbers,int idx, int sum, int target) {
		if(idx==numbers.length) {
			if(sum==target) {
				answer++;
			}
		}else {
			dfs(numbers, idx+1, sum+numbers[idx], target);
			dfs(numbers, idx+1, sum-numbers[idx], target);
		}
	
	}
	public static int solution(int[] numbers, int target) {
		dfs(numbers, 0, 0, target);
		return answer;
	}
	
	public static void main(String[] args) {
		int[] numbers=new int[5];
		int target=3;
		for(int i=0; i<numbers.length; i++) {
			numbers[i]=1;
		}
		
		System.out.println(solution(numbers, target));
	}

}
