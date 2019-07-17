

public class F2CWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float fahrenheit;
		boolean again = true;
		
		while (again){
		System.out.print("Eneter fahrenheit value: ");
		fahrenheit = (float)IO.readDouble(); // cast to double
		
		//if statement for decision
		while (fahrenheit < -459.67){
			System.out.println("Fahrenheit value must be >= -459.67, enter again: ");
			fahrenheit = (float)IO.readDouble();
		}
		
		float celsius = (fahrenheit-32)*5/9;
		System.out.println(celsius + " degrees celcius");
		System.out.print("Do you want to go again?(Yes/No)");
		again = IO.readBoolean();}
		
	/* Version 2
		While(true){
			if (fahrenheit >= -459.67){
				break;}
		System.out.println("Fahrenheit value must be >= -459.67, enter again: ");
		fahrenheit = (float)IO.readDouble();
		}
		
		float celsius = (fahrenheit-32)*5/9;
		System.out.println(celsius + " degrees celcius");
				
	 	Version 3
	 	do{
	 		System.out.print("Enter fahrenheit  value, must be >= -459.67: ");
	 		fahrenheit = (Float)IO.readDouble();
		} while (fahrenheit < -459.67);
		float celsius = (fahrenheit-32)*5/9;
		System.out.println(celsius + " degrees celcius");
	 	
	 	*/ 	
	
	}

}
