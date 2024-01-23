package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time implements Comparable<Time>{
	int s,e;
	public Time(int s,int e) {
		this.s = s;
		this.e = e;
	}
	@Override
	public int compareTo(Time t) {
		if(this.s == t.s)return this.e-t.e;
		else return this.s-t.s;
	}
	
}
public class MeetingRoom {

	public int sol(int n, ArrayList<Time> list) {
		int answer = 0; 
		int[] start = new int[n];
		int[] end = new int[n];
		for(int i=0;i<n;i++) {
			start[i] = list.get(i).s;
			end[i] = list.get(i).e;
		}
		
		for(int i=0;i<n/2;i++) {
			int lt =i,rt =i;
			int cnt = 1;
			while(lt<n) {
				if(start[lt]>=end[rt]) {
					rt = lt;
					lt++;
					cnt++;
				}
				else lt++;
			}
			answer = Math.max(answer, cnt);
		}
		
		return answer;
	}
	public static void main(String[] args) {
		MeetingRoom ex = new MeetingRoom();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Time> list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			int s = kb.nextInt();
			int e = kb.nextInt();
			list.add(new Time(s,e));
		}
		Collections.sort(list);
		System.out.println(ex.sol(n, list));
	}

}
