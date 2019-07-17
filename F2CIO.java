import Web_cat_HW.IO;

public class F2CIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float fahrenheit;
		
		System.out.print("Eneter fahrenheit value: ");
		fahrenheit = (float)IO.readDouble(); // cast to double
		
		float celsius = (fahrenheit-32)*5/9;
		System.out.println(celsius + " degrees celcius");
	}

}
