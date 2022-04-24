public class DoublyLinkedList{
	
	class Node() {
		String val;
		Node prev;
		Node next;

		public Node(String val) {
			this.val = val;
		}
	}


	// add new node in the beginning (head)
	public void push(String data) {
		Node newNode = new Node(data);

		newNode.next = head;
		newNode.prev = null;

		if (head != null) {
			head.prev = newNode;
		}

		head = newNode;
	}


	// insert new node after a specific node
	public void insertAfter(Node previous, String data) {
		if (previous == null) {
			return;
		}

		Node newNode = new Node(data);

		newNode.next = previous.next;
		newNode.prev = previous;
		previous.next = newNode;

		if (newNode.next != null) {
			newNode.next.previous = newNode;
		}
	}

	// Append new node at the end of the list (tail)
	public void append(String data) {
		Node newNode = new Node(data);

		if (head == null) {
			push(newNode);
			return;
		}

		Node cur = head;
		while(cur.next != null) {
			cur = cur.next;
		}

		cur.next = newNode;
		newNode.prev = cur;
		newNode.next = null;
	}

	public void remove(Node del) {

		// need to check if head is null
		if (head == null || del == null)	return;


		// If del is head node
		if (del == head) {
			head = del.next;
		}

		// Change next only if del is NOT the tail
		if (del.next != null) {
			del.next.prev = del.prev;
		}

		// Change prev only if del is NOT the head
		if (del.prev != null) {
			del.prev.next = del.next;
		}
	}


	public void moveToHead(Node cur) {
		remove(cur);
		push(cur);
	}

	public Node popTail() {
		if (head == null)	return null;

		Node cur = head;
		while(cur.next != null) {
			cur = cur.next;
		}

		remove(cur);
		return cur;
	}

}
