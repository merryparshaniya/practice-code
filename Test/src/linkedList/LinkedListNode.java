package linkedList;

public class LinkedListNode {
	
	public LinkedListNode next;
	public Object data;
	public int size=0;
	
	public LinkedListNode(Object data, LinkedListNode next){
	this.data = data;
	//next = null;
	this.next=next;
	

	}

	public LinkedListNode() {
		// TODO Auto-generated constructor stub
	}

	public LinkedListNode getNext()
	{
		return next;
	}
	
	public void setNext(LinkedListNode next)
	{
		next = next;
	}

	
	public void add(LinkedListNode data)
	{
	   if(size==0)
	   {
	      LinkedListNode head = new LinkedListNode();
	      head.next=null;
	      head.data=data;
	   }
	   else
	   {
	      LinkedListNode currentnode=getnode(size-1);
	      LinkedListNode newnode=new LinkedListNode();
	      newnode.data=data;
	      newnode.next=null;
	      currentnode.next=newnode;
	   }
	   size++;
	  }

	private LinkedListNode getnode(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
