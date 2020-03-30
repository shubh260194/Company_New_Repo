package techbodhi_february_batch_2020;

public class BaseClass {
   String base_class_var = "Base_class_var";
	
	public static void method() {
		System.out.println(" This is method ");
		method2();
	}
	  
	static void method2() {
		System.out.println("This is method2 ");
	}
	
	public static void main(String[] args) {
		
		System.out.println(" This is First Line ");
		
 		System.out.println(" This is Second Line ");
 		
 		method();

	}

}
