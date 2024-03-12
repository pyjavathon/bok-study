package day3_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B_1244 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		boolean[] arr = new boolean[N+1];
		arr[0] = false;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=1;i<=N;i++) {
			if(0==Integer.parseInt(st.nextToken())) arr[i]=false;
			else arr[i]=true;
		}
		int M = Integer.parseInt(br.readLine());
		ArrayList<Student> list = new ArrayList<>();
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			list.add(new Student(s,num));
		}
		

		for(int i=0;i<list.size();i++) {
			if(list.get(i).sex==1) {
				int tmp = list.get(i).number;
				while(tmp<=N) {
					arr[tmp] = !arr[tmp];
					tmp+=tmp;
				}
			}
			else {
				int lt = list.get(i).number-1;
				int rt = list.get(i).number+1;
				arr[list.get(i).number] = !arr[list.get(i).number];
				while(arr[lt]==arr[rt]) {
					arr[lt]= !arr[lt];
					arr[rt] = !arr[rt];
					lt--;
					rt++;
				}
			}
		}
		
		for(int i=1;i<=N;i++) {
			if(arr[i]==true)System.out.print(1);
			else System.out.print(0);
			System.out.print(" ");
		}
		
	}
}
class Student{
	int sex;
	int number;
	
	public Student(int sex, int number) {
		this.sex = sex;
		this.number = number;
	}
	
}
