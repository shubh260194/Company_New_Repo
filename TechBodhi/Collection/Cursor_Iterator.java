package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;
import java.util.*;

public class Cursor_Iterator {

	// applicable for any collection implemented classes, legacy classes
	// universal cursor
	// public boolean hasNext()
	// public object next()
	// public void remove()
	// drawback : can't go backward, single directional cursor
	// drawback : can't go backward, single directional cursor
	// drawback : replacement/ addition of new objects not allowed

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		// LinkedList ll = new LinkedList();
		// Vector v = new Vector();
		// Stack s = new Stack();
		
		for (int a = 0; a <= 10; a++) {
			al.add(a);
		}
		System.out.println(al);

		Iterator it = al.iterator();
		System.out.println(al.size());
		
		System.out.println(it.getClass().getName());

		while (it.hasNext()) {
			Integer j = (Integer) it.next();
			if (j % 2 == 0) {
				System.out.println(j);
			} else {
				it.remove();
			}
		}

	}

}
