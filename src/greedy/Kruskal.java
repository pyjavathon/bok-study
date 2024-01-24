package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class Road implements Comparable<Road>{
	int a,b,cost;
	public Road(int a,int b, int cost) {
		this.a = a;
		this.b = b;
		this.cost=cost;
	}
	@Override
	public int compareTo(Road r) {
		return this.cost-r.cost;
	}
	
}
public class Kruskal {
	static int[] unf;
	
	public static int Find(int v) {
		if(v==unf[v])return unf[v];
		else return unf[v]= Find(unf[v]);
	}
	public static void Union(int a, int b) {
		int fa = Find(a);
		int fb = Find(b);
		if(fa!=fb) unf[fa] = fb;
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		unf = new int[n+1];
		ArrayList<Road> list = new ArrayList<>();
		for(int i=0;i<=n;i++)unf[i]=i;
		for(int i=0;i<m;i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			int c = kb.nextInt();
			list.add(new Road(a,b,c));
			
		}
		Collections.sort(list);
		int answer = 0;
		for(Road r : list) {
			int r1 = Find(r.a);
			int r2 = Find(r.b);
			if(r1!=r2) {
				answer+=r.cost;
				Union(r.a,r.b);
			}
			
			
		}
		System.out.println(answer);

	}

}
