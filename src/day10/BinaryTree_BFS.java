package day10;

import java.util.LinkedList;
import java.util.Queue;

class Node{
	Node lt, rt;
	int data;
	public Node(int val) {
		data = val;
		lt = rt = null;
	}
}
public class BinaryTree_BFS {
	Node root;
	
	public void bfs(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		int L = 0;
		while(!q.isEmpty()) {
			int len = q.size();
			System.out.print(L+" : ");
			for(int i = 0; i< len; i++) {
				Node cur = q.poll();
				System.out.print(cur.data+" ");
				if(cur.lt!=null)q.add(cur.lt);
				if(cur.rt!=null)q.add(cur.rt);
			}
			L++;
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		BinaryTree_BFS tree = new BinaryTree_BFS();
		tree.root = new Node(1);
		tree.root.lt=new Node(2); 
        tree.root.rt=new Node(3); 
        tree.root.lt.lt=new Node(4); 
        tree.root.lt.rt=new Node(5); 
		tree.root.rt.lt=new Node(6); 
        tree.root.rt.rt=new Node(7);
        tree.bfs(tree.root);
		
	}
	public Node getRoot() {
		return root;
	}
	public void setRoot(Node root) {
		this.root = root;
	}
}
