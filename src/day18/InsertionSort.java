package day18;

import java.util.Scanner;

public class InsertionSort {
	public int[] solution(int n, int[] arr) {
		for(int i=1;i<n;i++) {
			int tmp=arr[i],j;
			for(j=i-1;j>=0;j--) {
				if(arr[j]>tmp) arr[j+1] = arr[j];
				else break;
			}
			arr[j+1] = tmp;
		}
		return arr;
	}
	public int[] sol(int n, int[] arr) {
		for(int i = 0;i<n-1;i++) {
			for(int j = i+1;j>0;j--) {
				if(arr[j]<arr[j-1]) {
					int tmp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		InsertionSort ex = new InsertionSort();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = kb.nextInt();
		}
		
		for(int x : ex.sol(n,arr))System.out.print(x+" ");

	}

}
