package BinarySearchTrees;

import java.util.Scanner;

class Node {
	Node left, right; //what is it?
	int data;

	// Constructor
	Node(int data) {
		this.data = data;
		left = right = null;
	}
}

public class Solution {

	public static int getHeight(Node root) {
		int heightLeft = 0;
		int heightRight = 0;

		if (root.left != null) {
			heightLeft = getHeight(root.left) + 1;
		}
		if (root.right != null) {
			heightRight = getHeight(root.right) + 1;
		}
		return (heightLeft > heightRight ? heightLeft : heightRight);
	}

	public static Node insert(Node root, int data) {
		System.out.println("data : " + data);
		if (root == null) {
			// First create root node
			return new Node(data);
		} else {
			Node cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
				System.out.println("left");
			} else {
				cur = insert(root.right, data);
				root.right = cur;
				System.out.println("right");
			}
			
			System.out.println("cur.data: " + cur.data);
			return root;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		// The root is the first input data
		Node root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		
		//System.out.println("root is: " + root.data);
		// int height = getHeight(root);
		// System.out.println(height);
	}
}
