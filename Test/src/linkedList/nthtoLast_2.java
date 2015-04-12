package linkedList;

//import java.util.LinkedList;

public class nthtoLast_2 {
public static Node nthtoLast(LinkedList list, int n){
		
		 Node head=list.search(10);
		
	
		//Node head = new Node(list.search(1));
		//System.out.println("Printing head: " +head.item);
		//(head==null || n<1){
			//return null;
		//}
		
		Node p1 = head;
		Node p2 = head;
		
		//System.out.println("P1 before the for loop: " +p1.item);
		//System.out.println("P2 before the for loop: " +p2.item);
		
		for(int j=0; j<n-1; ++j){
			if(p2!=null){
				
				System.out.println("P2 before assigning the next: " +p2.item);
				
				p2=p2.next;
				
				System.out.println("P2 aftfer assigning the next: " +p2.item);
				
		}
			else{
				return null;
			}
		
		}
		while(p2.next != null){
			p1=p1.next;
			p2=p2.next;
			System.out.println("List after removing the duplicates: " +p1.item);
			System.out.println("List after removing the duplicates: " +p2.item);
		}
				
		return p1;
	}
	
	
	public static void main(String[] args){
		LinkedList list = new LinkedList();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);
		list.insert(6);
		list.insert(7);
		list.insert(8);
		list.insert(9);
		list.insert(10);
		list.display();
		//Node p1 =list.nfromlast(4);
		//System.out.println("The Original List: " list.display());
		//LinkedListNode head = new LinkedListNode(list.getFirst());
		//System.out.println("Head node of the linked list " +list.getFirst());
		Node p1 = nthtoLast_2.nthtoLast(list, 3);
		System.out.println("List after removing the duplicates: " +p1.item);
	}

}
