package binaryTreeAlgo;

//Classe qui permet de verifier si tout un niveau a été visité avant de passer au suivant
public class Pair <K, V> {
	private K key;
	private V value;
	
	public Pair(K key, V value) {
		this.key  = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}
	
	@Override
	public String toString () {
		return "{" + key + " ," + value + "}";
	}

}