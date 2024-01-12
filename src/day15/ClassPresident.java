package day15;

import java.util.Scanner;

public class ClassPresident {
	
	public int sol(int n, int[][]arr) {
		int answer=0,
				max=0;
		for(int i=1;i<=n;i++) {
			int cnt =0;
			for(int j=1;j<=n;j++) {
				for(int k =1;k<=5;k++) {
					if(arr[i][k]==arr[j][k]) {
						cnt++;
						break;
					}
				}
			}
			if(cnt>max) {
				max = cnt;
				answer = i;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		ClassPresident ex = new ClassPresident();
		int n = kb.nextInt();
		
		int[][] arr = new int[n+1][6];
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=5;j++) {
				arr[i][j]=kb.nextInt();
			}
		}

		System.out.println(ex.sol(n,arr));
	}

}
