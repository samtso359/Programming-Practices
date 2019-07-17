
public class Recursion {
	//n is assumed to be >= 1
	
public static int fact(int n){
	if(n==1) { // termination condition (aka base case)
		return 1;
	}
	return n*fact(n-1);
}

public static boolean isPalindrome(String s){
	if (s.length() == 0 || s.length()==1){ //termination
			return true;
	}
	if(s.charAt(0) != s.charAt(s.length()-1)){ //termination
		return false;
	}
	return isPalindrome(s.substring(1,s.length()-1));
}


private static void printLine(int n){
	System.out.print('k');
	for(int i=0; i <n-1; i++){
		System.out.print(' ');
	}
	System.out.println('k');
}

public static void bigK(int n){
	if (n==1){ //termination
		System.out.println('k');
		return;
	}
	printLine(n); // top line
	bigK(n-1); // recursion
	printLine(n);
}

//recursive method to find max of arr[start..length -1]
private int max(int[] arr, int start){
	if(start == arr.length-1){// only one thing left
		return arr[start];
	}
	
	//recursion
	return Math.max(arr[start], max(arr,start+1));
}
public int max(int[] arr){
	return max(arr, 0);
}

public static void main(String[] arg){
	bigK(10);
}
}
