package techbodhi_february_batch_2020;

public class Loops {

	public static void main(String[] args) {

		/*
		 * for loop
		 * 
		 * for(intialization 1 ; condition 2,5,8.. ; increment/decrement 4,7.. ) {body 3,6..}
		 * loop will execute until , condition turns false
		 * initialization part is optional inside loop , but have to declare somewhere else
		 * we can write syso at intialization part
		 * more than 1 intialization not possible  
		 * more than 1 declaration  possible
		 * if conditional part is skipped, loop turns infinite
		 * condition must return boolean value : True / False
		 * increment decrement is optional
		 */


		
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		

//		for (; i <= 2; i++) {
//			System.out.println(i);
//		}
		
		int i=0 ;
		int j=0;
		int k=0;
		
		for (System.out.println(" initialization replaced "); j <= 2; j++) {
			System.out.println(j);
		}
		
		//for (int k = 0; char c='c'; k <= 10; k++)
		
//		for (int l = 0, k=10; l <= 10; l++) {
//			System.out.println(l);
//		}
		
		
		//condition : true , always true : infinite loop
		
//		for (int n = 1; n>0; n++) {
//			System.out.println(n);
//		}
//		
//		for (int m = 0; true; m++) {
//			System.out.println(m);
//		}
		
//	 ++ , -- optional
//		for (int p = 10; p >=0;) {
//			System.out.println(p);
//		}
		
		for (int o = 10; o >=0; o--) {
			System.out.println(o);
		}
		
//		for (System.out.println("a"); ; System.out.println("c")) {
//			System.out.println(" every part is optional ");
//		}
		
		
		// while loop : 
//		runs until if finds condition true
//		not based on fixed no of iterations >>	while( condition ){ body }	
		
		int i1 = 0;
		while (i1 < 5) {
			System.out.println(i1);
			i1++;
		}
		
// infinite loop as i1<5 is always true
//		while (i1 < 5) {
//			System.out.println(i1);
//		}
		
		while (i1<0) {
			System.out.println(i1);
			i1++;
		}
// unreachable statement
		
		
		
		// do while loop
		// when we need to execute loops body atleast one time
		
		int i2 = 0;

		do {
			System.out.println(i2);
			i2++;

		} while (i2 <= 10);
		
//	un reachable code
//		do {
//			System.out.println(i2);
//			i2++;
//
//		} while (true);
//		System.out.println("abc");
		
		
		do {
			System.out.println(i2);
			i2++;

		} while (false);
		System.out.println(" check ");
		

	}

}
