package Oops;

public class Inheritance {
	// is a - relation / Inheritance
	// parent class members n methods n constructor : available to child on
	// inheritance
	// syntax : extends advantage : reusability
	// parent(base /super class) -child (sub class) relation : A is child of B
	// p ->> c : allowed , c ->> p : not allowed
	// reference matters
	// parent class reference can be used to hold child object, vice versa not
	// possible
	// Example : Object >> string, stringbuffer, throwable ->exception, error
	// Types : single , multi level , multiple
	// single : class A extends B
	// multi level : class D extends C , class C extends B ,class B extends A
	// multiple : class E extends A,B,C,D
	// *** Not supported wrt classes (ambiguity issue), but possible with Interfaces
	// interface A extends B,C ( B,C are two other interfaces ) : unique
	// implementation
	// if our class doesn't extends any other class, then its direct child of OBJECT
	// class
	// cyclic not allowed : class A extends B <> class B extends A , class A extends A

	public static void main(String[] args) {

		Grand_child gc = new Grand_child();
		gc.p_m1();
		gc.c_m1();
		gc.gc_m1();

		Child gc1 = new Grand_child();
		gc1.p_m1();
		gc1.c_m1();
		// gc1.gc_m1();   

		Parent gc2 = new Grand_child();
		gc2.p_m1();
		// gc2.c_m1();
		// gc2.gc_m1();

		Parent p = new Parent();
		p.p_m1();

		Child c = new Child();
		c.c_m1();

		// Grand_child gc3 = new Child();
		// Grand_child gc4 = new Parent();
	}

}

// ---------------------------------------------------------------------------------
class Parent {
	Parent() {
		System.out.println("parent constructor");
	}

	int p = 100;

	void p_m1() {
		System.out.println("parent");
	}

}

class Child extends Parent {
	Child() {
		System.out.println("child constructor");
	}

	int c = 50;

	void c_m1() {
		System.out.println("child");
	}

}

class Grand_child extends Child {

	Grand_child() {
		System.out.println("grand child constructor");
	}

	int gc = 50;

	void gc_m1() {
		System.out.println("grand child");
	}

}
