import Web_cat_HW.IO;

public class F2CIfElse {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float fahrenheit;
		
		System.out.print("Eneter fahrenheit value: ");
		fahrenheit = (float)IO.readDouble(); // cast to double
		
		//if statement for decision
		if (fahrenheit < -459.67f){
			System.out.println("Fahrenheit value must be >= -459.67");
			return;} //stops the program
		else {
			float celsius = (fahrenheit-32)*5/9;
			System.out.println(celsius + " degrees celcius");}
		}
	}
