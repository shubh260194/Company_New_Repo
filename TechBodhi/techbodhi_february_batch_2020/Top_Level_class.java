package techbodhi_february_batch_2020;

public class Top_Level_class {
	// Allowed : public, default ,abstract , final
	// Not Allowed : Static

	int outer_class = 100;

	void outer_class_method() {
		System.out.println(" outer class method ");
	}

	class Inner_Class_1 {

		int inner_class = 200;

		void inner_class_method() {
			System.out.println(" inner class method ");

		}

	}

	public static void main(String[] args) {

		int local;

	}

}
