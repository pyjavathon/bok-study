package day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Point{
	int x, y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}
public class DfsGraph_List {
	
	static int n, m, answer = 0;
	static int[] ch;
	static List<Point> list = new ArrayList<>();
	
	public void dfs(int L) {
		if(L==n)answer++;
		else {
			for(int i = 1; i<=n;i++) {
				if(list.get(L).x == list.get(i).y && ch[i]==0)
					ch[i] = 1;
				dfs(list.get(i).y);
			}
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		DfsGraph_List ex = new DfsGraph_List();
		n = s.nextInt();
		m = s.nextInt();
		for(int i = 0;i<m;i++) {
			int x = s.nextInt();
			int y = s.nextInt();
			list.add(new Point(x,y));
		}
		ch = new int[n+1];
		ch[1] = 1;
		ex.dfs(0);
	}

}
