
public class SimplifyFraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Please enter numerator: ");
		int num= IO.readInt();
		System.out.print("Please enter denominator: ");
		int den = IO.readInt();
		
		System.out.println("Numerator = " + num + ", denominator = " + den + "; output: "+ (num/(GCF.gcf(num, den)))+"/"+(den/(GCF.gcf(num, den))));

	}

}
