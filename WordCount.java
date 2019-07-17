
public class WordCount {
	
	public static int countLetters(String str){
	
        int counter = 0;
        String[] tokens = str.split(" ");
        for(int i=0; i < tokens.length; i++){
			for(int x =0; x<tokens[i].length(); x++){
            if (Character.isLetter(tokens[i].charAt(x)))
                counter++;
        }}
       
        return counter;
	}
	
	public static int countWords(String original, int minLength){
		int words = 0;
		int counts=0;
		String[] tokens = original.split(" ");
		for(int i=0; i < tokens.length; i++){
	
			System.out.println(tokens[i]);
			if(countLetters(tokens[i])>=minLength){
				words++;		
				 }
		}
		System.out.println(words);
		return words;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

}
