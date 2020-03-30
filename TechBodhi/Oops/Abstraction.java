package Oops;

// samplecomment to test pull

public class Abstraction {
	// hide internal implementation & highlighting set of services offered
	// Security , improves maintainability , easy enhancement
	// tightly encapsulated class : each n every variable should be private
	// loosely encapsulated class : all the data members are not private 
	// case parent child : All classes must have private data members for tight encapsuled
	// if parent class is tightly encapsulated, no child class can be tight encapsuled

	private int balance;

	public int get_balance() {
		System.out.println(this.balance);
		return balance;
	}

	public int withdraw(int amount) {
		balance = this.balance - amount;
		return balance;
	}

	public int set_balance(int deposit) {
		this.balance = balance + deposit;
		return balance;
	}

	public static void main(String[] args) {
		Abstraction ab = new Abstraction();
		ab.set_balance(200);
		ab.set_balance(300);
		ab.withdraw(100);
		ab.get_balance();

	}

}
