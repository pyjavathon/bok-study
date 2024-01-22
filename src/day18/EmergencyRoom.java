package day18;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person{
	int id;
	int priority;
	public Person(int id, int priority) {
		this.id = id;
		this.priority = priority;
	}
}


public class EmergencyRoom {
	
	public int solution(int n , int m , int[] arr) {
		int answer = 0;
		Queue<Person> q = new LinkedList<>();
		for(int i =0;i<n;i++) {
			q.offer(new Person(i,arr[i]));
		}
		while(!q.isEmpty()) {
			Person tmp = q.poll();
			for(Person x : q) {
				if(x.priority>tmp.priority) {
					q.offer(tmp);
					tmp = null;
					break;
				}
			}
			if(tmp!=null) {
				answer++;
				if(tmp.id==m) return answer;
			}
		}
		return answer;
	}
	public int sol(int n, int m,Integer[] arr) {
		int answer = 0;
		int tmp = arr[m];
		Queue<Integer> q = new LinkedList<>();
		Arrays.sort(arr, Collections.reverseOrder());
		for(int i = 0;i<arr.length;i++) {
			if(tmp == arr[i]) return i+1;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		EmergencyRoom ex = new EmergencyRoom();
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		
		int m = kb.nextInt();
		Integer[] arr = new Integer[n];
		for(int i = 0; i<n;i++) arr[i] = kb.nextInt();
		System.out.println(ex.sol(n,m,arr));
	}

}
