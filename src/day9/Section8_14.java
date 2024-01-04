package day9;

import java.util.ArrayList;
import java.util.Scanner;

class Coordinate {
	int x, y;
	Coordinate(int x, int y){
		this.x=x;
		this.y=y;
	}
}

public class Section8_14 {
	
	static int n, m, len, answer = Integer.MAX_VALUE;
	static ArrayList<Coordinate> hs,pz;
	static int[] combi;
	
	public void DFS(int L, int s) {
		if(L==m) {
			int sum = 0;
			for(Coordinate c:hs) {
				int dis = Integer.MAX_VALUE;
				for(int i : combi) {
					dis = Math.min(dis, Math.abs(c.x-pz.get(i).x)+Math.abs(c.y-pz.get(i).y));
				}
				sum+=dis;
			}
			answer = Math.min(answer, sum);
			
		}else {
			for(int i = s; i<len; i++) {
				combi[L] = i;
				DFS(L+1,s+1);
			}
		}
	}
	
	public static void main(String[] args) {
	
		Section8_14 ex = new Section8_14();
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		m = s.nextInt();
		pz = new ArrayList<>();
		hs = new ArrayList<>();
		
		for(int i = 0;i<n;i++) {
			for(int j=0;j<n;j++) {
				int tmp = s.nextInt();
				if(tmp==1)hs.add(new Coordinate(i,j));
				else if(tmp==2)pz.add(new Coordinate(i,j));
			}
		}
		len = pz.size();
		combi = new int[m];
		ex.DFS(0,0);
		System.out.println(answer);
	}

}
