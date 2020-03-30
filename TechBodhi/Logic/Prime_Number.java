package Logic;

public class Prime_Number {
	
	// comment line
	// 2 3 5 7 11 ... divide by 1 and itself

	// logic 1
	int count = 0;

	public void check_prime_no(int num) {
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println(" yeahhh!!! its a prime number ");
		} else {
			System.out.println(" sorry ");
		}
	}

	// logic 2
	int flag = 1;
	int j;

	// num
	public void check_prime_no_1(int num) {
		if (num <= 1) {
			flag = 0;
		}
		while (j <= num / 2) {
			if (num % j == 0) {

			}

		}

	}

	public static void main(String[] args) {

		Prime_Number pn = new Prime_Number();
		// pn.check_prime_no(2);
		pn.check_prime_no_1(12);
	}

}
