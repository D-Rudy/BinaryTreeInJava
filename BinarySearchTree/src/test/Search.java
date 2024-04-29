package test;

public class Search {

	public static Node<Integer> lookup(Node<Integer> root, int data) {
		if (root == null) {
			return null;
		}
		if (root.getData() == data) {
			return root;
		}
		if (data <= root.getData()) {
			System.out.println("\n" + data + " <= " + root.getData() + " recherche dans le sous arbre de gauche...");
			return lookup(root.getLeftChild(), data);
		} else {
			System.out.println("\n" + data + " > " + root.getData() + " recherche dans le sous arbre de droite...");
			return lookup(root.getRightChild(), data);
		}
	}

	public static Integer minimumValue(Node<Integer> root) {
		int minVal = Integer.MAX_VALUE;
		while (root != null) {
			minVal = root.getData();
			System.out.println("\n actuellement au noeud " + root.getData() + " vers le sous-arbre de gauche");
			root = root.getLeftChild();
		}
		return minVal;
	}

	public static Integer maximumValue(Node<Integer> root) {
		int maxVal = Integer.MIN_VALUE;
		while (root != null) {
			maxVal = root.getData();
			System.out.println("\n actuellement au noeud " + root.getData() + " vers le sous-arbre de droite");
			root = root.getRightChild();
		}
		return maxVal;
	}

	public static void printRange(Node<Integer> root, int low, int high) {
		if (root == null) {
			return;
		}

		if (low <= root.getData()) {
			printRange(root.getLeftChild(), low, high);
		}
		if (low <= root.getData() && root.getData() <= high) {
			System.out.println(root.getData());
		}
		if (high > root.getData()) {
			printRange(root.getRightChild(), low, high);
		}
	}

	public static boolean isBinarySearchTree(Node<Integer> root) {
		
		
		if (root == null) {
			return true;
		}
		
		if (root.getLeftChild() != null) {
			if (root.getLeftChild().getData() > root.getData()) {
				return false;
			}
		}
		
		if (root.getRightChild() != null) {
			if (root.getRightChild().getData() <= root.getData()) {
				return false;
			}
		}
		
		return isBinarySearchTree(root.getLeftChild()) && isBinarySearchTree(root.getRightChild());
	}
}
