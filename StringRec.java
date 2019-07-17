
public class StringRec {
	public String reverse(String x){
		if(x.isEmpty()||x.length()==1){
			return x;}
		
		else{return x.charAt(x.length()-1) + reverse(x.substring(0, x.length()-1));}
	}
	
	public static String decompress(String compressedText){
		String result="";
		int counter =0;
		int n =0;
		if(n==compressedText.length()-1){
			return result;
		}
		else if(compressedText.charAt(n)>=48 && compressedText.charAt(n)<=57){
			counter = compressedText.charAt(n)-48;
			if(counter>1){
				result+= compressedText.charAt(n);
				counter--;}}
			
		else if(compressedText.charAt(compressedText.length()-1)<48 && compressedText.charAt(compressedText.length()-1)>71){
			result+= compressedText.charAt(n);
			n++;
		}
		
			
			return compressedText.charAt(compressedText.length()-1)+decompress(compressedText.substring(0, compressedText.length()-1));
			
		}
	}

