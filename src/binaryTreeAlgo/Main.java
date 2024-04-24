package binaryTreeAlgo;

import java.util.Scanner;

public class Main {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String choix = "0";

		do {
			Node<String> a = new Node<>("Alice");
			Node<String> b = new Node<>("Bob");
			Node<String> c = new Node<>("Charles");
			Node<String> d = new Node<>("Dora");
			Node<String> e = new Node<>("Elsa");
			Node<String> f = new Node<>("Fiona");
			Node<String> g = new Node<>("Greg");
			Node<String> h = new Node<>("Harry");
			Node<String> i = new Node<>("Irene");

			a.setLeftChild(b);
			a.setRightChild(c);

			b.setLeftChild(d);
			b.setRightChild(e);

			c.setLeftChild(f);
			c.setRightChild(g);

			d.setLeftChild(h);
			d.setRightChild(i);
			
			System.out.println("\nQuel algorithme a tester?: ");
			System.out.println("""
					1- parcours en largeur
					2- infixe pile
					3- infixe recursif
					4- postfixe pile
					5- postfixe récursif
					6- préfixe pile
					7- préfixe récursif
					8- quitter
					""");
			choix = sc.next();

			switch (choix) {
			case "1":
				System.out.println("parcours en largeur");
				Bfs.breadthFirst(a);
				break;
			case "2":
				System.out.println("Infixe avec pile");
				InOrder.inOrder(a);
				break;
			case "3":
				System.out.println("Infixe recursif");
				InOrder.inOrderRecursive(a);
				break;
			case "4":
				System.out.println("postfixe avec pile");
				PostOrder.postOrder(a);
				break;
			case "5":
				System.out.println("postfixe recursif");
				PostOrder.postOrderRecursive(a);
				break;
			case "6":
				System.out.println("préfixe avec pile");
				PreOrder.preOrder(a);
				break;
			case "7":
				System.out.println("préfixe recursif");
				PreOrder.preOrderRecursive(a);
				break;
			case "8":
				System.out.println("Sortie....");
				return;
			default:
				System.out.println("Choisir un chiffre entre 1 et 9");
				break;
			}
		} while (choix != "0");
	}

}
