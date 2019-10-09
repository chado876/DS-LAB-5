
public class Node {
	public GiftBasket data;
	public Node next;
	
	public Node() {
		this.data = data;
		this.next = next;
	}

	public Node(GiftBasket data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}

	public GiftBasket getData() {
		return data;
	}

	public void setData(GiftBasket data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	
}
