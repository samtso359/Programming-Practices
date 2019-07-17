

public class Scores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	double smallest=0;
	double largest=0;
	int count = 0;
	int judges;
	double scores=0;
	double input;
	double temp;
	double temp2;
	System.out.print("Number of judges: ");
	judges = IO.readInt();
	while(judges<=2){
		IO.reportBadInput();
		System.out.print("Number of judges: ");
		judges = IO.readInt();}
	
	System.out.print("Enter score: ");
	input=IO.readDouble();
	while(input<0 || input>10){
		IO.reportBadInput();
		System.out.print("Enter score: ");
		input=IO.readDouble();}
	smallest=input;
	largest=input;
	scores+=input;
	
	for(int i=judges-2;i>=0;i--){
		System.out.print("Enter score: ");
		input=IO.readDouble();
		while(input<0 || input>10){
			IO.reportBadInput();
			System.out.print("Enter score: ");
			input=IO.readDouble();}
		scores+=input;
		if(input < smallest){
			temp=smallest;
			smallest =input;
			if(temp<smallest){
				smallest=temp;}}
		else if(input > largest){
				temp2=largest;
				largest=input;
			if(temp2>largest){
				largest=temp2;}}
}
	if(judges>2){
	System.out.println("samllest = "+smallest);
	System.out.println("largest = " + largest);
	System.out.println("scores = " +scores);
	scores-=(smallest+largest);
	System.out.println("scores after smallest and largest = " +scores);
	IO.outputDoubleAnswer(scores/(double)(judges-2));}
	}
	}

