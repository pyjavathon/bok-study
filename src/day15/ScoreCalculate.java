package day15;

import java.util.Scanner;

public class ScoreCalculate {
	public int sol(int n, int[] arr) {
		int answer = 0;
		for(int i =0;i<n;i++) {
			if(arr[i]>0 && arr[i+1]>0) {
				arr[i+1]=arr[i]+1;
			}
			answer+=arr[i];
		}
		//for(int x: arr)System.out.print(x+" ");
		return answer;
	}

	public static void main(String[] args) {
		ScoreCalculate ex = new ScoreCalculate();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int[] arr = new int[n];
		
		for(int i =0;i<n;i++) {
			arr[i] = kb.nextInt();
		}
		System.out.println(ex.sol(n, arr));
	}

}
