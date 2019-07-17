
public class TwoSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num;
		double input;
		double smallest;
		double smallest2;
		double smallest3;
		int count = 0;
		
		System.out.print("Enter terminator value: ");
		double terminator = IO.readDouble();
		count =1;
		
		System.out.print("Enter value, or terminator: ");
		num = (IO.readDouble()); 
		while(num==terminator){
			IO.reportBadInput();
			System.out.print("Enter value, or terminator: ");
			num = (IO.readDouble()); }
		input = num;
		smallest= input;
		smallest2= input;
		smallest3=input;
		
		System.out.print("Enter value, or terminator: ");
		num = (IO.readDouble()); 
		while(num==terminator){
			IO.reportBadInput();
			System.out.print("Enter value, or terminator: ");
			num = (IO.readDouble()); }
		if(num!=terminator){
			input =num;
			if(input < smallest){
				smallest2 = smallest;
				smallest =input;
			}
			else if(input < smallest2){
				smallest2=input;
			}
			else if(input > smallest && input > smallest2){
				smallest3 = input;
				if(smallest==smallest2){
					smallest2 = smallest3;}}}
		
		while(num!=terminator){
			System.out.print("Enter value, or terminator: ");
			num = IO.readDouble();
			
		
		if(num!=terminator){
			input =num;
			if(input < smallest){
				smallest2 = smallest;
				smallest =input;
			}
			else if(input < smallest2){
				smallest2=input;
			}
			else if(input > smallest && input > smallest2){
				smallest3 = input;
				if(smallest==smallest2){
					smallest2 = smallest3;}}
			}
		}
		IO.outputDoubleAnswer(smallest);
		IO.outputDoubleAnswer(smallest2);
		}}
	
