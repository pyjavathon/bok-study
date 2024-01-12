package day15;

import java.util.Scanner;

public class Rank {
	public int[] sol(int n, int[] arr) {
		int[] answer = new int[n];
		for(int i=0;i<n;i++) {
			int cnt=1;
			for(int j=0;j<arr.length;j++) {
				if(arr[j]>arr[i])cnt++;
			}
			answer[i]=cnt;
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		Rank ex = new Rank();
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=kb.nextInt();
		}
		for(int x: ex.sol(n, arr))System.out.print(x+" ");
	}

}
