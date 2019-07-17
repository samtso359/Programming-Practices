
public class SumFor{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter number of value(int); ");
		int numValues = IO.readInt();
		if(numValues <= 0){
			System.out.println("Number of values must be a positive int");
		}
		int sum = 0;
		for (int i = 0; i < numValues; i++){
			System.out.print("Enter value: ");
			sum += IO.readInt();
		}
		
		System.out.println("Sum = " + sum);
}}