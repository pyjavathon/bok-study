package day12;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Island_BFS {
	
	static int[] dx = {-1,-1,0,1,1,1,0,-1};
	static int[] dy = {0,1,1,1,0,-1,-1,-1};
	static int[][] board;
	static int n, answer;
	
	public void bfs(int x,int y, int[][]board) {
		Queue<P> q = new LinkedList<>();
		q.offer(new P(x,y));
		while(!q.isEmpty()) {
			P tmp = q.poll();
			for(int i =0;i<8;i++) {
				int nx = tmp.x+dx[i];
				int ny = tmp.y+dy[i];
				if(nx>=0&&nx<n&&ny>=0&&ny<n&&board[nx][ny]==1) {
					board[nx][ny]=0;
					q.offer(new P(nx,ny));
				}
			}
			
		}
	}
	
	public void solution(int[][] board) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(board[i][j]==1) {
					answer++;
					bfs(i,j,board);
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Island_BFS ex = new Island_BFS();
		
		n = s.nextInt();
		
		board = new int[n][n];
		
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<n;j++) {
				board[i][j]=s.nextInt();
			}
		}
		ex.solution(board);
		System.out.println(answer);
	}

}
