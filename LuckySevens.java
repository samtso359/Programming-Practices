public class LuckySevens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int min;
	int max;
	int count = 0;
	
	System.out.print("Enter your min range: ");
	min = IO.readInt();
	System.out.print("Enter your max range: ");
	max = IO.readInt();
	while(max<min){
		IO.reportBadInput();
		return;
	}
	
	for (int i = min; i <= max ; i++) {
        int temp = Math.abs(i); 
        while (temp > 0) {
                
                if ( temp % 10 == 7 ) {
                        
                        count++;
                }       
                temp/=10;
        }
}
	

	
	IO.outputIntAnswer(count);
	}

}
