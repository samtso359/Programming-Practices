
public class FlipName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter name: ");
		String name = IO.readString();
		
		// get index of blank space character in the name string
		int blankPos = name.indexOf(' ');
		/*System.out.println("space is at index " + blankPos);
		blankPos = name.indexOf('x');
		System.out.println("space is at index " + blankPos); */
		
		// extract first name
		String firstName = name.substring(0, blankPos);
		String lastName = name.substring(blankPos+1);
		System.out.println(lastName + ", " +firstName);
	}

}
