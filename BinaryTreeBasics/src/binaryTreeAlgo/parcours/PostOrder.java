package binaryTreeAlgo.parcours;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

import binaryTreeAlgo.data.Node;

public class PostOrder {

	public static <T> void postOrderRecursive(Node<T> root) {

		if (root == null) {
			return;
		}

		postOrderRecursive(root.getLeftChild());
		postOrderRecursive(root.getRightChild());
		System.out.print(root.getData() + "->");
	}

	public static <T> void postOrder(Node<T> root) {

		if (root == null) {
			return;
		}

		Set<Node<T>> visitedNodes = new HashSet<>();
		Stack<Node<T>> stack = new Stack<>();

		stack.push(root);

		while (!stack.isEmpty()) {
			Node<T> top = stack.pop();

			if (top.getLeftChild() == null && top.getRightChild() == null) {
				System.out.print(top + "->");
			} else if (visitedNodes.contains(top)) {
				System.out.print(top + "->");
			} else {
				visitedNodes.add(top);

				stack.push(top);

				if (top.getRightChild() != null) {
					stack.push(top.getRightChild());
				}
				if (top.getLeftChild() != null) {
					stack.push(top.getLeftChild());
				}
			}
		}
	}
}
