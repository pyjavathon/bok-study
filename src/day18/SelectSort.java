package day18;

import java.util.Scanner;

public class SelectSort {
	public int[] sol(int n, int[] arr) {
		for(int i = 0;i<n-1;i++) {
			int idx = i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[idx]) idx = j;
			}
			int tmp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = tmp;
			
		}
		
		return arr;
	}

	public static void main(String[] args) {
		SelectSort ex = new SelectSort();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = kb.nextInt();
		}
		
		for(int x : ex.sol(n,arr))System.out.print(x+" ");

	}

}
