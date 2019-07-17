
public class SumDefinite{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter number of value(int); ");
		int numValues = IO.readInt();
		if(numValues <= 0){
			System.out.println("Number of values must be a positive int");
		}
		int sum = 0, count = 0;
		
		while(count != numValues){
			System.out.print("Enter value, or terminator (int): ");
			sum += IO.readInt();
			count++;
		}
		
		System.out.println("Sum = " + sum);
}}