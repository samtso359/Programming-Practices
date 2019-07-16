public class TwoSmallest {

    public static void main(String[] args) {
    	double terminator;
        double input;
        double min;
        double min2;
        double temp;
        int counter=0;


       do{ 
    	   
    	   System.out.print("Enter terminator value:");
        terminator = IO.readDouble();

        System.out.print("Enter numbers or terminator value:");
        input = IO.readDouble();
        min = input;
        min2 = input;
    	if(input == terminator){IO.reportBadInput();}
    	if(input != terminator){counter++;}
    	
       	}while(input== terminator);
    
      
       while (input != terminator){
    	   
        	 System.out.print("Enter numbers or terminator value:");
             input = IO.readDouble();
             if(input == terminator && counter<2){
            	 do{
            		IO.reportBadInput();
              	   System.out.print("Enter terminator value:");
                   terminator = IO.readDouble();
                   System.out.print("Enter numbers or terminator value:");
                   input = IO.readDouble();
                
             }while(input==terminator);}
             if(input!=terminator){ counter++;}
             if(input!=terminator&& counter==2){
            	 min2=input;
             }
             
             if(input == terminator &&counter >=2){
            	
            IO.outputDoubleAnswer(min);
     		IO.outputDoubleAnswer(min2);
     		break;}
        	if(input < min){
				min2 =min;
				min = input;}
        	
        	else if(input<min2){
        		min2=input;
			}
        	
        	
        	
       }
        	
     
				
			
			
          
    }}