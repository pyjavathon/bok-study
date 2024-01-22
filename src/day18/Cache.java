package day18;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Cache {
	public int[] sol(int n, int m, int[] arr){
		int[] cache = new int[n];
		for(int x: arr) {
			int pos = -1;
			for(int i=0;i<n;i++) if(x==cache[i]) pos = i;
			
			if(pos==-1) {
				for(int i= n-1;i>=1;i--) {
					cache[i]=cache[i-1];
				}
			}
			else {
				for(int i=pos;i>=1;i--) {
					cache[i] = cache[i-1];
				}
			}
			cache[0]=x;
		}
		
		return cache;
	}

	public static void main(String[] args) {
		Cache ex = new Cache();
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int m = kb.nextInt();
		int [] arr = new int[m];
		for(int i=0;i<m;i++)arr[i] = kb.nextInt();
		
		for(int i: ex.sol(n,m,arr))System.out.print(i+" ");
	}

}
