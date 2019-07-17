
public class DateFormatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter date in <month>/<day>/<year> format: ");
		String dateString = IO.readString();
		
		//get month substring
		int pos = dateString.indexOf("/");
		String monthString = dateString.substring(0, pos);
		//get date substring
		int nextPos = dateString.indexOf('/', pos+1);
		String date = dateString.substring(pos+1, nextPos);
		//get year substring
		String year = dateString.substring(nextPos+1);
		
		String[] monthNames = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep"
								, "Oct", "Nov", "Dec"};
		
		//convert monthString to an integer
		
		int month = Integer.parseInt(monthString);   //takes the integer out of a string 
		
		//print
		System.out.println(monthNames[month-1] + " " + date + ", "+ year);
	
		}
		
	}

