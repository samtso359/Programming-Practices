
public class average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter terminator value(int); ");
		int terminator = IO.readInt();
		
		int sum = 0, count = 0;
		System.out.print("Enter value, or terminator (int): ");
		int num = IO.readInt();
		
		while(num != terminator){
			sum += num;
			count ++;
			System.out.print("Enter value, or terminator (int): ");
			num = IO.readInt();
		}
		if (count == 0){
				System.out.println("No numbers to average!");}
		else {
			System.out.println("Average = " + ((float)sum/(float)count)); //or u can do sum*1f/count;
		
		}}}