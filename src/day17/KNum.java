package day17;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class KNum {
	
	public int sol(int n, int k, int[] arr) {
		int answer = -1;
		TreeSet<Integer> tSet = new TreeSet<>(Collections.reverseOrder());
		for(int i=0;i<n;i++) {
			for(int j = i+1;j<n;j++) {
				for(int l = j+1;l<n;l++) {
					tSet.add(arr[i]+arr[j]+arr[l]);
				}
			}
		}
		int cnt=0;
		for(int x: tSet) {
			cnt++;
			if(cnt==3)return x;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		KNum ex = new KNum();
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];
		for(int i =0;i<n;i++) {
			arr[i] = kb.nextInt();
		}
		System.out.println(ex.sol(n,k, arr));
	}

}
