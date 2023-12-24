package day5;

import java.util.*;

public class DFS_Amazon_Interview {
	static String answer = "NO";
	static int n, total = 0;
	boolean flag = false;
	
	public void DFS(int L, int sum, int[] arr) {
		if(flag) return;
		if(sum>total/2) return;
		if(L==n){
			if((total-sum)==sum) {
				answer = "YES";
				flag = true;
			}
		}else {
			
			DFS(L+1, sum+arr[L],arr);
			DFS(L+1,sum,arr);
		}
	}
	
	public static void main(String[] args) {
		
		DFS_Amazon_Interview main = new DFS_Amazon_Interview();
		
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i< n; i++) {
			arr[i] = s.nextInt();
			total += arr[i];
		}
		main.DFS(0,0,arr);
		System.out.println(answer);
	}

}
