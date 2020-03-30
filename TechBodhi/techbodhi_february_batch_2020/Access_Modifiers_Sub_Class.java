package techbodhi_february_batch_2020;

public class Access_Modifiers_Sub_Class {

	public static void main(String[] args) {

		Access_Modifiers am = new Access_Modifiers();

		// variables

		System.out.println(am.a); // default
		System.out.println(am.b); // public
		System.out.println(am.c); // protected
		System.out.println(am.getD()); // private

		// methods

		am.m1();
		am.m2();
		am.m3();
		// am.m4(); private methods can only be accessed in that class

	}

}
