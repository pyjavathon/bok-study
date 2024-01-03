package day8;

import java.util.Scanner;

public class Section8_13 {
	static int[] dx = {-1,-1,0,1,1,1,0,-1};
	static int[] dy = {0,1,1,1,0,-1,-1,-1};
	static int n, answer = 0;
	
	public void DFS(int x, int y, int[][] board) {
		for(int i = 0; i<8; i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			if(nx>=0&&nx<n&&ny>=0&&ny<n&&board[nx][ny]==1) {
				board[nx][ny]=0;
				DFS(nx,ny,board);
			}
		}
	}
	public void solution(int[][] board) {
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				if(board[i][j]==1) {
					answer++;
					board[i][j]=0;
					DFS(i,j,board);
				}
			}
		}
	}
	public static void main(String[] args) {
		Section8_13 ex = new Section8_13();
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		
		int[][] board = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j =0; j<n;j++) {
				board[i][j]= s.nextInt();
			}
		}
		ex.solution(board);
		System.out.println(answer);
	}

}
