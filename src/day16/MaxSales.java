package day16;

import java.util.Scanner;

public class MaxSales {
	public int solution(int n, int m, int[] a) {
		int answer, sum = 0;
		
		for(int i = 0;i<m;i++) {
			sum+=a[i];
		}
		answer = sum;
		for(int i = m;i<n;i++) {
			sum+= (a[i]-a[i-m]);
			answer = Math.max(answer, sum);
		}
		return answer;
	}

	public int sol(int n,int m, int[] a) {
		int answer = Integer.MIN_VALUE, sum = 0;
		int p1 = 0,p2 = m;
		while(p1<n-m) {
			for(int i = p1;i<p2;i++) {
				sum+=a[i];
			}
			p1++;
			p2++;
			answer = Math.max(answer, sum);
			sum=0;
		}
		
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		MaxSales ex = new MaxSales();
		
		int n = kb.nextInt();
		int m = kb.nextInt();
		
		int[] a = new int[n];
		for(int i =0;i<n;i++) {
			a[i] = kb.nextInt();
		}
		
		System.out.println(ex.sol(n,m,a));
	}

}
