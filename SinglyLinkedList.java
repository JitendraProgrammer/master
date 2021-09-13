package ds.singly.linked.list;


public class SinglyLinkedList {

	private Node head;

	private static class Node {
		int element;
		Node next = null;

		public Node(int element) {
			this.element = element;
			this.next = null;

		}

	}

	public int lengthOf() {
		if (head == null) {
			return 0;
		}
		int count = 0;
		Node current = head;
		while (current != null) {
			count++;
			current = current.next;

		}
		return count;
	}

	public void displyList() {
		Node current = head;
		while (current != null) {
			System.out.print(current.element + "-->");
			current = current.next;
		}
		System.out.println("null");

	}

	public static void main(String[] args) {

		SinglyLinkedList singly = new SinglyLinkedList();
		singly.head = new Node(0);
		Node sec = new Node(0);
		Node third = new Node(6);
		Node fourth = new Node(-0);

		singly.head.next = sec;
		sec.next = third;
		third.next = fourth;
		singly.displyList();
		
		
		System.out.println("singlyLinkedListSizeOf:" + singly.lengthOf());

	}

}
