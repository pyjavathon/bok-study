package day8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class Point2{
	public int x, y;
	Point2(int x, int y){
		this.x=x;
		this.y=y;
	}
}
public class Section8_12 {

	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,1,0,-1};
	static int n,m;
	static int[][] dis, board;
	static Queue<Point2> q = new LinkedList<>();
	
	public void BFS() {
		while(!q.isEmpty()) {
			Point2 tmp = q.poll();
			for(int i = 0; i < 4; i++) {
				int nx = tmp.x+dx[i];
				int ny = tmp.y+dy[i];
				if(nx>=0 && nx <n && ny >=0 && ny <m && board[nx][ny]==0) {
					board[nx][ny] = 1;
					q.offer(new Point2(nx,ny));
					dis[nx][ny] = dis[tmp.x][tmp.y]+1;
				}
			}
		}
	}
	public static void main(String[] args) {
		Section8_12 ex = new Section8_12();
		Scanner s = new Scanner(System.in);
		
		m = s.nextInt();
		n = s.nextInt();
		board = new int[n][m];
		dis = new int[n][m];
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<m; j++) {
				board[i][j] = s.nextInt();
				if(board[i][j]==1) q.offer(new Point2(i,j));
			}
		}
		ex.BFS();
		boolean flag = true;
		int answer = Integer.MIN_VALUE;
		for(int i = 0; i<n;i++) {
			for(int j = 0; j <m; j++) {
				if(board[i][j]==0)flag=false;
			}
		}
		if(flag) {
			for(int i = 0; i<n; i++) {
				for(int j = 0; j <m; j++) {
					answer = Math.max(answer, dis[i][j]);
				}
			}
			System.out.println(answer);
		}
		else System.out.println(-1);
	}
}
