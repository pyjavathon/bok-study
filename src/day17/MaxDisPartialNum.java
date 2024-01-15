package day17;

import java.util.Scanner;

public class MaxDisPartialNum {
	public int solution(int n, int m, int[] arr) {
		int answer = 0, cnt = 0, lt = 0;
		for(int rt=0;rt<n;rt++) {
			if(arr[rt]==0)cnt++;
			while(cnt>m) {
				if(arr[lt]==0)cnt--;
				lt++;
			}
			answer = Math.max(answer, rt-lt+1);
		}
		return answer;
	}
	public int sol(int n, int m, int[]arr) {
		int answer = Integer.MIN_VALUE, cnt = 0,z=0, lt =0;

		for(int rt=0;rt<n;rt++) {
			cnt++;
			if(arr[rt]==0) {
				z++;
				if(z>m) {
					z--;
					System.out.println(lt);
					while(arr[lt]!=0) {
						lt++;
					}
					cnt = rt-lt;
					lt++;
					answer = Math.max(answer, cnt);
				}
			}
			answer = Math.max(answer, cnt);
		}
		
		return answer;
	}

	public static void main(String[] args) {
		MaxDisPartialNum ex = new MaxDisPartialNum();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		
		int m = kb.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = kb.nextInt();
		}

		System.out.println(ex.sol(n,m,arr));
	}

}
