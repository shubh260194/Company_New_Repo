package Another_Package;

public class Another_Base_Class {

	public static void method_ap() {
		System.out.println(" This is method ");
		method_ap2();
	}

	static void method_ap2() {
		System.out.println("This is method2 ");
	}

	public static void main(String[] args) {

		System.out.println(" This is First Line ");

		System.out.println(" This is Second Line ");

		method_ap();

	}

}
