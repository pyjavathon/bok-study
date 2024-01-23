package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Friend2 implements Comparable<Friend2>{
	int time;
	char state;
	Friend2(int time, char state){
		this.time = time;
		this.state = state;
	}
	@Override
	public int compareTo(Friend2 ob) {
		if(this.time==ob.time) return this.state-ob.state;
		else return this.time-ob.time;
	}
}
public class Wedding_1 {
	public int solution(ArrayList<Friend2> arr) {
		int answer = Integer.MIN_VALUE;
		Collections.sort(arr);
		for(Friend2 f: arr)System.out.println(f.time+":"+f.state);
		int cnt = 0;
		for(Friend2 ob: arr) {
			if(ob.state=='s') cnt++;
			else cnt--;
			answer = Math.max(answer, cnt);
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		Wedding_1 ex = new Wedding_1();
		int n = kb.nextInt();
		ArrayList<Friend2> arr = new ArrayList<>();
		for(int i=0;i<n;i++) {
			int sT = kb.nextInt();
			int eT = kb.nextInt();
			arr.add(new Friend2(sT,'s'));
			arr.add(new Friend2(eT, 'e'));
		}

		System.out.println(ex.solution(arr));
	}

}
