import Web_cat_HW.IO;

public class F_to_C {

	public static void main(String[] args){ 
		// TODO Auto-generated method stub
		float Fahrenheit; //f next the value makes it a float constant, else it is double
		System.out.print("Enter Fahrenheit value: "); //read user's entered value
		Fahrenheit = (float)IO.readDouble(); // cast to float
		float celsius = (Fahrenheit-32)*5.0f/9;
		System.out.println(celsius + " degree Celcius");
		
		
		/* the following block of statement won't work because y cannot be assigned to x */
		/*
		float x=0;
		double y=42.5;
		x=y;
		*/
		/* a different way of writing the formula */
		celsius = (Fahrenheit-32)*(5/9); 
		System.out.println(celsius + " degrees celsius");
		/* celsius = (Fahrenheit-32)*(5.0/9);  this won't work because 5.0 makes the whole thing a double */
		celsius = (Fahrenheit-32)*(5.0f/9);
		System.out.println(celsius + " degrees celsius");
	
		//casting a larger type to a smaller type
		float x = (float)55.6; //cast 55.6 (double) to x (float)
		
		//  max and min values for types
		System.out.println("max int value = "+ Integer.MAX_VALUE);
		System.out.println("min int value = "+ Integer.MIN_VALUE);
		
		System.out.println("max short value ="+ Short.MAX_VALUE);
		System.out.println("min short value ="+ Short.MIN_VALUE);
		
		//boolean
		boolean b=false; // false and true are boolean constants NOT DOUBLE QUOTED
		System.out.println("b=" + b);
		boolean notb = !b;
		System.out.println("!b=" + notb);
		
		boolean c = false;
		System.out.println("b or c = "+ (b || c));
		System.out.println("!b or c = " + (!b || c));
		
		System.out.println("b and c = " + (b && c));
		System.out.println("!b and !c = " + (!b && !c));
		
		//char
		char ch1 = 'c';
		char ch2 = ' ';
		/* ch1 = "c"; -> Does not work because double quotes means string type */
		
		System.out.println(ch1);
		System.out.println(ch2+ch1); 
	}
		
}
