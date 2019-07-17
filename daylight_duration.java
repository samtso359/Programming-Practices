import Web_cat_HW.IO;

//Sun rises, does not set
//Sun sets does not rise
public class daylight_duration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// extreme condition 1: sun is either up all day or never up
		System.out.print("Did the sun rise today?: ");
		boolean sunRose = IO.readBoolean();
		
		System.out.print("Did the sun set today?: ");
		boolean sunSet = IO.readBoolean();
		
		System.out.print("Was the sun up at all?: ");
		boolean sunUp = IO.readBoolean();
		
		System.out.print("Was the sun set at all?: ");
		boolean sunDown = IO.readBoolean();
		
		if (!sunRose && !sunSet) {	//sun did not rise or set
			if (!sunUp){
				System.out.println("Daylight duration is 0 hours, 0 minutes");}
			else {
				System.out.println("Daylight duration is 24 hours, 0 minutes");}
			return;}
		
		if (sunRose && !sunSet){
			System.out.print("Enter sunrise hour(0..11): ");
			
		}
		
		// ask if sunrise is AM or PM
	System.out.print("Sunrise was Am (yes/no)?: ");
	boolean sunriseIsAM = IO.readBoolean();
	
	int sunriseHour;
	if (sunriseIsAM) {            // same as sunriseIsAM = true
		System.out.print("Enter sunrise hour(0..11): ");
		sunriseHour = IO.readInt();
		if (sunriseHour <0 || sunriseHour > 11){
			System.out.println("Hour must be between 0 and 11");
			return;}}
	else {
		System.out.print("Enter sunrise hour (12, or 1..11): ");
		sunriseHour = IO.readInt();
		if (sunriseHour <1 || sunriseHour > 12){
			System.out.println("Hour must be between 12, or 1..11");
			return;}}
	
	// add 12 if needed
	if (!sunriseIsAM && sunriseHour < 12){
		sunriseHour += 12; //  same as sunriseHour = sunriseHour + 12
	}
	System.out.print("Enter sunrise minute(0..59): ");
	int  sunriseMinute = IO.readInt();
	if (sunriseMinute <0 || sunriseMinute > 59){
		System.out.println("Minute must be between 0 and 59");
		return;}
	
	// ask if sunset is PM or AM
	System.out.print("Sunset was PM (yes/no)?: ");
	boolean sunsetIsPM = IO.readBoolean();
	
	int sunsetHour;
	if (!sunsetIsPM) {            // same as sunriseIsAM = true
		System.out.print("Enter sunset hour(0..11): ");
		sunsetHour = IO.readInt();
		if (sunsetHour <0 || sunsetHour > 11){
			System.out.println("Hour must be between 0 and 11");
			return;}}
	else {
		System.out.print("Enter sunset hour (12, or 1..11): ");
		sunsetHour = IO.readInt();
		if (sunsetHour <1 || sunsetHour > 12){
			System.out.println("Hour must be between 12, or 1..11");
			return;}}
	
	//add 12 if needed
	if (sunsetIsPM && sunsetHour < 12){
		sunsetHour += 12;
	}
	
	System.out.print("Enter sunrise minute(0..59): ");
	int  sunsetMinute = IO.readInt();
	if (sunsetMinute <0 || sunsetMinute > 59){
		System.out.println("Minute must be between 0 and 11");
		return;}
	
	
	
	int sunriseMinsAfterMidnight = sunriseHour*60 + sunriseMinute;
	int sunsetMinsAfterMidnight = sunsetHour*60 + sunsetMinute;
	

	
	int daylightMins = sunsetMinsAfterMidnight - sunriseMinsAfterMidnight;
	// check if sunset happens before sunrise, which is an error
	if (daylightMins <0){
		System.out.println(" Error! Sunset is before sunrise");
		return;}
	
	int daylightHours = daylightMins/60; //quotient
	int daylightMinutes = daylightMins % 60; // % stands for "modulus", i.e. remainder
	
	System.out.println("Daylight duration is " + daylightHours + " hours, " + daylightMinutes + " minutes");
	
	}


}
