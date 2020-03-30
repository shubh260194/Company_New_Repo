   package techbodhi_february_batch_2020;

public class Var_Types {

	// Types of Variables 1. local 2. instance 3. static

	/*
	 * local >>>>>>>>> declared inside : method / block / constructor scope inside :
	 * method / block / constructor
	 * Value of instance and static variables default are set by jvm (if not given)
	 */

	// constructor : allowed - public / protected / private
	Var_Types() {
		int var3 = 300;
		System.out.println(var3);
	}

	// block
	{
		int var4 = 400;
		System.out.println(var4);
	}

	static {
		int var5 = 500;
		System.out.println(var5);
	}

	// Method // return variables from methods
	public int method() {
		int var6 = 600;
		System.out.println(var6 + " var6 ");
		return var6;

	}

	public void method1() {

		System.out.println(var1 + " var1 ");
		System.out.println(var2 + " var2 ");

	}

	/*
	 * instance >>>>>>>>> declared : inside > class , outside > method scope :
	 * inside > class, in : any methods
	 */
	int var1 = 100;
	char var2 = 'a';

	/*
	 * static >>>>>>>>> declared : inside > class scope : inside > class, in : any
	 * methods
	 */

	static int var0 = 0;

	static void method2() {
		System.out.println(" static method ");
	}

	public static void main(String[] args) {

		char stat_check = 'a';
		System.out.println(stat_check); // static area working

		Var_Types vt = new Var_Types();

		vt.method(); // local
		// System.out.println(vt.var3); // local
		// System.out.println(vt.var4); // local
		// System.out.println(vt.var5); // local

		vt.method1();// instance
		System.out.println(vt.var1); // instance
		System.out.println(vt.var2); // instance

		System.out.println(var0); // calling static variable : way 1
		System.out.println(Var_Types.var0); // calling static variable : way 2
		System.out.println(vt.var0); // calling static variable : way 3

		method2(); // calling static method : way 1
		Var_Types.method2(); // calling static method : way 2
		vt.method2(); // calling static method : way 3

	}

}
