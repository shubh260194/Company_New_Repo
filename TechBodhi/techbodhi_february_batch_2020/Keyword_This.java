package techbodhi_february_batch_2020;

public class Keyword_This {

	// refer to current class object

	Keyword_This() {

		this(555);
		// calling another constructor
		// this or super are only allowed as first statement
		// constructor can either have this or super

		int a = 10;
		boolean b = true;
		this.a = 222;
		b = true;

		System.out.println(" in constructor a -" + a);
		System.out.println(" in constructor b -" + b);
		System.out.println(" in constructor use this.a -" + this.a);
		System.out.println(" in constructor use this.b -" + this.b);

	}

	Keyword_This(int random) {
		this.a = 1111;
		this.b = false;

		System.out.println(" calling overloaded constructor .this -par random -" + random);

	}

	int a = 1000;
	boolean b = true;

	{
		int a = 30;
		boolean b = false;
		System.out.println(" in instance block a -" + a);
		System.out.println(" in instance block b -" + b);
		System.out.println(" in instance block use this.a -" + this.a);
		System.out.println(" in instance block use this.b -" + this.b);
	}

	static {
		int a = 40;
		boolean b = true;
		System.out.println(" in static block a -" + a);
		System.out.println(" in static block b -" + b);
		// System.out.println(" in static block use this.a -" + this.a);
		// System.out.println(" in static block use this.b -" + this.b);
	}

	public void m1() {
		int a = 50;
		boolean b = false;
		System.out.println(" in method m1 a -" + a);
		System.out.println(" in method m1 b -" + b);
		System.out.println(" in method m1 this.a -" + this.a);
		System.out.println(" in method m1 this.b -" + this.b);
	}

	public void m2() {

		this.m1();
		// calling current class method
		int a = 60;
		boolean b = true;
		System.out.println(" in method m2  a -" + a);
		System.out.println(" in method m2  b -" + b);

	}

	public static void main(String[] args) {

		//Keyword_This kt = new Keyword_This();
		Keyword_This kt1 = new Keyword_This(10);

//		kt.m1();
//		kt.m2();

		kt1.m1();
		kt1.m2();

	}

}
