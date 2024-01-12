package day14;

import java.util.ArrayList;
import java.util.Scanner;

public class Play {
	
	public String soluition(int n, int[] a, int[] b) {
		String answer="";
		for(int i =0;i<n;i++) {
			if(a[i]==b[i])answer+="D";
			else if(a[i]==1 && b[i]==3) answer+="A";
			else if(a[i]==2 && b[i]==1) answer+="A";
			else if(a[i]==3 && b[i]==2) answer+="A";
			else answer+="B";
		}
		return answer;
	}
	public ArrayList<String> sol(int n, int[]A, int[] B) {
		ArrayList<String> list = new ArrayList<>();
		for(int i =0;i<n;i++) {
			if(Math.abs(A[i]-B[i])==1) {
				if(A[i]>B[i])list.add("A");
				else list.add("B");
			}
			else if(Math.abs(A[i]-B[i])==2) {
				if(A[i]>B[i])list.add("B");
				else list.add("A");
			}else list.add("D");
		}
		return list;
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		Play ex = new Play();
		
		int n = kb.nextInt();
		int[] A = new int[n];
		int[] B = new int[n];
		
		for(int i=0;i<n;i++) {
			A[i] = kb.nextInt();
		}
		for(int i=0;i<n;i++) {
			B[i] = kb.nextInt();
		}
		
		for(String s:ex.sol(n,A,B)) System.out.println(s);
	}

}
