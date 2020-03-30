package Collection;

import java.io.Serializable;
import java.util.*;

public class List_Linked_List {
	 
	// Underlying Data Structure : Doubly linked list
	// insertion order preserved
	// duplicate elements allowed
	// homo-hetero geneous elements allowed
	// Null insertion possible
	// best use : insertion n deletion (in middle)
	// worst use : retrival
	// implements : Serializable ,Cloneable
	// to develop Stacks and Queue
    // stack : LIFO , queue : FIFO
	// void addFirst() , void addLast() 
	// object removeFirst(),  object removeLast() 
	// object getFirst() ,object getLast()
	// adds /removes nodes with : reference address thts it
	
	public static void main(String[] args) {
  
		 // constructors
		 LinkedList l = new LinkedList();
		 // LinkedList l1 = new LinkedList(collections c);
		 
		 l.add('f');
		 l.add("abc");
		 l.add('l');
		 
			// no capacity >> System.out.println(l.capacity() +" capacity ");
			System.out.println(l.size() +" size ");
			
		 System.out.println(l);
		 l.addFirst(11);
		 l.addLast(99);
		 System.out.println(l);
		 l.set(0, "one");
		 l.add(0, "first");
		 System.out.println(l);
		 l.removeFirst();
		 l.removeLast();
		 System.out.println(l);
		 System.out.println(l.getFirst());
		 System.out.println(l.getLast());

		
	System.out.println(l instanceof Serializable);
	System.out.println(l instanceof Cloneable);

		

	}

}
