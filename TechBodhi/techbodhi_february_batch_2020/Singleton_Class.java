package techbodhi_february_batch_2020;

public class Singleton_Class {
	/*
	   Singleton pattern restricts the instantiation of a class and ensures that
	   only one instance of the class exists in the Java virtual machine. It seems
	   to be a very simple design pattern but when it comes to implementation, it
	   comes with a lot of implementation concerns
	   Also we need to provide : Global point of access
	 */
     int a = 100;
    
     void m1() {
    	System.out.println(" singleton normal method ");
    	
    }
	private static Singleton_Class instance_variable = new Singleton_Class();
	
	private Singleton_Class() {};
	
	public static Singleton_Class get_instance() {

		return instance_variable;
		
	}

}

class use_singleton{
	 int a=100; 
	
	public static void main(String[] args) {
		
		Singleton_Class s = Singleton_Class.get_instance();
		Singleton_Class s1 = Singleton_Class.get_instance();
		
		System.out.println(s.a);
		s.m1();
		
	}
	
}








