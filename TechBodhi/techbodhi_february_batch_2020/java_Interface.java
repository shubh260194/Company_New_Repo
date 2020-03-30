package techbodhi_february_batch_2020;

// Allowed :  public,default,abstract -- Not Allowed : private, protected, final,static

//Overriding: 
//Overriding in Java simply means that the particular method would be called 
//based on the run time type of the object and not on the compile time type of it 
//(which is the case with overriden static methods)
//
//Hiding: Parent class methods that are static are not part of a child class
//(although they are accessible), so there is no question of overriding it. 
//Even if you add another static method in a subclass,
//identical to the one in its parent class, 
//this subclass static method is unique and distinct 
//from the static method in its parent class.

public interface java_Interface {

	// variables >> public, static , final : Allowed 
    String a_interface = "10";
	public String b_interface = "20";
	static String e_interface = "30";
	final String f_interface = "40"; // need to initialize

	// Methods
	// Allowed : public, default, abstract
	// Not Allowed : protected , private , final

	void m1();

	public void m2();

	abstract void m3();

	static void m4() {
	};

}
