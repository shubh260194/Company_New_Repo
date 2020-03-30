package techbodhi_february_batch_2020;

import Another_Package.Access_Modifiers_001;
//If class = “public” then 
//we can access it from anywhere, i.e from any other class located in any other packages etc.
//We can have only one “public” class in a source file
//file name should be same as the public class name.
//If class = “default access” then 
//it can be accessed only from other classes in the same package.

public class Access_Modifiers extends Access_Modifiers_001 {

	// variables

	int a = 10;
	public int b = 20;
	protected int c = 30;
	private int d = 40;

	// methods
	void m1() {
		System.out.println("default am");
	}

	public void m2() {
		System.out.println("public am");
	}

	protected void m3() {
		System.out.println("protected am");
	}

	private void m4() {
		System.out.println("private am");
	}

	public static void main(String[] args) {

		Access_Modifiers am = new Access_Modifiers();

		//System.out.println(am.a1);
		// default accessible in package only
		// *USE GET SET METHODS
		
		System.out.println(am.b1);
		// public accessible everywhere
		
		//System.out.println(am.c1);
		// protected accessible in same package and to the subclasses in any package
		// *USE GET SET METHODS
		
		//System.out.println(am.d1);
		// private accessible in accessible only inside the same class
		// *USE GET SET METHODS

		// am.m11(); accessible in package only
		am.m22(); // visible and can be used everywhere
		// am.m33(); accessible in same package and to the subclasses
		// am.m44(); accessible only inside the same class
		
		System.out.println(am.c1); // we can't use parent object, as its in different package
        am.m33();
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}


}
