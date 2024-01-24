package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
class Speech implements Comparable<Speech>{
	int money;
	int day;
	Speech(int money, int day){
		this.money = money;
		this.day = day;
	}
	@Override
	public int compareTo(Speech s) {
		return s.day-this.day;
	}
}	
public class PriorityQueueEx {
	static int n, max = Integer.MIN_VALUE;
	
	public int solution(ArrayList<Speech>list) {
		int answer = 0;
		PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
		Collections.sort(list);
		int j = 0;
		for(int i=max;i>=1;i--) {
			for(;j<n;j++) {
				if(list.get(j).day<i) break;
				pQ.offer(list.get(j).money);
			}
			if(!pQ.isEmpty())answer+=pQ.poll();
		}
		return answer;//
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		PriorityQueueEx ex = new PriorityQueueEx();
		
		n = kb.nextInt();
		ArrayList<Speech> list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			int money = kb.nextInt();
			int day = kb.nextInt();
			list.add(new Speech(money,day));
			if(day>max)max = day;
		}
		System.out.println(ex.solution(list));
	}

}
