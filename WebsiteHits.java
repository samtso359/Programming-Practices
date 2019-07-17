
public class WebsiteHits {

	// this is a global variable, does not appear inside a method
	// visible to all methods
	public static String[] days = {"sun","mon","tue","wed","thu","fri","sat"};
		
	// returns the page index for a pageName in the pageNames array
	public static int getPageIndex(String[] pageNames, String pageName) {
        for (int i=0; i < pageNames.length; i++) {
        		if (pageNames[i].equalsIgnoreCase(pageName)) {
        			return i;
        		}
        }
		
        return -1;  // didn't find match
	}

	// returns the day index for a day in the days array
	public static int getDayIndex(String day) {
		for (int i=0; i < days.length; i++) {
    			if (days[i].equalsIgnoreCase(day)) {
    				return i;
    			}
		}
        return -1;
	}

	// sets the appropriate cell of the hits array to the given pageHitsForDay,
	// for the given page name and day
	public static void setPageHitsForDay(int[][] hits, int pageHitsForDay, 
										String[] pageNames, String pageName, String day) {
		// find page index
		int pageIndex = getPageIndex(pageNames, pageName);
		// find day index
		int dayIndex = getDayIndex(day);
		// set cell to hits
		hits[pageIndex][dayIndex] = pageHitsForDay;
	}

	// returns number of hits on a given page for the whole week 
	public static int getPageHitsForWeek(int[][] hits, String[] pageNames, 
										String pageName) {
		// get page index
		int pageIndex = getPageIndex(pageNames, pageName);
		// scan row for pageIndex and add up all cell values
		int sum=0;
		for (int i=0; i < hits[0].length; i++) { // hits[0].length is number of columns
			sum += hits[pageIndex][i];
		}
		
        return sum;
	}

	// returns number of hits on entire site (all pages) for a given day
	public static int getSiteHitsForDay(int[][] hits, String day) {
		// find column number
		int dayIndex = getDayIndex(day);
		// scan column 
		int sum=0;
		for (int i=0; i < hits.length; i++) { // hits.length is number of rows
			sum += hits[i][dayIndex];
		}
        return sum;
	}

	// returns the total number of hits on the entire site for all days
	public static int getSiteHitsForWeek(int[][] hits) {
		
		int sum=0;
		for (int r=0; r < hits.length; r++) { 
			for (int c=0; c < hits[0].length; c++) {
				sum += hits[r][c];
			}
		}
        return sum;
	}
	
	public static void printHitsData(int[][] hits, String[] pageNames) {
		// first print the day names for column headers
		// blank in day names column, fifteen spaces
		System.out.printf("%15s"," ");
		for (int c=0; c < days.length; c++) {
			System.out.print("  " + days[c]);
		}
		System.out.println("\n");

		// now the hits for each page, each day
		for (int r=0; r < hits.length; r++) {
			System.out.printf("%15s", pageNames[r]);
			for (int c=0; c < hits[0].length; c++) {
				System.out.printf("%5d", hits[r][c]);
			}
			System.out.println();
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/* read from file */
		boolean result = IO.openFile("websitehits.txt");   // opens a file
		if (!result) { // file couldn't be opened, exit
			System.exit(1);
		}
		
		int numPages = Integer.parseInt(IO.readLine());
		
		String[] pageNames = new String[numPages];
		
		// read page names into pageNames array
		for (int i=0; i < numPages; i++) {
			pageNames[i] = IO.readLine();
		}
		
		// set up the 2D hits array
		int[][] hits = new int[numPages][7];   // numPages number of rows, 7 columns
		
		// read lines from file and populate the array
		String line=null;
		while ((line = IO.readLine()) != null) {
			// parse the line to separate page name, day of week and hits
			int pos = line.indexOf('|');
			String pageName = line.substring(0, pos);
			int start=pos+1;
			pos = line.indexOf('|',start);
			String dayOfWeek = line.substring(start,pos).substring(0, 3);
			int numHits = Integer.parseInt(line.substring(pos+1));
			
			setPageHitsForDay(hits, numHits, pageNames, pageName, dayOfWeek);
			
		}
		
		
		// print hits data
		printHitsData(hits, pageNames);
		
		// print hits for week
		System.out.println("\nTotal hits for all pages in week = " + 
							getSiteHitsForWeek(hits));
		
		// respond to user queries for page hits for week or site hits for day
		doQueries(hits, pageNames);
		
	}

	private static void doQueries(int[][] hits, String[] pageNames) {
		char choice;
		while ((choice = getChoice()) != 'q') {
			if (choice == 'p') {
				System.out.print("Enter page name: ");
				String pageName = IO.readString();
				System.out.println("Hits in week for " + pageName + " = " + 
									getPageHitsForWeek(hits, pageNames, pageName));
			} else { // only other choice is 's'
				System.out.print("Enter day: ");
				String day = IO.readString();
				System.out.println("Hits on " +  day + " for site = " + 
									getSiteHitsForDay(hits, day.substring(0,3)));
			}
		}
	}
	
	public static char getChoice() {
		System.out.print("\n(p)age hits for week, or (s)ite hits for day? ('q' to quit): ");
		char ch = Character.toLowerCase(IO.readChar());
		while (!(ch == 'p' || ch == 's' || ch == 'q')) {
			System.out.print("You must enter 'p', or 's' or 'q': ");
			ch = Character.toLowerCase(IO.readChar());
		}
		return ch;
	}

}