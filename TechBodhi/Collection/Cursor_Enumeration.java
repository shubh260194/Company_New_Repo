package Collection;

import java.util.Enumeration;
import java.util.Vector;

public class Cursor_Enumeration {

	// ENumeration (interface)
	// applicable for legacy classes
	// if we want to retrieve objects from collection one by one, we use cursors
	// applicable for : Vector, using : elements methods
	// drawback : can't go backward, single directional cursor
	// drawback : We can't remove objects, we can only read

	public static void main(String[] args) {

		Vector v = new Vector();

		v.addElement(10);
		v.addElement(20);
		v.addElement(30);

		Enumeration e = v.elements();
		
		System.out.println(e.getClass().getName());

		System.out.println(e.hasMoreElements()); // checks
		System.out.println(e.nextElement()); // returns
		System.out.println(e.nextElement());
		System.out.println(e.nextElement());
		System.out.println(e.hasMoreElements()); // checks

		while (e.hasMoreElements()) {
			Integer i = (Integer) e.nextElement();

			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

		System.out.println(v);

	}

}
