package day3_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class B_2668 {
	static int N;
	static int[] arr;
	static boolean[] isVisited;
	static ArrayList<Integer> list;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N+1];
		
		for(int i=1;i<=N;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		list = new ArrayList<>();
		isVisited = new boolean[N+1];
		
		for(int i=1;i<=N;i++) {
			isVisited[i] = true;
			dfs(i,i);
			isVisited[i] = false;
		}
		
		Collections.sort(list);
		System.out.println(list.size());
		for(int i=0;i<list.size();i++)System.out.println(list.get(i));
	}
	
	static void dfs(int start, int target) {
		if(!isVisited[arr[start]]) {
			isVisited[arr[start]] = true;
			dfs(arr[start], target);
			isVisited[arr[start]] = false;
		}
		
		if(arr[start]==target) {
			list.add(target);
		}
	}

}
