package techbodhi_february_batch_2020;

// pending : this, super , why not static , return types

public class ConstructorVsMethod {

	String name = " first ";
	int age = 26;
	char fav_letter = 's';

	// Allowed Access Modifiers : default, public, protected, private
	// Constructor ( zero argument )
	public ConstructorVsMethod() {
		age = 50;
		name = " constructored name ";
		System.out.println(" constructor called successfully " + name);
	}

	// Constructor ( parameterized )
	public ConstructorVsMethod(int i) {
		name = " parametrized name ";
		System.out.println(" constructor called successfully with parameter >> " + i);
	}

	// Methods
	// Format : (Access Modifier)(Return Type) class_name (){ body }
	// provide business logic
	// Method Signature : class_name and parameters list

	public void method_1() {
		int c = 10;
		System.out.println(" instance :empty ");
	}

	public int method_2(int i) {
		char c = 'a';
		System.out.println(" instance : input " + i + " return local variable c >> " + c);
		return c;
	}

	public Boolean method_3(Boolean decision, int age) {
		System.out.println(" instance : age >>" + age + " name >> " + name);
		if (age > 50) {
			System.out.println(" you are senior citizen ");
		}
		return decision;

	}

	public static void method_11() {
		System.out.println(" static :empty ");
	}

	public static int method_22(int i) {
		System.out.println(" static : return the input " + i);
		return i;
	}

	public static String method_33(String name, int age) {
		if (age < 10) {
			System.out.println(" static : print age >>" + age + " & return the input name >> " + name);
		}
		return name;

	}

	// passing variables as parameters
	void method_4(int a, String b) {

		System.out.println(a + " " + b);
	}

	public static void main(String[] args) {
		// purpose : Facility to initialize object of a class
		// (no return type or void)class name (){}
		// Use : to perform operation at the time of object creation
		// Compiler generates constructor,default constructor provided by compiler
		// constructor : allowed access modifiers - public / protected / private
		// Compiler generated default constructor executed by JVM at time of execution.
		// 1. default (zero argument) 2. user defined > zero argument , parameterized

		ConstructorVsMethod cvm = new ConstructorVsMethod();
		System.out.println(cvm.name);
		System.out.println(" age modified by constructor :" + cvm.age);

		ConstructorVsMethod cvm1 = new ConstructorVsMethod(10);
		System.out.println(cvm.name);

		// return and use local variables from methods
		System.out.println(cvm.method_2(1) + " return variabes form local ");

		cvm.method_1();
		cvm.method_2(100);
		cvm.method_3(true, 10);
		cvm.method_4(10, "a");

		method_11();
		method_22(100);
		method_33("shubham", 26);

		// check return value
		System.out.println(cvm.method_3(true, 10));

		/*
		 * Constructor Over Loading ( possible and allowed ) 2 constructor with same
		 * name , different no. of parameters , different types of parameters
		 * Constructor Over Riding ( not possible, not allowed ) same name , same no. of
		 * parameters , same types of parameters ,different 2 constructor cant have same
		 * name, as 2 classes with same name not allowed
		 * Static Not Allowed : Because we initialize when we create object
		 * here , value is initialized before obj creation, which is wrong
		 */

	}

}
