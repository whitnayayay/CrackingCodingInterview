package LinkedLists;

import java.util.HashSet;


/* Write code to remove duplicates from an unsorted linked list.
 * Follow up: How would you solve this if a temp buffer is not allowed?
 */

public class RemoveDups {
	/* Solution: iterate through linked list, adding each element to a hash table.
	 * When there is a duplicate, remove the element and continue iterating.
	 */

	
	void deleteDups(LinkedListNode n) {
		HashSet<Integer> set = new HashSet<Integer>();
		LinkedListNode prev = null;
		while (n!= null) {
			if (set.contains(n.data)) {
				prev.next = n.next;
				
			} else {
				set.add(n.data);
				prev = n;
			}
			n = n.next;
		}
		
	}
}


/* Note: LinkedListNode is not a type. book contains implementation
 * of LinkedListNode. LinkedListNode class created from book.
 * */
