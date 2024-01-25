package dynamic_programming;

import java.util.Scanner;

public class Knapsack2 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int testNum = kb.nextInt();
		int limit = kb.nextInt();
		int [] dy = new int[limit+1];
		for(int i=0;i<testNum;i++) {
			int score = kb.nextInt();
			int time = kb.nextInt();
			
			for(int j=limit;j>=time;j--) {
				dy[j] = Math.max(dy[j],dy[j-time]+score);
			}
		}
		System.out.println(dy[limit]);

	}

}
