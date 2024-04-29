package test;

import java.util.LinkedList;
import java.util.Queue;

public class Utils {



	public static <T> void breadthFirst(Node<T> root) {
		if (root == null) {
			return;
		}
		Queue<Pair<Node<T>, Integer>> queue = new LinkedList<>();
		int level = 0;
		queue.add(new Pair<>(root, level));
		while (!queue.isEmpty()) {
			Pair<Node<T>, Integer> pair = queue.remove();
			System.out.print(pair + "->");
			level = pair.getValue() + 1;
			Node<T> leftChild = pair.getKey().getLeftChild();
			if (leftChild != null) {
				queue.add(new Pair<>(leftChild, level));
			}
			Node<T> rightChild = pair.getKey().getRightChild();
			if (rightChild != null) {
				queue.add(new Pair<>(rightChild, level));
			}
		}
	}

	// Verifie que l'arbre binaire est correctement formé
	public static void inOrder(Node<Integer> root) {
		if (root == null) {
			return;
		}
		inOrder(root.getLeftChild());
		System.out.print(root.getData() + " -> ");
		inOrder(root.getRightChild());
	}
}
