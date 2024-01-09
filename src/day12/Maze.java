package day12;

import java.util.Scanner;

public class Maze {//미로탐색
	static int[] lt = {-1,0,1,0};
	static int[] rt = {0,1,0,-1};
	static int[][] graph = new int[8][8];
	static int answer = 0;
	public void dfs(int x, int y) {
		if(x==7 & y ==7) {
			answer++;
		}else {
			for(int i = 0; i<4; i++) {
				int nx = x+lt[i];
				int ny = y+rt[i];
				if(nx>=1 && nx<=7 && ny>=1 && ny<=7 && graph[nx][ny]==0) {
					graph[nx][ny]=1;
					dfs(nx,ny);
					graph[nx][ny]=0;
				}
			}
			
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Maze ex = new Maze();

		for(int i = 1; i<=7; i++) {
			for(int j=1;j<=7;j++) {
				graph[i][j] = s.nextInt();
			}
		}
		graph[1][1]=1;
		ex.dfs(1,1);
		System.out.println(answer);
	}

}
