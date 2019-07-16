
public class Employeeapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Employee a = new Employee(2000, 10);
		Employee b = new Employee(20);
		Employee c = new Employee(8);
		
		a.name = "A";
		b.name = "B";
		c.name = "C";
		
		a.work(10);
		b.work(10);
		c.work(10);
		
		a.spend(500);
		b.spend(500);
		c.spend(500);
		
		a.printInfo();
		b.printInfo();
		c.printInfo();*/
		
		int numOfEmployees = 3;
		Employee[] employees = new Employee[numOfEmployees];
		for(int i = 0; i < employees.length; i++){
			//insert user's input here, ask for name, rate and balance
			employees[i] = new Employee("a"+i, 10+i, 0);}
		
	
	for(int x = 0; x<employees.length; x++){
		employees[x].work(5);
		employees[x].spend(10);
		employees[x].printInfo();
	}
		
	}}

