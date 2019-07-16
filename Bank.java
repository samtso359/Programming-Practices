
public class Bank {
	private int account_number;
	private int balance;
	private int last_transaction_amount = 0;
	public Bank(int account_number, int balance){
		this.account_number = account_number;
		this.balance = balance;
	}

	
	public void deposit(int amount){
		if(amount >=0){
		balance += amount;
		this.last_transaction_amount = amount;}
	}
	
	public void withdraw(int amount){
		if(amount >0){
		balance -= amount;
		this.last_transaction_amount = amount*-1;}
	}
	
	public int get_balance(){
		return balance;
	}
	public void get_into(){
		System.out.println("Account number: "+account_number);
		System.out.println("$"+balance+"\n");
	}
	
	public void set(int account_number){
		this.account_number = account_number;
	}
	
	public void transfer(Bank a, int amount){
		this.balance += amount;
		a.balance -= amount;
		this.last_transaction_amount = amount;
	}
	public void undo_transfer(Bank a){
		this.balance-=last_transaction_amount;
		a.balance += last_transaction_amount;
		this.last_transaction_amount = last_transaction_amount*-1;
	}
}
	
	
