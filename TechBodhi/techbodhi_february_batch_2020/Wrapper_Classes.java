package techbodhi_february_batch_2020;

public class Wrapper_Classes {
/* 
A Wrapper class is a class whose object wraps or contains a primitive data types.
When we create an object to a wrapper class, it contains a field and in this field,
we can store a primitive data types. 
In other words, we can wrap a primitive value into a wrapper class object.
*/
	
/*       Need of Wrapper Classes
They convert primitive data types into objects.
Objects are needed if we wish to modify the arguments passed into a method 
(because primitive types are passed by value).
The classes in java.util package handles only objects and 
hence wrapper classes help in this case also.
Data structures in the Collection framework, 
such as ArrayList and Vector, store only objects (reference types) and not primitive types.
An object is needed to support synchronization in multithreading.
*/

/*      
          Autoboxing
Automatic conversion of primitive types to the object of their corresponding wrapper classes
For example – conversion of int to Integer, long to Long, double to Double etc.

           Unboxing
It is just the reverse process of autoboxing. 
Automatically converting an object of a wrapper class 
to its corresponding primitive type is known as unboxing. 
For example – conversion of Integer to int, Long to long, Double to double etc.

 */
	
	public static void main(String[] args) {
	    //  byte data type 
        byte b = 1; 
        // wrapping around Byte object 
        Byte byteobj = new Byte(b); 
        
	    //  short data type 
        short  s = 10; 
        // wrapping around short object 
        Short shortobj = new Short(s); 
  
        // int data type 
        int i = 100;  
        //wrapping around Integer object 
        Integer intobj = new Integer(i); 
        
        // long data type 
        int l = 100000000;  
        //wrapping around Long object 
        Long longobj = new Long(l);
  
        // float data type 
        float f = 18.6f;   
        // wrapping around Float object 
        Float floatobj = new Float(f); 
  
        // double data type 
        double d = 250.5;  
        // Wrapping around Double object 
        Double doubleobj = new Double(d); 
  
        // char data type 
        char c = 'a'; 
        // wrapping around Character object 
        Character charobj = c; 
  
        //  printing the values from objects 
        System.out.println("Values of Wrapper objects (printing as objects)"); 
        System.out.println("Byte object byteobj:  " + byteobj+" primitive "+b); 
        System.out.println("Short object shortobj:  " + shortobj+" primitive "+s); 
        System.out.println("Integer object intobj:  " + intobj+" primitive "+i);
        System.out.println("Long object intobj:  " + longobj+" primitive "+l);
        System.out.println("Float object floatobj:  " + floatobj+" primitive "+f); 
        System.out.println("Double object doubleobj:  " + doubleobj+" primitive "+d); 
        System.out.println("Character object charobj:  " + charobj+" primitive "+c); 
  
        // objects to data types (retrieving data types from objects) 
        // unwrapping objects to primitive data types 
        byte bv = byteobj;
        short sv = shortobj;
        int iv = intobj;   
        long lv = longobj;
        float fv = floatobj; 
        double dv = doubleobj; 
        char cv = charobj; 
  
        // printing the values from data types 
        System.out.println("Unwrapped values (printing as data types)"); 
        System.out.println("byte value, bv: " + bv); 
        System.out.println("short value, sv: " + sv); 
        System.out.println("int value, iv: " + iv); 
        System.out.println("long value, iv: " + lv);
        System.out.println("float value, fv: " + fv); 
        System.out.println("double value, dv: " + dv); 
        System.out.println("char value, cv: " + cv); 
		

	}

}
