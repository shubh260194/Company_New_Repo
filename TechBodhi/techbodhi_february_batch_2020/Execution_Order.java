package techbodhi_february_batch_2020;

public class Execution_Order {

	Execution_Order() {
		System.out.println("zero arg constructor");
	}

	Execution_Order(int a) {
		System.out.println("integer arg constructor");
	}

	static {
		System.out.println("static block 1");
	}

	{
		System.out.println("intance block 1");
	}

	static {
		System.out.println("static block 2");
	}

	{
		System.out.println("intance block 2");
	}

	public static void main(String[] args) {

		Execution_Order eo = new Execution_Order();
		Execution_Order eo1 = new Execution_Order(10);

	}

}
