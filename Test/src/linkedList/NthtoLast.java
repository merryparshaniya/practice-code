package linkedList;

import java.util.LinkedList;

public class NthtoLast {

	
	public static LinkedListNode nthtoLast(LinkedListNode head, int n){
		
		if(head==null || n<1){
			return null;
		}
		
		LinkedListNode p1 = head;
		LinkedListNode p2 = head;
		System.out.println("List after removing the duplicates: " +p1.data);
		for(int j=0; j<n-1; ++j){
			System.out.println("List after removing the duplicates P2: " +p2.next.data);
			if(p2==null){
				return null;
		}
		p2=p2.next;
		System.out.println("List after removing the duplicates: " +p2.next.data);
		}
		while(p2.next != null){
			p1=p1.next;
			p2=p2.next;
			System.out.println("List after removing the duplicates: " +p1.data);
			System.out.println("List after removing the duplicates: " +p2.data);
		}
				
		return p1;
	}
	
	
	public static void main(String[] args){
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(100);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);	
		System.out.println("The Original List: " +list);
		LinkedListNode head = new LinkedListNode(list.getFirst());
		//System.out.println("Head node of the linked list " +list.getFirst());
		LinkedListNode p1 = NthtoLast.nthtoLast(head, 6);
		//System.out.println("List after removing the duplicates: " +p1.data);
	}
}
