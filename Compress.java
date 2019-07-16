
public class Compress {
	

		      
	 public static int counterwords(String str){
		    
		    int len = str.length();
		    int counter = 1;
		    
		    for(int index = 1; index < len; index++){
		    
		      if(str.charAt(index) == str.charAt(index-1)){
		      
		        counter++;
		      }
		      else{break;}
		    }
		    
		    return counter;
		  }
	 
	public static String compress(String original){
	
		String result ="";
		if(counterwords(original)==1){
			result+= original.charAt(0);
		}
		else{result+= counterwords(original);
		result+= original.charAt(0);
		}
		char[] x= original.toCharArray();
		for(int i=1; i<x.length;i++){
			if(x[i]!= x[i-1]){
				if(counterwords(original.substring(i))>1){
				result+=counterwords(original.substring(i));}
				result+=x[i];
				
				
			}
			
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(compress("qqqqqwwwwwsssssspppk"));
	
		
	}

}
