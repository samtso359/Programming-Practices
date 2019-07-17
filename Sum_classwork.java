
public class Sum_classwork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter terminator value(int); ");
		int terminator = IO.readInt();
		
		int sum = 0;
		System.out.print("Enter value, or terminator (int): ");
		int num = IO.readInt();
		
		while(num != terminator){
			sum += num;
			System.out.print("Enter value, or terminator (int): ");
			num = IO.readInt();
		}
		
		System.out.println("Sum = " + sum);
}}