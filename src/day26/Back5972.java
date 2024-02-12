package day26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


public class Back5972 {
	public static int n, m;
	public static ArrayList<ArrayList<Node>> graph = new ArrayList<>();
	public static boolean[] visited;
	public static int[] d = new int[50001];
	public static int answer = 0;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
	
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		visited = new boolean[n];
		
		for(int i=0;i<=n;i++) {
			graph.add(new ArrayList<>());
		}
		
		for(int i=0;i<m;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int dist = Integer.parseInt(st.nextToken());
			
			graph.get(a).add(new Node(b,dist));
			graph.get(b).add(new Node(a,dist));
		}
		
		dijkstra(1);
		System.out.println(d[n]);
		
	}
	
	public static void dijkstra(int start) {
		Arrays.fill(d, (int)1e9);
		PriorityQueue<Node> pq = new PriorityQueue<>();
		pq.offer(new Node(start,0));
		d[start]= 0;
		
		while(!pq.isEmpty()) {
			Node temp = pq.poll();
			int nodeB = temp.nodeB;
			int distance = temp.distance;
			
			if(d[nodeB] < distance) continue;//현재 노드가 이미 처리된 적 있는 노드라면 무시 ( 거리가 더 작다는것은 이미 더 효율적인 방안으로 처리된 것 )
			
			for(int i=0;i<graph.get(nodeB).size();i++) {
				int cost = d[nodeB]+graph.get(nodeB).get(i).distance;
				if(cost < d[graph.get(nodeB).get(i).nodeB]) {//현재 노드를 거쳐서 다른 노드로 이동하는것이 거리가 더 짧을 경우
					d[graph.get(nodeB).get(i).nodeB] = cost;
					pq.offer(new Node(graph.get(nodeB).get(i).nodeB,cost));
				}
			}
			
		}
	}


}

class Node implements Comparable<Node>{
	
	int nodeB, distance;
	public Node(int nodeB, int distance) {
		this.nodeB = nodeB;
		this.distance = distance;
	}
	
	@Override
	public int compareTo(Node other) {
		if(this.distance > other.distance) return 1;
		else if(this.distance == other.distance)return 0;
		else return -1;
	}
}
