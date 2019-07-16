package Web_cat_HW;

import java.util.ArrayList;

public class recitation_exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Please enter your prefered gender(male/female): ");
		String gender = IO.readString();
		
		System.out.print("Do you have a favorite number?(Yes/No) ");
		boolean num_y_n = IO.readBoolean();
		
		System.out.print("Please enter your favorite number: ");
		int num = IO.readInt();
		
		
		if(gender.equals("female")){
			if(num > 8){
			System.out.print("Your true love is Alice!");
		}
		
			else if(num <= 8){
			System.out.print("Your true love is Samantha!");
		}
		
			else if(num <0){
			System.out.print("Your true love is Cathy!");
		}
			else{
				System.out.print("No match for you.");
			}
		
		}
		
		else if(gender.equals("male")){
			if(!num_y_n){
				System.out.print("Your true love is Richard!");
			}
			
			else if((num%3==0) && (num%2 !=0)){
				System.out.print("Your true love is Sam!");
			}
			
			else if((num%2)==0){
				System.out.print("Your true love is Bob!");
		}
			else{
				System.out.print("No match for you.");
			}
		}
	}
}
