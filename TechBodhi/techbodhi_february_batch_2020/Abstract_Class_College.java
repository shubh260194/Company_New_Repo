package techbodhi_february_batch_2020;

public abstract class Abstract_Class_College {

	// only class and methods can be abstract
	// abstract methods can only be defined in Abstract classes or interface
	// default , public are , either final / abstract allowed
	// we can have an abstract class without any abstract method. 
	// This allows us to create classes that cannot be instantiated, but can only be inherited.
	// it can be inherited but, extending class must be abstract or 
	// must implement unimplemented methods of extended Abstract file
	/*
	 * public abstract Abstract_Class{ 
	 * void write(){
	 * System.out.println("concrete method in abstract class");
	 *  } 
	 *  public class Implementing_class extends Abstract_Class{
	 *   public static void main(String [] args} 
	 *   Abstract_Class ac = new Abstract_Class(); // will not work
	 * Implementing_class ic = new Implementing_class();
	 *  ic.write(); }
	 */

	// abstract char c; Abstract Variables can't be declared
	String a;
	public String b;
	private String c;
	protected String d;
	static String e;
	final String f ="123"; // need to initialize 
	
	// methods of all type : default, public, private, protected, static, final, abstract

	// abstract methods can be declared
	abstract void departments();

	// concrete methods can also be declared
	void transportation() {
		System.out.println(" Trnsporattion mode : Bus  ");
	}

	// can have Final methods that can't be changed
	final void final_methods() {

		System.out.println(" final method ");
	}

	// Constructor of an Abstract Class can be declared
	Abstract_Class_College() {
		System.out.println(" Abstract class constructor ");
	}

	public static void main(String[] args) {

		// Abstract_Class_College acc = new Abstract_Class_College();
		// can't instantiate Abstract class, can't make object of an class
	}

}
