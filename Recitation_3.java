
public class Recitation_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
	System.out.print("What is your name? ");
	String name = IO.readString();
	System.out.print("What is your age " + name + "? ");
	int age = IO.readInt();
	
	if (age >= 21) {
		System.out.println("Congratulation! You can vote, get your license and drink alcohol!");}
	else if (age >= 18 && age < 21){
		System.out.println("You can vote and get your license but you CANNOT drink alcohol until 21!");}
	else if (age >= 17 && age < 18){
		System.out.println("You can get your license, but you CANNOT vote until next year and you CANNOT drink until 21!");}	
	else {
		System.out.println("GET OUT!");}
	
	}
}
