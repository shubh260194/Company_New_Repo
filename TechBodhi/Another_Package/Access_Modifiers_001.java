package Another_Package;

import techbodhi_february_batch_2020.Access_Modifiers;
//If class = “public” then 
//we can access it from anywhere, i.e from any other class located in any other packages etc.
//We can have only one “public” class in a source file
//file name should be same as the public class name.
//If class = “default access” then 
//it can be accessed only from other classes in the same package.

public class Access_Modifiers_001 {

	int a1 = 11;
	public int b1 = 22;
	protected int c1 = 33;
	private int d1 = 44;

	// methods
	void m11() {
		System.out.println("default am1");
	}

	public void m22() {
		System.out.println("public am1");
	}

	protected void m33() {
		System.out.println("protected am1");
	}

	private void m44() {
		System.out.println("private am1");
	}

	public static void main(String[] args) {

		Access_Modifiers am = new Access_Modifiers();

		// System.out.println(am.a);
		// default accessible in package only
		// *USE GET SET METHODS
		System.out.println(am.b);
		// public accessible everywhere
		// System.out.println(am.c);
		// protected accessible in same package and to the subclasses in any package
		// *USE GET SET METHODS
		// System.out.println(am.d);
		// private accessible in accessible only inside the same class
		// *USE GET SET METHODS

		// am.m1(); accessible in package only
		am.m2(); // visible and can be used everywhere
		// am.m3(); accessible in same package and to the subclasses
		// am.m4(); accessible only inside the same class

	}

	public int getD1() {
		return d1;
	}

	public void setD1(int d1) {
		this.d1 = d1;
	}

}
