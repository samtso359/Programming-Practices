
public class Cities {
	//tells if the city is legitimate, i.e. only has letters
	// and spaces
	public static boolean isLegit(String city){
		//trim leading and trailing spaces
		city = city.trim();
		for (int i=0; i < city.length(); i++){
			char ch = city.charAt(i);
			if (!(Character.isLetter(ch)|| ch == ' ')){
				return false;
			}
	}
		return city.length()>0;
		}
	
	
	public static String getCity(){
		String prompt = "Enter city name "+
						"(letters or spaces only), " +
						"'quit' to stop: ";
		
		String city ="";
		do{
			System.out.print(prompt);
			city = IO.readString();
		}while(!isLegit(city));
		return city;
	}
	
	//adds city to cities in the correct position, and
	//returns the updated cities list
	public static String add(String cities, String city){
		int start=0;
		int pos=cities.indexOf(';');
		while (pos != -1){    //-1 is the null value for integer
			String nextCity = cities.substring(0,  pos);
			int c = city.compareToIgnoreCase(nextCity);
			if(c==0){// city is the same as nextCity, don't do anything
				return cities;		//return cities as is, no change
			}
			if(c<0){
				start = pos+1; //advance start to first letter of next city
				pos = cities.indexOf(';', start); //look for ';' starting at index start*
				continue; //go to top of loop for next iteration, skip all code after this point
			}
			// falling through here means c<0, so insert here
			String prefix = cities.substring(0, start);
			String suffix = cities.substring(start);
			return prefix + city+";"+suffix;
		}
		return cities+city +";"; //semicolon not found
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cities =""; // the main cities list
		String city = getCity();
		while(!"quit".equalsIgnoreCase(city)){
			cities = add(cities, city);
			System.out.println(cities);
			city = getCity();
		}
	}

}
