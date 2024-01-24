package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;
class D implements Comparable<D>{
	int num;
	int cost;
	D(int n, int im){
		this.num = n;
		this.cost = im;
	}
	@Override
	public int compareTo(D d) {
		return this.cost - d.cost;
	}
}

public class Dijkstra {
	static int n,m;
	static ArrayList<ArrayList<D>> list;
	static int[] dis;
	public void solution(int v) {
		PriorityQueue<D> q = new PriorityQueue<>();
		q.offer(new D(v,0));
		dis[v] = 0;
		while(!q.isEmpty()) {
			D tmp = q.poll();
			int now = tmp.num;
			int nowCost = tmp.cost;
			if(nowCost>dis[now])continue;
			for(D ob : list.get(now)) {
				if(dis[ob.num]>nowCost+ob.cost) {
					dis[ob.num]= nowCost+ob.cost;
					q.offer(new D(ob.num,nowCost+ob.cost));
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		Dijkstra ex = new Dijkstra();
		
		n = kb.nextInt();
		m = kb.nextInt();
		dis = new int[n+1];
		list = new ArrayList<ArrayList<D>>();
		for(int i=0;i<=n;i++) list.add(new ArrayList<D>());
		Arrays.fill(dis, Integer.MAX_VALUE);
		for(int j=0;j<m;j++) {
			int startNum = kb.nextInt();
			int num = kb.nextInt();
			int im = kb.nextInt();
			list.get(startNum).add(new D(num,im));
		}
		ex.solution(1);
		for(int i =2;i<=n;i++) {
			if(dis[i]!=Integer.MAX_VALUE)System.out.println(i+" : "+dis[i] );
			else System.out.println(i+": impossible");
		}
	}

}
