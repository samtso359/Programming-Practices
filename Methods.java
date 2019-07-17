
public class Methods {
	
	public static int add(int x, int y){
		return x+y;
	}
	
	public static double add(double x, double y){
		return x+y;
	}
	
	public static void stuff(int n){
		n = n+10;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math.min(3, 5));
		System.out.println(Math.min(2.5, 5.7));
		
		System.out.println(add(4,5));
		System.out.println(add(5.6, 7.95));
		
		int n =15;
		stuff(n); // this doesn't change the n in void main, because n in stuff is different this this n. Local variable!
		System.out.println(n);
	}

}
