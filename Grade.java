import Web_cat_HW.IO;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter score, integer 0..100: ");
		int score = IO.readInt();
		
		if (score< 0|| score > 100){
			System.out.println("Score must be between 0 and 100");
			return;
		}
		
		if(score>= 90 && score <= 100){ 
			System.out.println("A");}
		else if (score >= 80) {
			System.out.println("B+");}
		else if (score >= 70) {
			System.out.println("B");}
		else if (score >= 60) {
			System.out.println("C+");}
		else if (score >= 50) {
			System.out.println("C");}
		else {
			System.out.println("F");}
		}
	}

