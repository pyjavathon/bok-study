package day14;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {

	public int solution(int n, int[] arr) {
		int answer = 1,max = arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
				answer++;
			}
		}
		return answer;
	}
	public int sol(int[] arr) {
		int answer = 1;
		int lt=0, rt=1;
		while(lt!=arr.length-1) {
			if(arr[lt]<arr[rt]) {
				answer++;
				lt = rt;
				rt++;
			}else {
				rt++;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		Student ex = new Student();
		int n = kb.nextInt();
		int [] arr = new int[n];
		for(int i =0;i<n;i++) {
			arr[i] = kb.nextInt();
		}
		
		System.out.println(ex.sol(arr));
	}

}
