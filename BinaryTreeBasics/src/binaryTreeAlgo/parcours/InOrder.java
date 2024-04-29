package binaryTreeAlgo.parcours;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

import binaryTreeAlgo.data.Node;

public class InOrder {

	public static <T> void inOrderRecursive(Node<T> root) {

		if (root == null) {
			return;
		}
		inOrderRecursive(root.getLeftChild());
		System.out.print(root.getData() + "->");
		inOrderRecursive(root.getRightChild());
	}

	public static <T> void inOrder(Node<T> root) {
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

				if (top.getRightChild() != null) {
					stack.push(top.getRightChild());
				}
				stack.push(top);
				// Comme on traite l'enfant gauche en premier, on le place a la fin de la boucle
				if (top.getLeftChild() != null) {
					stack.push(top.getLeftChild());
				}
			}
		}
	}

}
