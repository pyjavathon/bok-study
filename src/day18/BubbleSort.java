package day18;

import java.util.Scanner;

public class BubbleSort {
	public int[] sol(int n, int[] arr) {
		for(int i = 0;i<n-1;i++) {
			for(int j = 0;j<n-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int tmp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		BubbleSort ex = new BubbleSort();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = kb.nextInt();
		}
		
		for(int x : ex.sol(n,arr))System.out.print(x+" ");

	}

}
