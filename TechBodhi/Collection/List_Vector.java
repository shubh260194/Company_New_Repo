package Collection;

import java.util.Vector;

public class List_Vector {

	public static void main(String[] args) {
		// Collection (I) > List (I)
		// ArrayList (c) , LinkedList (c), Vector (c)--Stack (c)
		// resizable array, growable array
		// homo-hetero genous objects allowed (except : tree map, tree set)
		// duplicates allowed
		// insertion order preserved
		// NUll insertion possible
		// empty object size = 10
		// new capacity = current cap x 2
		// to hold object and transfer objects from one place to another :Serializable object
		// every collection class implements Seralizable interface 
		// every collection class implements Clonable interface 
		// Cloning : process of create duplicate objects
		// Best case use : retrival 
		// Worst case use :insertion , removal (in middle)
		// int size() >> cureent occupied  , int capacity() >> total capacity
		
		//constructors
		
		Vector v = new Vector();
// Vector v1 = new Vector( int initialCapacity);
// Vector v2 = new Vector( int initialcapacity , int incrementCapacity);
// Vector v3 = new Vector(collections c);
		
		v.addElement(10);
		v.addElement('A');
		v.addElement(false);
		v.addElement(10000000);
		
		System.out.println(v.capacity() +" capacity ");
		System.out.println(v.size() +" size ");
		
		System.out.println(v);
		v.removeElement(10);
		v.removeElementAt(1);
		System.out.println(v);
		v.get(0);
		v.setElementAt("first", 0);
		v.insertElementAt("second", 1);
		System.out.println(v);
		v.clear();
		v.removeAllElements();
		System.out.println(v);
		
		

	}

}
