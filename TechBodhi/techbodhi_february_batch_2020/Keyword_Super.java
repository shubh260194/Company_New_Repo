package techbodhi_february_batch_2020;

public class Keyword_Super extends Access_Modifiers {

	// The use of super keyword
	// 1) To access the data members of parent class when both parent and child class have member with same name
	// 2) To explicitly call the no-arg and parameterized constructor of parent class
	// 3) To access the method of parent class when child class has overridden that method.

	Keyword_Super() {

		// super(555);
		// calling another constructor
		// this or super are only allowed as first statement
		// constructor can either have this or super

		int a = 111;
		// super.a = 222;

		System.out.println(" in constructor a -" + a);
		System.out.println(" in constructor use super.a -" + super.a);

	}

	Keyword_Super(int random) {
		super.a = 1111111;
		System.out.println(" calling overloaded constructor .super -par random -" + random);

	}

	int a = 1000;

	public void m1() {
		int a = 50;
		System.out.println(" in method m1 a -" + a);
		System.out.println(" in method m1 super.a -" + super.a);
	}

	public void m2() {

		super.m1();
		// calling current class method
		int a = 60;
		boolean b = true;
		System.out.println(" in method m2  a -" + a);
		System.out.println(" in method m2  b -" + b);
	}

	public static void main(String[] args) {

		Keyword_Super ks = new Keyword_Super();
		Keyword_Super ks1 = new Keyword_Super(10);

	}

}
