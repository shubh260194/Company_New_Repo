package Another_Package;

import techbodhi_february_batch_2020.Access_Modifiers;

public class Access_Modifiers_001_Sub_Class {

	public static void main(String[] args) {
		Access_Modifiers_001 am1 = new Access_Modifiers_001();

		// variables

		System.out.println(am1.a1); // default
		System.out.println(am1.b1); // public
		System.out.println(am1.c1); // protected
		System.out.println(am1.getD1()); // p    rivate

		// methods

		am1.m11();
		am1.m22();
		am1.m33();
		// am1.m44(); private methods can only be accessed in that class

	}

}
