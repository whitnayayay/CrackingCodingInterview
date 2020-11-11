package LinkedLists;

/* Implement an algorithm to delete a node in the middle 
 * (i.e., any node but the first and last node, not necessarily
 * the exact middle) of a singly linked list, given only access
 * to that node.
 * 
 *  Example: the node c from Linked List a -> b -> c -> d -> e -> f
 *  Result: nothing returned. but new linked list looks like
 *  a -> b -> d -> e -> f
 * 
 * 
 */

public class DeleteMiddleNode {

	boolean deleteNode(LinkedListNode n) {
		if (n == null || n.next == null) {
			return false; //failure
		}
		LinkedListNode next = n.next;
		n.data = next.data;
		n.next = next.next;
		
		return true;
	}
}
