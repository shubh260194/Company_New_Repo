package Oops;

public class OverRiding extends Childs {

	void method() {
		System.out.println(" overriding ");
	} 

	public static void main(String[] args) {
 
// over riding ( compulsory in 2 different class )  
// re writing implementation, with same method signature
// run time polymorphism / dynamic polymorphism / late binding
// method resolution , based on run time object > object matters
// over ridden : same name , same argument types , co-variant return types
// after all possible Auto Promotion,check for compilation error, if not found matched method
// scope of access modifier can't be reduced while over riding
// child class method return types must be co variant
// over riding not applicable for below conditions > parent/other class private, final methods, static methods
// static methods : seems over ridden -> but its method hiding
// scope changing allowed : Abstract -> Non Abstract , Non Abstract -> Abstract  
// ex. interface, abstract class, parent-child classes, 
// in method hiding, method resol. taken care by compiler, reference will matter
// over riding : only new copy -child copy is available 
// in method hiding ; both copies available -> parent , child
		

		Parents p = new Parents(); // other class 
		p.method();

		Childs c = new Childs(); // parent class ref , parent class object
		// OverRiding c1 = new Childs();
		c.method();

		OverRiding o = new OverRiding(); // child class ref , child class object
		o.method();
		
		Childs c1 = new OverRiding(); // parent class ref , child class object
		c1.method();
		
		//OverRiding o2 = new Childs(); // child class ref , parent class object
		//o2.method();

	}
}

class Parents {

	void method() {
		System.out.println(" parents ");
	}

}

class Childs {

	void method() {
		System.out.println(" childs ");
	}

}