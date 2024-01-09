package day12;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class P{
	public int x,y;
	P(int x, int y){
		this.x = x;
		this.y = y;
	}
}
public class Maze_BFS {
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,1,0,-1};
	static int[][] board, dis;
	static int answer = Integer.MAX_VALUE;
	
	public void bfs(int x,int y) {
		Queue<P> q = new LinkedList<>();
		q.offer(new P(x,y));
		board[x][y] =1;
		while(!q.isEmpty()) {
			P tmp = q.poll();
			for(int i=0; i<4; i++) {
				int nx = tmp.x+dx[i];
				int ny = tmp.y+dy[i];
				if(nx>=1 &&nx<=7 && ny>=1 && ny <=7 && board[nx][ny]==0) {
					board[nx][ny]=1;
					q.offer(new P(nx,ny));
					dis[nx][ny] = dis[tmp.x][tmp.y]+1;
				}
			}
		}
		
	}
	public static void main(String[] args) {
		Maze_BFS ex = new Maze_BFS();
		Scanner s = new Scanner(System.in);

		board = new int[8][8];
		dis = new int[8][8];
		
		for(int i = 1;i<=7;i++) {
			for(int j=1;j<=7;j++) {
				board[i][j] = s.nextInt();
			}
		}
		ex.bfs(1,1);
		if(dis[7][7]==0)System.out.println(-1);
		else System.out.println(dis[7][7]);
	}

}
