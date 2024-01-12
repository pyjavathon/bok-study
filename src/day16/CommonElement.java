package day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class CommonElement {
	public ArrayList<Integer> solution(int n, int m, int[]a ,int[] b){
		ArrayList<Integer> answer = new ArrayList<>();
		Arrays.sort(a);
		Arrays.sort(b);
		
		int p1=0,p2=0;
		while(p1<n &&p2<m) {
			if(a[p1]==b[p2]) {
				answer.add(a[p1++]);
				p2++;
			}
			else if(a[p1]<b[p2]) p1++;
			else p2++;
		}
		return answer;
	}
	public ArrayList<Integer> sol(int n, int m, int[] a, int[] b){
		ArrayList<Integer> answer = new ArrayList<>();
		int p1 = 0;
		while(p1<n) {
			for(int i=0;i<m;i++) {
				if(a[p1]==b[i]) answer.add(b[i]);
			}
			p1++;
		}
		answer.sort(Comparator.naturalOrder());
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		CommonElement ex = new CommonElement();
		int n = kb.nextInt();
		int[] a = new int[n];
		for(int i =0;i<n;i++) {
			a[i] = kb.nextInt();
		}
		int m = kb.nextInt();
		int[] b = new int[m];
		for(int i =0;i<m;i++) {
			b[i] = kb.nextInt();
		}
		
		for(int x:ex.sol(n,m,a,b)) System.out.print(x+" ");
	}

}
