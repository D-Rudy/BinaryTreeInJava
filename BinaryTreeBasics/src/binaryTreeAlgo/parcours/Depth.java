package binaryTreeAlgo.parcours;

import binaryTreeAlgo.data.Node;

public class Depth {

	public static <T> int leftDepth(Node<T> root) {
		int leftDepth = 0;
		Node<T> node = root;

		while (node != null) {
			leftDepth++;
			node = node.getLeftChild();
		}
		
		return leftDepth - 1;
	}
}
