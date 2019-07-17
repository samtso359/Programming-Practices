
public class MaxWithArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter number of values: ");
		int n = IO.readInt();
		
		//set up a double array of length n
		double[] arr = new double[n]; //double array of length n
		
		//loop to read n values from user
		for (int i=0; i<n; i++){
			System.out.print("Enter value: ");
			arr[i]=IO.readDouble();
		}
		
		//compute max
		/*
		double max = arr[0];
		for (int i = 1; i<n; i++){
			if(arr[i]>max){
				max = arr[i];
			}
		}
		*/
		//Or, start with minimum possible value that can be stored in computer as initial max
		double max = Double.MIN_VALUE;   //use as initial that is always less than any other value
		for (int i=0; i<n;i++){
			if (arr[i]>max){
				max = arr[i];
			}
		}
		printArray(arr);
		System.out.println("max = " + max);
		
	}
	
	public static void printArray(int[] arr){
		System.out.print("[");
		if(arr.length > 0){
			System.out.print(arr[0]);
		}
		for (int i =1; i<arr.length; i++){
			System.out.print(","+arr[i]);
		}
		System.out.println("]");
	}
	
	public static void printArray(double[] arr){
		System.out.print("[");
		if(arr.length > 0){
			System.out.print(arr[0]);
		}
		for (int i =1; i<arr.length; i++){
			System.out.print(","+arr[i]);
		}
		System.out.println("]");
	}


}
