package binaryTreeAlgo;

import java.util.HashMap;
import java.util.Scanner;

import binaryTreeAlgo.count.CountingNodes;
import binaryTreeAlgo.data.Node;
import binaryTreeAlgo.parcours.Bfs;
import binaryTreeAlgo.parcours.InOrder;
import binaryTreeAlgo.parcours.PostOrder;
import binaryTreeAlgo.parcours.PreOrder;
import binaryTreeAlgo.typeOfBinaryTree.BinaryTreeType;

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
			Node<String> j = new Node<>("Janet");



			Node<Integer> one = new Node<>(1);
			Node<Integer> two = new Node<>(2);
			Node<Integer> three = new Node<>(3);
			Node<Integer> four = new Node<>(4);
			Node<Integer> five = new Node<>(5);
			Node<Integer> six = new Node<>(6);
			Node<Integer> seven = new Node<>(7);
			Node<Integer> eight = new Node<>(8);

			one.setLeftChild(two);
			one.setRightChild(three);

			three.setLeftChild(seven);
			three.setRightChild(six);

			seven.setLeftChild(eight);

			six.setLeftChild(five);
			six.setRightChild(four);

			System.out.println("\nQuel algorithme a tester?: ");
			System.out.println("""
					1- Parcourir un arbre
					2- Compter les noeuds
					3- type d'arbre
					""");
			choix = sc.nextLine();
			if (choix.equals("1")) {
				
				a.setLeftChild(b);
				a.setRightChild(c);

				b.setLeftChild(d);
				b.setRightChild(e);

				c.setLeftChild(f);
				c.setRightChild(g);

				d.setLeftChild(h);
				d.setRightChild(i);
				
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
			}
			if (choix.equals("2")) {
				
				a.setLeftChild(b);
				a.setRightChild(c);

				b.setLeftChild(d);
				b.setRightChild(e);

				c.setLeftChild(f);
				c.setRightChild(g);

				d.setLeftChild(h);
				d.setRightChild(i);
				
				System.out.println("""
						1- compter le nombre de noeuds
						2- calculer la profondeur max
						3- vérifier la somme d'un chemin

						""");
				choix = sc.next();
				switch (choix) {
				case "1":
					System.out.println("Nb de noeuds de l'arbre actuel: " + CountingNodes.countNodes(a));
					break;
				case "2":
					CountingNodes.maxDepth(a);
					break;
				case "3":
					System.out.println("Entrer une somme (entier)");
					int currentSum = sc.nextInt();
					if (CountingNodes.hasPathSum(one, currentSum)) {
						System.out.printf("\nIl existe un chemin dont la somme est %d ", currentSum);
					} else {
						System.out.printf("\nIl n'y a pas de chemin dont la somme est %d", currentSum);
					}
					System.out.println("\n----------\n");
				}

			}
			if (choix.equals("3")) {
				a.setLeftChild(b);
				a.setRightChild(c);

				c.setLeftChild(d);
				c.setRightChild(e);
				
				e.setRightChild(i);
				//d.setLeftChild(f);
				//d.setRightChild(h);
				
				b.setLeftChild(f);
				//b.setRightChild(g);
				
				//c.setLeftChild(e);
				//c.setRightChild(f);
				f.setLeftChild(h);
				//f.setRightChild(i);
				System.out.println("""
						1- Reflexion d'un arbre
						2- Arbre complet
						3- Arbre parfait
						4- arbre presque parfait
						5- Arbre binaire équilibré

						""");
				choix = sc.next();
				switch (choix) {
				case "1":
					System.out.println("Original {noeud, niveau}: ");
					Bfs.breadthFirst(one);
					System.out.println();
					System.out.println("Reflection: ");
					BinaryTreeType.mirror(one);
					Bfs.breadthFirst(one);
					break;
				case "2":
					if(BinaryTreeType.isFull(a)) {
					System.out.println("Cet arbre est un arbre binaire complet");}
					else {
						System.out.println("ce n'est pas un arbre binaire complet");
					}
					System.out.println("\n----------\n");
					break;
				case "3":
					if(BinaryTreeType.isPerfect(a)) {
					System.out.println("Cet arbre est un arbre binaire parfait");}
					else {
						System.out.println("ce n'est pas un arbre binaire parfait");
					}
					System.out.println("\n----------\n");
					break;
				case "4":
					if(BinaryTreeType.isComplete(a, 0, CountingNodes.countNodes(a))) {
					System.out.println("Cet arbre est un arbre binaire presque complet");}
					else {
						System.out.println("ce n'est pas un arbre binaire presque complet");
					}
					System.out.println("\n----------\n");
					break;
				case "5":
					if(BinaryTreeType.isBalanced(a, new HashMap<Node<String>, Integer>())) {
					System.out.println("Cet arbre est un arbre équilibré");}
					else {
						System.out.println("ce n'est pas un arbre équilibré");
					}
					System.out.println("\n----------\n");
					break;
				}

			}
		} while (choix != "0");
	}

}
