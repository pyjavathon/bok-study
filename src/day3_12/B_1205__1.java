package day3_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B_1205__1 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int point = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		
		if(n == 0) {
			System.out.println(1);
			return;
		}
		
		st = new StringTokenizer(br.readLine());
		ArrayList<Integer> rankList = new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			rankList.add(Integer.parseInt(st.nextToken()));
		}
		int rank = 1;
		if(rankList.size() == p && point <= rankList.get(rankList.size()-1)) {
			System.out.println(-1);
			return;
		}
		
		for(int i=0;i<n;i++) {
			if(point>=rankList.get(i)) {
				rank = i+1;
				break;
			}
			else {
				rank++;
			}
		}
		if(rank<=p) {
			System.out.println(rank);
		}
		else {
			System.out.println(-1);
		}
	}

}
