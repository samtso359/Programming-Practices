import java.text.*;
public class billsAndCoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int twenty, ten, five, one;
		int quarter, dime, nickel, cent;
		
		System.out.print("What is the total sales charge?");
		double charge= IO.readDouble();
		System.out.print("How much is the customer giving?");
		double pay = IO.readDouble();
		double change = pay-charge;
		System.out.println("Change is $"+new DecimalFormat("0.00").format(change));
		twenty = (int)change/20;
		ten=((int)change - twenty*20)/10;
		five=((int)change- twenty*20-ten*10)/5;
		one=((int)change -twenty*20-ten*10-five*5)/1;
		
		double coin = Math.round((change%(int)change)*100);
		
		System.out.println("Coin is: ."+coin);
		quarter = (int)coin/25;
		dime=((int)coin-quarter*25)/10;
		nickel = ((int)coin-quarter*25-dime*10)/05;
		cent=((int)coin-quarter*25-dime*10-nickel*05)/01;
		
		System.out.println("The change is: ");
		if(twenty>0){
			System.out.println(twenty+" $20 bills");
		}
		if(ten>0){
			System.out.println(ten+" $10 bills");
		}
		if(five>0){
			System.out.println(five+" $5 bills");
		}
		if(one>0){
			System.out.println(one+" $1 bills");
		}
		if(quarter>0){
			System.out.println(quarter+" quarters");
		}
		if(dime>0){
			System.out.println(dime+" dime");
		}
		if(nickel>0){
			System.out.println(nickel+" nickels");
		}
		if(cent>0){
			System.out.println(cent+" pennies");
		}
		
	}

}
