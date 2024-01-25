package dynamic_programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Stone implements Comparable<Stone>{
	int dimensions;
	int height;
	int weight;
	public Stone(int d, int h, int w) {
		this.dimensions = d;
		this.height = h;
		this.weight = w;
	}
	@Override
	public int compareTo(Stone s) {
		return s.dimensions-this.dimensions;
	}
}

public class TopStack {
	public int solution(int n, ArrayList<Stone> list) {
		int answer = 0;
		int[] dy = new int[n];
		Collections.sort(list);
		dy[0]=list.get(0).height;
		answer = dy[0];
		for(int i=1;i<list.size();i++) {
			int max_h = 0;
			for(int j=i-1;j>=0;j++) {
				if(list.get(j).weight>list.get(i).weight && dy[j]>max_h) {
					max_h = dy[j];
				}
			}
			dy[i] = max_h + list.get(i).height;
			answer = Math.max(answer, dy[i]);
		}
		return answer;
	}
	public int sol(int n, ArrayList<Stone> list) {//벽돌의 갯수가 1이 나올 경우 틀린 답이 됨 
		Collections.sort(list);
		int answer = Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			int total =list.get(i).height;
			int w = Integer.MAX_VALUE;
			for(int j=i+1;j<n;j++) {
				if(list.get(i).weight>list.get(j).weight) {
					total+=list.get(j).height;
					if(w>list.get(j).weight) w = list.get(j).weight;
				}
			}
			answer = Math.max(answer, total);
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		TopStack ex = new TopStack();
		int n = kb.nextInt();
		ArrayList<Stone> list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			int c = kb.nextInt();
			list.add(new Stone(a,b,c));
		}
		
		System.out.println(ex.sol(n,list));

	}

}
