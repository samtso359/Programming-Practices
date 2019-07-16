
public class AdditivePersistence {

	//computes and returns the sum of digits of input n
	public static int sumDigits(int n){
		int sum=0;
		while(n>9){
			sum += n%10;
			n /= 10;
		}
		sum +=n;
		return sum;
	}
	
	public static int getInput() {
		int n;
		do {
			System.out.print("Enter number, >0: ");
			n = IO.readInt();
		} while (n<= 0);
		return n;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = getInput();
		System.out.println("Input value = " + n);
		int count = 0;
		while (n>9){
			n = sumDigits(n);
			count++;
		}
		System.out.println("Additive persistence = " + count);
		System.out.println("Digital root = " + n);
	}

}
