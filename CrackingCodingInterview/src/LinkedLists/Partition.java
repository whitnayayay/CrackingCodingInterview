package LinkedLists;

/*
 * Write code to partition a linked list around a value x, such that
 * all nodes less than x come before all nodes greater or equal to x.
 * 
 * ex) input: 3 -> 5 - > 8 -> 5 -> 10 -> 2 -> 1 (partition: 5)
 * 	  output: 3 -> 1 -> 2     ->    -> 10 -> 5 -> 5 -> 8
 */
public class Partition {

	LinkedListNode partition(LinkedListNode node, int x) {
		LinkedListNode head = node;
		LinkedListNode tail = node;
		
		while (node != null) {
			LinkedListNode next = node.next;
			if (node.data < x) {
				/* Insert node at head. */
				node.next = head;
				head = node;
			} else {
				/* Insert node at tail. */
				tail.next = node;
				tail = node;
			}
			node = next;
		}
		tail.next = null;
		
		//head changed, so we need to return it to user
		return head;
	}
}
