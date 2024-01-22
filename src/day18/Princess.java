package day18;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Princess {
	public int sol(int n, int m) {
		Queue<Integer> q = new LinkedList<>();
		for(int i = 1;i<=n;i++) q.add(i);
		
		while(q.size()!=1) {
			for(int i=0;i<m-1;i++) {
				int tmp = q.poll();
				q.add(tmp);
			}
			q.poll();
		}
		
		int answer  = q.poll();
		return answer;
	}
	public static void main(String[] args) {
		Princess ex = new Princess();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		
		System.out.println(ex.sol(n,m));
	}

}
