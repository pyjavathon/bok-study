package day11;

import java.util.Scanner;

public class MaxScore {
	static int exam,time,answer = Integer.MIN_VALUE;
	
	public void dfs(int L, int totalScore, int totalTime, int[][] arr) {
		if(totalTime>time)return;
		if(L==exam) {
			answer = Math.max(totalScore, answer);
		}else {
			dfs(L+1,totalScore+arr[L][0],totalTime+arr[L][1],arr);
			dfs(L+1, totalScore, totalTime,arr);
		}
	}
	public static void main(String[] args) {
		MaxScore ex = new MaxScore();
		Scanner s = new Scanner(System.in);
		
		exam = s.nextInt();
		
		time = s.nextInt();
		
		int[][] arr = new int[exam][2];
		
		for(int i = 0;i<exam; i++) {
			for(int j = 0; j<2;j++) {
				arr[i][j] = s.nextInt();
			}
		}
		ex.dfs(0,0,0,arr);
		System.out.println(answer);
	}

}
