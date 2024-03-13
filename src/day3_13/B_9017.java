package day3_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B_9017 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int testcase = Integer.parseInt(br.readLine());
		
		for(int i=0;i<testcase;i++) {
			int race = Integer.parseInt(br.readLine());
			
			st = new StringTokenizer(br.readLine());
			ArrayList<Integer> list = new ArrayList<>();
			int[] num = new int[race];
			int[] score = new int[race];
			for(int j=0;j<race;j++) {
				int x = Integer.parseInt(st.nextToken());
				num[x]++;
				list.add(x);
			}
			int tmp = 1;
			for(int z = 0;z<list.size();z++) {
				if(num[list.get(z)]>=6) {
					score[list.get(z)]+=tmp;
					tmp++;
				}
				
			}
			int minScore = Integer.MAX_VALUE;
			int answer = 0;
			for(int y=1;y<race;y++) {
				if(score[y]!=0 && minScore > score[y]) {
					minScore = score[y];
					answer = y;
				}
			}
			
			System.out.println(answer);
			
			
			
		}
		
		

	}

}
