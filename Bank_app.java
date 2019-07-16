
public class Bank_app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Bank a = new Bank(001, 100);
	Bank b = new Bank(002, 0);
	Bank c = new Bank(003, 999999);
	b.get_into();
	b.transfer(a, 1);
	System.out.println("after transfering $1 from Bank 1");
	b.get_into();
	a.get_into();
	b.undo_transfer(a);
	b.get_into();
	a.get_into();
	}

}
