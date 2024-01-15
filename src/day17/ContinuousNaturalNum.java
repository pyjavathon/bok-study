package day17;

import java.util.Scanner;

public class ContinuousNaturalNum {
	
	public int solution(int n) {
		int answer = 0, cnt = 0;
		n--;
		while(n>0) {
			cnt++;
			n = n-cnt;
			if(n%cnt==0)answer++;
		}
		return answer;
	}
	public int sol(int n) {
		int answer = 0, sum = 0,lt = 1;
		
		for(int rt=1;rt<n;rt++) {
			sum+=rt;
			if(sum==n)answer++;
			while(sum>=n) {
				sum-=lt++;
				if(sum==n)answer++;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		ContinuousNaturalNum ex = new ContinuousNaturalNum();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		
		System.out.println(ex.sol(n));

	}

}
