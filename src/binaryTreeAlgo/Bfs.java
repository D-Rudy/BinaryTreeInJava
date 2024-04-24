package binaryTreeAlgo;

import java.util.LinkedList;
import java.util.Queue;

//Algorithme de parcour en largeur: BFS
public class Bfs {

	public static <T> void breadthFirst(Node<T> root) {

		if (root == null) {
			return;
		}

		Queue<Pair<Node<T>, Integer>> queue = new LinkedList<>();

		int level = 0;
		queue.add(new Pair<>(root, level));

		// Tant que queue n'est pas vide:
		while (!queue.isEmpty()) {

			// On enleve le premier entré
			Pair<Node<T>, Integer> pair = queue.remove();
			System.out.print(pair + "->");

			level = pair.getValue() + 1;

			// Si l'enfant gauche n'est pas vide on l'ajoute
			Node<T> leftChild = pair.getKey().getLeftChild();
			if (leftChild != null) {
				queue.add(new Pair<>(leftChild, level));
			}
			// Si l'enfant droit n'est pas vide on l'ajoute
			Node<T> rightChild = pair.getKey().getRightChild();
			if (rightChild != null) {
				queue.add(new Pair<>(rightChild, level));
			}
		}
	}
}
