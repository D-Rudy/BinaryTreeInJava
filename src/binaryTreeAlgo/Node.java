package binaryTreeAlgo;

//Classe générique:permet de stocker tous type de données 
public class Node<T> {
	
	private T data;
	
	private Node<T> leftChild;
	private Node<T> rightChild;
	
	public Node(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(Node<T> leftChild) {
		this.leftChild = leftChild;
	}

	public Node<T> getRightChild() {
		return rightChild;
	}

	public void setRightChild(Node<T> rightChild) {
		this.rightChild = rightChild;
	}
	/*
	@Override//Main
	public String toString() {
		return "\nData: " + data.toString() + "\nLeft child: " + ((leftChild == null) ? "" : leftChild.getData()) + "Right child: " + ((rightChild == null) ? "" : rightChild.getData() + "\n********\n");
	}
	*/
    @Override//breadFirst
    public String toString() {
        return data.toString();     
    }
}
