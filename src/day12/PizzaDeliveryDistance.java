package day12;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaDeliveryDistance {
	static ArrayList<P> pizza = new ArrayList<>();
	static ArrayList<P> house = new ArrayList<>();
	static int[] village;
	static int n,m,len,answer=Integer.MAX_VALUE;
	
	public void dfs(int L, int s) {
		if(L==m) {
			int sum=0;
			for(P h: house) {
				int dis = Integer.MAX_VALUE;
				for(int i:village) {
					dis = Math.min(dis, Math.abs(h.x-pizza.get(i).x)+Math.abs(h.y-pizza.get(i).y));
				}
				sum += dis;
			}
			answer = Math.min(answer, sum);
		}else {
			for(int i=s;i<len;i++) {
				village[L]=i;
				dfs(L+1,i+1);
			}
		}
	}
	
	

	public static void main(String[] args) {
		PizzaDeliveryDistance ex = new PizzaDeliveryDistance();
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		m = s.nextInt();
		village = new int[m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				int tmp = s.nextInt();
				if(tmp==1)house.add(new P(i,j));
				else if(tmp==2)pizza.add(new P(i,j));
			}
		}
		len = pizza.size();
		ex.dfs(0,0);
		System.out.println(answer);
	}

}
