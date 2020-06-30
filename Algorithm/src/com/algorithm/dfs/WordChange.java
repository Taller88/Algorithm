package com.algorithm.dfs;

public class WordChange {
	public static int compare(String a, String b) {
		int c=0;
		for(int i=0; i<a.length(); i++) {
			if(a.charAt(i)!=b.charAt(i)) {
				c++;
			}
		}
		return c;
		
	}
	
	 public static int solution(String begin, String target, String[] words) {
		  int answer = 51;
	        boolean cTar=false;
	        boolean[] visited=new boolean[words.length];
	        for(int i=0; i<words.length; i++){
	            if(words[i].equals(target)){
	                cTar=true;
	            }
	        }
	        if(!cTar){
	            return 0;
	        }else{
	            for(int i=0; i<words.length; i++) {
	            	if(compare(begin, words[i])==1) {
	            		visited[i]=true;
	            		int tmp=dfs(words,words[i],visited,target,1);
	            		if(tmp!=0 && tmp<answer) {
	            			answer=tmp;
	            		}
	            	}
	            }
	        	
	        	
	        	
	        	
	        }
	        return answer;
	    }
	public static int dfs(String[] words,String begin, boolean[] visited, String target,int result) {
		int min=51;
		if(target.equals(begin)) {
			return result;
		}
		if(words.length<=result) {
			return 0;
		}
		
		for(int i=0; i<words.length; i++) {
			if(!visited[i] && compare(words[i],begin)==1) {
				visited[i]=true;
				int tmp= dfs(words,words[i],visited,target,result+1);
				visited[i]=false;
				if(tmp<min) {
					min=tmp;
				}
			}
		}
		
	return min;
	}

	public static void main(String[] args) {
		String[] words= {"hot", "dot", "dog", "lot", "log","cog"};
		
		System.out.println(solution("hit", "cog", words));
	}

}
