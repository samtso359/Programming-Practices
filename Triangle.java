
public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		do {
			System.out.print("Enter number, >0: ");
			n = IO.readInt();
		} while (n<= 0);
		
		for (int i = 1; i <= n; i ++){
			//System.out.println("i=" + i);
			for (int j=1; j<=i ; j++){
				//System.out.println("\tj=" + j);
				System.out.print('*');
		
			}
			System.out.println();
		}
		
		
	}
}
