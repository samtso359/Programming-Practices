
public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter terminator value(int); ");
		int terminator = IO.readInt();
	
		System.out.print("Enter value, or terminator (int): ");
		int max = IO.readInt();
		if(max == terminator){
			System.out.println("No numbers to find max!");
			return;
		}
		
		System.out.print("Enter value, or terminator(int); ");
		int num = IO.readInt();
		while(num != terminator){
			if (num > max){
				max = num;
			}
			System.out.print("Enter value, or terminator (int): ");
			num = IO.readInt();
		}
		
		System.out.println("Max = " + max);
}}