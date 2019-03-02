package com.soumyadeep.recursion;

public class RecursionJavatpoint {

	/*
	 * What is Recursion? The process in which a function calls itself directly or
	 * indirectly is called recursion and the corresponding function is called as
	 * recursive function. Using recursive algorithm, certain problems can be solved
	 * quite easily. Examples of such problems are Towers of Hanoi (TOH),
	 * Inorder/Preorder/Postorder Tree Traversals, DFS of Graph, etc.
	 */

	static int count = 0;

	static void p() {
		count++;
		if (count <= 5) {
			System.out.println("hello " + count);
			p();
		}
	}

	public static void main(String[] args) {
		p();
	}
}
