package techbodhi_february_batch_2020;

public class Class_P {

	// constructor : reset variables

	Class_P() {
		name = "parent";
		number = 1;
		availability = true;
		System.out.println("parent class constructor");
	}

	String name = "Shubham";
	int number = 100;
	boolean availability = true;

	// method : to check land print local variable

	public String display() {
		String name = "diplay_name_parent";
		System.out.println("used in method with local variable  >> " + name);
		return name;
	}

	// method : to assign instance variable (class level) to local variable & check
	// printing

	public String display1() {
		String name = this.name;
		System.out.println("used in method with THIS. >> " + name);
		return name;
	}
	
	// to check over loading n riding
	void sm() {
		System.out.println(" to check over loading n riding ->> parent");
	}
	
	void sm1(int a) {
		System.out.println(" to check over loading n riding ->> parent");
	}

	public static void main(String[] args) {

		Class_P cp1 = new Class_P();
		Class_C cc1 = new Class_C();

		System.out.println(cp1.name);
		System.out.println(cp1.number);
		System.out.println(cp1.availability);
		cp1.sm();

		// trying to print local variable outside local method
		cp1.display();
		String local_var = cp1.display();
		System.out.println(local_var);

		// trying to assign class level variable to local method local level variable
		cp1.display1();
		String local_var1 = cp1.display1();
		System.out.println(local_var1);

	}

}
