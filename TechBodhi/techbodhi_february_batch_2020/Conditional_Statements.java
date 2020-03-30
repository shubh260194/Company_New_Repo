package techbodhi_february_batch_2020;

public class Conditional_Statements {

	public static void main(String[] args) {

		// condition based
		// case 1

		if (true) {
			System.out.println(" print if 1 ");
		} else {
			System.out.println(" print else ");
		}

		// case 2 : only if can also work
		// * for single statement we can skip curly braces

		if (true) {
			System.out.println(" print if 2 ");
		}

		if (true)
			System.out.println(" print if 3 ");

		// without if else wont work

		// else {
		// System.out.println(" print if 4");
		// }

		// we can put if else if else if ... else , to check multiple condition
		if (false) {
			System.out.println(" condition 1 ");
		} else if (false) {
			System.out.println(" condition 2 ");
		} else if (false) {
			System.out.println(" condition 3 ");
		} else {
			System.out.println(" all conditions are false ");
		}

		// optimisation


	}

}
