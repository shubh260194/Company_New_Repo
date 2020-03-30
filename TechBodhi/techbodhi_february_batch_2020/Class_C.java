package techbodhi_february_batch_2020;

public class Class_C extends Class_P {

	// current class constructor

	Class_C() {
		super();

		name = "child";
		number = 2;
		availability = false;
		System.out.println("child class constructor");

	}
    
	// variables 
	
	String name = "Satyam";
	int number = 200;
	boolean availability = false;

	// method : to check land print local variable

	public String display() {

		super.display1();

		String name = "diplay_name_child";
		System.out.println("used in method with local variable  >> " + name);
		return name;
	}

	// method : to assign instance variable (class level) to local variable & check
	// printing

	public String display1() {

		super.display1();

		String name = this.name;
		System.out.println("used in method with THIS. >> " + name);
		return name;
	}
	 
	 // to check over loading n riding
	void sm() {
		System.out.println(" to check over loading n riding ->>child");
	}
	
	void sm1(String a) {
		System.out.println(" to check over loading n riding ->> parent ");
	}

	public static void main(String[] args) {

		Class_P cp = new Class_P();
		Class_P cp_1 = new Class_C();
		
		Class_C cc = new Class_C();
		//Class_C cc_1 = new Class_P();
		
		// overloading
		cp.sm1(10); // parent ref - parent object
		cp_1.sm1(20); // parent ref - child object
		cc.sm1("abc"); // child ref - child object
		cc.sm1(10); // child ref - child object
		
		// overRiding
		cp.sm(); // parent ref - parent object
		cp_1.sm(); // parent ref - child object
		cc.sm(); // child ref - child object
		cc.sm(); // child ref - child object
		

		System.out.println(cp.name);
		System.out.println(cp.number);
		System.out.println(cp.availability);

		System.out.println(cc.name);
		System.out.println(cc.number);
		System.out.println(cc.availability);

		cc.display();
		cc.display1();
	}

}
