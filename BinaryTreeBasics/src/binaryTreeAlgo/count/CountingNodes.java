package binaryTreeAlgo.count;

import binaryTreeAlgo.data.Node;

public class CountingNodes {
	public static <T> int countNodesComplete(Node<T> root) {
		
		if (root == null) {
			return 0;
		}
		
		return 1 + countNodes(root.getLeftChild()) + countNodes(root.getRightChild());
	}

	public static <T> int countNodes(Node<T> root) {
		// si pas de noeuds, on renvoi 0
		if (root == null) {
			return 0;
		}

		// On recupere le nombre de noeuds de chaque sous-arbre de facon recursif
		int numNodesLeft = countNodes(root.getLeftChild());
		int numNodesRight = countNodes(root.getRightChild());

		// On renvoi 1 (le noeuds actuel, + le nombre de noeuds chaque sous-arbre
		return 1 + numNodesLeft + numNodesRight;
	}

	public static <T> int maxDepth(Node<T> root) {
		if (root == null) {
			return 0;
		}
		if (root.getLeftChild() == null && root.getRightChild() == null) {
			System.out.println(
					"\nEn partant de " + root + "\nprofondeur maximal: " + 0 + "\nC'est une feuille\n----------");
			return 0;
		}
		int leftMaxDepth = maxDepth(root.getLeftChild());
		int righMaxDepth = maxDepth(root.getRightChild());

		int maxDepth = 1 + Math.max(leftMaxDepth, righMaxDepth);
		System.out.println(
				"En partant de " + root + "\nprofondeur max gauche: " + leftMaxDepth + "\nprofondeur maximal droit: "
						+ righMaxDepth + "\nprofondeur maximale de cet arbre:" + maxDepth + "\n----------");
		return maxDepth;
	}

	public static boolean hasPathSum(Node<Integer> root, int currentSum) {
		if (root == null) {
			return false;
		}
		// Verifier si noeud == feuille
		if (root.getLeftChild() == null && root.getRightChild() == null) {
			return currentSum == root.getData();
		}
		// On déduit la somme du noeud a la valeur actuelle a chaque itération
		boolean hasPathSumLeft = hasPathSum(root.getLeftChild(), currentSum - root.getData());
		boolean hasPathSumRight = hasPathSum(root.getRightChild(), currentSum - root.getData());

		boolean hasPathSum = hasPathSumLeft || hasPathSumRight;

		System.out.println("\nLe noeud " + root + "\nChemin gauche = " + hasPathSumLeft + "\nChemin droit= "
				+ hasPathSumRight + "\nChemin est egal a " + currentSum + " : " + hasPathSum + "\n----------");
		return hasPathSum;
	}

}
