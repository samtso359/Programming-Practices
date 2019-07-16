
public class Longestsubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a sequence of string: ");
		String s1 = IO.readString();
		String s2 = "";
		String s3= "";
		int count=s1.length();
		int x = 0;
		char[] list=new char[s1.length()];
		for(int i =0; i<=s1.length()-1;i++){
			list[i]=s1.charAt(i);
			}
		
		while(x<count-1){
			if(list[x]==list[x+1]){
				s2=s2+list[x]+list[x+1];
			}
			x++;
				
				
		}
		System.out.print(s2);
			
		}
		
	
	}

