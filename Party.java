

public class Party {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Number of people attending the party: ");
		int a = IO.readInt();
		System.out.print("Number of slices of pizza each person can eat: ");
		int b = IO.readInt();
		System.out.print("Number of cans of soda each person can drink: ");
		int c = IO.readInt();
		System.out.print("Cost of one pizza pie: ");
		double d = IO.readDouble();
		System.out.print("Number of slices in a pizza pie: ");
		int e = IO.readInt();
		System.out.print("Cost of a case of soda: ");
		double f = IO.readDouble();
		System.out.print("Number of cans of soda in a case of soda: ");
		int g = IO.readInt();
		
	
		
		double pizza = ((Math.ceil(((a*b)/(float)e))*d));
		double soda =  ((Math.ceil(((a*c)/(float)g))*f));
		double total =  (pizza+soda);

		IO.outputDoubleAnswer(total);
		
	}

}
