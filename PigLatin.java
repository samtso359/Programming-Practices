
public class PigLatin {
	
	public static String translate(String original){
		String vowels = "AEIOUaeiou";
		String translated = "";
		String consonants = "bBcCdDfFgGhHjJkKlLmMnNpPqQrRsStTVvWwXxYyZz";

		for(int i = 0; i<consonants.length(); i++){
			for(int g = 0; g<vowels.length(); g++){
			if(original.charAt(0)==consonants.charAt(i)){
				translated = original.substring(1)+original.charAt(0)+"ay";
				break;
			}
			else if(original.charAt(0)==vowels.charAt(g)){
				translated = original +"way";
				break;
			}
			
			}
		}
		System.out.println(translated);
		return translated;
	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
}
