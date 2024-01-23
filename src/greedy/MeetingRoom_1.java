package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time2 implements Comparable<Time2>{
	int s,e;
	public Time2(int s, int e) {
		this.s = s;
		this.e = e;
	}
	
	@Override
	public int compareTo(Time2 t) {
		if(this.e==t.e) return this.s-t.s;
		else return this.e-t.e;
	}
}
public class MeetingRoom_1 {
	public int sol(int n, ArrayList<Time2> list) {
		int cnt = 0;
		int endTime = 0;
		for(Time2 t: list) {
			if(t.s>=endTime) {
				cnt++;
				endTime = t.e;
			}
		}
		
		return cnt;
	}
	
	
	public static void main(String[] args) {
		MeetingRoom_1 ex = new MeetingRoom_1();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Time2> list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			int s = kb.nextInt();
			int e = kb.nextInt();
			list.add(new Time2(s,e));
		}
		Collections.sort(list);
		System.out.println(ex.sol(n, list));
	
	}

}
