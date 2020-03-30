package Collection;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.RandomAccess;



public class List_ArrayList {

	// Collection (I) > List (I)
	// ArrayList (c) , LinkedList (c), Vector (c)--Stack (c)
	// resizable array, growable array
	// homo-hetero genous objects allowed (except : tree map, tree set)
	// duplicates allowed
	// insertion order preserved
	// NUll insertion possible
	// empty object size = 10
	// new capacity = ( current cap x 1.5 )+1
	// index helps to identify duplicate values
	// add (index value) ,addAll (index value) ,remove(index)
	// get (index value) , set (index value)
	// to hold object and transfer objects from one place to another :Serializable object
	// every collection class implements Seralizable interface 
	// every collection class implements Clonable interface 
	// Cloning : process of create duplicate objects
	// Best case use : retrival 
	// Worst case use :insertion , removal (in middle)

	public static void main(String[] args) {
        
		           // constructors
        // ArrayList al = new ArrayList();
        // ArrayList al1 = new ArrayList(int initialcapacity);
        // ArrayList al1 = new ArrayList(collections c);
		
		ArrayList al = new  ArrayList();
		
		// change AL into Synchronised AL 
		// public static List synchronizedList();
		java.util.List al1 = Collections.synchronizedList(al);
		
		al.add(null);
		al.add("ABC");
		al.add(123);	
		
		// System.out.println(al.capacity() +" capacity ");
		System.out.println(al.size() +" size ");
		
		System.out.println(al);
		al.remove(1);
		System.out.println(al);
		System.out.println(al.get(1));
		al.add(false);
		System.out.println(al);
		al.set(2, true);
		System.out.println(al);
		al.clear();
		System.out.println(al);
		
		System.out.println(al instanceof Serializable);
		System.out.println(al instanceof Cloneable);
		System.out.println(al instanceof RandomAccess);
		

	}

}
