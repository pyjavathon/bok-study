package day5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS {
	
	static int n,m;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] check, dis;
	
	public void bfs(int v) {
		check[v]=1;
		dis[v]=0;
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(v);
		while(!queue.isEmpty()) {
			int current = queue.poll();
			for(int next : graph.get(current)) {
				if(check[next] == 0) {
					check[next] = 1;
					queue.offer(next);
					dis[next] = dis[current]+1;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		BFS main = new BFS();
		
		Scanner kb = new Scanner(System.in);
		
		n = kb.nextInt();
		
		m = kb.nextInt();
		
		graph = new ArrayList<ArrayList<Integer>>();
		//길게 인덱스 만들기 0에서 ~n+1까지
		for(int i = 0; i <= n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		check = new int[n+1];
		dis = new int[n+1];
		for(int i = 0; i < m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			graph.get(a).add(b);
		}
		main.bfs(1);
		for(int i = 2; i<=n; i++) {
			System.out.println(i+":"+dis[i]);
		}
	}

}
