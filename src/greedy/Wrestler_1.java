package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class Body implements Comparable<Body>{
	int h,w;
	public Body(int h, int w) {
		this.h = h;
		this.w = w;
	}
	@Override
	public int compareTo(Body o) {
		return o.h-this.h;
	}
	
}

public class Wrestler_1 {

	public int sol(int n, ArrayList<Body> list) {
		int cnt = 0;
		Collections.sort(list);
		int max = Integer.MIN_VALUE;
		for(Body b : list) {
			if(b.w>max) {
				max = b.w;
				cnt++;
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		Wrestler_1 ex = new Wrestler_1();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Body> list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			int h = kb.nextInt();
			int w = kb.nextInt();
			list.add(new Body(h,w));
		}
		
		System.out.println(ex.sol(n,list));
	}

}
