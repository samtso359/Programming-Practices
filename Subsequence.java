public class Subsequence{
  
  public static void main(String[] args){
    
    //test your method here
    System.out.println(subseq("abaabacccaabbbba"));
    System.out.println(subseq("aaaaaa"));
  }
  
  public static String subseq(String str){
    
    int len = str.length();
    int longestSubsequenceStart = 0;
    int longestSubsequenceLength = 1;
    int currentSubsequenceStart = 0;
    int currentSubsequenceLength = 1;
    
    for(int index = 1; index < len; index++){
    
      if(str.charAt(index) == str.charAt(index-1)){
      
        currentSubsequenceLength++;
      
        if(currentSubsequenceLength > longestSubsequenceLength){
        
          longestSubsequenceStart = currentSubsequenceStart;
          longestSubsequenceLength = currentSubsequenceLength;
        }
      }
      else{ // different letter, so start over
      
        currentSubsequenceStart = index;
        currentSubsequenceLength = 1;
      }
    }
    
    String subseq = "";
    for(int i = longestSubsequenceStart; i < longestSubsequenceStart+longestSubsequenceLength; i++){
    
      subseq += str.charAt(i);
    }
    
    return subseq;
  }
}