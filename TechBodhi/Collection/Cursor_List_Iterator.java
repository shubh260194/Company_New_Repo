package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Cursor_List_Iterator {

	// Limitation : applicable for all classes which implements Lists
	// forward/backward navigation possible
	// add, remove , replace, add new objects possible
	// FORWARD :-
	// public boolean hasNext()
	// public object next()
	// public int nextIndex() 
	// FORWARD :-
	// public boolean hasPrevious()
	// public object previous()
	// public int previousIndex()
	// public void remove()
	// public void set(object new)
	// public void add(object new)

	public static void main(String[] args) {

		// ArrayList al = new ArrayList();
		LinkedList ll = new LinkedList();
		// Vector v = new Vector();
		// Stack s = new Stack();
		for (int a = 0; a <= 10; a++) {
			ll.add(a);
		}
		System.out.println(ll);

		ListIterator ltr = ll.listIterator();
		System.out.println(ltr.getClass().getName());

		while (ltr.hasNext()) {

			Integer i = (Integer) ltr.next();

			if (i == 3) {
				ltr.add(i + "add");
			} else if (i == 5) {
				ltr.remove();
			} else if (i == 7) {
				ltr.set(i + "set");
			}
		}
		
		System.out.println(ll);

	}

}
