
public class GiftList {
	public Node head;
	
	public GiftList() {
	 this.head = head;
	}

	public boolean isEmpty() {
		
		if (head == null) {
			 return true;
		} else {
			return false;
		}
	}
	
	public boolean isFull() {
	Node temp = new Node();
	
		
		if (temp == null) {
			 return true;
		} else {
			temp = null;
			return false;
		}

	}
	
	public boolean addGiftBasketToEnd(GiftBasket giftbasket) {
		if(isFull()) {
			   System.out.println("List is full, unable to back");
			   return false;
		   } else {
			   Node nextItem = new Node();
			   nextItem.setData(giftbasket);
			   		if(isEmpty()) {
			   			head = nextItem;
		   } else {
			   Node current = head;
			   while(current.getNext()!=null) {
				   current = current.getNext();
			   }
			   current.setNext(nextItem);
		   }
			   		return true;
		
		   	}
		
	}
	
	public void showAllGiftBaskets() {
		if(isEmpty()) {
			   System.out.println("List is empty, nothing to display");
		   }else {
			   Node current = head;
			   while(current != null) {
				   current.getData().Display();
				   current = current.getNext();
			   }
		   }	   
	   }
	}
	
	

