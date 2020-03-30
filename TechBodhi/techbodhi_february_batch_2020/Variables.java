package techbodhi_february_batch_2020;

public class Variables {

	// numeric
	byte var1;
	short var2;
	int var3;
	long var4;
	float var5;
	double var6;
	// text
	char var7;
	boolean var8;
	// not a primitive data type
	String var9;
	// literal : constant value assigned to variables

	// numeric
	static byte var11;
	static short var22;
	static int var33;
	static long var44;
	static float var55;
	static double var66;

	// text
	static char var77;
	static boolean var88;

	// not a primitive data type
	static String var99;

	// literal : constant value assigned to variables
	int int_literal = 123;
	static int int_literal1 = 123;
	String Str_literal = "abc";
	static String Str_literal1 = "abc";
  
	public static void main(String[] args) {

		// using object
		Variables v = new Variables();

		System.out.println(v.var1 + " ->> var1 ");
		System.out.println(v.var2 + " ->> var2 ");
		System.out.println(v.var3 + " ->> var3 ");
		System.out.println(v.var4 + " ->> var4 ");
		System.out.println(v.var5 + " ->> var5 ");
		System.out.println(v.var6 + " ->> var6 ");
		System.out.println(v.var7 + " ->> var7 ");
		System.out.println(v.var8 + " ->> var8 ");
		System.out.println(v.var9 + " ->> var9 ");
		System.out.println(v.int_literal + " ->> int_literal ");
		System.out.println(v.Str_literal + " ->> Str_literal ");

		System.out.println("-------------------------------------------------------");

		// using class reference

		System.out.println(Variables.var11 + " ->> var11 ");    
		System.out.println(Variables.var22 + " ->> var22 ");
		System.out.println(Variables.var33 + " ->> var33 ");
		System.out.println(Variables.var44 + " ->> var44 ");
		System.out.println(Variables.var55 + " ->> var55 ");
		System.out.println(Variables.var66 + " ->> var66 ");
		System.out.println(Variables.var77 + " ->> var77 ");
		System.out.println(Variables.var88 + " ->> var88 ");
		System.out.println(Variables.var99 + " ->> var99 ");
		System.out.println(Variables.int_literal1 + " ->> int_literal1 ");
		System.out.println(Variables.Str_literal1 + " ->> Str_literal1 ");

		System.out.println("-------------------------------------------------------");


	}

}
