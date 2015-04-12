package linkedList;

import java.util.LinkedList;


public class RemoveDups_1 {
	//LinkedListNode head;
	
	public static void deleteDups(LinkedListNode head){
		if (head==null)return;
		LinkedListNode previous = head;
		LinkedListNode current = previous.next;
		System.out.println("List after removing the duplicates: " +current.data);
		
		
	}
	
	public static void main(String[] args){
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.addLast(1);
		list.addLast(2);
		list.addLast(3);
		list.addLast(3);
		list.addLast(3);
		list.addLast(4);
		list.addLast(4);
		list.addLast(5);
		list.addLast(6);
		list.addLast(6);	
		System.out.println("The Original List: " +list);
		LinkedListNode head = new LinkedListNode(list.getFirst());
		//System.out.println("Head node of the linked list " +list.getFirst());
		RemoveDups_1.deleteDups(head);
		System.out.println("List after removing the duplicates: " +list);
	}

}
