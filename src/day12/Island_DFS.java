package day12;

import java.util.Scanner;

public class Island_DFS {
	
	static int[] dx = {-1,-1,0,1,1,1,0,-1};
	static int[] dy = {0,1,1,1,0,-1,-1,-1};
	static int[][] board;
	static int n, answer;
	
	public void dfs(int x, int y, int[][] board) {
		for(int i=0;i<8;i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			if(nx>=0&&nx<n&&ny>=0&&ny<n&&board[nx][ny]==1) {
				board[nx][ny]=0;
				dfs(nx,ny,board);
			}
		}
		
	}
	
	public void solution(int [][] board) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(board[i][j]==1) {
					answer++;
					dfs(i,j,board);
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Island_DFS ex = new Island_DFS();
		
		n = s.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				board[i][j]= s.nextInt();
			}
		}
		ex.solution(board);
		System.out.println(answer);
		
	}

}
