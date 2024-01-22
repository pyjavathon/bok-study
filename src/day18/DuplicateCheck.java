package day18;

import java.util.Scanner;

public class DuplicateCheck {
	public char sol(int n, int[] arr) {
		char answer = 'U';
		
		for(int i=0;i<n-1;i++) {
			for(int j= i+1;j<n;j++) {
				if(arr[i]==arr[j]) return 'D';
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		DuplicateCheck ex = new DuplicateCheck();
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = kb.nextInt();
		}
		
		System.out.println(ex.sol(n, arr));
	}

}
