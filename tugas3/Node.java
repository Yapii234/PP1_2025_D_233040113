package tugas3;


public class Node {
	private double data;
	Node next;
	
	public Node getNext() {
	return next;
	}
	public void setNext(Node next) {
	this.next = next;
	}
	public double getData() {
	return data;
	}
	public void setData(double data) {
	this.data = data;
	}
	public Node(double data) {
		this.data = data;
		this.next = null;

	}
}
