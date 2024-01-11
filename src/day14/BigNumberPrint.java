package day14;

import java.util.Scanner;

public class BigNumberPrint {
	
	public void sol(int[] arr) {
		int[] answer = new int[arr.length];
		System.out.print(arr[0]+" ");
		for(int i=1;i<arr.length;i++) {
			if(arr[i-1]<arr[i]) {
				System.out.print(arr[i]+" ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		BigNumberPrint ex = new BigNumberPrint();
		
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = kb.nextInt();
		}
		
		ex.sol(arr);

	}

}
