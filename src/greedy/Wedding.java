package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Friend implements Comparable<Friend>{
	int come, leave;
	public Friend(int c, int l) {
		this.come = c;
		this.leave = l;
	}
	@Override
	public int compareTo(Friend f) {
		if(this.come==f.come) return this.leave-f.leave;
		else return this.come-f.come;
	}
}
public class Wedding {
	public int sol(int n, ArrayList<Friend> list) {
		int dap = Integer.MIN_VALUE; 
		for(int i=0;i<n-1;i++) {
			int cnt = 1;
				for(int j=i+1;j<n;j++) {
					if(list.get(i).leave>list.get(j).come) {
						cnt++;

					}
					
					else break;
			}
				dap = Math.max(dap, cnt);
		}
		return dap;
	}

	public static void main(String[] args) {
		Wedding ex = new Wedding();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Friend> list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			int s = kb.nextInt();
			int e = kb.nextInt();
			list.add(new Friend(s,e));
		}
		Collections.sort(list);

		System.out.println(ex.sol(n,list));
	}

}
