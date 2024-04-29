package test;

public class Insertion {

	//Data est la valeur a insérer dans l'arbre
	public static Node<Integer> insert(Node<Integer> root, int data) {

		if (root == null) {
			return new Node<Integer>(data);
		}

		if (data <= root.getData()) {

			root.setLeftChild(insert(root.getLeftChild(), data));
		} else {

			root.setRightChild(insert(root.getRightChild(), data));
		}

		return root;
	}
}
