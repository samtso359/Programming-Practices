
public class Sorter {

	public static void selectionSort(int[] arr) {
		for (int n=arr.length; n > 1; n--) {  // n is effective array size
			// find max from 0..n-1 and switch with n-1
			int maxIndex=0;  // set first item to be max
			for (int j=1; j < n; j++) { 
				if (arr[j] > arr[maxIndex]) {
					maxIndex = j;
				}
			}
			// switch arr[maxIndex] with arr[n-1]
			int temp = arr[n-1];
			arr[n-1] = arr[maxIndex];
			arr[maxIndex] = temp;
		}
	}
	
	public static void insertionSort(int[] arr) {
		for (int i=1; i < arr.length; i++) {
			// insert arr[i] in the sorted sub array arr[0]..arr[i-1]
			int temp = arr[i];
			int j=i-1;
			for (; j >= 0; j--) {
				if (temp < arr[j]) {
					arr[j+1] = arr[j];
				} else {
					break;
				}
			}
			arr[j+1] = temp;
		}
	}
	
	
	public static int[] getItems() {
		int n=0;
		do {
			System.out.print("How many items in array? (need at least 1) : ");
			n = IO.readInt();
		} while (n <= 0);
		
		int[] items = new int[n];
		System.out.println("Enter integers to sort:");
		for (int i=0; i < n; i++) {
			items[i] = IO.readInt();
		}
		return items;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = getItems();
		BinarySearch.printArray(arr);
		//selectionSort(arr);
		insertionSort(arr);
		BinarySearch.printArray(arr);

	}

}