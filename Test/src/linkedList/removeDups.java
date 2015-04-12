package linkedList;

import java.util.Hashtable;
import java.util.LinkedList;

public class removeDups {
	
	public static LinkedList<Integer> deleteDups(LinkedList list){
		
		Hashtable table = new Hashtable();
		//LinkedList previoud = null;
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).equals(list.get(j))) {
					list.remove(j);
					j--;
				}
			}
		}
		
		
		return list;
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
		list = removeDups.deleteDups(list);
		System.out.println("List after removing the duplicates: " +list);
	}

}
