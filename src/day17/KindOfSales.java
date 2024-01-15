package day17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class KindOfSales {
	public ArrayList<Integer> solution(int n, int k ,int[] arr){
		ArrayList<Integer> answer = new ArrayList<>();
		HashMap<Integer,Integer>map = new HashMap<>();
		
		for(int i = 0;i<k-1;i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		int lt = 0;
		for(int rt = k-1;rt<n;rt++) {
			map.put(arr[rt], map.getOrDefault(arr[rt], 0)+1);
			answer.add(map.size());
			map.put(arr[lt], map.get(arr[lt])-1);
			if(map.get(arr[lt])==0) map.remove(arr[lt]);
			lt++;
		}
		return answer;
	}
	public int[] sol(int n, int m, int[] arr) {
		int[] answer = new int[m];
		
		HashMap<Integer,Integer>map = new HashMap<>();
		for(int i=0;i<n-m+1;i++) {
			for(int j=i;j<m+i;j++) {
				if(i==0) {
					map.put(arr[j], map.getOrDefault(arr[j], 0)+1);
				}
				else {
					map.put(arr[j], map.getOrDefault(arr[j], 0)+1);
				}
			}
			answer[i] = map.size();
			map.clear();
		}
		return answer;
	}

	public static void main(String[] args) {
		KindOfSales ex = new KindOfSales();
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = kb.nextInt();
		}
		
		for(int x : ex.solution(n,m,arr)) System.out.print(x+" ");
	}
	

}
