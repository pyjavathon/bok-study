package day8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Position{
	public int x, y;
	Position(int x, int y){
		this.x = x;
		this.y = y;
	}
}

public class Section8_13_BFS {
	
	static int n, answer = 0;
	static int[] dx = {-1,-1,0,1,1,1,0,-1};
	static int[] dy = {0,1,1,1,0,-1,-1,-1};
	
	public void BFS(int x, int y, int[][] board) {
		
		Queue<Position> q = new LinkedList<>();	
		q.add(new Position(x,y));
		while(!q.isEmpty()) {
			Position tmp = q.poll();
			for(int i = 0; i<8;i++) {
				int nx = tmp.x+dx[i];
				int ny = tmp.y+dy[i];
				if(nx>=0&&nx<n&&ny>=0&&ny<n&&board[nx][ny]==1) {
					board[nx][ny]=0;
					q.add(new Position(nx,ny));
				}
			}
		}
	}
	
	public void solution(int[][] board) {
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				if(board[i][j]==1) {
					board[i][j]=0;
					answer++;
					BFS(i,j,board);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Section8_13_BFS ex = new Section8_13_BFS();
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		
		int[][] board = new int[n][n];
		
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				board[i][j]=s.nextInt();
			}
		}
		ex.solution(board);
		System.out.println(answer);
	}

}
