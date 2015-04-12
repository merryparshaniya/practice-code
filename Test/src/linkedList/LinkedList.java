package linkedList;

public class LinkedList {
	
	private Node first;
    public LinkedList()
    {
        first = null;
    }
    public boolean isEmpty()
    {
        return (first==null);
    }
    public void insert(int val)//inserts at beginning of list
    {
        Node newNode = new Node(val);
        newNode.next = first;
        first = newNode;
    }
    public Node delete()//deletes at beginning of list
    {
        Node temp = first;
        first = first.next;
        return temp;
    }
    public void display()
    {
        System.out.println("List items from head to tail :");
        Node current = first;
        while(current != null)
        {
            current.displayNode();
            current = current.next; 
        }
        System.out.println("");
    }
    public Node search(int val)
    {
        Node current = first;
        while(current.item != val)
        {
            if(current.next == null)
                return null;
            else
                current = current.next;
        }
        return current;
    }
    public Node nfromlast(int n)
    {
        int i;
        Node current = first;
        for (i=0;i<n;i++)
        {
            if(current != null)
            {
                current = current.next;
            }
            else
            {
                return null;
            }
        }
        Node behind = first;
        while (current != null)
        {
            current = current.next;
            behind = behind.next;
        }
        return behind;
    }

}
