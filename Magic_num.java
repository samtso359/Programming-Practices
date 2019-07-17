import java.util.ArrayList;
import java.util.List;

public class Magic_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("What is the number you want to check? ");
		int num=IO.readInt();
		List<Integer> a = new ArrayList<Integer>();
		int sum=0;
		for(int i =1; i<=num;i++){
			if(num%i==0){
				a.add(i);
				sum+=i;
			}
	
		}
		if(sum-num==num){
			System.out.println("This is a magical number!");
		}
		else{
			System.out.println("This is not a magical number!");
		}
	}

}
