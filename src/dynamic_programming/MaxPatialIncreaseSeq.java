package dynamic_programming;

import java.util.Scanner;

public class MaxPatialIncreaseSeq {
	public int solution(int n,int[] arr) {
		int[] dy = new int[n];
		int answer = 0;
		dy[0]=1;
		for(int i=1;i<arr.length;i++) {
			int max = 0;
			for(int j = i-1;j>=0;j--) {
				if(arr[j]<arr[i]&&dy[j]>max)max = dy[j];
			}
			dy[i] = max+1;
			answer = Math.max(answer, dy[i]);
		}
		return answer;
	}
	public int sol(int n, int[] arr) {//틀림
		int[] dy = new int[n];
		dy[1]=(arr[1]<=arr[0])?1:2;
		int t = dy[1];
		for(int i=2;i<arr.length;i++) {
			if(arr[i-1]<arr[i]) {
				dy[i]=t++;
				//System.out.println(dy[i]);
			}
		}
		return t;
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		MaxPatialIncreaseSeq ex = new MaxPatialIncreaseSeq();
		int n = kb.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) arr[i] = kb.nextInt();
		
		System.out.println(ex.sol(n,arr));
	}

}
