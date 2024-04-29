package test;

public class Main {

	public static void main(String[] args) {

		System.out.println("INSERTION\n************************\n");
		Node<Integer> eight = new Node<>(8);
		Insertion.insert(eight, 3);
		Insertion.insert(eight, 10);

		System.out.println("\n");
		Utils.breadthFirst(eight);

		Insertion.insert(eight, 1);
		Insertion.insert(eight, 14);

		System.out.println("\n");
		Utils.breadthFirst(eight);

		Insertion.insert(eight, 6);
		Insertion.insert(eight, 4);
		Insertion.insert(eight, 7);
		Insertion.insert(eight, 13);

		System.out.println("\n");
		Utils.breadthFirst(eight);

		System.out.println("\n\n dans l'ordre");
		Utils.inOrder(eight);

		Insertion.insert(eight, 2);
		System.out.println("\n");
		Utils.breadthFirst(eight);

		Insertion.insert(eight, 12);
		System.out.println("\n");
		Utils.breadthFirst(eight);

		System.out.println("\n\nLookup\n************************\n");
		Utils.breadthFirst(eight);
		System.out.println("\n\n dans l'ordre");
		Utils.inOrder(eight);

		System.out.println(Search.lookup(eight, 4));
		System.out.println("\n\n");
		System.out.println(Search.lookup(eight, 15));

		System.out.println("\nTROUVER LA VALEUR MINIMUM:\n************************\n");
		System.out.println("\n Valeur minimum: " + Search.minimumValue(eight));
		System.out.println("\n dans l'ordre: ");
		Utils.inOrder(eight);

		System.out.println("\nTROUVER LA VALEUR MAXIMUM:\n************************\n");
		System.out.println("\n Valeur maximum: " + Search.maximumValue(eight));
		System.out.println("\n dans l'ordre: ");
		Utils.inOrder(eight);
		
		Insertion.insert(eight, -10);
		System.out.println("\nTROUVER LA VALEUR MAXIMUM:\n************************\n");
		System.out.println("\n Valeur maximum: " + Search.maximumValue(eight));
		System.out.println("\n dans l'ordre: ");
		Utils.inOrder(eight);
		
		System.out.println("\nTROUVER LA VALEUR MINIMUM:\n************************\n");
		System.out.println("\n Valeur minimum: " + Search.minimumValue(eight));
		System.out.println("\n dans l'ordre: ");
		Utils.inOrder(eight);
		
		Insertion.insert(eight, 19);
		System.out.println("\nTROUVER LA VALEUR MAXIMUM:\n************************\n");
		System.out.println("\n Valeur maximum: " + Search.maximumValue(eight));
		System.out.println("\n dans l'ordre: ");
		Utils.inOrder(eight);
		
		Insertion.insert(eight, 22);
		
		System.out.println("\n dans l'ordre: ");
		Utils.inOrder(eight);
		
		System.out.println("\nAffichage de la plage 7 à 14: ");
		Search.printRange(eight, 7, 14);
		
		System.out.println("\nAffichage de la plage -1 à 5: ");
		Search.printRange(eight, -1, 5);
		
		System.out.println("\nDans l'ordre: ");
		Utils.inOrder(eight);

		System.out.println("\nC'est un arbre de recherche binaire?: " + Search.isBinarySearchTree(eight));
		
		Node<Integer> one = new Node<>(1);
		Node<Integer> two = new Node<>(2);
		Node<Integer> three = new Node<>(3);
		Node<Integer> four = new Node<>(4);
		Node<Integer> five = new Node<>(5);
		Node<Integer> six = new Node<>(6);
		Node<Integer> seven = new Node<>(7);
		//Node<Integer> eight = new Node<>(8);
		eight.setLeftChild(null);
		eight.setRightChild(null);
one.setLeftChild(two);
one.setRightChild(three);

three.setLeftChild(seven);
three.setRightChild(six);

seven.setLeftChild(eight);

six.setLeftChild(five);
six.setRightChild(four);

System.out.println("\nDans l'ordre: ");
Utils.inOrder(one);

System.out.println("\nC'est un arbre de recherche binaire?: " + Search.isBinarySearchTree(one));
	}

}
