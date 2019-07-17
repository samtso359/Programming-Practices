
public class FactFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter number of values: ");
		int numValues = IO.readInt();
		while (numValues <=0) {
			System.out.println("Number of value must be a positive int, enter again: ");
			numValues = IO.readInt();
		}
		
		/* Version 1 */
		/*int prod = 1;
		for (int i =2; i <= numValues; i ++){
			prod *= i;
		}
		
		/* Version 2 */
		/*int prod =1, i=2;
		for(; i <= numValues; i++){
			prod *= i;
		} */
		
		/* Version 3 */
		/*int prod = 1, i=2;
		for (; i<= numValues;){
				prod *= i;
				i++;
		}
		*/
		
		int prod=1, i=2;
		for (;;){	//this is an infinite for loop if there is no condition 
			if (i > numValues){
				break;
			}
			prod *= i;
			i++;
		}  
		
		System.out.print(numValues + "! = " + prod);
	}

}
