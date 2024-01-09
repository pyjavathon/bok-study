package day12;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TomatoBox_BFS {
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,1,0,-1};
	static int m,n;
	static int[][]board,days;
	static Queue<P> q = new LinkedList<>();
	
	public void bfs() {
		while(!q.isEmpty()) {
			P tmp = q.poll();
			for(int i = 0;i<4;i++) {
				int nx = tmp.x+dx[i];
				int ny = tmp.y+dy[i];
				if(nx>=0 &&nx<n && ny>=0 &&ny<m && board[nx][ny]==0) {
					board[nx][ny]=1;
					q.offer(new P(nx,ny));
					days[nx][ny]=days[tmp.x][tmp.y]+1;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		TomatoBox_BFS ex = new TomatoBox_BFS();
		
		m = s.nextInt();
		n = s.nextInt();
		
		board = new int[n][m];
		days = new int[n][m];
		
		for(int i = 0;i<n;i++) {
			for(int j = 0; j<m;j++) {
				board[i][j] = s.nextInt();
				if(board[i][j]==1)q.offer(new P(i,j));
			}
		}
		ex.bfs();
		int answer = Integer.MIN_VALUE;
		boolean flag = true;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(board[i][j]==0)flag = false;
			}
		}
		
		if(flag) {
			for(int i=0;i<n;i++) {
				for(int j =0;j<m;j++) {
					answer = Math.max(answer, days[i][j]);
				}
			}
			System.out.println(answer);
		}else {
			System.out.println(-1);
		}
		
		

	}

}
