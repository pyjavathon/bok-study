package day15;

import java.util.Scanner;

public class Peaks {
	public int sol(int n, int[][] arr) {
		int answer = 0;
		
		int[] dx = {-1,0,1,0};
		int[] dy = {0,1,0,-1};
		
		for(int i = 0;i<n;i++) {
			for(int j=0;j<n;j++) {
				boolean flag= true;
				for(int p=0;p<4;p++) {
					int nx = i+dx[p];
					int ny = j+dy[p];
					if(nx>=0&&nx<n&&ny>=0&&ny<n&&arr[nx][ny]>=arr[i][j]) {
						flag = false;
						break;
					}
				}
				if(flag)answer++;
			}
		}
		
		
		return answer;
	}
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		Peaks ex = new Peaks();
		
		int n = kb.nextInt();
		int[][] arr = new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]= kb.nextInt();
			}
		}
		System.out.println(ex.sol(n,arr));

	}

}
