public class PayFriend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter payment amount: ");
		double x = IO.readDouble();
		double fee = 0;
		if(x<= 0){
			fee = 0;
		}
		if(x<=100 && x> 0){
			fee += 5;
			}
		
		if(x> 100 && x <1000){
			if((x*0.03)>6){
				fee = x*0.03;
			}
			else{
				fee += 6;
			}}
			
		if(x>= 1000 && x<10000){
			if((x*0.01) > 15){
				fee = x*0.01;
				}
			else{
				fee += 15;}}
		
		if(x>=10000 && x<15000){
			fee = x*0.01 + (x-10000)*0.01;
				}
		if(x==15000){
			fee = (x-5000)*0.01 +5000*0.02;
		}
		if(x>15000){
			fee = 10000*0.01 +5000*0.02 + (x - 15000)*0.03;
		}
		
		
		IO.outputDoubleAnswer(fee);}}

		
			
			
