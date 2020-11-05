// public class Node{
// 	public int element;
// 	public Node next;

// 	public Node(int element, Node next){
// 		this.element = element;
// 		next = null;
// 	}

// }
// public class LinkedlistQueue{
// 	Node head;
// 	Node tail;
// 	Node front;
// 	int len;

// 	public LinkedlistQueue(){
// 		head = null;
// 		tail = null;
// 		front = null;
// 		len = 0;
// 	}

// 	public boolean isEmpty(){
// 		if (len == 0) {
// 			return true;	
// 		}
// 		return false;
// 	}

// 	public int size(){	
// 		return len;
// 	}
// 	public int first(){
// 		if (isEmpty()) {
// 			return 0;	
// 		}
// 		return front.element;
// 	}

// 	public void Enqueue(){
// 		Node newest = new Node(n, null)
// 		if (this.isEmpty()) {
// 			this.head = newest;
// 			this.tail = newest;
// 			this.front = newest;	
// 		}
// 		this.rear.next = newest;
// 		this.rear = newest;

// 		len = len + 1;
// 	}
// 	public int Dequeue(){
// 		int e = front.element;
// 		if (isEmpty()) {
// 			return 0;	
// 		}
// 		front = front.next;
// 		lel = len - 1;
// 		return e; 
// 	}
// 	public static void main(String[] args) {
// 		LinkedlistQueue obj = new LinkedlistQueue();
// 	}
// }

public class Node{
	public int element;
	public Node next;

	public Node(){
		this.element = element;
		next = null;  
	}
}
public class LinkedlistQueue{
	Node front;
	Node tail;
	Node head;
	int len;

	public LinkedlistQueue(){
		front = null;
		tail = null;
		head = null;
		len = 0;
	}

	public boolean isEmpty(){
		if (len == 0) {
			return true;
		}
		return false;
	}

	public int size(){
		return len;
	}

	public int first(){
		if (isEmpty()) {
			return 0;	
		}
		return front.element;
	}

	public void Enqueue(){
		Node newest = new Node(n, null);
		if (isEmpty()) {
			this.head = newest;
			this.tail = newest;
			this.front = newest;
		}
		this.rear.next = newest;
		this.rear = newest;
	}

	public int Dequeue(){
		int e = front.element;
		if (isEmpty()) {
			return 0;
		}
		front = front.next;
		len = len - 1;
		return e;
	}
	public static void main(String[] args) {
		LinkedlistQueue obj = new LinkedlistQueue();
	}
}