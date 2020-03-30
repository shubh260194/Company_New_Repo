package techbodhi_february_batch_2020;

final class Final_Class_A {

	// final : class - prevent inheritance, can't inherit this class
	// final : methods - prevent over riding,
	// final : variable - to create constant variables

	final int a = 10;

	Final_Class_A() {
		// this.a=20;
		System.out.println(" constructor ");
		System.out.println(this.a);
	}

	final void m1() {
		System.out.println(" method ");
	}

	void m1(int a) {
		System.out.println(" over loaded m1 final method ");
	}

	// try over riding in other class
	// final void m1() {
	// System.out.println(" method ");
	// }

	public static void main(String[] args) {

		Final_Class_A fca = new Final_Class_A();

		System.out.println(fca.a);
		fca.m1();

	}

}
