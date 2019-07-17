
public class WordCount2 {

	public static void main(String[] args){
		String sen = IO.readString();
		String word = IO.readString();
		sen = sen.toLowerCase();
		word = word.toLowerCase();
		int counter = 0;
		System.out.println("text1:" +sen.indexOf("PP"));
		while(sen.indexOf(word)!=-1){
			counter ++;
			sen=sen.substring(sen.indexOf(word)+word.length());
			
		}
		IO.outputIntAnswer(counter);
	}
}
