package day23;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Back3758 {
	
	static class Team{
		int id;
		int[] scoreList;
		int submitNum;
		int lastSubmit;
		int totalScore;
	}

	public static void main(String[] args) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		for(int T = 0;T<testCase;T++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());//팀 수
			int k = Integer.parseInt(st.nextToken());//문제 수 k
			int t = Integer.parseInt(st.nextToken());//내 팀 id
			int m = Integer.parseInt(st.nextToken());//로그 개수
			
			Team[] list = new Team[n];
			for(int i=0;i<m;i++) {
				st = new StringTokenizer(br.readLine());
				int teamId = Integer.parseInt(st.nextToken());
				int problemNum = Integer.parseInt(st.nextToken());
				int score = Integer.parseInt(st.nextToken());
				
				if(list[teamId -1] == null) {
					list[teamId -1] = new Team();
					list[teamId-1].id = teamId;
					list[teamId-1].scoreList = new int[k+1];
				}
				
				list[teamId-1].scoreList[problemNum] = Math.max(score, list[teamId-1].scoreList[problemNum]);
				list[teamId-1].submitNum++;
				list[teamId-1].lastSubmit = i;
			}
			
			for(int i=0;i<n;i++) {
				int sum =0;
				for(int j=1;j<=k;j++) {
					sum+= list[i].scoreList[j];
				}
				list[i].totalScore = sum;
			}
			Arrays.sort(list,new Comparator<Team>() {
				@Override
				public int compare(Team o1, Team o2) {
					if(o1.totalScore==o2.totalScore) {
						if(o1.submitNum==o2.submitNum) {
							return o1.lastSubmit-o2.lastSubmit;
						}
						return o1.submitNum-o2.submitNum;
					}
					return o2.totalScore-o1.totalScore;//점수는 높은 게 좋다.(내림차순)
				}
			});
			for(int i=0;i<n;i++) {
				if(list[i].id==t) {
					bw.append(String.valueOf(i+1)+"\n");
				}
			}
		}
		bw.flush();
		bw.close();
		br.close();
		
	}

}
