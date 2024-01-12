package day15;

import java.util.Scanner;

public class NxN {
	
	public int sol(int n, int[][]board) {
		int answer = Integer.MIN_VALUE;
		int sum1 = 0,sum2 = 0;
		
		for(int i = 0;i<n;i++) {
			sum1=sum2=0;
			for(int j=0;j<n;j++) {
				sum1+=board[i][j];
				sum2+=board[j][i];
			}
			answer = Math.max(answer, sum1);
			answer = Math.max(answer, sum2);
		}
		sum1=sum2=0;
		//대각선
		for(int i = 0;i<n;i++) {
			sum1+=board[i][i];
			sum2+=board[i][n-i-1];
		}
		answer = Math.max(answer, sum1);
		answer = Math.max(answer, sum2);
		return answer;
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		NxN ex= new NxN();
		int n = kb.nextInt();
		int[][] board = new int[n][n];
		for(int i =0;i<n;i++) {
			for(int j=0;j<n;j++) {
				board[i][j]=kb.nextInt();
			}
		}
		System.out.println(ex.sol(n,board));

	}

}
