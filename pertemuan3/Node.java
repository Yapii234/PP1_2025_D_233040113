package pertemuan3;


public class Node {
	private int data;
	Node next;
	
	public Node getNext() {
	return next;
	}
	public void setNext(Node next) {
	this.next = next;
	}
	public int getData() {
	return data;
	}
	public void setData(int data) {
	this.data = data;
	}
	public Node(int data) {
		this.data = data;
		this.next = null;
}


}
