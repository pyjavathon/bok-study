package day24;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

public class Back1927 {

	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		
		for(int i=0;i<N;i++) {
			int a = Integer.parseInt(br.readLine());
			if(a==0) {
				if(q.isEmpty())bw.write(0+"\n");
				else{
					int x = q.poll();
					bw.write(x+"\n");
				}
				
			}
			else q.offer(a);
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
