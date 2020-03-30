package Logic;

public class Swap_Numbers {

	int a;
	int b;
	int temp;

	public void swap_No_with_temp(int a, int b) {

		System.out.println("before swap  a " + a + " " + "b" + b);
		temp = b; // temp = 200
		b = a; // b = 100
		a = temp; // a = 200
		System.out.println("after swap b " + a + " " + "b" + b);

	};

	public void swap_No_without_temp(int a, int b) {

		System.out.println("before swap  a " + a + " " + "b " + b);
		a = a + b; // a = 300
		b = a - b; // b = 300-200 = 100
		a = a - b; // a = 300-100 = 200

		System.out.println("after swap b " + a + " " + "b " + b);

	};

	public static void main(String[] args) {
		Swap_Numbers sn = new Swap_Numbers();
		sn.swap_No_with_temp(100, 200);
		sn.swap_No_without_temp(200, 400);

	}

}
