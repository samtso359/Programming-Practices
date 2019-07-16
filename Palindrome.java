
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a string: ");
		String s1 = IO.readString();
		s1 = s1.replaceAll("\\s+","");
		System.out.println(s1);
		String s2="";
		for(int i = s1.length()-1;i>=0;i--){
			s2=s2+s1.charAt(i);
		}
		System.out.println(s2);
		if(s1.compareToIgnoreCase(s2)==0){
			System.out.println("True, the string is a palindrome");
		}
		else{System.out.println("False, the string is not a palindrome");}
		
		
	}

}
