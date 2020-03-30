package Oops;

public class OverLoading extends Hotel {
	// object oriented programming feature
	// allows us to perform a single action in different ways.
	// method signature : name followed by argument types ex. m1( int a)
	// *** modifier, return types , not part of method signature (in java)

	void reference_example(int a) {
		System.out.println(" OverLoading class refernce_example ");
	}
	
	// Automatic Internal Promotion
	// byte > short > int > long >float > double
	// char > int > long >float > double
	// after all possible Auto Promotion,check for compilation error, if not found
	// matched method
	// promotion is allowed , demotion not allowed
	// Var Arg will get chance when no methods matches. check by connecting exact method.
	// internal promotion
    // first check Argument passed : if nothing to match
	// then go for exact match
	// then Auto promote and check
	// still not found 
	void m1() {}
	void m1(int a) {}
	void m1(int a,float b) {}
	void m1(float a,int b) {}
	void m1(double a) {}

	public static void main(String[] args) {

		Hotel h = new Hotel();
		OverLoading o = new OverLoading();

		h.reference_example();
		h.get_pavbhaji_rate();
		h.get_pavbhaji_rate(1);
		o.reference_example(20);

		Hotel h1 = new OverLoading();
		// OverLoading o = new Hotel();
		h1.reference_example();

		Extra e = new Extra();

		e.method();
		e.method(10, 10.0f);
		e.method(10.5f, 10);
		// e.method(10 ,10); wont work with auto promotion, as we have 2 here, Ambiguity
		e.method1(null);
		// null can be both String or Object

	}

}

// over loading ( within same class or outside same class )
// compile time polymorphism / static polymorphism / early binding
// method resolution taken care by compiler, based on reference type - reference
// matters
// over loaded : same name , different argument types
// *** Argument type same and different numbers also allowed
// try - main method over loading

class Hotel {

	void get_pavbhaji_rate() {
		System.out.println(" single person rs -50 ");
	}

	void get_pavbhaji_rate(int person) {
		if (person >= 1 && person < 4) {
			System.out.println(" rs 50 + rs 40 extra per person ");
		} else {
			System.out.println(" not allowed  ");
		}
	}

	void reference_example() {
		System.out.println(" hotel class refernce_example ");
	}

}

// child type arg will get chance , if we have both parent n child type methods

class Extra {

	void method() {
		System.out.println(" no arg ");
	}

	void method1(String s) {
		System.out.println(" String ");
	}

	void method1(Object o) {
		System.out.println(" Object ");
	}

	void method(int a, float b) {
		System.out.println(" int - float ");
	}

	void method(float a, int b) {
		System.out.println(" float - int ");
	}

	void method(int... x) {
		System.out.println(" variable argument ");
	}

	void method(int x) {
		System.out.println(" single argument ");
	}

}
