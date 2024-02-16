package day29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class B1927 {
	public void solution() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i=0;i<N;i++) {
			int a = Integer.parseInt(br.readLine());
			if(a == 0) {
				if(pq.isEmpty())System.out.println(0);
				else System.out.println(pq.poll());
			}else {
				pq.add(a);
			}
		}
	}
	public static void main(String[] args) throws IOException{
		new B1927().solution();
	}

}
