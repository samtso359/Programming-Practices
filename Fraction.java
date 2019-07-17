
public class Fraction {

	// fields
	private int numerator;
	private int denominator;
	
	// most general constructor
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	// constructor with just numerator, denominator defaults to 1
	public Fraction(int numerator) {
		this(numerator, 1);  // call most general constructor with 1 for denom
	}
	
	// constructor with neither numerator nor denominator, for int 1
	public Fraction() {
		this(1,1);
	}
	
	// getter
	public int getNumerator() {
		return numerator;
	}
	
	// getter
	public int getDenominator() {
		return denominator;
	}
	
	/* 
	 * Decided to make Fraction objects immutable, so not setters.  
	 */
	
	
	// string representation 
	public String toString() {  // "standard" method to return string representation of object
		return numerator + "/" + denominator;
	}
	
	
	/* This is version 1 of add, which should NOT be implemented if
	 * Fraction is to be immutable, because it changes "this" fraction
	 * to the result of the addition
	 */
	/*
	public void add(Fraction other) {
		denominator = denominator * other.denominator;
		numerator = numerator * other.denominator 
				   + denominator * other.numerator;
	}
	*/
	
	/* This is version 2 of add, which does not change "this" Fraction
	 * object. Instead, it creates a new Fraction object to hold the
	 * result and returns that.
	 */
	public Fraction add(Fraction other) {
		Fraction result = new Fraction();
		result.denominator = denominator * other.denominator;
		result.numerator = numerator * other.denominator 
				   + denominator * other.numerator;
		return result;
	}
	
	/* This is version 3 of add, which does not work with "this" Fraction
	 * object at all, because it is a static method. Instead, it only 
	 * works with the parameter fraction objects.
	 */
	public static Fraction add(Fraction f1, Fraction f2) {
		Fraction result = new Fraction();
		result.denominator = f1.denominator * f2.denominator;
		result.numerator = f1.numerator * f2.denominator 
				   + f1.denominator * f2.numerator;
		return result;
	}
	
	// check if this Fraction instance is equal to the supplied Fraction instance
	public boolean equals(Fraction other) {
		return numerator == other.numerator &&
				denominator == other.denominator;
	}
	
}