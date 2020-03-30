package techbodhi_february_batch_2020;

public class Bird {

	// constructor : to initialize value of object
	// 1. default 2.parameterized, over loading allowed
	Bird() {
		name = "bird_constructor";
	}
	
	Bird(String name) {
		name = "bird_constructor";
	}

	// properties

	static String name = "parrot";
	String color = "red";
	int weight = 10;
	int flight = 1000;

	// behavior
   
	void fly() {

		if (name == "eagle") {
			System.out.println(" Eagle flies 1000 m high");
		} else {
			System.out.println(name + " flies lower than Eagle");
		}

	}
	


}
