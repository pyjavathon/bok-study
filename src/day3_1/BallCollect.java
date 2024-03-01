package day3_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BallCollect {
	
	public int solution(int N, char[] arr) {
		
		int answer = Integer.MAX_VALUE;
		int firstBallCnt = 0;
		int redCnt = 0;
		int blueCnt = 0;
		
		for(int i=0;i<N;i++) {
			if(arr[i]=='R')redCnt++;
			else blueCnt++;
		}
		
		for(int i=0;i<N;i++) {
			if(arr[i]=='R') firstBallCnt +=1;
			else break;
		}
		answer = Math.min(answer, redCnt-firstBallCnt);
		
		firstBallCnt = 0;
		
		for(int i=N-1;i>=0;i--) {
			if(arr[i]=='R') firstBallCnt+=1;
			else break;
		}
		answer = Math.min(answer, redCnt-firstBallCnt);
		firstBallCnt = 0;
		
		for(int i=0;i<N;i++) {
			if(arr[i]=='B') firstBallCnt +=1;
			else break;
		}
		answer = Math.min(answer, blueCnt-firstBallCnt);
		firstBallCnt=0;
		
		for(int i=N-1;i>=0;i--) {
			if(arr[i]=='B') firstBallCnt+=1;
			else break;
		}
		answer = Math.min(answer, blueCnt-firstBallCnt);
		return answer;
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		char[] arr = new char[N];
		arr = br.readLine().toCharArray();
		BallCollect main = new BallCollect();
		System.out.println(main.solution(N,arr));
		
	}

}
