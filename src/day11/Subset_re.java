package day11;

import java.util.Scanner;

public class Subset_re {
	static int n,total;
	static String answer = "NO";
	boolean flag = false;
	public void dfs(int L, int sum, int[] arr) {
		if(flag)return;
		if(sum>total/2)return;
		if(L==n) {
			if((total-sum)==sum) {
				answer = "YES";
				flag = true;
			}
		}else {
			
			dfs(L+1,sum+arr[L],arr);
			dfs(L+1,sum,arr);
		}
	}
	
	public static void main(String[] args) {
		Subset_re ex = new Subset_re();
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = s.nextInt();
			total+=arr[i];
		}
		
		ex.dfs(0,0,arr);
		System.out.println(answer);
	}

}
