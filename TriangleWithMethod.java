
public class TriangleWithMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = getInput();
		
				
		for (int i = 1; i <= n; i ++){
			System.out.println("i=" + i);
			writeRow(i); //call to method writeRow
			System.out.println();
		}
	}
	
///////////////////////////////////////////////////////////////////////////////////////////////
	public static int getInput() {
		int n;
		do {
			System.out.print("Enter number, >0: ");
			n = IO.readInt();
		} while (n<= 0);
		return n;
	}

	public static void writeRow(int i) {
		for (int j=1; j<=i ; j++){
			System.out.println("\tj=" + j);
			System.out.print('*');

		}
	}
}
