package day3_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class B_1205 {
	
	
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int T = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		
		List<Ranking> list = new ArrayList<>();
		
		list.add(new Ranking(0,T));
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			
			list.add(new Ranking(i+1, Integer.parseInt(st.nextToken())));
		}
		
		/*
		 * Collections.sort(list); for(int i=0;i<=N;i++) {
		 * System.out.println(i+": "+list.get(i).score); }
		 */
		Collections.sort(list);
		int taesu = 0;
		for(int i=0;i<list.size();i++) {
			if(list.get(i).id==0) {
				if(taesu+1>P) {
					System.out.println(-1);
					return;
				}
				taesu = list.get(i).score;
				
			}
		}
		int rank = 0;
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i).score>taesu) {
				rank++;
			}
		}
		System.out.println(rank);
	}

}

class Ranking implements Comparable<Ranking>{
	
	public int id;
	public int score;
	public Ranking(int id, int score) {
		this.id = id;
		this.score = score;
	}
	@Override
	public int compareTo(Ranking other) {
		if(this.score == other.score) {
			return other.id-this.id;
		}
		else return other.score - this.score;
	}
}
