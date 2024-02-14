package day27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class B8979 {
	
	static int N, K;
	static ArrayList<Country> list = new ArrayList<>();
	static int index;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		while(N-- >0) {
			st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			int g = Integer.parseInt(st.nextToken());
			int s = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			list.add(new Country(num,g,s,b,0));
		}
		Collections.sort(list);
		list.get(0).rank = 1;
		
		for(int i =1; i<list.size();i++) {
			Country c = list.get(i);
			
			int prevG = list.get(i-1).gold;
			int prevS = list.get(i-1).silver;
			int prevB = list.get(i-1).bronze;
			
			if(list.get(i).num == K) {
				index = i;
			}
			
			if(c.gold== prevG && c.silver == prevS && c.bronze == prevB) {
				list.get(i).rank = list.get(i-1).rank;
			}
			else {
				list.get(i).rank = i + 1;
			}
		}
		System.out.println(list.get(index).rank);
	}

}

class Country implements Comparable<Country>{
	int num;
	int gold;
	int silver;
	int bronze;
	int rank;
	
	public Country(int n, int g, int s, int b, int r) {
		this.num = n;
		this.gold = g;
		this.silver = s;
		this.bronze = b;
		this.rank = r;
	}
	
	@Override
	public int compareTo(Country c) {
		if(this.gold == c.gold) {
			if(this.silver == c.silver) {
				return c.bronze-this.bronze;
			}
			else {
				return c.silver-this.silver;
			}
		}else return c.gold-this.gold;
	}
}
