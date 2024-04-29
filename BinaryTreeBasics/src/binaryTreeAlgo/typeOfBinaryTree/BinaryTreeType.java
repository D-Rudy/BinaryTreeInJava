package binaryTreeAlgo.typeOfBinaryTree;

import java.util.Map;

import binaryTreeAlgo.data.Node;
import binaryTreeAlgo.parcours.Depth;

public class BinaryTreeType {

	public static <T> boolean isBalanced(Node<T> root, Map<Node<T>, Integer> nodeHeightMap) {
		if (root == null) {
			return true;
		}
		boolean isLeftBalanced = isBalanced(root.getLeftChild(), nodeHeightMap);
		boolean isRightBalanced = isBalanced(root.getRightChild(), nodeHeightMap);

		// Recuprer la valeur de l'enfant, s'il y en a pas la valeur par défaut est 0
		int leftHeight = nodeHeightMap.getOrDefault(root.getLeftChild(), 0);
		int rightHeight = nodeHeightMap.getOrDefault(root.getRightChild(), 0);

		// Ajouter la hauteur de l'arbre actuel a la map
		nodeHeightMap.put(root, Math.max(leftHeight, rightHeight) +1);

		if (Math.abs(leftHeight - rightHeight) <= 1) {
			return isLeftBalanced && isRightBalanced;
		}
		return false;
	}

	public static <T> boolean isComplete(Node<T> root, int currNodeIndex, int totalNodes) {
		if (root == null) {
			return true;
		}
		if (currNodeIndex >= totalNodes) {
			return false;
		}
		// Calcul de la valeur des index
		int leftChildIndex = 2 * currNodeIndex + 1;
		int rightChildIndex = 2 * currNodeIndex + 2;

		// si le sous arbre droit est complet et le sous arbre gauche est complet
		return isComplete(root.getLeftChild(), leftChildIndex, totalNodes)
				&& isComplete(root.getRightChild(), rightChildIndex, totalNodes);
	}

	public static <T> void mirror(Node<T> root) {
		if (root == null) {
			return;
		}

		Node<T> tmp = root.getLeftChild();

		root.setLeftChild(root.getRightChild());
		root.setRightChild(tmp);

		mirror(root.getLeftChild());
		mirror(root.getRightChild());
	}

	public static <T> boolean isFull(Node<T> root) {
		if (root == null) {
			return true;
		}
		if (root.getLeftChild() == null && root.getRightChild() == null) {
			return true;
		}
		if (root.getLeftChild() != null && root.getRightChild() != null) {
			return isFull(root.getLeftChild()) && isFull(root.getRightChild());
		}
		return false;
	}

	public static <T> boolean isPerfectRecursive(Node<T> root, int leftDepth, int currentLevel) {
		if (root == null) {
			return true;
		}
		// vérifie si c'est une feuille
		if (root.getLeftChild() == null && root.getRightChild() == null) {
			return currentLevel == leftDepth;
		}
		// vérifie s'il le noeuds n'a qu'un enfant
		if (root.getLeftChild() == null || root.getRightChild() == null) {
			return false;
		}

		return isPerfectRecursive(root.getLeftChild(), leftDepth, currentLevel + 1)
				&& isPerfectRecursive(root.getRightChild(), leftDepth, currentLevel + 1);
	}

	public static <T> boolean isPerfect(Node<T> root) {

		int leftDepth = Depth.leftDepth(root);

		return isPerfectRecursive(root, leftDepth, 0);
	}
}
