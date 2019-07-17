
public class FractionApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fraction f1 = new Fraction(2,3); 	//new, allocate space for fraction object, and sets fields to default values(zeros for number, null for objects)
		System.out.println(f1.toString());
		Fraction f2 = new Fraction(1, 3);
		Fraction f3 = new Fraction();
		System.out.println(f3.toString());
		
		System.out.println(f1.getDenominator());
		
		//version 2
		//Fraction f4 = f1.add(f1, f2);
		
		//version 3
		Fraction f4 = Fraction.add(f1,  f2);
		System.out.println(f4.toString());
	}

}
