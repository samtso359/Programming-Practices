//public = can be accessed from OUTSIDE of the CLASS
//private = can only be accessed WITHIN the CLASS
//static =

//if no construct there, default constructor will always be there

public class Employee { //recitation10
	 String name;
	private double balance;
	private double rate;
	
	//public Employee(){ //default constructor
		
	//}
	public Employee(String name, double rate, double balance){
		
	}
	public Employee(double rate){
		this.rate = rate;
		this.balance = 0;
	}
	public Employee(double balance, double rate){
		this.balance = balance; //this means public class employee
		this.rate = rate;
	}
	public Employee(int hours){
		this.rate = rate;
		this.balance = 0;
	}
	
	//public Employee(String name, int hours){ this overloads the constructor
		
	//}
	
	public void work(int hours){
		if(hours >= 0){
			
		balance += hours*rate;}
		else{
			System.out.println("bad hours");
		}
		
	}
	
	//public void work(String hours){ // this overloads a method
		
	//}
	
	
	public void spend(double money){
		if(money <0|| money > balance){
			System.out.println("bad money");
			return;}
		balance -= money;}
		
	
	
	public double getBalance(){ 
		return balance;
	}
	public void setBalance(double balance){
		this.balance = balance;
	}
	
	public void printInfo(){
		System.out.println(name + " " + rate + " " + balance);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
