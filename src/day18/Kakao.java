package day18;

import java.util.Scanner;
import java.util.Stack;

public class Kakao {
	public int solution(int[][]board, int[] moves) {
		int answer = 0;
		
		Stack<Integer> stack = new Stack<>();
		
		for(int pos: moves) {
			for(int i=0;i<board.length;i++) {
				if(board[i][pos-1]!=0) {
					int tmp = board[i][pos-1];
					board[i][pos-1] = 0;
					if(!stack.isEmpty() && tmp == stack.peek()) {
						answer +=2;
						stack.pop();
					}
					else stack.push(tmp);
					break;
				}
				
			}
		}
		
		return answer;
	}
	
	public int sol(int n,int[][] board, int m, int[] arr) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		
		for(int x : arr) {
			int i = 1;
			while(board[i][x]==0) {
				i++;
				if(i==n) break;
			}
			if(!stack.isEmpty() && stack.peek()==board[i][x]) {
				answer+=2;
				stack.pop();
			}
			else{
				stack.push(board[i][x]);
			}
			board[i][x]=0;
			
			
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		Kakao ex = new Kakao();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int[][] board = new int[n+1][n+1];

		for(int i = 1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				board[i][j]=kb.nextInt();
			}
		}
		int moves = kb.nextInt();
		int[] arr = new int[moves];
		
		for(int i=0;i<moves;i++) arr[i] = kb.nextInt();
		
		System.out.println(ex.sol(n,board,moves,arr));
	}

}
