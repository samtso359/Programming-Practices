
public class VandC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter text: ");
		String text = IO.readString();
		
		int vowels =0, consonants = 0;
		//scan string to get each character
		for (int i=0; i < text.length(); i++){
			char ch = text.charAt(i);
			if (!Character.isLetter(ch)){       // if the character is not a letter, it skips and continue, only works in loops
				continue;
			}
			
			ch = Character.toLowerCase(ch);
			if ( ch == 'a'|| ch=='e'|| ch == 'i'|| ch == 'o' || ch =='u'){
				vowels ++;
			} else{
				consonants ++ ;
			}
					
		}
		System.out.println("vowels =  " + vowels + ", consonants = " + consonants);
	}

}
